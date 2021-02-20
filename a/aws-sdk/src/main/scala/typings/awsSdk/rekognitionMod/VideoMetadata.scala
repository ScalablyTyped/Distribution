package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoMetadata extends StObject {
  
  /**
    * Type of compression used in the analyzed video. 
    */
  var Codec: js.UndefOr[String] = js.native
  
  /**
    * Length of the video in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  
  /**
    * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * Vertical pixel dimension of the video.
    */
  var FrameHeight: js.UndefOr[ULong] = js.native
  
  /**
    * Number of frames per second in the video.
    */
  var FrameRate: js.UndefOr[Float] = js.native
  
  /**
    * Horizontal pixel dimension of the video.
    */
  var FrameWidth: js.UndefOr[ULong] = js.native
}
object VideoMetadata {
  
  @scala.inline
  def apply(): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMetadata]
  }
  
  @scala.inline
  implicit class VideoMetadataMutableBuilder[Self <: VideoMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setFrameHeight(value: ULong): Self = StObject.set(x, "FrameHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeightUndefined: Self = StObject.set(x, "FrameHeight", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Float): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    @scala.inline
    def setFrameWidth(value: ULong): Self = StObject.set(x, "FrameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidthUndefined: Self = StObject.set(x, "FrameWidth", js.undefined)
  }
}
