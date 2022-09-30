package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSignalCatalogResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the signal catalog. 
    */
  var arn: typings.awsSdk.iotfleetwiseMod.arn
  
  /**
    *  The time the signal catalog was created in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.Date
  
  /**
    *  A brief description of the signal catalog. 
    */
  var description: js.UndefOr[typings.awsSdk.iotfleetwiseMod.description] = js.undefined
  
  /**
    * The last time the signal catalog was modified.
    */
  var lastModificationTime: js.Date
  
  /**
    *  The name of the signal catalog. 
    */
  var name: resourceName
  
  /**
    *  The total number of network nodes specified in a signal catalog. 
    */
  var nodeCounts: js.UndefOr[NodeCounts] = js.undefined
}
object GetSignalCatalogResponse {
  
  inline def apply(arn: arn, creationTime: js.Date, lastModificationTime: js.Date, name: resourceName): GetSignalCatalogResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalCatalogResponse]
  }
  
  extension [Self <: GetSignalCatalogResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeCounts(value: NodeCounts): Self = StObject.set(x, "nodeCounts", value.asInstanceOf[js.Any])
    
    inline def setNodeCountsUndefined: Self = StObject.set(x, "nodeCounts", js.undefined)
  }
}
