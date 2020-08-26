package typings.bdfjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  var addStyleName: js.UndefOr[String] = js.native
  var averageWidth: js.UndefOr[Double] = js.native
  var capHeight: js.UndefOr[Double] = js.native
  var charsetEncoding: js.UndefOr[String] = js.native
  var charsetRegistry: js.UndefOr[String] = js.native
  var copyright: js.UndefOr[String] = js.native
  var defaultChar: Double = js.native
  var faceName: js.UndefOr[String] = js.native
  var familyName: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var fontAscent: Double = js.native
  var fontDescent: Double = js.native
  var fontVersion: js.UndefOr[String] = js.native
  var fontnameRegistry: js.UndefOr[String] = js.native
  var foundry: js.UndefOr[String] = js.native
  var notice: js.UndefOr[String] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var resolutionX: js.UndefOr[Double] = js.native
  var resolutionY: js.UndefOr[Double] = js.native
  var setwidthName: js.UndefOr[String] = js.native
  var slant: js.UndefOr[String] = js.native
  var spacing: js.UndefOr[String] = js.native
  var weightName: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double] = js.native
}

object Properties {
  @scala.inline
  def apply(defaultChar: Double, fontAscent: Double, fontDescent: Double): Properties = {
    val __obj = js.Dynamic.literal(defaultChar = defaultChar.asInstanceOf[js.Any], fontAscent = fontAscent.asInstanceOf[js.Any], fontDescent = fontDescent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
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
    def setDefaultChar(value: Double): Self = this.set("defaultChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontAscent(value: Double): Self = this.set("fontAscent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontDescent(value: Double): Self = this.set("fontDescent", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddStyleName(value: String): Self = this.set("addStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddStyleName: Self = this.set("addStyleName", js.undefined)
    @scala.inline
    def setAverageWidth(value: Double): Self = this.set("averageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageWidth: Self = this.set("averageWidth", js.undefined)
    @scala.inline
    def setCapHeight(value: Double): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", js.undefined)
    @scala.inline
    def setCharsetEncoding(value: String): Self = this.set("charsetEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsetEncoding: Self = this.set("charsetEncoding", js.undefined)
    @scala.inline
    def setCharsetRegistry(value: String): Self = this.set("charsetRegistry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsetRegistry: Self = this.set("charsetRegistry", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setFaceName(value: String): Self = this.set("faceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceName: Self = this.set("faceName", js.undefined)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontVersion(value: String): Self = this.set("fontVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVersion: Self = this.set("fontVersion", js.undefined)
    @scala.inline
    def setFontnameRegistry(value: String): Self = this.set("fontnameRegistry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontnameRegistry: Self = this.set("fontnameRegistry", js.undefined)
    @scala.inline
    def setFoundry(value: String): Self = this.set("foundry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoundry: Self = this.set("foundry", js.undefined)
    @scala.inline
    def setNotice(value: String): Self = this.set("notice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotice: Self = this.set("notice", js.undefined)
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    @scala.inline
    def setResolutionX(value: Double): Self = this.set("resolutionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionX: Self = this.set("resolutionX", js.undefined)
    @scala.inline
    def setResolutionY(value: Double): Self = this.set("resolutionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionY: Self = this.set("resolutionY", js.undefined)
    @scala.inline
    def setSetwidthName(value: String): Self = this.set("setwidthName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetwidthName: Self = this.set("setwidthName", js.undefined)
    @scala.inline
    def setSlant(value: String): Self = this.set("slant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlant: Self = this.set("slant", js.undefined)
    @scala.inline
    def setSpacing(value: String): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setWeightName(value: String): Self = this.set("weightName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightName: Self = this.set("weightName", js.undefined)
    @scala.inline
    def setXHeight(value: Double): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXHeight: Self = this.set("xHeight", js.undefined)
  }
  
}

