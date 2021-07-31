package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DolbyVisionLevel6Metadata extends StObject {
  
  /**
    * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream. Measured in nits.
    */
  var MaxCll: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness in the entire stream. Measured in nits.
    */
  var MaxFall: js.UndefOr[integerMin0Max65535] = js.undefined
}
object DolbyVisionLevel6Metadata {
  
  @scala.inline
  def apply(): DolbyVisionLevel6Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVisionLevel6Metadata]
  }
  
  @scala.inline
  implicit class DolbyVisionLevel6MetadataMutableBuilder[Self <: DolbyVisionLevel6Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCll(value: integerMin0Max65535): Self = StObject.set(x, "MaxCll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCllUndefined: Self = StObject.set(x, "MaxCll", js.undefined)
    
    @scala.inline
    def setMaxFall(value: integerMin0Max65535): Self = StObject.set(x, "MaxFall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFallUndefined: Self = StObject.set(x, "MaxFall", js.undefined)
  }
}
