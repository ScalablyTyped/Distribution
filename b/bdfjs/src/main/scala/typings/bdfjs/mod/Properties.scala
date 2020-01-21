package typings.bdfjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  var addStyleName: js.UndefOr[String] = js.undefined
  var averageWidth: js.UndefOr[Double] = js.undefined
  var capHeight: js.UndefOr[Double] = js.undefined
  var charsetEncoding: js.UndefOr[String] = js.undefined
  var charsetRegistry: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var defaultChar: Double
  var faceName: js.UndefOr[String] = js.undefined
  var familyName: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontAscent: Double
  var fontDescent: Double
  var fontVersion: js.UndefOr[String] = js.undefined
  var fontnameRegistry: js.UndefOr[String] = js.undefined
  var foundry: js.UndefOr[String] = js.undefined
  var notice: js.UndefOr[String] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var resolutionX: js.UndefOr[Double] = js.undefined
  var resolutionY: js.UndefOr[Double] = js.undefined
  var setwidthName: js.UndefOr[String] = js.undefined
  var slant: js.UndefOr[String] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
  var weightName: js.UndefOr[String] = js.undefined
  var xHeight: js.UndefOr[Double] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    defaultChar: Double,
    fontAscent: Double,
    fontDescent: Double,
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double]] = null,
    addStyleName: String = null,
    averageWidth: Int | Double = null,
    capHeight: Int | Double = null,
    charsetEncoding: String = null,
    charsetRegistry: String = null,
    copyright: String = null,
    faceName: String = null,
    familyName: String = null,
    font: String = null,
    fontVersion: String = null,
    fontnameRegistry: String = null,
    foundry: String = null,
    notice: String = null,
    pixelSize: Int | Double = null,
    pointSize: Int | Double = null,
    resolutionX: Int | Double = null,
    resolutionY: Int | Double = null,
    setwidthName: String = null,
    slant: String = null,
    spacing: String = null,
    weightName: String = null,
    xHeight: Int | Double = null
  ): Properties = {
    val __obj = js.Dynamic.literal(defaultChar = defaultChar.asInstanceOf[js.Any], fontAscent = fontAscent.asInstanceOf[js.Any], fontDescent = fontDescent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addStyleName != null) __obj.updateDynamic("addStyleName")(addStyleName.asInstanceOf[js.Any])
    if (averageWidth != null) __obj.updateDynamic("averageWidth")(averageWidth.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (charsetEncoding != null) __obj.updateDynamic("charsetEncoding")(charsetEncoding.asInstanceOf[js.Any])
    if (charsetRegistry != null) __obj.updateDynamic("charsetRegistry")(charsetRegistry.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (faceName != null) __obj.updateDynamic("faceName")(faceName.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontVersion != null) __obj.updateDynamic("fontVersion")(fontVersion.asInstanceOf[js.Any])
    if (fontnameRegistry != null) __obj.updateDynamic("fontnameRegistry")(fontnameRegistry.asInstanceOf[js.Any])
    if (foundry != null) __obj.updateDynamic("foundry")(foundry.asInstanceOf[js.Any])
    if (notice != null) __obj.updateDynamic("notice")(notice.asInstanceOf[js.Any])
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (resolutionX != null) __obj.updateDynamic("resolutionX")(resolutionX.asInstanceOf[js.Any])
    if (resolutionY != null) __obj.updateDynamic("resolutionY")(resolutionY.asInstanceOf[js.Any])
    if (setwidthName != null) __obj.updateDynamic("setwidthName")(setwidthName.asInstanceOf[js.Any])
    if (slant != null) __obj.updateDynamic("slant")(slant.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (weightName != null) __obj.updateDynamic("weightName")(weightName.asInstanceOf[js.Any])
    if (xHeight != null) __obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

