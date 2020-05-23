package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    BluePrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined,
    BluePrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined,
    GreenPrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined,
    GreenPrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined,
    MaxContentLightLevel: js.UndefOr[integerMin0Max65535] = js.undefined,
    MaxFrameAverageLightLevel: js.UndefOr[integerMin0Max65535] = js.undefined,
    MaxLuminance: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    MinLuminance: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    RedPrimaryX: js.UndefOr[integerMin0Max50000] = js.undefined,
    RedPrimaryY: js.UndefOr[integerMin0Max50000] = js.undefined,
    WhitePointX: js.UndefOr[integerMin0Max50000] = js.undefined,
    WhitePointY: js.UndefOr[integerMin0Max50000] = js.undefined
  ): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BluePrimaryX)) __obj.updateDynamic("BluePrimaryX")(BluePrimaryX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BluePrimaryY)) __obj.updateDynamic("BluePrimaryY")(BluePrimaryY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GreenPrimaryX)) __obj.updateDynamic("GreenPrimaryX")(GreenPrimaryX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GreenPrimaryY)) __obj.updateDynamic("GreenPrimaryY")(GreenPrimaryY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxContentLightLevel)) __obj.updateDynamic("MaxContentLightLevel")(MaxContentLightLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxFrameAverageLightLevel)) __obj.updateDynamic("MaxFrameAverageLightLevel")(MaxFrameAverageLightLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxLuminance)) __obj.updateDynamic("MaxLuminance")(MaxLuminance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinLuminance)) __obj.updateDynamic("MinLuminance")(MinLuminance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RedPrimaryX)) __obj.updateDynamic("RedPrimaryX")(RedPrimaryX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RedPrimaryY)) __obj.updateDynamic("RedPrimaryY")(RedPrimaryY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WhitePointX)) __obj.updateDynamic("WhitePointX")(WhitePointX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WhitePointY)) __obj.updateDynamic("WhitePointY")(WhitePointY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hdr10Metadata]
  }
}

