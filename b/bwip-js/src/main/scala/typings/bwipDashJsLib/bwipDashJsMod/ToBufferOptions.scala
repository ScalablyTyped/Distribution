package typings
package bwipDashJsLib.bwipDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToBufferOptions extends js.Object {
  var addontextfont: js.UndefOr[java.lang.String] = js.undefined
  var addontextsize: js.UndefOr[scala.Double] = js.undefined
  var addontextxoffset: js.UndefOr[scala.Double] = js.undefined
  var addontextyoffset: js.UndefOr[scala.Double] = js.undefined
  var alttext: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundcolor: js.UndefOr[java.lang.String] = js.undefined
  var barcolor: js.UndefOr[java.lang.String] = js.undefined
  var bcid: java.lang.String
  var boraderbottom: js.UndefOr[scala.Double] = js.undefined
  var bordercolor: js.UndefOr[java.lang.String] = js.undefined
  var borderleft: js.UndefOr[scala.Double] = js.undefined
  var borderright: js.UndefOr[scala.Double] = js.undefined
  var bordertop: js.UndefOr[scala.Double] = js.undefined
  var borderwidth: js.UndefOr[scala.Double] = js.undefined
  var guardheight: js.UndefOr[scala.Double] = js.undefined
  var guardleftpos: js.UndefOr[scala.Double] = js.undefined
  var guardleftypos: js.UndefOr[scala.Double] = js.undefined
  var guardrightpos: js.UndefOr[scala.Double] = js.undefined
  var guardrightypos: js.UndefOr[scala.Double] = js.undefined
  var guardwhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var guardwidth: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var includecheck: js.UndefOr[scala.Boolean] = js.undefined
  var includecheckintext: js.UndefOr[scala.Boolean] = js.undefined
  var includetext: js.UndefOr[scala.Boolean] = js.undefined
  var inkspread: js.UndefOr[scala.Double] = js.undefined
  var inkspreadh: js.UndefOr[scala.Double] = js.undefined
  var inkspreadv: js.UndefOr[scala.Double] = js.undefined
  var monochrome: js.UndefOr[scala.Boolean] = js.undefined
  var paddingheight: js.UndefOr[scala.Double] = js.undefined
  var paddingwidth: js.UndefOr[scala.Double] = js.undefined
  var parse: js.UndefOr[scala.Boolean] = js.undefined
  var parsefunc: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[
    bwipDashJsLib.bwipDashJsLibStrings.N | bwipDashJsLib.bwipDashJsLibStrings.R | bwipDashJsLib.bwipDashJsLibStrings.L | bwipDashJsLib.bwipDashJsLibStrings.I
  ] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  var showborder: js.UndefOr[scala.Boolean] = js.undefined
  var sizelimit: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
  var textcolor: js.UndefOr[java.lang.String] = js.undefined
  var textfont: js.UndefOr[java.lang.String] = js.undefined
  var textgaps: js.UndefOr[scala.Double] = js.undefined
  var textsize: js.UndefOr[scala.Double] = js.undefined
  var textxalign: js.UndefOr[
    bwipDashJsLib.bwipDashJsLibStrings.offleft | bwipDashJsLib.bwipDashJsLibStrings.left | bwipDashJsLib.bwipDashJsLibStrings.center | bwipDashJsLib.bwipDashJsLibStrings.right | bwipDashJsLib.bwipDashJsLibStrings.offright | bwipDashJsLib.bwipDashJsLibStrings.justify
  ] = js.undefined
  var textxoffset: js.UndefOr[scala.Double] = js.undefined
  var textyalign: js.UndefOr[
    bwipDashJsLib.bwipDashJsLibStrings.below | bwipDashJsLib.bwipDashJsLibStrings.center | bwipDashJsLib.bwipDashJsLibStrings.above
  ] = js.undefined
  var textyoffset: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ToBufferOptions {
  @scala.inline
  def apply(
    bcid: java.lang.String,
    text: java.lang.String,
    addontextfont: java.lang.String = null,
    addontextsize: scala.Int | scala.Double = null,
    addontextxoffset: scala.Int | scala.Double = null,
    addontextyoffset: scala.Int | scala.Double = null,
    alttext: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundcolor: java.lang.String = null,
    barcolor: java.lang.String = null,
    boraderbottom: scala.Int | scala.Double = null,
    bordercolor: java.lang.String = null,
    borderleft: scala.Int | scala.Double = null,
    borderright: scala.Int | scala.Double = null,
    bordertop: scala.Int | scala.Double = null,
    borderwidth: scala.Int | scala.Double = null,
    guardheight: scala.Int | scala.Double = null,
    guardleftpos: scala.Int | scala.Double = null,
    guardleftypos: scala.Int | scala.Double = null,
    guardrightpos: scala.Int | scala.Double = null,
    guardrightypos: scala.Int | scala.Double = null,
    guardwhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    guardwidth: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    includecheck: js.UndefOr[scala.Boolean] = js.undefined,
    includecheckintext: js.UndefOr[scala.Boolean] = js.undefined,
    includetext: js.UndefOr[scala.Boolean] = js.undefined,
    inkspread: scala.Int | scala.Double = null,
    inkspreadh: scala.Int | scala.Double = null,
    inkspreadv: scala.Int | scala.Double = null,
    monochrome: js.UndefOr[scala.Boolean] = js.undefined,
    paddingheight: scala.Int | scala.Double = null,
    paddingwidth: scala.Int | scala.Double = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    parsefunc: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: bwipDashJsLib.bwipDashJsLibStrings.N | bwipDashJsLib.bwipDashJsLibStrings.R | bwipDashJsLib.bwipDashJsLibStrings.L | bwipDashJsLib.bwipDashJsLibStrings.I = null,
    scale: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    showborder: js.UndefOr[scala.Boolean] = js.undefined,
    sizelimit: scala.Int | scala.Double = null,
    textcolor: java.lang.String = null,
    textfont: java.lang.String = null,
    textgaps: scala.Int | scala.Double = null,
    textsize: scala.Int | scala.Double = null,
    textxalign: bwipDashJsLib.bwipDashJsLibStrings.offleft | bwipDashJsLib.bwipDashJsLibStrings.left | bwipDashJsLib.bwipDashJsLibStrings.center | bwipDashJsLib.bwipDashJsLibStrings.right | bwipDashJsLib.bwipDashJsLibStrings.offright | bwipDashJsLib.bwipDashJsLibStrings.justify = null,
    textxoffset: scala.Int | scala.Double = null,
    textyalign: bwipDashJsLib.bwipDashJsLibStrings.below | bwipDashJsLib.bwipDashJsLibStrings.center | bwipDashJsLib.bwipDashJsLibStrings.above = null,
    textyoffset: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ToBufferOptions = {
    val __obj = js.Dynamic.literal(bcid = bcid, text = text)
    if (addontextfont != null) __obj.updateDynamic("addontextfont")(addontextfont)
    if (addontextsize != null) __obj.updateDynamic("addontextsize")(addontextsize.asInstanceOf[js.Any])
    if (addontextxoffset != null) __obj.updateDynamic("addontextxoffset")(addontextxoffset.asInstanceOf[js.Any])
    if (addontextyoffset != null) __obj.updateDynamic("addontextyoffset")(addontextyoffset.asInstanceOf[js.Any])
    if (!js.isUndefined(alttext)) __obj.updateDynamic("alttext")(alttext)
    if (backgroundcolor != null) __obj.updateDynamic("backgroundcolor")(backgroundcolor)
    if (barcolor != null) __obj.updateDynamic("barcolor")(barcolor)
    if (boraderbottom != null) __obj.updateDynamic("boraderbottom")(boraderbottom.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor)
    if (borderleft != null) __obj.updateDynamic("borderleft")(borderleft.asInstanceOf[js.Any])
    if (borderright != null) __obj.updateDynamic("borderright")(borderright.asInstanceOf[js.Any])
    if (bordertop != null) __obj.updateDynamic("bordertop")(bordertop.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (guardheight != null) __obj.updateDynamic("guardheight")(guardheight.asInstanceOf[js.Any])
    if (guardleftpos != null) __obj.updateDynamic("guardleftpos")(guardleftpos.asInstanceOf[js.Any])
    if (guardleftypos != null) __obj.updateDynamic("guardleftypos")(guardleftypos.asInstanceOf[js.Any])
    if (guardrightpos != null) __obj.updateDynamic("guardrightpos")(guardrightpos.asInstanceOf[js.Any])
    if (guardrightypos != null) __obj.updateDynamic("guardrightypos")(guardrightypos.asInstanceOf[js.Any])
    if (!js.isUndefined(guardwhitespace)) __obj.updateDynamic("guardwhitespace")(guardwhitespace)
    if (guardwidth != null) __obj.updateDynamic("guardwidth")(guardwidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(includecheck)) __obj.updateDynamic("includecheck")(includecheck)
    if (!js.isUndefined(includecheckintext)) __obj.updateDynamic("includecheckintext")(includecheckintext)
    if (!js.isUndefined(includetext)) __obj.updateDynamic("includetext")(includetext)
    if (inkspread != null) __obj.updateDynamic("inkspread")(inkspread.asInstanceOf[js.Any])
    if (inkspreadh != null) __obj.updateDynamic("inkspreadh")(inkspreadh.asInstanceOf[js.Any])
    if (inkspreadv != null) __obj.updateDynamic("inkspreadv")(inkspreadv.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome)
    if (paddingheight != null) __obj.updateDynamic("paddingheight")(paddingheight.asInstanceOf[js.Any])
    if (paddingwidth != null) __obj.updateDynamic("paddingwidth")(paddingwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(parsefunc)) __obj.updateDynamic("parsefunc")(parsefunc)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(showborder)) __obj.updateDynamic("showborder")(showborder)
    if (sizelimit != null) __obj.updateDynamic("sizelimit")(sizelimit.asInstanceOf[js.Any])
    if (textcolor != null) __obj.updateDynamic("textcolor")(textcolor)
    if (textfont != null) __obj.updateDynamic("textfont")(textfont)
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

