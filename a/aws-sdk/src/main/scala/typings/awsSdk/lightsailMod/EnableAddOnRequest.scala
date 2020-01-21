package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableAddOnRequest extends js.Object {
  /**
    * An array of strings representing the add-on to enable or modify.
    */
  var addOnRequest: AddOnRequest = js.native
  /**
    * The name of the source resource for which to enable or modify the add-on.
    */
  var resourceName: ResourceName = js.native
}

object EnableAddOnRequest {
  @scala.inline
  def apply(addOnRequest: AddOnRequest, resourceName: ResourceName): EnableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnRequest = addOnRequest.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableAddOnRequest]
  }
}

