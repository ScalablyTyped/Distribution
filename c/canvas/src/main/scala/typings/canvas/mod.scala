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
    def getContext_2d(contextId: `2d`): CanvasRenderingContext2D = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, contextAttributes: NodeCanvasRenderingContext2DSettings): CanvasRenderingContext2D = js.native
    
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
  open class CanvasGradient () extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit = js.native
  }
  
  @JSImport("canvas", "CanvasPattern")
  @js.native
  open class CanvasPattern () extends StObject {
    
    def setTransform(): Unit = js.native
    def setTransform(transform: DOMMatrix): Unit = js.native
  }
  
  @JSImport("canvas", "CanvasRenderingContext2D")
  @js.native
  open class CanvasRenderingContext2D () extends StObject {
    
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
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(
      x: Double,
      y: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      counterclockwise: Boolean
    ): Unit = js.native
    
    def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    var canvas: Canvas = js.native
    
    def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def clip(): Unit = js.native
    def clip(fillRule: CanvasFillRule): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def createImageData(imagedata: ImageData): ImageData = js.native
    def createImageData(sw: Double, sh: Double): ImageData = js.native
    
    def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
    
    def createPattern(image: Canvas): CanvasPattern = js.native
    def createPattern(image: Canvas, repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat` | _empty): CanvasPattern = js.native
    def createPattern(image: Image): CanvasPattern = js.native
    def createPattern(image: Image, repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat` | _empty): CanvasPattern = js.native
    
    def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
    
    /** Returns or sets a `DOMMatrix` for the current transformation matrix. */
    var currentTransform: DOMMatrix = js.native
    
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
    
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double
    ): Unit = js.native
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double,
      counterclockwise: Boolean
    ): Unit = js.native
    
    def fill(): Unit = js.native
    def fill(fillRule: CanvasFillRule): Unit = js.native
    
    def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    var fillStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var font: String = js.native
    
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    def getTransform(): DOMMatrix = js.native
    
    var globalAlpha: Double = js.native
    
    var globalCompositeOperation: GlobalCompositeOperation = js.native
    
    var imageSmoothingEnabled: Boolean = js.native
    
    def isPointInPath(x: Double, y: Double): Boolean = js.native
    def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean = js.native
    
    var lineCap: CanvasLineCap = js.native
    
    var lineDashOffset: Double = js.native
    
    var lineJoin: CanvasLineJoin = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    var lineWidth: Double = js.native
    
    def measureText(text: String): TextMetrics = js.native
    
    var miterLimit: Double = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    /**
    	 * _Non-standard_. Defaults to 'good'. Affects pattern (gradient, image,
    	 * etc.) rendering quality.
    	 */
    var patternQuality: fast | good | best | nearest | bilinear = js.native
    
    def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit = js.native
    def putImageData(
      imagedata: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    /**
    	 * _Non-standard_. Defaults to 'good'. Like `patternQuality`, but applies to
    	 * transformations affecting more than just patterns.
    	 */
    var quality: fast | good | best | nearest | bilinear = js.native
    
    def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def resetTransform(): Unit = js.native
    
    def restore(): Unit = js.native
    
    def rotate(angle: Double): Unit = js.native
    
    def roundRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    def roundRect(x: Double, y: Double, w: Double, h: Double, radii: js.Array[Double]): Unit = js.native
    def roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double): Unit = js.native
    
    def save(): Unit = js.native
    
    def scale(x: Double, y: Double): Unit = js.native
    
    def setLineDash(segments: js.Array[Double]): Unit = js.native
    
    def setTransform(): Unit = js.native
    def setTransform(transform: DOMMatrix): Unit = js.native
    
    var shadowBlur: Double = js.native
    
    var shadowColor: String = js.native
    
    var shadowOffsetX: Double = js.native
    
    var shadowOffsetY: Double = js.native
    
    def stroke(): Unit = js.native
    
    def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    var strokeStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def strokeText(text: String, x: Double, y: Double): Unit = js.native
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var textAlign: CanvasTextAlign = js.native
    
    var textBaseline: CanvasTextBaseline = js.native
    
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
    
    def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  @JSImport("canvas", "DOMMatrix")
  @js.native
  open class DOMMatrix protected () extends StObject {
    def this(init: String) = this()
    def this(init: js.Array[Double]) = this()
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var d: Double = js.native
    
    var e: Double = js.native
    
    var f: Double = js.native
    
    def flipX(): DOMMatrix = js.native
    
    def flipY(): DOMMatrix = js.native
    
    def inverse(): DOMMatrix = js.native
    
    def invertSelf(): DOMMatrix = js.native
    
    val is2D: Boolean = js.native
    
    val isIdentity: Boolean = js.native
    
    var m11: Double = js.native
    
    var m12: Double = js.native
    
    var m13: Double = js.native
    
    var m14: Double = js.native
    
    var m21: Double = js.native
    
    var m22: Double = js.native
    
    var m23: Double = js.native
    
    var m24: Double = js.native
    
    var m31: Double = js.native
    
    var m32: Double = js.native
    
    var m33: Double = js.native
    
    var m34: Double = js.native
    
    var m41: Double = js.native
    
    var m42: Double = js.native
    
    var m43: Double = js.native
    
    var m44: Double = js.native
    
    def multiply(): DOMMatrix = js.native
    def multiply(other: DOMMatrix): DOMMatrix = js.native
    
    def multiplySelf(): DOMMatrix = js.native
    def multiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def preMultiplySelf(): DOMMatrix = js.native
    def preMultiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def rotate(): DOMMatrix = js.native
    def rotate(rotX: Double): DOMMatrix = js.native
    def rotate(rotX: Double, rotY: Double): DOMMatrix = js.native
    def rotate(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
    def rotate(rotX: Double, rotY: Unit, rotZ: Double): DOMMatrix = js.native
    def rotate(rotX: Unit, rotY: Double): DOMMatrix = js.native
    def rotate(rotX: Unit, rotY: Double, rotZ: Double): DOMMatrix = js.native
    def rotate(rotX: Unit, rotY: Unit, rotZ: Double): DOMMatrix = js.native
    
    def rotateAxisAngle(): DOMMatrix = js.native
    def rotateAxisAngle(x: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Double, z: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Unit, z: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Double, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Double, z: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Unit, z: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngle(x: Unit, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
    
    def rotateAxisAngleSelf(): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Double, z: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Unit, z: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Double, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Double, z: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Unit, z: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
    def rotateAxisAngleSelf(x: Unit, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
    
    def rotateFromVector(): DOMMatrix = js.native
    def rotateFromVector(x: Double): DOMMatrix = js.native
    def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native
    def rotateFromVector(x: Unit, y: Double): DOMMatrix = js.native
    
    def rotateFromVectorSelf(): DOMMatrix = js.native
    def rotateFromVectorSelf(x: Double): DOMMatrix = js.native
    def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
    def rotateFromVectorSelf(x: Unit, y: Double): DOMMatrix = js.native
    
    def rotateSelf(): DOMMatrix = js.native
    def rotateSelf(rotX: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Double, rotY: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Double, rotY: Unit, rotZ: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Unit, rotY: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Unit, rotY: Double, rotZ: Double): DOMMatrix = js.native
    def rotateSelf(rotX: Unit, rotY: Unit, rotZ: Double): DOMMatrix = js.native
    
    def scale(
      scaleX: js.UndefOr[Double],
      scaleY: js.UndefOr[Double],
      scaleZ: js.UndefOr[Double],
      originX: js.UndefOr[Double],
      originY: js.UndefOr[Double],
      originZ: js.UndefOr[Double]
    ): DOMMatrix = js.native
    
    def scale3d(): DOMMatrix = js.native
    def scale3d(scale: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    
    def scale3dSelf(): DOMMatrix = js.native
    def scale3dSelf(scale: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    
    def scaleSelf(
      scaleX: js.UndefOr[Double],
      scaleY: js.UndefOr[Double],
      scaleZ: js.UndefOr[Double],
      originX: js.UndefOr[Double],
      originY: js.UndefOr[Double],
      originZ: js.UndefOr[Double]
    ): DOMMatrix = js.native
    
    def setMatrixValue(transformList: String): DOMMatrix = js.native
    
    def skewX(): DOMMatrix = js.native
    def skewX(sx: Double): DOMMatrix = js.native
    
    def skewXSelf(): DOMMatrix = js.native
    def skewXSelf(sx: Double): DOMMatrix = js.native
    
    def skewY(): DOMMatrix = js.native
    def skewY(sy: Double): DOMMatrix = js.native
    
    def skewYSelf(): DOMMatrix = js.native
    def skewYSelf(sy: Double): DOMMatrix = js.native
    
    def toFloat32Array(): js.typedarray.Float32Array = js.native
    
    def toFloat64Array(): js.typedarray.Float64Array = js.native
    
    def transformPoint(): DOMPoint = js.native
    def transformPoint(point: DOMPoint): DOMPoint = js.native
    
    def translate(): DOMMatrix = js.native
    def translate(tx: Double): DOMMatrix = js.native
    def translate(tx: Double, ty: Double): DOMMatrix = js.native
    def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
    def translate(tx: Double, ty: Unit, tz: Double): DOMMatrix = js.native
    def translate(tx: Unit, ty: Double): DOMMatrix = js.native
    def translate(tx: Unit, ty: Double, tz: Double): DOMMatrix = js.native
    def translate(tx: Unit, ty: Unit, tz: Double): DOMMatrix = js.native
    
    def translateSelf(): DOMMatrix = js.native
    def translateSelf(tx: Double): DOMMatrix = js.native
    def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
    def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
    def translateSelf(tx: Double, ty: Unit, tz: Double): DOMMatrix = js.native
    def translateSelf(tx: Unit, ty: Double): DOMMatrix = js.native
    def translateSelf(tx: Unit, ty: Double, tz: Double): DOMMatrix = js.native
    def translateSelf(tx: Unit, ty: Unit, tz: Double): DOMMatrix = js.native
  }
  /* static members */
  object DOMMatrix {
    
    @JSImport("canvas", "DOMMatrix")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFloat32Array(a: js.typedarray.Float32Array): DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(a.asInstanceOf[js.Any]).asInstanceOf[DOMMatrix]
    
    inline def fromFloat64Array(a: js.typedarray.Float64Array): DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(a.asInstanceOf[js.Any]).asInstanceOf[DOMMatrix]
    
    inline def fromMatrix(other: DOMMatrix): DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[DOMMatrix]
  }
  
  @JSImport("canvas", "DOMPoint")
  @js.native
  open class DOMPoint () extends StObject {
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  
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
  open class ImageData protected () extends StObject {
    def this(data: js.typedarray.Uint8ClampedArray, sw: Double) = this()
    def this(sw: Double, sh: Double) = this()
    def this(data: js.typedarray.Uint8ClampedArray, sw: Double, sh: Double) = this()
    
    val data: js.typedarray.Uint8ClampedArray = js.native
    
    val height: Double = js.native
    
    val width: Double = js.native
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
  
  inline def createImageData(data: js.typedarray.Uint16Array, width: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createImageData(data: js.typedarray.Uint16Array, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createImageData(data: js.typedarray.Uint8ClampedArray, width: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createImageData(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createImageData(width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageData")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.evenodd
    - typings.canvas.canvasStrings.nonzero
  */
  trait CanvasFillRule extends StObject
  object CanvasFillRule {
    
    inline def evenodd: typings.canvas.canvasStrings.evenodd = "evenodd".asInstanceOf[typings.canvas.canvasStrings.evenodd]
    
    inline def nonzero: typings.canvas.canvasStrings.nonzero = "nonzero".asInstanceOf[typings.canvas.canvasStrings.nonzero]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.butt
    - typings.canvas.canvasStrings.round
    - typings.canvas.canvasStrings.square
  */
  trait CanvasLineCap extends StObject
  object CanvasLineCap {
    
    inline def butt: typings.canvas.canvasStrings.butt = "butt".asInstanceOf[typings.canvas.canvasStrings.butt]
    
    inline def round: typings.canvas.canvasStrings.round = "round".asInstanceOf[typings.canvas.canvasStrings.round]
    
    inline def square: typings.canvas.canvasStrings.square = "square".asInstanceOf[typings.canvas.canvasStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.bevel
    - typings.canvas.canvasStrings.miter
    - typings.canvas.canvasStrings.round
  */
  trait CanvasLineJoin extends StObject
  object CanvasLineJoin {
    
    inline def bevel: typings.canvas.canvasStrings.bevel = "bevel".asInstanceOf[typings.canvas.canvasStrings.bevel]
    
    inline def miter: typings.canvas.canvasStrings.miter = "miter".asInstanceOf[typings.canvas.canvasStrings.miter]
    
    inline def round: typings.canvas.canvasStrings.round = "round".asInstanceOf[typings.canvas.canvasStrings.round]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.center
    - typings.canvas.canvasStrings.end
    - typings.canvas.canvasStrings.left
    - typings.canvas.canvasStrings.right
    - typings.canvas.canvasStrings.start
  */
  trait CanvasTextAlign extends StObject
  object CanvasTextAlign {
    
    inline def center: typings.canvas.canvasStrings.center = "center".asInstanceOf[typings.canvas.canvasStrings.center]
    
    inline def end: typings.canvas.canvasStrings.end = "end".asInstanceOf[typings.canvas.canvasStrings.end]
    
    inline def left: typings.canvas.canvasStrings.left = "left".asInstanceOf[typings.canvas.canvasStrings.left]
    
    inline def right: typings.canvas.canvasStrings.right = "right".asInstanceOf[typings.canvas.canvasStrings.right]
    
    inline def start: typings.canvas.canvasStrings.start = "start".asInstanceOf[typings.canvas.canvasStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.alphabetic
    - typings.canvas.canvasStrings.bottom
    - typings.canvas.canvasStrings.hanging
    - typings.canvas.canvasStrings.ideographic
    - typings.canvas.canvasStrings.middle
    - typings.canvas.canvasStrings.top
  */
  trait CanvasTextBaseline extends StObject
  object CanvasTextBaseline {
    
    inline def alphabetic: typings.canvas.canvasStrings.alphabetic = "alphabetic".asInstanceOf[typings.canvas.canvasStrings.alphabetic]
    
    inline def bottom: typings.canvas.canvasStrings.bottom = "bottom".asInstanceOf[typings.canvas.canvasStrings.bottom]
    
    inline def hanging: typings.canvas.canvasStrings.hanging = "hanging".asInstanceOf[typings.canvas.canvasStrings.hanging]
    
    inline def ideographic: typings.canvas.canvasStrings.ideographic = "ideographic".asInstanceOf[typings.canvas.canvasStrings.ideographic]
    
    inline def middle: typings.canvas.canvasStrings.middle = "middle".asInstanceOf[typings.canvas.canvasStrings.middle]
    
    inline def top: typings.canvas.canvasStrings.top = "top".asInstanceOf[typings.canvas.canvasStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvas.canvasStrings.clear
    - typings.canvas.canvasStrings.copy
    - typings.canvas.canvasStrings.destination
    - typings.canvas.canvasStrings.`source-over`
    - typings.canvas.canvasStrings.`destination-over`
    - typings.canvas.canvasStrings.`source-in`
    - typings.canvas.canvasStrings.`destination-in`
    - typings.canvas.canvasStrings.`source-out`
    - typings.canvas.canvasStrings.`destination-out`
    - typings.canvas.canvasStrings.`source-atop`
    - typings.canvas.canvasStrings.`destination-atop`
    - typings.canvas.canvasStrings.xor
    - typings.canvas.canvasStrings.lighter
    - typings.canvas.canvasStrings.normal
    - typings.canvas.canvasStrings.multiply
    - typings.canvas.canvasStrings.screen
    - typings.canvas.canvasStrings.overlay
    - typings.canvas.canvasStrings.darken
    - typings.canvas.canvasStrings.lighten
    - typings.canvas.canvasStrings.`color-dodge`
    - typings.canvas.canvasStrings.`color-burn`
    - typings.canvas.canvasStrings.`hard-light`
    - typings.canvas.canvasStrings.`soft-light`
    - typings.canvas.canvasStrings.difference
    - typings.canvas.canvasStrings.exclusion
    - typings.canvas.canvasStrings.hue
    - typings.canvas.canvasStrings.saturation
    - typings.canvas.canvasStrings.color
    - typings.canvas.canvasStrings.luminosity
    - typings.canvas.canvasStrings.saturate
  */
  trait GlobalCompositeOperation extends StObject
  object GlobalCompositeOperation {
    
    inline def clear: typings.canvas.canvasStrings.clear = "clear".asInstanceOf[typings.canvas.canvasStrings.clear]
    
    inline def color: typings.canvas.canvasStrings.color = "color".asInstanceOf[typings.canvas.canvasStrings.color]
    
    inline def `color-burn`: typings.canvas.canvasStrings.`color-burn` = "color-burn".asInstanceOf[typings.canvas.canvasStrings.`color-burn`]
    
    inline def `color-dodge`: typings.canvas.canvasStrings.`color-dodge` = "color-dodge".asInstanceOf[typings.canvas.canvasStrings.`color-dodge`]
    
    inline def copy: typings.canvas.canvasStrings.copy = "copy".asInstanceOf[typings.canvas.canvasStrings.copy]
    
    inline def darken: typings.canvas.canvasStrings.darken = "darken".asInstanceOf[typings.canvas.canvasStrings.darken]
    
    inline def destination: typings.canvas.canvasStrings.destination = "destination".asInstanceOf[typings.canvas.canvasStrings.destination]
    
    inline def `destination-atop`: typings.canvas.canvasStrings.`destination-atop` = "destination-atop".asInstanceOf[typings.canvas.canvasStrings.`destination-atop`]
    
    inline def `destination-in`: typings.canvas.canvasStrings.`destination-in` = "destination-in".asInstanceOf[typings.canvas.canvasStrings.`destination-in`]
    
    inline def `destination-out`: typings.canvas.canvasStrings.`destination-out` = "destination-out".asInstanceOf[typings.canvas.canvasStrings.`destination-out`]
    
    inline def `destination-over`: typings.canvas.canvasStrings.`destination-over` = "destination-over".asInstanceOf[typings.canvas.canvasStrings.`destination-over`]
    
    inline def difference: typings.canvas.canvasStrings.difference = "difference".asInstanceOf[typings.canvas.canvasStrings.difference]
    
    inline def exclusion: typings.canvas.canvasStrings.exclusion = "exclusion".asInstanceOf[typings.canvas.canvasStrings.exclusion]
    
    inline def `hard-light`: typings.canvas.canvasStrings.`hard-light` = "hard-light".asInstanceOf[typings.canvas.canvasStrings.`hard-light`]
    
    inline def hue: typings.canvas.canvasStrings.hue = "hue".asInstanceOf[typings.canvas.canvasStrings.hue]
    
    inline def lighten: typings.canvas.canvasStrings.lighten = "lighten".asInstanceOf[typings.canvas.canvasStrings.lighten]
    
    inline def lighter: typings.canvas.canvasStrings.lighter = "lighter".asInstanceOf[typings.canvas.canvasStrings.lighter]
    
    inline def luminosity: typings.canvas.canvasStrings.luminosity = "luminosity".asInstanceOf[typings.canvas.canvasStrings.luminosity]
    
    inline def multiply: typings.canvas.canvasStrings.multiply = "multiply".asInstanceOf[typings.canvas.canvasStrings.multiply]
    
    inline def normal: typings.canvas.canvasStrings.normal = "normal".asInstanceOf[typings.canvas.canvasStrings.normal]
    
    inline def overlay: typings.canvas.canvasStrings.overlay = "overlay".asInstanceOf[typings.canvas.canvasStrings.overlay]
    
    inline def saturate: typings.canvas.canvasStrings.saturate = "saturate".asInstanceOf[typings.canvas.canvasStrings.saturate]
    
    inline def saturation: typings.canvas.canvasStrings.saturation = "saturation".asInstanceOf[typings.canvas.canvasStrings.saturation]
    
    inline def screen: typings.canvas.canvasStrings.screen = "screen".asInstanceOf[typings.canvas.canvasStrings.screen]
    
    inline def `soft-light`: typings.canvas.canvasStrings.`soft-light` = "soft-light".asInstanceOf[typings.canvas.canvasStrings.`soft-light`]
    
    inline def `source-atop`: typings.canvas.canvasStrings.`source-atop` = "source-atop".asInstanceOf[typings.canvas.canvasStrings.`source-atop`]
    
    inline def `source-in`: typings.canvas.canvasStrings.`source-in` = "source-in".asInstanceOf[typings.canvas.canvasStrings.`source-in`]
    
    inline def `source-out`: typings.canvas.canvasStrings.`source-out` = "source-out".asInstanceOf[typings.canvas.canvasStrings.`source-out`]
    
    inline def `source-over`: typings.canvas.canvasStrings.`source-over` = "source-over".asInstanceOf[typings.canvas.canvasStrings.`source-over`]
    
    inline def xor: typings.canvas.canvasStrings.xor = "xor".asInstanceOf[typings.canvas.canvasStrings.xor]
  }
  
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
  
  trait TextMetrics extends StObject {
    
    val actualBoundingBoxAscent: Double
    
    val actualBoundingBoxDescent: Double
    
    val actualBoundingBoxLeft: Double
    
    val actualBoundingBoxRight: Double
    
    val fontBoundingBoxAscent: Double
    
    val fontBoundingBoxDescent: Double
    
    val width: Double
  }
  object TextMetrics {
    
    inline def apply(
      actualBoundingBoxAscent: Double,
      actualBoundingBoxDescent: Double,
      actualBoundingBoxLeft: Double,
      actualBoundingBoxRight: Double,
      fontBoundingBoxAscent: Double,
      fontBoundingBoxDescent: Double,
      width: Double
    ): TextMetrics = {
      val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
      
      inline def setActualBoundingBoxAscent(value: Double): Self = StObject.set(x, "actualBoundingBoxAscent", value.asInstanceOf[js.Any])
      
      inline def setActualBoundingBoxDescent(value: Double): Self = StObject.set(x, "actualBoundingBoxDescent", value.asInstanceOf[js.Any])
      
      inline def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
      
      inline def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
      
      inline def setFontBoundingBoxAscent(value: Double): Self = StObject.set(x, "fontBoundingBoxAscent", value.asInstanceOf[js.Any])
      
      inline def setFontBoundingBoxDescent(value: Double): Self = StObject.set(x, "fontBoundingBoxDescent", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
