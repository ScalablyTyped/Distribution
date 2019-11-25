package typings.atAwsDashSdkTypes.buildMarshallerMod

import typings.atAwsDashSdkTypes.buildProtocolMod.Member
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySerializerBuildOptions extends js.Object {
  /**
    * Whether the operation input contains a payload member.
    */
  var hasPayload: js.UndefOr[Boolean] = js.undefined
  /**
    * The value to convert.
    */
  var input: js.Any
  /**
    * The root input member of the operation used to serialize the body.
    * Should be either operation input or the input payload member.
    * Defaults to operation.input.
    */
  var member: js.UndefOr[Member] = js.undefined
  /**
    * Location name for the member.
    */
  var memberName: js.UndefOr[String] = js.undefined
  /**
    * The operation model to which the input should be converted.
    */
  var operation: OperationModel
}

object BodySerializerBuildOptions {
  @scala.inline
  def apply(
    input: js.Any,
    operation: OperationModel,
    hasPayload: js.UndefOr[Boolean] = js.undefined,
    member: Member = null,
    memberName: String = null
  ): BodySerializerBuildOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPayload)) __obj.updateDynamic("hasPayload")(hasPayload.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (memberName != null) __obj.updateDynamic("memberName")(memberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySerializerBuildOptions]
  }
}

