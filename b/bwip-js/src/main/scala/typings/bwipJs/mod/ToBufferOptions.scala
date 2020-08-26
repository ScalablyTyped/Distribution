package typings.bwipJs.mod

import typings.bwipJs.bwipJsStrings.I
import typings.bwipJs.bwipJsStrings.L
import typings.bwipJs.bwipJsStrings.N
import typings.bwipJs.bwipJsStrings.R
import typings.bwipJs.bwipJsStrings.above
import typings.bwipJs.bwipJsStrings.below
import typings.bwipJs.bwipJsStrings.center
import typings.bwipJs.bwipJsStrings.justify
import typings.bwipJs.bwipJsStrings.left
import typings.bwipJs.bwipJsStrings.offleft
import typings.bwipJs.bwipJsStrings.offright
import typings.bwipJs.bwipJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToBufferOptions extends js.Object {
  var addontextfont: js.UndefOr[String] = js.native
  var addontextsize: js.UndefOr[Double] = js.native
  var addontextxoffset: js.UndefOr[Double] = js.native
  var addontextyoffset: js.UndefOr[Double] = js.native
  var alttext: js.UndefOr[Boolean] = js.native
  var backgroundcolor: js.UndefOr[String] = js.native
  var barcolor: js.UndefOr[String] = js.native
  var bcid: String = js.native
  var boraderbottom: js.UndefOr[Double] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderleft: js.UndefOr[Double] = js.native
  var borderright: js.UndefOr[Double] = js.native
  var bordertop: js.UndefOr[Double] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var guardheight: js.UndefOr[Double] = js.native
  var guardleftpos: js.UndefOr[Double] = js.native
  var guardleftypos: js.UndefOr[Double] = js.native
  var guardrightpos: js.UndefOr[Double] = js.native
  var guardrightypos: js.UndefOr[Double] = js.native
  var guardwhitespace: js.UndefOr[Boolean] = js.native
  var guardwidth: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var includecheck: js.UndefOr[Boolean] = js.native
  var includecheckintext: js.UndefOr[Boolean] = js.native
  var includetext: js.UndefOr[Boolean] = js.native
  var inkspread: js.UndefOr[Double] = js.native
  var inkspreadh: js.UndefOr[Double] = js.native
  var inkspreadv: js.UndefOr[Double] = js.native
  var monochrome: js.UndefOr[Boolean] = js.native
  var paddingheight: js.UndefOr[Double] = js.native
  var paddingwidth: js.UndefOr[Double] = js.native
  var parse: js.UndefOr[Boolean] = js.native
  var parsefunc: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[N | R | L | I] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scaleX: js.UndefOr[Double] = js.native
  var scaleY: js.UndefOr[Double] = js.native
  var showborder: js.UndefOr[Boolean] = js.native
  var sizelimit: js.UndefOr[Double] = js.native
  var text: String = js.native
  var textcolor: js.UndefOr[String] = js.native
  var textfont: js.UndefOr[String] = js.native
  var textgaps: js.UndefOr[Double] = js.native
  var textsize: js.UndefOr[Double] = js.native
  var textxalign: js.UndefOr[offleft | left | center | right | offright | justify] = js.native
  var textxoffset: js.UndefOr[Double] = js.native
  var textyalign: js.UndefOr[below | center | above] = js.native
  var textyoffset: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ToBufferOptions {
  @scala.inline
  def apply(bcid: String, text: String): ToBufferOptions = {
    val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBufferOptions]
  }
  @scala.inline
  implicit class ToBufferOptionsOps[Self <: ToBufferOptions] (val x: Self) extends AnyVal {
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
    def setBcid(value: String): Self = this.set("bcid", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddontextfont(value: String): Self = this.set("addontextfont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddontextfont: Self = this.set("addontextfont", js.undefined)
    @scala.inline
    def setAddontextsize(value: Double): Self = this.set("addontextsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddontextsize: Self = this.set("addontextsize", js.undefined)
    @scala.inline
    def setAddontextxoffset(value: Double): Self = this.set("addontextxoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddontextxoffset: Self = this.set("addontextxoffset", js.undefined)
    @scala.inline
    def setAddontextyoffset(value: Double): Self = this.set("addontextyoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddontextyoffset: Self = this.set("addontextyoffset", js.undefined)
    @scala.inline
    def setAlttext(value: Boolean): Self = this.set("alttext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlttext: Self = this.set("alttext", js.undefined)
    @scala.inline
    def setBackgroundcolor(value: String): Self = this.set("backgroundcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundcolor: Self = this.set("backgroundcolor", js.undefined)
    @scala.inline
    def setBarcolor(value: String): Self = this.set("barcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarcolor: Self = this.set("barcolor", js.undefined)
    @scala.inline
    def setBoraderbottom(value: Double): Self = this.set("boraderbottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoraderbottom: Self = this.set("boraderbottom", js.undefined)
    @scala.inline
    def setBordercolor(value: String): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    @scala.inline
    def setBorderleft(value: Double): Self = this.set("borderleft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderleft: Self = this.set("borderleft", js.undefined)
    @scala.inline
    def setBorderright(value: Double): Self = this.set("borderright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderright: Self = this.set("borderright", js.undefined)
    @scala.inline
    def setBordertop(value: Double): Self = this.set("bordertop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordertop: Self = this.set("bordertop", js.undefined)
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    @scala.inline
    def setGuardheight(value: Double): Self = this.set("guardheight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardheight: Self = this.set("guardheight", js.undefined)
    @scala.inline
    def setGuardleftpos(value: Double): Self = this.set("guardleftpos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardleftpos: Self = this.set("guardleftpos", js.undefined)
    @scala.inline
    def setGuardleftypos(value: Double): Self = this.set("guardleftypos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardleftypos: Self = this.set("guardleftypos", js.undefined)
    @scala.inline
    def setGuardrightpos(value: Double): Self = this.set("guardrightpos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardrightpos: Self = this.set("guardrightpos", js.undefined)
    @scala.inline
    def setGuardrightypos(value: Double): Self = this.set("guardrightypos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardrightypos: Self = this.set("guardrightypos", js.undefined)
    @scala.inline
    def setGuardwhitespace(value: Boolean): Self = this.set("guardwhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardwhitespace: Self = this.set("guardwhitespace", js.undefined)
    @scala.inline
    def setGuardwidth(value: Double): Self = this.set("guardwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardwidth: Self = this.set("guardwidth", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIncludecheck(value: Boolean): Self = this.set("includecheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludecheck: Self = this.set("includecheck", js.undefined)
    @scala.inline
    def setIncludecheckintext(value: Boolean): Self = this.set("includecheckintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludecheckintext: Self = this.set("includecheckintext", js.undefined)
    @scala.inline
    def setIncludetext(value: Boolean): Self = this.set("includetext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludetext: Self = this.set("includetext", js.undefined)
    @scala.inline
    def setInkspread(value: Double): Self = this.set("inkspread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkspread: Self = this.set("inkspread", js.undefined)
    @scala.inline
    def setInkspreadh(value: Double): Self = this.set("inkspreadh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkspreadh: Self = this.set("inkspreadh", js.undefined)
    @scala.inline
    def setInkspreadv(value: Double): Self = this.set("inkspreadv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkspreadv: Self = this.set("inkspreadv", js.undefined)
    @scala.inline
    def setMonochrome(value: Boolean): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    @scala.inline
    def setPaddingheight(value: Double): Self = this.set("paddingheight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingheight: Self = this.set("paddingheight", js.undefined)
    @scala.inline
    def setPaddingwidth(value: Double): Self = this.set("paddingwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingwidth: Self = this.set("paddingwidth", js.undefined)
    @scala.inline
    def setParse(value: Boolean): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setParsefunc(value: Boolean): Self = this.set("parsefunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsefunc: Self = this.set("parsefunc", js.undefined)
    @scala.inline
    def setRotate(value: N | R | L | I): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setShowborder(value: Boolean): Self = this.set("showborder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowborder: Self = this.set("showborder", js.undefined)
    @scala.inline
    def setSizelimit(value: Double): Self = this.set("sizelimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizelimit: Self = this.set("sizelimit", js.undefined)
    @scala.inline
    def setTextcolor(value: String): Self = this.set("textcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextcolor: Self = this.set("textcolor", js.undefined)
    @scala.inline
    def setTextfont(value: String): Self = this.set("textfont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextfont: Self = this.set("textfont", js.undefined)
    @scala.inline
    def setTextgaps(value: Double): Self = this.set("textgaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextgaps: Self = this.set("textgaps", js.undefined)
    @scala.inline
    def setTextsize(value: Double): Self = this.set("textsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextsize: Self = this.set("textsize", js.undefined)
    @scala.inline
    def setTextxalign(value: offleft | left | center | right | offright | justify): Self = this.set("textxalign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextxalign: Self = this.set("textxalign", js.undefined)
    @scala.inline
    def setTextxoffset(value: Double): Self = this.set("textxoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextxoffset: Self = this.set("textxoffset", js.undefined)
    @scala.inline
    def setTextyalign(value: below | center | above): Self = this.set("textyalign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextyalign: Self = this.set("textyalign", js.undefined)
    @scala.inline
    def setTextyoffset(value: Double): Self = this.set("textyoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextyoffset: Self = this.set("textyoffset", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

