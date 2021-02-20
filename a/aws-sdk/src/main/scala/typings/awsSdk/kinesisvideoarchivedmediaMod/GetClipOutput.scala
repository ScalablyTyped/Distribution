package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClipOutput extends StObject {
  
  /**
    * The content type of the media in the requested clip.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ContentType] = js.native
  
  /**
    * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see Kinesis Video Streams Limits. 
    */
  var Payload: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.Payload] = js.native
}
object GetClipOutput {
  
  @scala.inline
  def apply(): GetClipOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipOutput]
  }
  
  @scala.inline
  implicit class GetClipOutputMutableBuilder[Self <: GetClipOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
