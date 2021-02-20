package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorVersionMetadataRequest extends StObject {
  
  /**
    * The description.
    */
  var description: typings.awsSdk.frauddetectorMod.description = js.native
  
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString = js.native
}
object UpdateDetectorVersionMetadataRequest {
  
  @scala.inline
  def apply(description: description, detectorId: identifier, detectorVersionId: wholeNumberVersionString): UpdateDetectorVersionMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorVersionMetadataRequestMutableBuilder[Self <: UpdateDetectorVersionMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
