package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupResourcesItem extends StObject {
  
  var Identifier: js.UndefOr[ResourceIdentifier] = js.undefined
  
  /**
    * A structure that contains the status of this resource's membership in the group.  This field is present in the response only if the group is of type AWS::EC2::HostManagement. 
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
}
object ListGroupResourcesItem {
  
  inline def apply(): ListGroupResourcesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupResourcesItem]
  }
  
  extension [Self <: ListGroupResourcesItem](x: Self) {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
