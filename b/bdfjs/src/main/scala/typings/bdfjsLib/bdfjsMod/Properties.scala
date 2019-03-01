package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double]] {
  var addStyleName: js.UndefOr[java.lang.String] = js.undefined
  var averageWidth: js.UndefOr[scala.Double] = js.undefined
  var capHeight: js.UndefOr[scala.Double] = js.undefined
  var charsetEncoding: js.UndefOr[java.lang.String] = js.undefined
  var charsetRegistry: js.UndefOr[java.lang.String] = js.undefined
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var defaultChar: scala.Double
  var faceName: js.UndefOr[java.lang.String] = js.undefined
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var fontAscent: scala.Double
  var fontDescent: scala.Double
  var fontVersion: js.UndefOr[java.lang.String] = js.undefined
  var fontnameRegistry: js.UndefOr[java.lang.String] = js.undefined
  var foundry: js.UndefOr[java.lang.String] = js.undefined
  var notice: js.UndefOr[java.lang.String] = js.undefined
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
  var pointSize: js.UndefOr[scala.Double] = js.undefined
  var resolutionX: js.UndefOr[scala.Double] = js.undefined
  var resolutionY: js.UndefOr[scala.Double] = js.undefined
  var setwidthName: js.UndefOr[java.lang.String] = js.undefined
  var slant: js.UndefOr[java.lang.String] = js.undefined
  var spacing: js.UndefOr[java.lang.String] = js.undefined
  var weightName: js.UndefOr[java.lang.String] = js.undefined
  var xHeight: js.UndefOr[scala.Double] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    defaultChar: scala.Double,
    fontAscent: scala.Double,
    fontDescent: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double]] = null,
    addStyleName: java.lang.String = null,
    averageWidth: scala.Int | scala.Double = null,
    capHeight: scala.Int | scala.Double = null,
    charsetEncoding: java.lang.String = null,
    charsetRegistry: java.lang.String = null,
    copyright: java.lang.String = null,
    faceName: java.lang.String = null,
    familyName: java.lang.String = null,
    font: java.lang.String = null,
    fontVersion: java.lang.String = null,
    fontnameRegistry: java.lang.String = null,
    foundry: java.lang.String = null,
    notice: java.lang.String = null,
    pixelSize: scala.Int | scala.Double = null,
    pointSize: scala.Int | scala.Double = null,
    resolutionX: scala.Int | scala.Double = null,
    resolutionY: scala.Int | scala.Double = null,
    setwidthName: java.lang.String = null,
    slant: java.lang.String = null,
    spacing: java.lang.String = null,
    weightName: java.lang.String = null,
    xHeight: scala.Int | scala.Double = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultChar")(defaultChar)
    __obj.updateDynamic("fontAscent")(fontAscent)
    __obj.updateDynamic("fontDescent")(fontDescent)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addStyleName != null) __obj.updateDynamic("addStyleName")(addStyleName)
    if (averageWidth != null) __obj.updateDynamic("averageWidth")(averageWidth.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (charsetEncoding != null) __obj.updateDynamic("charsetEncoding")(charsetEncoding)
    if (charsetRegistry != null) __obj.updateDynamic("charsetRegistry")(charsetRegistry)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (faceName != null) __obj.updateDynamic("faceName")(faceName)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontVersion != null) __obj.updateDynamic("fontVersion")(fontVersion)
    if (fontnameRegistry != null) __obj.updateDynamic("fontnameRegistry")(fontnameRegistry)
    if (foundry != null) __obj.updateDynamic("foundry")(foundry)
    if (notice != null) __obj.updateDynamic("notice")(notice)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (resolutionX != null) __obj.updateDynamic("resolutionX")(resolutionX.asInstanceOf[js.Any])
    if (resolutionY != null) __obj.updateDynamic("resolutionY")(resolutionY.asInstanceOf[js.Any])
    if (setwidthName != null) __obj.updateDynamic("setwidthName")(setwidthName)
    if (slant != null) __obj.updateDynamic("slant")(slant)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (weightName != null) __obj.updateDynamic("weightName")(weightName)
    if (xHeight != null) __obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

