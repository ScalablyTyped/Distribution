package typings.bwipJs

import typings.bwipJs.anon.Advance
import typings.bwipJs.anon.Ascent
import typings.bwipJs.anon.Bbs
import typings.bwipJs.anon.Cx
import typings.bwipJs.anon.Cx1
import typings.bwipJs.anon.Dx
import typings.bwipJs.anon.Height
import typings.bwipJs.anon.Pixs
import typings.bwipJs.anon.Type
import typings.bwipJs.anon.X
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
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Array
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
  inline def apply(
    canvas: String,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | js.Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    canvas: HTMLCanvasElement,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | js.Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], opts: RenderOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("bwip-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FontLib {
    
    @JSImport("bwip-js", "FontLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getglyph(fontid: Double, charcode: Double, width: Double, height: Double): Advance = (^.asInstanceOf[js.Dynamic].applyDynamic("getglyph")(fontid.asInstanceOf[js.Any], charcode.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Advance]
    
    inline def getpaths(fontid: Double, charcode: Double, width: Double, height: Double): PathData = (^.asInstanceOf[js.Dynamic].applyDynamic("getpaths")(fontid.asInstanceOf[js.Any], charcode.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PathData]
    
    inline def loadFont(name: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadFont(name: String, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadFont(name: String, mult: Double, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], mult.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadFont(name: String, mult: Double, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], mult.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadFont(name: String, multy: Double, multx: Double, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], multy.asInstanceOf[js.Any], multx.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadFont(name: String, multy: Double, multx: Double, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(name.asInstanceOf[js.Any], multy.asInstanceOf[js.Any], multx.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lookup(font: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(font.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def monochrome(mono: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monochrome")(mono.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @js.native
    trait PathData
      extends StObject
         with Array[Type | X | Cx | Cx1] {
      
      var advance: Double = js.native
      
      var ascent: Double = js.native
      
      var descent: Double = js.native
    }
  }
  
  inline def fixupOptions(opts: RenderOptions): RenderOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fixupOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[RenderOptions]
  
  inline def loadFont(fontName: String, sizeMulti: Double, fontFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(fontName.asInstanceOf[js.Any], sizeMulti.asInstanceOf[js.Any], fontFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadFont(fontName: String, sizeMulti: Double, fontFile: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(fontName.asInstanceOf[js.Any], sizeMulti.asInstanceOf[js.Any], fontFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def raw(bcid: String, text: String): js.Array[Bbs | Pixs] = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(bcid.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bbs | Pixs]]
  inline def raw(bcid: String, text: String, opts: String): js.Array[Bbs | Pixs] = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(bcid.asInstanceOf[js.Any], text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bbs | Pixs]]
  inline def raw(bcid: String, text: String, opts: BwippOptions): js.Array[Bbs | Pixs] = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(bcid.asInstanceOf[js.Any], text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bbs | Pixs]]
  inline def raw(options: RawOptions): js.Array[Bbs | Pixs] = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bbs | Pixs]]
  
  inline def render[T](params: RenderOptions, drawing: DrawingOption[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(params.asInstanceOf[js.Any], drawing.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def request(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(req: IncomingMessage, res: ServerResponse[IncomingMessage], opts: RenderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toBuffer(opts: RenderOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def toBuffer(opts: RenderOptions, callback: js.Function2[/* err */ String | js.Error, /* png */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toCanvas(canvas: String, opts: RenderOptions): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def toCanvas(canvas: HTMLCanvasElement, opts: RenderOptions): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def toDataURL(opts: RenderOptions): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
  inline def toDataURL(opts: RenderOptions, callback: js.Function2[/* err */ String | js.Error, /* png */ Height, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BwippOptions extends StObject {
    
    var addontextfont: js.UndefOr[String] = js.undefined
    
    var addontextsize: js.UndefOr[Double] = js.undefined
    
    var addontextxoffset: js.UndefOr[Double] = js.undefined
    
    var addontextyoffset: js.UndefOr[Double] = js.undefined
    
    var alttext: js.UndefOr[String] = js.undefined
    
    var backgroundcolor: js.UndefOr[String] = js.undefined
    
    var barcolor: js.UndefOr[String] = js.undefined
    
    var boraderbottom: js.UndefOr[Double] = js.undefined
    
    var bordercolor: js.UndefOr[String] = js.undefined
    
    var borderleft: js.UndefOr[Double] = js.undefined
    
    var borderright: js.UndefOr[Double] = js.undefined
    
    var bordertop: js.UndefOr[Double] = js.undefined
    
    var borderwidth: js.UndefOr[Double] = js.undefined
    
    var dotty: js.UndefOr[Boolean] = js.undefined
    
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
    
    var parse: js.UndefOr[Boolean] = js.undefined
    
    var parsefnc: js.UndefOr[Boolean] = js.undefined
    
    var showborder: js.UndefOr[Boolean] = js.undefined
    
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
  object BwippOptions {
    
    inline def apply(): BwippOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BwippOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BwippOptions] (val x: Self) extends AnyVal {
      
      inline def setAddontextfont(value: String): Self = StObject.set(x, "addontextfont", value.asInstanceOf[js.Any])
      
      inline def setAddontextfontUndefined: Self = StObject.set(x, "addontextfont", js.undefined)
      
      inline def setAddontextsize(value: Double): Self = StObject.set(x, "addontextsize", value.asInstanceOf[js.Any])
      
      inline def setAddontextsizeUndefined: Self = StObject.set(x, "addontextsize", js.undefined)
      
      inline def setAddontextxoffset(value: Double): Self = StObject.set(x, "addontextxoffset", value.asInstanceOf[js.Any])
      
      inline def setAddontextxoffsetUndefined: Self = StObject.set(x, "addontextxoffset", js.undefined)
      
      inline def setAddontextyoffset(value: Double): Self = StObject.set(x, "addontextyoffset", value.asInstanceOf[js.Any])
      
      inline def setAddontextyoffsetUndefined: Self = StObject.set(x, "addontextyoffset", js.undefined)
      
      inline def setAlttext(value: String): Self = StObject.set(x, "alttext", value.asInstanceOf[js.Any])
      
      inline def setAlttextUndefined: Self = StObject.set(x, "alttext", js.undefined)
      
      inline def setBackgroundcolor(value: String): Self = StObject.set(x, "backgroundcolor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundcolorUndefined: Self = StObject.set(x, "backgroundcolor", js.undefined)
      
      inline def setBarcolor(value: String): Self = StObject.set(x, "barcolor", value.asInstanceOf[js.Any])
      
      inline def setBarcolorUndefined: Self = StObject.set(x, "barcolor", js.undefined)
      
      inline def setBoraderbottom(value: Double): Self = StObject.set(x, "boraderbottom", value.asInstanceOf[js.Any])
      
      inline def setBoraderbottomUndefined: Self = StObject.set(x, "boraderbottom", js.undefined)
      
      inline def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
      
      inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
      
      inline def setBorderleft(value: Double): Self = StObject.set(x, "borderleft", value.asInstanceOf[js.Any])
      
      inline def setBorderleftUndefined: Self = StObject.set(x, "borderleft", js.undefined)
      
      inline def setBorderright(value: Double): Self = StObject.set(x, "borderright", value.asInstanceOf[js.Any])
      
      inline def setBorderrightUndefined: Self = StObject.set(x, "borderright", js.undefined)
      
      inline def setBordertop(value: Double): Self = StObject.set(x, "bordertop", value.asInstanceOf[js.Any])
      
      inline def setBordertopUndefined: Self = StObject.set(x, "bordertop", js.undefined)
      
      inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
      
      inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
      
      inline def setDotty(value: Boolean): Self = StObject.set(x, "dotty", value.asInstanceOf[js.Any])
      
      inline def setDottyUndefined: Self = StObject.set(x, "dotty", js.undefined)
      
      inline def setGuardheight(value: Double): Self = StObject.set(x, "guardheight", value.asInstanceOf[js.Any])
      
      inline def setGuardheightUndefined: Self = StObject.set(x, "guardheight", js.undefined)
      
      inline def setGuardleftpos(value: Double): Self = StObject.set(x, "guardleftpos", value.asInstanceOf[js.Any])
      
      inline def setGuardleftposUndefined: Self = StObject.set(x, "guardleftpos", js.undefined)
      
      inline def setGuardleftypos(value: Double): Self = StObject.set(x, "guardleftypos", value.asInstanceOf[js.Any])
      
      inline def setGuardleftyposUndefined: Self = StObject.set(x, "guardleftypos", js.undefined)
      
      inline def setGuardrightpos(value: Double): Self = StObject.set(x, "guardrightpos", value.asInstanceOf[js.Any])
      
      inline def setGuardrightposUndefined: Self = StObject.set(x, "guardrightpos", js.undefined)
      
      inline def setGuardrightypos(value: Double): Self = StObject.set(x, "guardrightypos", value.asInstanceOf[js.Any])
      
      inline def setGuardrightyposUndefined: Self = StObject.set(x, "guardrightypos", js.undefined)
      
      inline def setGuardwhitespace(value: Boolean): Self = StObject.set(x, "guardwhitespace", value.asInstanceOf[js.Any])
      
      inline def setGuardwhitespaceUndefined: Self = StObject.set(x, "guardwhitespace", js.undefined)
      
      inline def setGuardwidth(value: Double): Self = StObject.set(x, "guardwidth", value.asInstanceOf[js.Any])
      
      inline def setGuardwidthUndefined: Self = StObject.set(x, "guardwidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIncludecheck(value: Boolean): Self = StObject.set(x, "includecheck", value.asInstanceOf[js.Any])
      
      inline def setIncludecheckUndefined: Self = StObject.set(x, "includecheck", js.undefined)
      
      inline def setIncludecheckintext(value: Boolean): Self = StObject.set(x, "includecheckintext", value.asInstanceOf[js.Any])
      
      inline def setIncludecheckintextUndefined: Self = StObject.set(x, "includecheckintext", js.undefined)
      
      inline def setIncludetext(value: Boolean): Self = StObject.set(x, "includetext", value.asInstanceOf[js.Any])
      
      inline def setIncludetextUndefined: Self = StObject.set(x, "includetext", js.undefined)
      
      inline def setInkspread(value: Double): Self = StObject.set(x, "inkspread", value.asInstanceOf[js.Any])
      
      inline def setInkspreadUndefined: Self = StObject.set(x, "inkspread", js.undefined)
      
      inline def setInkspreadh(value: Double): Self = StObject.set(x, "inkspreadh", value.asInstanceOf[js.Any])
      
      inline def setInkspreadhUndefined: Self = StObject.set(x, "inkspreadh", js.undefined)
      
      inline def setInkspreadv(value: Double): Self = StObject.set(x, "inkspreadv", value.asInstanceOf[js.Any])
      
      inline def setInkspreadvUndefined: Self = StObject.set(x, "inkspreadv", js.undefined)
      
      inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setParsefnc(value: Boolean): Self = StObject.set(x, "parsefnc", value.asInstanceOf[js.Any])
      
      inline def setParsefncUndefined: Self = StObject.set(x, "parsefnc", js.undefined)
      
      inline def setShowborder(value: Boolean): Self = StObject.set(x, "showborder", value.asInstanceOf[js.Any])
      
      inline def setShowborderUndefined: Self = StObject.set(x, "showborder", js.undefined)
      
      inline def setTextcolor(value: String): Self = StObject.set(x, "textcolor", value.asInstanceOf[js.Any])
      
      inline def setTextcolorUndefined: Self = StObject.set(x, "textcolor", js.undefined)
      
      inline def setTextfont(value: String): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
      
      inline def setTextfontUndefined: Self = StObject.set(x, "textfont", js.undefined)
      
      inline def setTextgaps(value: Double): Self = StObject.set(x, "textgaps", value.asInstanceOf[js.Any])
      
      inline def setTextgapsUndefined: Self = StObject.set(x, "textgaps", js.undefined)
      
      inline def setTextsize(value: Double): Self = StObject.set(x, "textsize", value.asInstanceOf[js.Any])
      
      inline def setTextsizeUndefined: Self = StObject.set(x, "textsize", js.undefined)
      
      inline def setTextxalign(value: offleft | left | center | right | offright | justify): Self = StObject.set(x, "textxalign", value.asInstanceOf[js.Any])
      
      inline def setTextxalignUndefined: Self = StObject.set(x, "textxalign", js.undefined)
      
      inline def setTextxoffset(value: Double): Self = StObject.set(x, "textxoffset", value.asInstanceOf[js.Any])
      
      inline def setTextxoffsetUndefined: Self = StObject.set(x, "textxoffset", js.undefined)
      
      inline def setTextyalign(value: below | center | above): Self = StObject.set(x, "textyalign", value.asInstanceOf[js.Any])
      
      inline def setTextyalignUndefined: Self = StObject.set(x, "textyalign", js.undefined)
      
      inline def setTextyoffset(value: Double): Self = StObject.set(x, "textyoffset", value.asInstanceOf[js.Any])
      
      inline def setTextyoffsetUndefined: Self = StObject.set(x, "textyoffset", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait DrawingOption[T] extends StObject {
    
    def ellipse(x: Double, y: Double, rx: Double, ry: Double, ccw: Boolean): Unit
    
    def end(): T
    
    def fill(rgb: String): Unit
    
    def hexagon(
      pts: js.Tuple5[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ]
    ): Unit
    
    def init(width: Double, height: Double): Unit
    
    def line(x0: Double, y0: Double, x1: Double, y1: Double, lw: Double, rgb: String): Unit
    
    def measure(str: String, font: String, fwidth: Double, fheight: Double): Ascent
    
    def polygon(pts: js.Array[js.Tuple2[Double, Double]]): Unit
    
    def scale(sx: Double, sy: Double): (js.Tuple2[Double, Double]) | Null
    
    def text(x: Double, y: Double, str: String, rgb: String, font: Dx): Unit
  }
  object DrawingOption {
    
    inline def apply[T](
      ellipse: (Double, Double, Double, Double, Boolean) => Unit,
      end: () => T,
      fill: String => Unit,
      hexagon: js.Tuple5[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ] => Unit,
      init: (Double, Double) => Unit,
      line: (Double, Double, Double, Double, Double, String) => Unit,
      measure: (String, String, Double, Double) => Ascent,
      polygon: js.Array[js.Tuple2[Double, Double]] => Unit,
      scale: (Double, Double) => (js.Tuple2[Double, Double]) | Null,
      text: (Double, Double, String, String, Dx) => Unit
    ): DrawingOption[T] = {
      val __obj = js.Dynamic.literal(ellipse = js.Any.fromFunction5(ellipse), end = js.Any.fromFunction0(end), fill = js.Any.fromFunction1(fill), hexagon = js.Any.fromFunction1(hexagon), init = js.Any.fromFunction2(init), line = js.Any.fromFunction6(line), measure = js.Any.fromFunction4(measure), polygon = js.Any.fromFunction1(polygon), scale = js.Any.fromFunction2(scale), text = js.Any.fromFunction5(text))
      __obj.asInstanceOf[DrawingOption[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingOption[?], T] (val x: Self & DrawingOption[T]) extends AnyVal {
      
      inline def setEllipse(value: (Double, Double, Double, Double, Boolean) => Unit): Self = StObject.set(x, "ellipse", js.Any.fromFunction5(value))
      
      inline def setEnd(value: () => T): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setFill(value: String => Unit): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setHexagon(
        value: js.Tuple5[
              js.Tuple2[Double, Double], 
              js.Tuple2[Double, Double], 
              js.Tuple2[Double, Double], 
              js.Tuple2[Double, Double], 
              js.Tuple2[Double, Double]
            ] => Unit
      ): Self = StObject.set(x, "hexagon", js.Any.fromFunction1(value))
      
      inline def setInit(value: (Double, Double) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setLine(value: (Double, Double, Double, Double, Double, String) => Unit): Self = StObject.set(x, "line", js.Any.fromFunction6(value))
      
      inline def setMeasure(value: (String, String, Double, Double) => Ascent): Self = StObject.set(x, "measure", js.Any.fromFunction4(value))
      
      inline def setPolygon(value: js.Array[js.Tuple2[Double, Double]] => Unit): Self = StObject.set(x, "polygon", js.Any.fromFunction1(value))
      
      inline def setScale(value: (Double, Double) => (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "scale", js.Any.fromFunction2(value))
      
      inline def setText(value: (Double, Double, String, String, Dx) => Unit): Self = StObject.set(x, "text", js.Any.fromFunction5(value))
    }
  }
  
  trait RawOptions
    extends StObject
       with BwippOptions {
    
    var bcid: String
    
    var text: String
  }
  object RawOptions {
    
    inline def apply(bcid: String, text: String): RawOptions = {
      val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawOptions] (val x: Self) extends AnyVal {
      
      inline def setBcid(value: String): Self = StObject.set(x, "bcid", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderOptions
    extends StObject
       with BwippOptions {
    
    var bcid: String
    
    var monochrome: js.UndefOr[Boolean] = js.undefined
    
    var paddingbottom: js.UndefOr[Double] = js.undefined
    
    var paddingheight: js.UndefOr[Double] = js.undefined
    
    var paddingleft: js.UndefOr[Double] = js.undefined
    
    var paddingright: js.UndefOr[Double] = js.undefined
    
    var paddingtop: js.UndefOr[Double] = js.undefined
    
    var paddingwidth: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[N | R | L | I] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var sizelimit: js.UndefOr[Double] = js.undefined
    
    var text: String
  }
  object RenderOptions {
    
    inline def apply(bcid: String, text: String): RenderOptions = {
      val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      inline def setBcid(value: String): Self = StObject.set(x, "bcid", value.asInstanceOf[js.Any])
      
      inline def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      inline def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
      
      inline def setPaddingbottom(value: Double): Self = StObject.set(x, "paddingbottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingbottomUndefined: Self = StObject.set(x, "paddingbottom", js.undefined)
      
      inline def setPaddingheight(value: Double): Self = StObject.set(x, "paddingheight", value.asInstanceOf[js.Any])
      
      inline def setPaddingheightUndefined: Self = StObject.set(x, "paddingheight", js.undefined)
      
      inline def setPaddingleft(value: Double): Self = StObject.set(x, "paddingleft", value.asInstanceOf[js.Any])
      
      inline def setPaddingleftUndefined: Self = StObject.set(x, "paddingleft", js.undefined)
      
      inline def setPaddingright(value: Double): Self = StObject.set(x, "paddingright", value.asInstanceOf[js.Any])
      
      inline def setPaddingrightUndefined: Self = StObject.set(x, "paddingright", js.undefined)
      
      inline def setPaddingtop(value: Double): Self = StObject.set(x, "paddingtop", value.asInstanceOf[js.Any])
      
      inline def setPaddingtopUndefined: Self = StObject.set(x, "paddingtop", js.undefined)
      
      inline def setPaddingwidth(value: Double): Self = StObject.set(x, "paddingwidth", value.asInstanceOf[js.Any])
      
      inline def setPaddingwidthUndefined: Self = StObject.set(x, "paddingwidth", js.undefined)
      
      inline def setRotate(value: N | R | L | I): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setSizelimit(value: Double): Self = StObject.set(x, "sizelimit", value.asInstanceOf[js.Any])
      
      inline def setSizelimitUndefined: Self = StObject.set(x, "sizelimit", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type ToBufferOptions = RenderOptions
}
