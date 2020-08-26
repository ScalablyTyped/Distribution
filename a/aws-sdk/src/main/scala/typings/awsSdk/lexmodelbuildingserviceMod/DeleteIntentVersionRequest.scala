package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntentVersionRequest extends js.Object {
  /**
    * The name of the intent.
    */
  var name: IntentName = js.native
  /**
    * The version of the intent to delete. You cannot delete the $LATEST version of the intent. To delete the $LATEST version, use the DeleteIntent operation.
    */
  var version: NumericalVersion = js.native
}

object DeleteIntentVersionRequest {
  @scala.inline
  def apply(name: IntentName, version: NumericalVersion): DeleteIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntentVersionRequest]
  }
  @scala.inline
  implicit class DeleteIntentVersionRequestOps[Self <: DeleteIntentVersionRequest] (val x: Self) extends AnyVal {
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
    def setVersion(value: NumericalVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

