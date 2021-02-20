package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hdr10Metadata extends StObject {
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.  This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxContentLightLevel: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxFrameAverageLightLevel: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
    */
  var MaxLuminance: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
    */
  var MinLuminance: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointX: js.UndefOr[integerMin0Max50000] = js.native
  
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointY: js.UndefOr[integerMin0Max50000] = js.native
}
object Hdr10Metadata {
  
  @scala.inline
  def apply(): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Metadata]
  }
  
  @scala.inline
  implicit class Hdr10MetadataMutableBuilder[Self <: Hdr10Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBluePrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "BluePrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluePrimaryXUndefined: Self = StObject.set(x, "BluePrimaryX", js.undefined)
    
    @scala.inline
    def setBluePrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "BluePrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluePrimaryYUndefined: Self = StObject.set(x, "BluePrimaryY", js.undefined)
    
    @scala.inline
    def setGreenPrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "GreenPrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenPrimaryXUndefined: Self = StObject.set(x, "GreenPrimaryX", js.undefined)
    
    @scala.inline
    def setGreenPrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "GreenPrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenPrimaryYUndefined: Self = StObject.set(x, "GreenPrimaryY", js.undefined)
    
    @scala.inline
    def setMaxContentLightLevel(value: integerMin0Max65535): Self = StObject.set(x, "MaxContentLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxContentLightLevelUndefined: Self = StObject.set(x, "MaxContentLightLevel", js.undefined)
    
    @scala.inline
    def setMaxFrameAverageLightLevel(value: integerMin0Max65535): Self = StObject.set(x, "MaxFrameAverageLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrameAverageLightLevelUndefined: Self = StObject.set(x, "MaxFrameAverageLightLevel", js.undefined)
    
    @scala.inline
    def setMaxLuminance(value: integerMin0Max2147483647): Self = StObject.set(x, "MaxLuminance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLuminanceUndefined: Self = StObject.set(x, "MaxLuminance", js.undefined)
    
    @scala.inline
    def setMinLuminance(value: integerMin0Max2147483647): Self = StObject.set(x, "MinLuminance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLuminanceUndefined: Self = StObject.set(x, "MinLuminance", js.undefined)
    
    @scala.inline
    def setRedPrimaryX(value: integerMin0Max50000): Self = StObject.set(x, "RedPrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedPrimaryXUndefined: Self = StObject.set(x, "RedPrimaryX", js.undefined)
    
    @scala.inline
    def setRedPrimaryY(value: integerMin0Max50000): Self = StObject.set(x, "RedPrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedPrimaryYUndefined: Self = StObject.set(x, "RedPrimaryY", js.undefined)
    
    @scala.inline
    def setWhitePointX(value: integerMin0Max50000): Self = StObject.set(x, "WhitePointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitePointXUndefined: Self = StObject.set(x, "WhitePointX", js.undefined)
    
    @scala.inline
    def setWhitePointY(value: integerMin0Max50000): Self = StObject.set(x, "WhitePointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitePointYUndefined: Self = StObject.set(x, "WhitePointY", js.undefined)
  }
}
