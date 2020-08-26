package typings.awsSdkTypes.marshallerMod

import typings.awsSdkTypes.protocolMod.Member
import typings.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodySerializerBuildOptions extends js.Object {
  /**
    * Whether the operation input contains a payload member.
    */
  var hasPayload: js.UndefOr[Boolean] = js.native
  /**
    * The value to convert.
    */
  var input: js.Any = js.native
  /**
    * The root input member of the operation used to serialize the body.
    * Should be either operation input or the input payload member.
    * Defaults to operation.input.
    */
  var member: js.UndefOr[Member] = js.native
  /**
    * Location name for the member.
    */
  var memberName: js.UndefOr[String] = js.native
  /**
    * The operation model to which the input should be converted.
    */
  var operation: OperationModel = js.native
}

object BodySerializerBuildOptions {
  @scala.inline
  def apply(input: js.Any, operation: OperationModel): BodySerializerBuildOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySerializerBuildOptions]
  }
  @scala.inline
  implicit class BodySerializerBuildOptionsOps[Self <: BodySerializerBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationModel): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPayload(value: Boolean): Self = this.set("hasPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPayload: Self = this.set("hasPayload", js.undefined)
    @scala.inline
    def setMember(value: Member): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setMemberName(value: String): Self = this.set("memberName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberName: Self = this.set("memberName", js.undefined)
  }
  
}

