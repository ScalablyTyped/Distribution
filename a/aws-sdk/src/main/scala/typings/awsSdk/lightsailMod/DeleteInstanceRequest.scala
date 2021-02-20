package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInstanceRequest extends StObject {
  
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName = js.native
}
object DeleteInstanceRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  
  @scala.inline
  implicit class DeleteInstanceRequestMutableBuilder[Self <: DeleteInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceDeleteAddOns(value: Boolean): Self = StObject.set(x, "forceDeleteAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteAddOnsUndefined: Self = StObject.set(x, "forceDeleteAddOns", js.undefined)
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
