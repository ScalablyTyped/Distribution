package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSpecification extends StObject {
  
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.undefined
  
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined
  
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.undefined
}
object InputSpecification {
  
  @scala.inline
  def apply(): InputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecification]
  }
  
  @scala.inline
  implicit class InputSpecificationMutableBuilder[Self <: InputSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: InputCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setMaximumBitrate(value: InputMaximumBitrate): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    @scala.inline
    def setResolution(value: InputResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
  }
}
