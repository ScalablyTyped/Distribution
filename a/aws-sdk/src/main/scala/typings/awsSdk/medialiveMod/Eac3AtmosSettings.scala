package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eac3AtmosSettings extends StObject {
  
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
  //  * @affectsRightSizing true
    */
  var Bitrate: js.UndefOr[double] = js.undefined
  
  /**
    * Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined
  
  /**
    * Sets the dialnorm for the output. Default 23.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined
  
  /**
    * Sets the Dolby dynamic range compression profile.
    */
  var DrcLine: js.UndefOr[Eac3AtmosDrcLine] = js.undefined
  
  /**
    * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DrcRf: js.UndefOr[Eac3AtmosDrcRf] = js.undefined
  
  /**
    * Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream player isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
    */
  var HeightTrim: js.UndefOr[double] = js.undefined
  
  /**
    * Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream player isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
    */
  var SurroundTrim: js.UndefOr[double] = js.undefined
}
object Eac3AtmosSettings {
  
  inline def apply(): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
  
  extension [Self <: Eac3AtmosSettings](x: Self) {
    
    inline def setBitrate(value: double): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setCodingMode(value: Eac3AtmosCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    inline def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    inline def setDialnorm(value: integerMin1Max31): Self = StObject.set(x, "Dialnorm", value.asInstanceOf[js.Any])
    
    inline def setDialnormUndefined: Self = StObject.set(x, "Dialnorm", js.undefined)
    
    inline def setDrcLine(value: Eac3AtmosDrcLine): Self = StObject.set(x, "DrcLine", value.asInstanceOf[js.Any])
    
    inline def setDrcLineUndefined: Self = StObject.set(x, "DrcLine", js.undefined)
    
    inline def setDrcRf(value: Eac3AtmosDrcRf): Self = StObject.set(x, "DrcRf", value.asInstanceOf[js.Any])
    
    inline def setDrcRfUndefined: Self = StObject.set(x, "DrcRf", js.undefined)
    
    inline def setHeightTrim(value: double): Self = StObject.set(x, "HeightTrim", value.asInstanceOf[js.Any])
    
    inline def setHeightTrimUndefined: Self = StObject.set(x, "HeightTrim", js.undefined)
    
    inline def setSurroundTrim(value: double): Self = StObject.set(x, "SurroundTrim", value.asInstanceOf[js.Any])
    
    inline def setSurroundTrimUndefined: Self = StObject.set(x, "SurroundTrim", js.undefined)
  }
}
