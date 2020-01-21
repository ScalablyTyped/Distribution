package typings.canvaskitWasm.mod

import typings.canvaskitWasm.AnonA16float
import typings.canvaskitWasm.AnonBevel
import typings.canvaskitWasm.AnonBlack
import typings.canvaskitWasm.AnonButt
import typings.canvaskitWasm.AnonCenter
import typings.canvaskitWasm.AnonClamp
import typings.canvaskitWasm.AnonClear
import typings.canvaskitWasm.AnonCondensed
import typings.canvaskitWasm.AnonDifference
import typings.canvaskitWasm.AnonDifferenceIntersect
import typings.canvaskitWasm.AnonDownstream
import typings.canvaskitWasm.AnonEvenOdd
import typings.canvaskitWasm.AnonFill
import typings.canvaskitWasm.AnonHigh
import typings.canvaskitWasm.AnonInner
import typings.canvaskitWasm.AnonItalic
import typings.canvaskitWasm.AnonJPEG
import typings.canvaskitWasm.AnonLTR
import typings.canvaskitWasm.AnonLines
import typings.canvaskitWasm.AnonOpaque
import typings.canvaskitWasm.AnonTriangleFan
import typings.std.ArrayBuffer
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasKit extends js.Object {
  // enums
  val Affinity: SkEnum[SkAffinity, AnonDownstream] = js.native
  val AlphaType: SkEnum[SkAlphaType, AnonOpaque] = js.native
  // colors
  val BLACK: SkColor = js.native
  val BLUE: SkColor = js.native
  val BlendMode: SkEnum[SkBlendMode, AnonClear] = js.native
  val BlurStyle: SkEnum[SkBlurStyle, AnonInner] = js.native
  val CYAN: SkColor = js.native
  val ClipOp: SkEnum[SkClipOp, AnonDifference] = js.native
  val ColorType: SkEnum[SkColorType, AnonA16float] = js.native
  val FillType: SkEnum[SkFillType, AnonEvenOdd] = js.native
  val FilterQuality: SkEnum[SkFilterQuality, AnonHigh] = js.native
  val FontSlant: SkEnum[SkFontSlant, AnonItalic] = js.native
  val FontWeight: SkEnum[SkFontWeight, AnonBlack] = js.native
  val FontWidth: SkEnum[SkFontWidth, AnonCondensed] = js.native
  val ImageFormat: SkEnum[SkImageFormat, AnonJPEG] = js.native
  // decoration
  val LineThroughDecoration: SkDecoration = js.native
  val NoDecoration: SkDecoration = js.native
  val OverlineDecoration: SkDecoration = js.native
  val PaintStyle: SkEnum[SkPaintStyle, AnonFill] = js.native
  val ParagraphBuilder: SkParagraphBuilderFactory = js.native
  val ParagraphStyle: ParagraphStyleConstructor = js.native
  val PathOp: SkEnum[SkPathOp, AnonDifferenceIntersect] = js.native
  val PointMode: SkEnum[SkPointMode, AnonLines] = js.native
  val RED: SkColor = js.native
  val ShapedText: ShapedTextConstructor = js.native
  val SkColorFilter: SkColorFilterFactory = js.native
  val SkFont: SkFontConstructor = js.native
  val SkFontMgr: SkFontMgrFactory = js.native
  val SkImageFilter: SkImageFilterFactory = js.native
  val SkMaskFilter: SkMaskFilterFactory = js.native
  // classes
  val SkPaint: SkPaintConstructor = js.native
  val SkPath: SKPathConstructor = js.native
  val SkPictureRecorder: SkPictureRecorderConstructor = js.native
  val SkTextBlob: SkTextBlobFactory = js.native
  val StrokeCap: SkEnum[SkStrokeCap, AnonButt] = js.native
  val StrokeJoin: SkEnum[SkStrokeJoin, AnonBevel] = js.native
  val TRANSPARENT: SkColor = js.native
  val TextAlign: SkEnum[SkTextAlign, AnonCenter] = js.native
  val TextDirection: SkEnum[SkTextDirection, AnonLTR] = js.native
  val TextStyle: TextStyleConstructor = js.native
  val TileMode: SkEnum[SkTileMode, AnonClamp] = js.native
  val UnderlineDecoration: SkDecoration = js.native
  val VertexMode: SkEnum[SkVertexMode, AnonTriangleFan] = js.native
  val WHITE: SkColor = js.native
  val YELLOW: SkColor = js.native
  // factories
  def Color(r: Double, g: Double, b: Double, a: Double): SkColor = js.native
  def LTRBRect(left: Double, top: Double, right: Double, bottom: Double): SkRect = js.native
  def MakeAnimatedImageFromEncoded(buffer: ArrayBuffer): SkAnimatedImage = js.native
  def MakeAnimation(lottieJson: js.Any): SkAnimation = js.native
  def MakeCanvasSurface(canvas: HTMLCanvasElement): SkSurface = js.native
  def MakeImageFromEncoded(buffer: ArrayBuffer): SkImage = js.native
  def MakeLinearGradientShader(
    start: SkPoint,
    end: SkPoint,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeLinearGradientShader(
    start: SkPoint,
    end: SkPoint,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def MakePathFromCmds(cmds: js.Array[SkPathCommand]): typings.canvaskitWasm.mod.SkPath = js.native
  def MakePathFromOp(first: typings.canvaskitWasm.mod.SkPath, second: typings.canvaskitWasm.mod.SkPath, op: SkPathOp): typings.canvaskitWasm.mod.SkPath = js.native
  def MakePathFromSVGString(svg: String): typings.canvaskitWasm.mod.SkPath = js.native
  def MakeRadialGradientShader(
    center: SkPoint,
    radius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeRadialGradientShader(
    center: SkPoint,
    radius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def MakeSkCornerPathEffect(radius: Double): SkPathEffect = js.native
  def MakeSkDashPathEffect(intervals: js.Array[Double], phase: Double): SkPathEffect = js.native
  def MakeSkDiscretePathEffect(frequency: Double, amplitude: Double, seed: Double): SkPathEffect = js.native
  def MakeSurface(width: Double, height: Double): SkSurface = js.native
  def MakeTwoPointConicalGradientShader(
    start: SkPoint,
    startRadius: Double,
    end: SkPoint,
    endRadius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: Null,
    flags: Double
  ): SkShader = js.native
  def MakeTwoPointConicalGradientShader(
    start: SkPoint,
    startRadius: Double,
    end: SkPoint,
    endRadius: Double,
    colors: js.Array[SkColor],
    positions: js.Array[Double],
    mode: Double,
    localMatrix: SkMatrix,
    flags: Double
  ): SkShader = js.native
  def RRectXY(rect: SkRect, rx: Double, ry: Double): SkRRect = js.native
  def XYWHRect(x: Double, y: Double, width: Double, height: Double): SkRect = js.native
  // methods
  def currentContext(): SkContext = js.native
  def setCurrentContext(context: SkContext): Unit = js.native
}

