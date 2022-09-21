package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualClusterResponse extends StObject {
  
  /**
    * This output contains the ARN of virtual cluster.
    */
  var arn: js.UndefOr[VirtualClusterArn] = js.undefined
  
  /**
    * This output contains the virtual cluster ID.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * This output contains the name of the virtual cluster.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
}
object CreateVirtualClusterResponse {
  
  inline def apply(): CreateVirtualClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVirtualClusterResponse]
  }
  
  extension [Self <: CreateVirtualClusterResponse](x: Self) {
    
    inline def setArn(value: VirtualClusterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
