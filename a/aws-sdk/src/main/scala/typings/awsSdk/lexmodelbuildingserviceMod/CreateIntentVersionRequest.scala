package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntentVersionRequest extends js.Object {
  /**
    * Checksum of the $LATEST version of the intent that should be used to create the new version. If you specify a checksum and the $LATEST version of the intent has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The name of the intent that you want to create a new version of. The name is case sensitive. 
    */
  var name: IntentName = js.native
}

object CreateIntentVersionRequest {
  @scala.inline
  def apply(name: IntentName): CreateIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntentVersionRequest]
  }
  @scala.inline
  implicit class CreateIntentVersionRequestOps[Self <: CreateIntentVersionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: IntentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
  }
  
}

