package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hdr10Metadata extends js.Object {
  
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
  implicit class Hdr10MetadataOps[Self <: Hdr10Metadata] (val x: Self) extends AnyVal {
    
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
    def setBluePrimaryX(value: integerMin0Max50000): Self = this.set("BluePrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluePrimaryX: Self = this.set("BluePrimaryX", js.undefined)
    
    @scala.inline
    def setBluePrimaryY(value: integerMin0Max50000): Self = this.set("BluePrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluePrimaryY: Self = this.set("BluePrimaryY", js.undefined)
    
    @scala.inline
    def setGreenPrimaryX(value: integerMin0Max50000): Self = this.set("GreenPrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenPrimaryX: Self = this.set("GreenPrimaryX", js.undefined)
    
    @scala.inline
    def setGreenPrimaryY(value: integerMin0Max50000): Self = this.set("GreenPrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenPrimaryY: Self = this.set("GreenPrimaryY", js.undefined)
    
    @scala.inline
    def setMaxContentLightLevel(value: integerMin0Max65535): Self = this.set("MaxContentLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxContentLightLevel: Self = this.set("MaxContentLightLevel", js.undefined)
    
    @scala.inline
    def setMaxFrameAverageLightLevel(value: integerMin0Max65535): Self = this.set("MaxFrameAverageLightLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFrameAverageLightLevel: Self = this.set("MaxFrameAverageLightLevel", js.undefined)
    
    @scala.inline
    def setMaxLuminance(value: integerMin0Max2147483647): Self = this.set("MaxLuminance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLuminance: Self = this.set("MaxLuminance", js.undefined)
    
    @scala.inline
    def setMinLuminance(value: integerMin0Max2147483647): Self = this.set("MinLuminance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLuminance: Self = this.set("MinLuminance", js.undefined)
    
    @scala.inline
    def setRedPrimaryX(value: integerMin0Max50000): Self = this.set("RedPrimaryX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedPrimaryX: Self = this.set("RedPrimaryX", js.undefined)
    
    @scala.inline
    def setRedPrimaryY(value: integerMin0Max50000): Self = this.set("RedPrimaryY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedPrimaryY: Self = this.set("RedPrimaryY", js.undefined)
    
    @scala.inline
    def setWhitePointX(value: integerMin0Max50000): Self = this.set("WhitePointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitePointX: Self = this.set("WhitePointX", js.undefined)
    
    @scala.inline
    def setWhitePointY(value: integerMin0Max50000): Self = this.set("WhitePointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitePointY: Self = this.set("WhitePointY", js.undefined)
  }
}
