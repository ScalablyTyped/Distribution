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
    addontextsize: js.UndefOr[Double] = js.undefined,
    addontextxoffset: js.UndefOr[Double] = js.undefined,
    addontextyoffset: js.UndefOr[Double] = js.undefined,
    alttext: js.UndefOr[Boolean] = js.undefined,
    backgroundcolor: String = null,
    barcolor: String = null,
    boraderbottom: js.UndefOr[Double] = js.undefined,
    bordercolor: String = null,
    borderleft: js.UndefOr[Double] = js.undefined,
    borderright: js.UndefOr[Double] = js.undefined,
    bordertop: js.UndefOr[Double] = js.undefined,
    borderwidth: js.UndefOr[Double] = js.undefined,
    guardheight: js.UndefOr[Double] = js.undefined,
    guardleftpos: js.UndefOr[Double] = js.undefined,
    guardleftypos: js.UndefOr[Double] = js.undefined,
    guardrightpos: js.UndefOr[Double] = js.undefined,
    guardrightypos: js.UndefOr[Double] = js.undefined,
    guardwhitespace: js.UndefOr[Boolean] = js.undefined,
    guardwidth: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    includecheck: js.UndefOr[Boolean] = js.undefined,
    includecheckintext: js.UndefOr[Boolean] = js.undefined,
    includetext: js.UndefOr[Boolean] = js.undefined,
    inkspread: js.UndefOr[Double] = js.undefined,
    inkspreadh: js.UndefOr[Double] = js.undefined,
    inkspreadv: js.UndefOr[Double] = js.undefined,
    monochrome: js.UndefOr[Boolean] = js.undefined,
    paddingheight: js.UndefOr[Double] = js.undefined,
    paddingwidth: js.UndefOr[Double] = js.undefined,
    parse: js.UndefOr[Boolean] = js.undefined,
    parsefunc: js.UndefOr[Boolean] = js.undefined,
    rotate: N | R | L | I = null,
    scale: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    showborder: js.UndefOr[Boolean] = js.undefined,
    sizelimit: js.UndefOr[Double] = js.undefined,
    textcolor: String = null,
    textfont: String = null,
    textgaps: js.UndefOr[Double] = js.undefined,
    textsize: js.UndefOr[Double] = js.undefined,
    textxalign: offleft | left | center | right | offright | justify = null,
    textxoffset: js.UndefOr[Double] = js.undefined,
    textyalign: below | center | above = null,
    textyoffset: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ToBufferOptions = {
    val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (addontextfont != null) __obj.updateDynamic("addontextfont")(addontextfont.asInstanceOf[js.Any])
    if (!js.isUndefined(addontextsize)) __obj.updateDynamic("addontextsize")(addontextsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addontextxoffset)) __obj.updateDynamic("addontextxoffset")(addontextxoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addontextyoffset)) __obj.updateDynamic("addontextyoffset")(addontextyoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alttext)) __obj.updateDynamic("alttext")(alttext.get.asInstanceOf[js.Any])
    if (backgroundcolor != null) __obj.updateDynamic("backgroundcolor")(backgroundcolor.asInstanceOf[js.Any])
    if (barcolor != null) __obj.updateDynamic("barcolor")(barcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(boraderbottom)) __obj.updateDynamic("boraderbottom")(boraderbottom.get.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderleft)) __obj.updateDynamic("borderleft")(borderleft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderright)) __obj.updateDynamic("borderright")(borderright.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bordertop)) __obj.updateDynamic("bordertop")(bordertop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardheight)) __obj.updateDynamic("guardheight")(guardheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardleftpos)) __obj.updateDynamic("guardleftpos")(guardleftpos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardleftypos)) __obj.updateDynamic("guardleftypos")(guardleftypos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardrightpos)) __obj.updateDynamic("guardrightpos")(guardrightpos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardrightypos)) __obj.updateDynamic("guardrightypos")(guardrightypos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardwhitespace)) __obj.updateDynamic("guardwhitespace")(guardwhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guardwidth)) __obj.updateDynamic("guardwidth")(guardwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includecheck)) __obj.updateDynamic("includecheck")(includecheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includecheckintext)) __obj.updateDynamic("includecheckintext")(includecheckintext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includetext)) __obj.updateDynamic("includetext")(includetext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inkspread)) __obj.updateDynamic("inkspread")(inkspread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inkspreadh)) __obj.updateDynamic("inkspreadh")(inkspreadh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inkspreadv)) __obj.updateDynamic("inkspreadv")(inkspreadv.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingheight)) __obj.updateDynamic("paddingheight")(paddingheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingwidth)) __obj.updateDynamic("paddingwidth")(paddingwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parsefunc)) __obj.updateDynamic("parsefunc")(parsefunc.get.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showborder)) __obj.updateDynamic("showborder")(showborder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizelimit)) __obj.updateDynamic("sizelimit")(sizelimit.get.asInstanceOf[js.Any])
    if (textcolor != null) __obj.updateDynamic("textcolor")(textcolor.asInstanceOf[js.Any])
    if (textfont != null) __obj.updateDynamic("textfont")(textfont.asInstanceOf[js.Any])
    if (!js.isUndefined(textgaps)) __obj.updateDynamic("textgaps")(textgaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textsize)) __obj.updateDynamic("textsize")(textsize.get.asInstanceOf[js.Any])
    if (textxalign != null) __obj.updateDynamic("textxalign")(textxalign.asInstanceOf[js.Any])
    if (!js.isUndefined(textxoffset)) __obj.updateDynamic("textxoffset")(textxoffset.get.asInstanceOf[js.Any])
    if (textyalign != null) __obj.updateDynamic("textyalign")(textyalign.asInstanceOf[js.Any])
    if (!js.isUndefined(textyoffset)) __obj.updateDynamic("textyoffset")(textyoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBufferOptions]
  }
}

