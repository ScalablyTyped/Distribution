package typings.bwipJs

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
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The Browser version of the library's functionality, which makes use of an HTMLCanvasElement for rendering.
    * @param canvas ID string or HTML element of the canvas to render within
    * @param opts Options to use for rendering
    * @param callback Function to execute when rendering has completed or failed
    */
  @scala.inline
  def apply(
    canvas: String,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse, opts: ToBufferOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("bwip-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadFont(fontName: String, sizeMulti: Double, fontFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(fontName.asInstanceOf[js.Any], sizeMulti.asInstanceOf[js.Any], fontFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toBuffer(opts: ToBufferOptions, callback: js.Function2[/* err */ String | Error, /* png */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toCanvas(canvas: String, opts: ToBufferOptions): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  @scala.inline
  def toCanvas(canvas: HTMLCanvasElement, opts: ToBufferOptions): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  trait ToBufferOptions extends StObject {
    
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
    def apply(bcid: String, text: String): ToBufferOptions = {
      val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToBufferOptions]
    }
    
    @scala.inline
    implicit class ToBufferOptionsMutableBuilder[Self <: ToBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddontextfont(value: String): Self = StObject.set(x, "addontextfont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddontextfontUndefined: Self = StObject.set(x, "addontextfont", js.undefined)
      
      @scala.inline
      def setAddontextsize(value: Double): Self = StObject.set(x, "addontextsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddontextsizeUndefined: Self = StObject.set(x, "addontextsize", js.undefined)
      
      @scala.inline
      def setAddontextxoffset(value: Double): Self = StObject.set(x, "addontextxoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddontextxoffsetUndefined: Self = StObject.set(x, "addontextxoffset", js.undefined)
      
      @scala.inline
      def setAddontextyoffset(value: Double): Self = StObject.set(x, "addontextyoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddontextyoffsetUndefined: Self = StObject.set(x, "addontextyoffset", js.undefined)
      
      @scala.inline
      def setAlttext(value: Boolean): Self = StObject.set(x, "alttext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlttextUndefined: Self = StObject.set(x, "alttext", js.undefined)
      
      @scala.inline
      def setBackgroundcolor(value: String): Self = StObject.set(x, "backgroundcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundcolorUndefined: Self = StObject.set(x, "backgroundcolor", js.undefined)
      
      @scala.inline
      def setBarcolor(value: String): Self = StObject.set(x, "barcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarcolorUndefined: Self = StObject.set(x, "barcolor", js.undefined)
      
      @scala.inline
      def setBcid(value: String): Self = StObject.set(x, "bcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoraderbottom(value: Double): Self = StObject.set(x, "boraderbottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoraderbottomUndefined: Self = StObject.set(x, "boraderbottom", js.undefined)
      
      @scala.inline
      def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
      
      @scala.inline
      def setBorderleft(value: Double): Self = StObject.set(x, "borderleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderleftUndefined: Self = StObject.set(x, "borderleft", js.undefined)
      
      @scala.inline
      def setBorderright(value: Double): Self = StObject.set(x, "borderright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderrightUndefined: Self = StObject.set(x, "borderright", js.undefined)
      
      @scala.inline
      def setBordertop(value: Double): Self = StObject.set(x, "bordertop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordertopUndefined: Self = StObject.set(x, "bordertop", js.undefined)
      
      @scala.inline
      def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
      
      @scala.inline
      def setGuardheight(value: Double): Self = StObject.set(x, "guardheight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardheightUndefined: Self = StObject.set(x, "guardheight", js.undefined)
      
      @scala.inline
      def setGuardleftpos(value: Double): Self = StObject.set(x, "guardleftpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardleftposUndefined: Self = StObject.set(x, "guardleftpos", js.undefined)
      
      @scala.inline
      def setGuardleftypos(value: Double): Self = StObject.set(x, "guardleftypos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardleftyposUndefined: Self = StObject.set(x, "guardleftypos", js.undefined)
      
      @scala.inline
      def setGuardrightpos(value: Double): Self = StObject.set(x, "guardrightpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardrightposUndefined: Self = StObject.set(x, "guardrightpos", js.undefined)
      
      @scala.inline
      def setGuardrightypos(value: Double): Self = StObject.set(x, "guardrightypos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardrightyposUndefined: Self = StObject.set(x, "guardrightypos", js.undefined)
      
      @scala.inline
      def setGuardwhitespace(value: Boolean): Self = StObject.set(x, "guardwhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardwhitespaceUndefined: Self = StObject.set(x, "guardwhitespace", js.undefined)
      
      @scala.inline
      def setGuardwidth(value: Double): Self = StObject.set(x, "guardwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardwidthUndefined: Self = StObject.set(x, "guardwidth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIncludecheck(value: Boolean): Self = StObject.set(x, "includecheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludecheckUndefined: Self = StObject.set(x, "includecheck", js.undefined)
      
      @scala.inline
      def setIncludecheckintext(value: Boolean): Self = StObject.set(x, "includecheckintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludecheckintextUndefined: Self = StObject.set(x, "includecheckintext", js.undefined)
      
      @scala.inline
      def setIncludetext(value: Boolean): Self = StObject.set(x, "includetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludetextUndefined: Self = StObject.set(x, "includetext", js.undefined)
      
      @scala.inline
      def setInkspread(value: Double): Self = StObject.set(x, "inkspread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkspreadUndefined: Self = StObject.set(x, "inkspread", js.undefined)
      
      @scala.inline
      def setInkspreadh(value: Double): Self = StObject.set(x, "inkspreadh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkspreadhUndefined: Self = StObject.set(x, "inkspreadh", js.undefined)
      
      @scala.inline
      def setInkspreadv(value: Double): Self = StObject.set(x, "inkspreadv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkspreadvUndefined: Self = StObject.set(x, "inkspreadv", js.undefined)
      
      @scala.inline
      def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
      
      @scala.inline
      def setPaddingheight(value: Double): Self = StObject.set(x, "paddingheight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingheightUndefined: Self = StObject.set(x, "paddingheight", js.undefined)
      
      @scala.inline
      def setPaddingwidth(value: Double): Self = StObject.set(x, "paddingwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingwidthUndefined: Self = StObject.set(x, "paddingwidth", js.undefined)
      
      @scala.inline
      def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setParsefunc(value: Boolean): Self = StObject.set(x, "parsefunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsefuncUndefined: Self = StObject.set(x, "parsefunc", js.undefined)
      
      @scala.inline
      def setRotate(value: N | R | L | I): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setShowborder(value: Boolean): Self = StObject.set(x, "showborder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowborderUndefined: Self = StObject.set(x, "showborder", js.undefined)
      
      @scala.inline
      def setSizelimit(value: Double): Self = StObject.set(x, "sizelimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizelimitUndefined: Self = StObject.set(x, "sizelimit", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextcolor(value: String): Self = StObject.set(x, "textcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextcolorUndefined: Self = StObject.set(x, "textcolor", js.undefined)
      
      @scala.inline
      def setTextfont(value: String): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextfontUndefined: Self = StObject.set(x, "textfont", js.undefined)
      
      @scala.inline
      def setTextgaps(value: Double): Self = StObject.set(x, "textgaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextgapsUndefined: Self = StObject.set(x, "textgaps", js.undefined)
      
      @scala.inline
      def setTextsize(value: Double): Self = StObject.set(x, "textsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextsizeUndefined: Self = StObject.set(x, "textsize", js.undefined)
      
      @scala.inline
      def setTextxalign(value: offleft | left | center | right | offright | justify): Self = StObject.set(x, "textxalign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextxalignUndefined: Self = StObject.set(x, "textxalign", js.undefined)
      
      @scala.inline
      def setTextxoffset(value: Double): Self = StObject.set(x, "textxoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextxoffsetUndefined: Self = StObject.set(x, "textxoffset", js.undefined)
      
      @scala.inline
      def setTextyalign(value: below | center | above): Self = StObject.set(x, "textyalign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextyalignUndefined: Self = StObject.set(x, "textyalign", js.undefined)
      
      @scala.inline
      def setTextyoffset(value: Double): Self = StObject.set(x, "textyoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextyoffsetUndefined: Self = StObject.set(x, "textyoffset", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
