package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedProperties extends StObject {
  
  /**
    * The detected duration of the input file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.native
  
  /**
    * The detected file size of the input file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.native
  
  /**
    * The detected frame rate of the input file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.native
  
  /**
    * The detected height of the input file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The detected width of the input file, in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.native
}
object DetectedProperties {
  
  @scala.inline
  def apply(): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProperties]
  }
  
  @scala.inline
  implicit class DetectedPropertiesMutableBuilder[Self <: DetectedProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMillis(value: NullableLong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    @scala.inline
    def setFileSize(value: NullableLong): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "FileSize", js.undefined)
    
    @scala.inline
    def setFrameRate(value: FloatString): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    @scala.inline
    def setHeight(value: NullableInteger): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setWidth(value: NullableInteger): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
