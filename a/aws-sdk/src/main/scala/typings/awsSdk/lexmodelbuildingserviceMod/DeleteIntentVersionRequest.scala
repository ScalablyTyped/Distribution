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
}

