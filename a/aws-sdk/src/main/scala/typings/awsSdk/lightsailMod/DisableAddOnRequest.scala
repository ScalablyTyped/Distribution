package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAddOnRequest extends StObject {
  
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
  
  @scala.inline
  implicit class DisableAddOnRequestMutableBuilder[Self <: DisableAddOnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnType(value: AddOnType): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
