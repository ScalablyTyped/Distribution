package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSlotTypeVersionRequest extends js.Object {
  /**
    * Checksum for the $LATEST version of the slot type that you want to publish. If you specify a checksum and the $LATEST version of the slot type has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish the new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The name of the slot type that you want to create a new version for. The name is case sensitive. 
    */
  var name: SlotTypeName = js.native
}

object CreateSlotTypeVersionRequest {
  @scala.inline
  def apply(name: SlotTypeName): CreateSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlotTypeVersionRequest]
  }
  @scala.inline
  implicit class CreateSlotTypeVersionRequestOps[Self <: CreateSlotTypeVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: SlotTypeName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
  }
  
}

