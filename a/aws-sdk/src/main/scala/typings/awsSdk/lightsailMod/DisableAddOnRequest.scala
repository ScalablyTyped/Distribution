package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableAddOnRequest extends js.Object {
  /**
    * The add-on type to disable.
    */
  var addOnType: AddOnType = js.native
  /**
    * The name of the source resource for which to disable the add-on.
    */
  var resourceName: ResourceName = js.native
}

object DisableAddOnRequest {
  @scala.inline
  def apply(addOnType: AddOnType, resourceName: ResourceName): DisableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableAddOnRequest]
  }
}

