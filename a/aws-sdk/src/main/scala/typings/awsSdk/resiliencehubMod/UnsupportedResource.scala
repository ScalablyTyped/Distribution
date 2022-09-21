package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedResource extends StObject {
  
  /**
    * The logical resource identifier for the unsupported resource.
    */
  var logicalResourceId: LogicalResourceId
  
  /**
    * The physical resource identifier for the unsupported resource.
    */
  var physicalResourceId: PhysicalResourceId
  
  /**
    * The type of resource.
    */
  var resourceType: String255
}
object UnsupportedResource {
  
  inline def apply(
    logicalResourceId: LogicalResourceId,
    physicalResourceId: PhysicalResourceId,
    resourceType: String255
  ): UnsupportedResource = {
    val __obj = js.Dynamic.literal(logicalResourceId = logicalResourceId.asInstanceOf[js.Any], physicalResourceId = physicalResourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedResource]
  }
  
  extension [Self <: UnsupportedResource](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String255): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
