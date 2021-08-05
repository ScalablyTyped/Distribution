package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelVersionRequest extends StObject {
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * The major version number.
    */
  var majorVersionNumber: wholeNumberVersionString
  
  /**
    * The model ID.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object UpdateModelVersionRequest {
  
  inline def apply(majorVersionNumber: wholeNumberVersionString, modelId: modelIdentifier, modelType: ModelTypeEnum): UpdateModelVersionRequest = {
    val __obj = js.Dynamic.literal(majorVersionNumber = majorVersionNumber.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelVersionRequest]
  }
  
  extension [Self <: UpdateModelVersionRequest](x: Self) {
    
    inline def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    inline def setMajorVersionNumber(value: wholeNumberVersionString): Self = StObject.set(x, "majorVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
