package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AiffSettings extends StObject {
  
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.native
  
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.native
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.native
}
object AiffSettings {
  
  @scala.inline
  def apply(): AiffSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AiffSettings]
  }
  
  @scala.inline
  implicit class AiffSettingsMutableBuilder[Self <: AiffSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitDepth(value: integerMin16Max24): Self = StObject.set(x, "BitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitDepthUndefined: Self = StObject.set(x, "BitDepth", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max64): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin8000Max192000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
