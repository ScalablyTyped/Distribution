package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelManifestResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the vehicle model. 
    */
  var arn: typings.awsSdk.iotfleetwiseMod.arn
  
  /**
    * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var creationTime: js.Date
  
  /**
    *  A brief description of the vehicle model. 
    */
  var description: js.UndefOr[typings.awsSdk.iotfleetwiseMod.description] = js.undefined
  
  /**
    * The last time the vehicle model was modified.
    */
  var lastModificationTime: js.Date
  
  /**
    *  The name of the vehicle model. 
    */
  var name: resourceName
  
  /**
    *  The ARN of the signal catalog associated with the vehicle model. 
    */
  var signalCatalogArn: js.UndefOr[arn] = js.undefined
  
  /**
    *  The state of the vehicle model. If the status is ACTIVE, the vehicle model can't be edited. You can edit the vehicle model if the status is marked DRAFT.
    */
  var status: js.UndefOr[ManifestStatus] = js.undefined
}
object GetModelManifestResponse {
  
  inline def apply(arn: arn, creationTime: js.Date, lastModificationTime: js.Date, name: resourceName): GetModelManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelManifestResponse]
  }
  
  extension [Self <: GetModelManifestResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArnUndefined: Self = StObject.set(x, "signalCatalogArn", js.undefined)
    
    inline def setStatus(value: ManifestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
