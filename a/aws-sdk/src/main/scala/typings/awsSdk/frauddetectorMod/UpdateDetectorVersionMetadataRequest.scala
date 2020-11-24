package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorVersionMetadataRequest extends js.Object {
  
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
  implicit class UpdateDetectorVersionMetadataRequestOps[Self <: UpdateDetectorVersionMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
  }
}
