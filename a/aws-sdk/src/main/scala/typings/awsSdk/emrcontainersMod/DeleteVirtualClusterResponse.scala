package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualClusterResponse extends StObject {
  
  /**
    * This output contains the ID of the virtual cluster that will be deleted. 
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
}
object DeleteVirtualClusterResponse {
  
  inline def apply(): DeleteVirtualClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVirtualClusterResponse]
  }
  
  extension [Self <: DeleteVirtualClusterResponse](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
