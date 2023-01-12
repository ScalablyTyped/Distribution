package typings.canvas

import typings.canvas.anon.Family
import typings.canvas.canvasInts.`0`
import typings.canvas.canvasInts.`1`
import typings.canvas.canvasInts.`2`
import typings.canvas.canvasInts.`3`
import typings.canvas.canvasInts.`4`
import typings.canvas.canvasInts.`5`
import typings.canvas.canvasInts.`6`
import typings.canvas.canvasInts.`7`
import typings.canvas.canvasInts.`8`
import typings.canvas.canvasInts.`9`
import typings.canvas.canvasStrings.A1
import typings.canvas.canvasStrings.A8
import typings.canvas.canvasStrings.RGB16_565
import typings.canvas.canvasStrings.RGB24
import typings.canvas.canvasStrings.RGB30
import typings.canvas.canvasStrings.RGBA32
import typings.canvas.canvasStrings._empty
import typings.canvas.canvasStrings.`2d`
import typings.canvas.canvasStrings.`no-repeat`
import typings.canvas.canvasStrings.`repeat-x`
import typings.canvas.canvasStrings.`repeat-y`
import typings.canvas.canvasStrings.applicationSlashpdf
import typings.canvas.canvasStrings.best
import typings.canvas.canvasStrings.bilinear
import typings.canvas.canvasStrings.default
import typings.canvas.canvasStrings.fast
import typings.canvas.canvasStrings.glyph
import typings.canvas.canvasStrings.good
import typings.canvas.canvasStrings.gray
import typings.canvas.canvasStrings.image
import typings.canvas.canvasStrings.imageSlashjpeg
import typings.canvas.canvasStrings.imageSlashpng
import typings.canvas.canvasStrings.nearest
import typings.canvas.canvasStrings.none
import typings.canvas.canvasStrings.path
import typings.canvas.canvasStrings.pdf
import typings.canvas.canvasStrings.raw
import typings.canvas.canvasStrings.repeat
import typings.canvas.canvasStrings.subpixel
import typings.canvas.canvasStrings.svg
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.std.CanvasDirection
import typings.std.CanvasFontKerning
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.GlobalCompositeOperation
import typings.std.ImageSmoothingQuality
import typings.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvas", "Canvas")
  @js.native
  open class Canvas protected () extends StObject {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, `type`: image | pdf | svg) = this()
    
    /** Constant used in PNG encoding methods. */
    val PNG_ALL_FILTERS: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_FILTER_AVG: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_FILTER_NONE: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_FILTER_PAETH: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_FILTER_SUB: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_FILTER_UP: Double = js.native
    
    /** Constant used in PNG encoding methods. */
    val PNG_NO_FILTERS: Double = js.native
    
    def createJPEGStream(): JPEGStream = js.native
    def createJPEGStream(config: JpegConfig): JPEGStream = js.native
    
    def createPDFStream(): PDFStream = js.native
    def createPDFStream(config: PdfConfig): PDFStream = js.native
    
    def createPNGStream(): PNGStream = js.native
    def createPNGStream(config: PngConfig): PNGStream = js.native
    
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): NodeCanvasRenderingContext2D = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, contextAttributes: NodeCanvasRenderingContext2DSettings): NodeCanvasRenderingContext2D = js.native
    
    var height: Double = js.native
    
    /** _Non standard._ Getter. The stride used by the canvas. */
    val stride: Double = js.native
    
    /**
    	 * For image canvases, encodes the canvas as a PNG. For PDF canvases,
    	 * encodes the canvas as a PDF. For SVG canvases, encodes the canvas as an
    	 * SVG.
    	 */
    def toBuffer(): Buffer = js.native
    /**
    	 * For image canvases, encodes the canvas as a PNG. For PDF canvases,
    	 * encodes the canvas as a PDF. For SVG canvases, encodes the canvas as an
    	 * SVG.
    	 */
    def toBuffer(cb: js.Function2[/* err */ js.Error | Null, /* result */ Buffer, Unit]): Unit = js.native
    @JSName("toBuffer")
    def toBuffer_applicationpdf(mimeType: applicationSlashpdf): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_applicationpdf(mimeType: applicationSlashpdf, config: PdfConfig): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_imagejpeg(cb: js.Function2[/* err */ js.Error | Null, /* result */ Buffer, Unit], mimeType: imageSlashjpeg): Unit = js.native
    @JSName("toBuffer")
    def toBuffer_imagejpeg(
      cb: js.Function2[/* err */ js.Error | Null, /* result */ Buffer, Unit],
      mimeType: imageSlashjpeg,
      config: JpegConfig
    ): Unit = js.native
    @JSName("toBuffer")
    def toBuffer_imagejpeg(mimeType: imageSlashjpeg): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_imagejpeg(mimeType: imageSlashjpeg, config: JpegConfig): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_imagepng(cb: js.Function2[/* err */ js.Error | Null, /* result */ Buffer, Unit], mimeType: imageSlashpng): Unit = js.native
    @JSName("toBuffer")
    def toBuffer_imagepng(
      cb: js.Function2[/* err */ js.Error | Null, /* result */ Buffer, Unit],
      mimeType: imageSlashpng,
      config: PngConfig
    ): Unit = js.native
    @JSName("toBuffer")
    def toBuffer_imagepng(mimeType: imageSlashpng): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_imagepng(mimeType: imageSlashpng, config: PngConfig): Buffer = js.native
    /**
    	 * Returns the unencoded pixel data, top-to-bottom. On little-endian (most)
    	 * systems, the array will be ordered BGRA; on big-endian systems, it will
    	 * be ARGB.
    	 */
    @JSName("toBuffer")
    def toBuffer_raw(mimeType: raw): Buffer = js.native
    
    /** Defaults to PNG image. */
    def toDataURL(): String = js.native
    /** _Non-standard._ Defaults to PNG image. */
    def toDataURL(cb: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]): Unit = js.native
    @JSName("toDataURL")
    def toDataURL_imagejpeg(mimeType: imageSlashjpeg): String = js.native
    /** _Non-standard._ */
    @JSName("toDataURL")
    def toDataURL_imagejpeg(mimeType: imageSlashjpeg, cb: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]): Unit = js.native
    /** _Non-standard._ */
    @JSName("toDataURL")
    def toDataURL_imagejpeg(
      mimeType: imageSlashjpeg,
      config: JpegConfig,
      cb: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]
    ): Unit = js.native
    @JSName("toDataURL")
    def toDataURL_imagejpeg(mimeType: imageSlashjpeg, quality: Double): String = js.native
    /** _Non-standard._ */
    @JSName("toDataURL")
    def toDataURL_imagejpeg(
      mimeType: imageSlashjpeg,
      quality: Double,
      cb: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]
    ): Unit = js.native
    @JSName("toDataURL")
    def toDataURL_imagepng(mimeType: imageSlashpng): String = js.native
    /** _Non-standard._ */
    @JSName("toDataURL")
    def toDataURL_imagepng(mimeType: imageSlashpng, cb: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]): Unit = js.native
    
    /** _Non standard._ The type of the canvas. */
    val `type`: image | pdf | svg = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("canvas", "CanvasGradient")
  @js.native
  open class CanvasGradient ()
    extends StObject
       with typings.std.CanvasGradient {
    
    /**
      * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
      *
      * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
      */
    /* standard dom */
    /* CompleteClass */
    override def addColorStop(offset: Double, color: String): Unit = js.native
  }
  
  @JSImport("canvas", "CanvasPattern")
  @js.native
  open class CanvasPattern ()
    extends StObject
       with typings.std.CanvasPattern
  
  @JSImport("canvas", "CanvasRenderingContext2D")
  @js.native
  open class CanvasRenderingContext2D ()
    extends StObject
       with NodeCanvasRenderingContext2D {
    
    /* standard dom */
    /* CompleteClass */
    override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var direction: CanvasDirection = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var filter: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var font: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var fontKerning: CanvasFontKerning = js.native
    
    /* standard dom */
    /* CompleteClass */
    var globalAlpha: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    var globalCompositeOperation: GlobalCompositeOperation = js.native
    
    /* standard dom */
    /* CompleteClass */
    var imageSmoothingEnabled: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    var imageSmoothingQuality: ImageSmoothingQuality = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def save(): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var shadowBlur: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    var shadowColor: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var shadowOffsetX: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    var shadowOffsetY: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var textAlign: CanvasTextAlign = js.native
    
    /* standard dom */
    /* CompleteClass */
    var textBaseline: CanvasTextBaseline = js.native
  }
  
  @JSImport("canvas", "DOMMatrix")
  @js.native
  open class DOMMatrix ()
    extends StObject
       with typings.std.DOMMatrix
  
  @JSImport("canvas", "DOMPoint")
  @js.native
  open class DOMPoint ()
    extends StObject
       with typings.std.DOMPoint
  
  @JSImport("canvas", "Image")
  @js.native
  open class Image () extends StObject {
    
    /** Retrieves whether the object is fully loaded. */
    val complete: Boolean = js.native
    
    /**
    	 * Applies to JPEG images drawn to PDF canvases only. Setting
    	 * `img.dataMode = Image.MODE_MIME` or `Image.MODE_MIME|Image.MODE_IMAGE`
    	 * enables image MIME data tracking. When MIME data is tracked, PDF canvases
    	 * can embed JPEGs directly into the output, rather than re-encoding into
    	 * PNG. This can drastically reduce filesize and speed up rendering.
    	 */
    var dataMode: Double = js.native
    
    /** Sets or retrieves the height of the image. */
    var height: Double = js.native
    
    /** The original height of the image resource before sizing. */
    val naturalHeight: Double = js.native
    
    /** The original width of the image resource before sizing. */
    val naturalWidth: Double = js.native
    
    var onerror: (js.Function1[/* err */ js.Error, Unit]) | Null = js.native
    
    var onload: js.Function0[Unit] | Null = js.native
    
    /**
    	 * The URL, `data:` URI or local file path of the image to be loaded, or a
    	 * Buffer instance containing an encoded image.
    	 */
    var src: String | Buffer = js.native
    
    /** Sets or retrieves the width of the image. */
    var width: Double = js.native
  }
  /* static members */
  object Image {
    
    /** Track image data */
    @JSImport("canvas", "Image.MODE_IMAGE")
    @js.native
    val MODE_IMAGE: Double = js.native
    
    /** Track MIME data */
    @JSImport("canvas", "Image.MODE_MIME")
    @js.native
    val MODE_MIME: Double = js.native
  }
  
  @JSImport("canvas", "ImageData")
  @js.native
  open class ImageData ()
    extends StObject
       with typings.std.ImageData {
    
    /* standard dom */
    /* CompleteClass */
    override val colorSpace: PredefinedColorSpace = js.native
    
    /** Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255. */
    /* standard dom */
    /* CompleteClass */
    override val data: js.typedarray.Uint8ClampedArray = js.native
    
    /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
    /* standard dom */
    /* CompleteClass */
    override val height: Double = js.native
    
    /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
    /* standard dom */
    /* CompleteClass */
    override val width: Double = js.native
  }
  
  @JSImport("canvas", "JPEGStream")
  @js.native
  open class JPEGStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("canvas", "PDFStream")
  @js.native
  open class PDFStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("canvas", "PNGStream")
  @js.native
  open class PNGStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("canvas", "cairoVersion")
  @js.native
  val cairoVersion: String = js.native
  
  inline def createCanvas(width: Double, height: Double): Canvas = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Canvas]
  inline def createCanvas(width: Double, height: Double, `type`: pdf | svg): Canvas = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Canvas]
  
  inline def createImageData(data: js.typedarray.Uint16Array, width: Double): typings.std.ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.std.ImageData]
  inline def createImageData(data: js.typedarray.Uint16Array, width: Double, height: Double): typings.std.ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.std.ImageData]
  inline def createImageData(data: js.typedarray.Uint8ClampedArray, width: Double): typings.std.ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.std.ImageData]
  inline def createImageData(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double): typings.std.ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.std.ImageData]
  inline def createImageData(width: Double, height: Double): typings.std.ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.std.ImageData]
  
  inline def deregisterAllFonts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterAllFonts")().asInstanceOf[Unit]
  
  @JSImport("canvas", "freetypeVersion")
  @js.native
  val freetypeVersion: String = js.native
  
  @JSImport("canvas", "gifVersion")
  @js.native
  val gifVersion: js.UndefOr[String] = js.native
  
  @JSImport("canvas", "jpegVersion")
  @js.native
  val jpegVersion: js.UndefOr[String] = js.native
  
  inline def loadImage(src: String): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
  inline def loadImage(src: String, options: Any): js.Promise[Image] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Image]]
  inline def loadImage(src: Buffer): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
  inline def loadImage(src: Buffer, options: Any): js.Promise[Image] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Image]]
  
  inline def registerFont(path: String, fontFace: Family): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFont")(path.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("canvas", "rsvgVersion")
  @js.native
  val rsvgVersion: js.UndefOr[String] = js.native
  
  @JSImport("canvas", "version")
  @js.native
  val version: String = js.native
  
  trait JpegConfig extends StObject {
    
    /** Enables 2x2 chroma subsampling. Defaults to `true`. */
    var chromaSubsampling: js.UndefOr[Boolean] = js.undefined
    
    /** Enables progressive encoding. Defaults to `false`. */
    var progressive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the quality, between 0 and 1. Defaults to 0.75. */
    var quality: js.UndefOr[Double] = js.undefined
  }
  object JpegConfig {
    
    inline def apply(): JpegConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JpegConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JpegConfig] (val x: Self) extends AnyVal {
      
      inline def setChromaSubsampling(value: Boolean): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
      
      inline def setChromaSubsamplingUndefined: Self = StObject.set(x, "chromaSubsampling", js.undefined)
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  type NodeCanvasCanvasGradient = typings.std.CanvasGradient
  
  type NodeCanvasCanvasPattern = typings.std.CanvasPattern
  
  type NodeCanvasDOMMatrix = typings.std.DOMMatrix
  
  type NodeCanvasDOMPoint = typings.std.DOMPoint
  
  type NodeCanvasImageData = typings.std.ImageData
  
  @js.native
  trait NodeCanvasRenderingContext2D
    extends StObject
       with typings.std.CanvasRenderingContext2D {
    
    /**
    	 * For PDF canvases, adds another page. If width and/or height are omitted,
    	 * the canvas's initial size is used.
    	 */
    def addPage(): Unit = js.native
    def addPage(width: Double): Unit = js.native
    def addPage(width: Double, height: Double): Unit = js.native
    def addPage(width: Unit, height: Double): Unit = js.native
    
    /** _Non-standard_. Sets the antialiasing mode. */
    var antialias: default | gray | none | subpixel = js.native
    
    /**
    	 * **Do not use this overload. Use the other three overload.** This is a
    	 * catch-all definition required for compatibility with the base
    	 * `CanvasRenderingContext2D` interface.
    	 */
    def createPattern(args: Any*): NodeCanvasCanvasPattern = js.native
    def createPattern(image: Canvas): NodeCanvasCanvasPattern = js.native
    def createPattern(image: Canvas, repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat` | _empty): NodeCanvasCanvasPattern = js.native
    def createPattern(image: Image): NodeCanvasCanvasPattern = js.native
    def createPattern(image: Image, repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat` | _empty): NodeCanvasCanvasPattern = js.native
    
    // Standard, but not in the TS lib and needs node-canvas class return type.
    /** Returns or sets a `DOMMatrix` for the current transformation matrix. */
    var currentTransform: NodeCanvasDOMMatrix = js.native
    
    /**
    	 * **Do not use this overload. Use one of the other three overloads.** This
    	 * is a catch-all definition required for compatibility with the base
    	 * `CanvasRenderingContext2D` interface.
    	 */
    def drawImage(args: Any*): Unit = js.native
    def drawImage(image: Canvas, dx: Double, dy: Double): Unit = js.native
    def drawImage(image: Canvas, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
    def drawImage(
      image: Canvas,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double
    ): Unit = js.native
    def drawImage(image: Image, dx: Double, dy: Double): Unit = js.native
    def drawImage(image: Image, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
    def drawImage(
      image: Image,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double
    ): Unit = js.native
    
    /**
    	 * _Non-standard_. Defaults to 'good'. Affects pattern (gradient, image,
    	 * etc.) rendering quality.
    	 */
    var patternQuality: fast | good | best | nearest | bilinear = js.native
    
    /**
    	 * _Non-standard_. Defaults to 'good'. Like `patternQuality`, but applies to
    	 * transformations affecting more than just patterns.
    	 */
    var quality: fast | good | best | nearest | bilinear = js.native
    
    def setTransform(transform: NodeCanvasDOMMatrix): Unit = js.native
    
    /**
    	 * Defaults to 'path'. The effect depends on the canvas type:
    	 *
    	 * * **Standard (image)** `'glyph'` and `'path'` both result in rasterized
    	 *   text. Glyph mode is faster than path, but may result in lower-quality
    	 *   text, especially when rotated or translated.
    	 *
    	 * * **PDF** `'glyph'` will embed text instead of paths into the PDF. This
    	 *   is faster to encode, faster to open with PDF viewers, yields a smaller
    	 *   file size and makes the text selectable. The subset of the font needed
    	 *   to render the glyphs will be embedded in the PDF. This is usually the
    	 *   mode you want to use with PDF canvases.
    	 *
    	 * * **SVG** glyph does not cause `<text>` elements to be produced as one
    	 *   might expect ([cairo bug](https://gitlab.freedesktop.org/cairo/cairo/issues/253)).
    	 *   Rather, glyph will create a `<defs>` section with a `<symbol>` for each
    	 *   glyph, then those glyphs be reused via `<use>` elements. `'path'` mode
    	 *   creates a `<path>` element for each text string. glyph mode is faster
    	 *   and yields a smaller file size.
    	 *
    	 * In glyph mode, `ctx.strokeText()` and `ctx.fillText()` behave the same
    	 * (aside from using the stroke and fill style, respectively).
    	 */
    var textDrawingMode: path | glyph = js.native
  }
  
  trait NodeCanvasRenderingContext2DSettings extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var pixelFormat: js.UndefOr[RGBA32 | RGB24 | A8 | RGB16_565 | A1 | RGB30] = js.undefined
  }
  object NodeCanvasRenderingContext2DSettings {
    
    inline def apply(): NodeCanvasRenderingContext2DSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCanvasRenderingContext2DSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeCanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setPixelFormat(value: RGBA32 | RGB24 | A8 | RGB16_565 | A1 | RGB30): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
      
      inline def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    }
  }
  
  trait PdfConfig extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var creationDate: js.UndefOr[js.Date] = js.undefined
    
    var creator: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var modDate: js.UndefOr[js.Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PdfConfig {
    
    inline def apply(): PdfConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfConfig] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setModDate(value: js.Date): Self = StObject.set(x, "modDate", value.asInstanceOf[js.Any])
      
      inline def setModDateUndefined: Self = StObject.set(x, "modDate", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PngConfig extends StObject {
    
    /**
    	 * _For creating indexed PNGs._ The index of the background color. Defaults
    	 * to 0.
    	 */
    var backgroundIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the ZLIB compression level. Defaults to 6. */
    var compressionLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
    
    /**
    	 * Any bitwise combination of `PNG_FILTER_NONE`, `PNG_FILTER_SUB`,
    	 * `PNG_FILTER_UP`, `PNG_FILTER_AVG` and `PNG_FILTER_PATETH`; or one of
    	 * `PNG_ALL_FILTERS` or `PNG_NO_FILTERS` (all are properties of the canvas
    	 * instance). These specify which filters *may* be used by libpng. During
    	 * encoding, libpng will select the best filter from this list of allowed
    	 * filters. Defaults to `canvas.PNG_ALL_FILTERS`.
    	 */
    var filters: js.UndefOr[Double] = js.undefined
    
    /**
    	 * _For creating indexed PNGs._ The palette of colors. Entries should be in
    	 * RGBA order.
    	 */
    var palette: js.UndefOr[js.typedarray.Uint8ClampedArray] = js.undefined
    
    /** pixels per inch */
    var resolution: js.UndefOr[Double] = js.undefined
  }
  object PngConfig {
    
    inline def apply(): PngConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PngConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PngConfig] (val x: Self) extends AnyVal {
      
      inline def setBackgroundIndex(value: Double): Self = StObject.set(x, "backgroundIndex", value.asInstanceOf[js.Any])
      
      inline def setBackgroundIndexUndefined: Self = StObject.set(x, "backgroundIndex", js.undefined)
      
      inline def setCompressionLevel(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setPalette(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    }
  }
}
