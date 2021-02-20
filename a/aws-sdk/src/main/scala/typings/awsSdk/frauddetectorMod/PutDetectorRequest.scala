package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDetectorRequest extends StObject {
  
  /**
    * The description of the detector.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector ID. 
    */
  var detectorId: identifier = js.native
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object PutDetectorRequest {
  
  @scala.inline
  def apply(detectorId: identifier, eventTypeName: identifier): PutDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDetectorRequest]
  }
  
  @scala.inline
  implicit class PutDetectorRequestMutableBuilder[Self <: PutDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
