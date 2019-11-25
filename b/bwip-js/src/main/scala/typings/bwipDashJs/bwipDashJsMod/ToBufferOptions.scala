package typings.bwipDashJs.bwipDashJsMod

import typings.bwipDashJs.bwipDashJsStrings.I
import typings.bwipDashJs.bwipDashJsStrings.L
import typings.bwipDashJs.bwipDashJsStrings.N
import typings.bwipDashJs.bwipDashJsStrings.R
import typings.bwipDashJs.bwipDashJsStrings.above
import typings.bwipDashJs.bwipDashJsStrings.below
import typings.bwipDashJs.bwipDashJsStrings.center
import typings.bwipDashJs.bwipDashJsStrings.justify
import typings.bwipDashJs.bwipDashJsStrings.left
import typings.bwipDashJs.bwipDashJsStrings.offleft
import typings.bwipDashJs.bwipDashJsStrings.offright
import typings.bwipDashJs.bwipDashJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToBufferOptions extends js.Object {
  var addontextfont: js.UndefOr[String] = js.undefined
  var addontextsize: js.UndefOr[Double] = js.undefined
  var addontextxoffset: js.UndefOr[Double] = js.undefined
  var addontextyoffset: js.UndefOr[Double] = js.undefined
  var alttext: js.UndefOr[Boolean] = js.undefined
  var backgroundcolor: js.UndefOr[String] = js.undefined
  var barcolor: js.UndefOr[String] = js.undefined
  var bcid: String
  var boraderbottom: js.UndefOr[Double] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderleft: js.UndefOr[Double] = js.undefined
  var borderright: js.UndefOr[Double] = js.undefined
  var bordertop: js.UndefOr[Double] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var guardheight: js.UndefOr[Double] = js.undefined
  var guardleftpos: js.UndefOr[Double] = js.undefined
  var guardleftypos: js.UndefOr[Double] = js.undefined
  var guardrightpos: js.UndefOr[Double] = js.undefined
  var guardrightypos: js.UndefOr[Double] = js.undefined
  var guardwhitespace: js.UndefOr[Boolean] = js.undefined
  var guardwidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var includecheck: js.UndefOr[Boolean] = js.undefined
  var includecheckintext: js.UndefOr[Boolean] = js.undefined
  var includetext: js.UndefOr[Boolean] = js.undefined
  var inkspread: js.UndefOr[Double] = js.undefined
  var inkspreadh: js.UndefOr[Double] = js.undefined
  var inkspreadv: js.UndefOr[Double] = js.undefined
  var monochrome: js.UndefOr[Boolean] = js.undefined
  var paddingheight: js.UndefOr[Double] = js.undefined
  var paddingwidth: js.UndefOr[Double] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
  var parsefunc: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[N | R | L | I] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var showborder: js.UndefOr[Boolean] = js.undefined
  var sizelimit: js.UndefOr[Double] = js.undefined
  var text: String
  var textcolor: js.UndefOr[String] = js.undefined
  var textfont: js.UndefOr[String] = js.undefined
  var textgaps: js.UndefOr[Double] = js.undefined
  var textsize: js.UndefOr[Double] = js.undefined
  var textxalign: js.UndefOr[offleft | left | center | right | offright | justify] = js.undefined
  var textxoffset: js.UndefOr[Double] = js.undefined
  var textyalign: js.UndefOr[below | center | above] = js.undefined
  var textyoffset: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ToBufferOptions {
  @scala.inline
  def apply(
    bcid: String,
    text: String,
    addontextfont: String = null,
    addontextsize: Int | Double = null,
    addontextxoffset: Int | Double = null,
    addontextyoffset: Int | Double = null,
    alttext: js.UndefOr[Boolean] = js.undefined,
    backgroundcolor: String = null,
    barcolor: String = null,
    boraderbottom: Int | Double = null,
    bordercolor: String = null,
    borderleft: Int | Double = null,
    borderright: Int | Double = null,
    bordertop: Int | Double = null,
    borderwidth: Int | Double = null,
    guardheight: Int | Double = null,
    guardleftpos: Int | Double = null,
    guardleftypos: Int | Double = null,
    guardrightpos: Int | Double = null,
    guardrightypos: Int | Double = null,
    guardwhitespace: js.UndefOr[Boolean] = js.undefined,
    guardwidth: Int | Double = null,
    height: Int | Double = null,
    includecheck: js.UndefOr[Boolean] = js.undefined,
    includecheckintext: js.UndefOr[Boolean] = js.undefined,
    includetext: js.UndefOr[Boolean] = js.undefined,
    inkspread: Int | Double = null,
    inkspreadh: Int | Double = null,
    inkspreadv: Int | Double = null,
    monochrome: js.UndefOr[Boolean] = js.undefined,
    paddingheight: Int | Double = null,
    paddingwidth: Int | Double = null,
    parse: js.UndefOr[Boolean] = js.undefined,
    parsefunc: js.UndefOr[Boolean] = js.undefined,
    rotate: N | R | L | I = null,
    scale: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    showborder: js.UndefOr[Boolean] = js.undefined,
    sizelimit: Int | Double = null,
    textcolor: String = null,
    textfont: String = null,
    textgaps: Int | Double = null,
    textsize: Int | Double = null,
    textxalign: offleft | left | center | right | offright | justify = null,
    textxoffset: Int | Double = null,
    textyalign: below | center | above = null,
    textyoffset: Int | Double = null,
    width: Int | Double = null
  ): ToBufferOptions = {
    val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (addontextfont != null) __obj.updateDynamic("addontextfont")(addontextfont.asInstanceOf[js.Any])
    if (addontextsize != null) __obj.updateDynamic("addontextsize")(addontextsize.asInstanceOf[js.Any])
    if (addontextxoffset != null) __obj.updateDynamic("addontextxoffset")(addontextxoffset.asInstanceOf[js.Any])
    if (addontextyoffset != null) __obj.updateDynamic("addontextyoffset")(addontextyoffset.asInstanceOf[js.Any])
    if (!js.isUndefined(alttext)) __obj.updateDynamic("alttext")(alttext.asInstanceOf[js.Any])
    if (backgroundcolor != null) __obj.updateDynamic("backgroundcolor")(backgroundcolor.asInstanceOf[js.Any])
    if (barcolor != null) __obj.updateDynamic("barcolor")(barcolor.asInstanceOf[js.Any])
    if (boraderbottom != null) __obj.updateDynamic("boraderbottom")(boraderbottom.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderleft != null) __obj.updateDynamic("borderleft")(borderleft.asInstanceOf[js.Any])
    if (borderright != null) __obj.updateDynamic("borderright")(borderright.asInstanceOf[js.Any])
    if (bordertop != null) __obj.updateDynamic("bordertop")(bordertop.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (guardheight != null) __obj.updateDynamic("guardheight")(guardheight.asInstanceOf[js.Any])
    if (guardleftpos != null) __obj.updateDynamic("guardleftpos")(guardleftpos.asInstanceOf[js.Any])
    if (guardleftypos != null) __obj.updateDynamic("guardleftypos")(guardleftypos.asInstanceOf[js.Any])
    if (guardrightpos != null) __obj.updateDynamic("guardrightpos")(guardrightpos.asInstanceOf[js.Any])
    if (guardrightypos != null) __obj.updateDynamic("guardrightypos")(guardrightypos.asInstanceOf[js.Any])
    if (!js.isUndefined(guardwhitespace)) __obj.updateDynamic("guardwhitespace")(guardwhitespace.asInstanceOf[js.Any])
    if (guardwidth != null) __obj.updateDynamic("guardwidth")(guardwidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(includecheck)) __obj.updateDynamic("includecheck")(includecheck.asInstanceOf[js.Any])
    if (!js.isUndefined(includecheckintext)) __obj.updateDynamic("includecheckintext")(includecheckintext.asInstanceOf[js.Any])
    if (!js.isUndefined(includetext)) __obj.updateDynamic("includetext")(includetext.asInstanceOf[js.Any])
    if (inkspread != null) __obj.updateDynamic("inkspread")(inkspread.asInstanceOf[js.Any])
    if (inkspreadh != null) __obj.updateDynamic("inkspreadh")(inkspreadh.asInstanceOf[js.Any])
    if (inkspreadv != null) __obj.updateDynamic("inkspreadv")(inkspreadv.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (paddingheight != null) __obj.updateDynamic("paddingheight")(paddingheight.asInstanceOf[js.Any])
    if (paddingwidth != null) __obj.updateDynamic("paddingwidth")(paddingwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(parsefunc)) __obj.updateDynamic("parsefunc")(parsefunc.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(showborder)) __obj.updateDynamic("showborder")(showborder.asInstanceOf[js.Any])
    if (sizelimit != null) __obj.updateDynamic("sizelimit")(sizelimit.asInstanceOf[js.Any])
    if (textcolor != null) __obj.updateDynamic("textcolor")(textcolor.asInstanceOf[js.Any])
    if (textfont != null) __obj.updateDynamic("textfont")(textfont.asInstanceOf[js.Any])
    if (textgaps != null) __obj.updateDynamic("textgaps")(textgaps.asInstanceOf[js.Any])
    if (textsize != null) __obj.updateDynamic("textsize")(textsize.asInstanceOf[js.Any])
    if (textxalign != null) __obj.updateDynamic("textxalign")(textxalign.asInstanceOf[js.Any])
    if (textxoffset != null) __obj.updateDynamic("textxoffset")(textxoffset.asInstanceOf[js.Any])
    if (textyalign != null) __obj.updateDynamic("textyalign")(textyalign.asInstanceOf[js.Any])
    if (textyoffset != null) __obj.updateDynamic("textyoffset")(textyoffset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBufferOptions]
  }
}

