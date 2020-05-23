package typings.canvaskitWasm.mod

import typings.canvaskitWasm.anon.SkEnumSkAffinityDownstrea
import typings.canvaskitWasm.anon.SkEnumSkAlphaTypeOpaqueSk
import typings.canvaskitWasm.anon.SkEnumSkBlendModeClearSkB
import typings.canvaskitWasm.anon.SkEnumSkBlurStyleInnerSkB
import typings.canvaskitWasm.anon.SkEnumSkClipOpDifferenceS
import typings.canvaskitWasm.anon.SkEnumSkColorTypeA16float
import typings.canvaskitWasm.anon.SkEnumSkFillTypeEvenOddSk
import typings.canvaskitWasm.anon.SkEnumSkFilterQualityHigh
import typings.canvaskitWasm.anon.SkEnumSkFontSlantItalicSk
import typings.canvaskitWasm.anon.SkEnumSkFontWeightExtraBl
import typings.canvaskitWasm.anon.SkEnumSkFontWidthCondense
import typings.canvaskitWasm.anon.SkEnumSkImageFormatJPEGSk
import typings.canvaskitWasm.anon.SkEnumSkPaintStyleFillSkP
import typings.canvaskitWasm.anon.SkEnumSkPathOpDifferenceS
import typings.canvaskitWasm.anon.SkEnumSkPointModeLinesSkP
import typings.canvaskitWasm.anon.SkEnumSkStrokeCapButtSkSt
import typings.canvaskitWasm.anon.SkEnumSkStrokeJoinBevelSk
import typings.canvaskitWasm.anon.SkEnumSkTextAlignCenterSk
import typings.canvaskitWasm.anon.SkEnumSkTextDirectionLTRS
import typings.canvaskitWasm.anon.SkEnumSkTileModeClampSkTi
import typings.canvaskitWasm.anon.SkEnumSkVertexModeTriangl
import typings.std.ArrayBuffer
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasKit extends js.Object {
  // enums
  val Affinity: SkEnumSkAffinityDownstrea = js.native
  val AlphaType: SkEnumSkAlphaTypeOpaqueSk = js.native
  // colors
  val BLACK: SkColor = js.native
  val BLUE: SkColor = js.native
  val BlendMode: SkEnumSkBlendModeClearSkB = js.native
  val BlurStyle: SkEnumSkBlurStyleInnerSkB = js.native
  val CYAN: SkColor = js.native
  val ClipOp: SkEnumSkClipOpDifferenceS = js.native
  val ColorType: SkEnumSkColorTypeA16float = js.native
  val FillType: SkEnumSkFillTypeEvenOddSk = js.native
  val FilterQuality: SkEnumSkFilterQualityHigh = js.native
  val FontSlant: SkEnumSkFontSlantItalicSk = js.native
  val FontWeight: SkEnumSkFontWeightExtraBl = js.native
  val FontWidth: SkEnumSkFontWidthCondense = js.native
  val ImageFormat: SkEnumSkImageFormatJPEGSk = js.native
  // decoration
  val LineThroughDecoration: SkDecoration = js.native
  val NoDecoration: SkDecoration = js.native
  val OverlineDecoration: SkDecoration = js.native
  val PaintStyle: SkEnumSkPaintStyleFillSkP = js.native
  val ParagraphBuilder: SkParagraphBuilderFactory = js.native
  val ParagraphStyle: ParagraphStyleConstructor = js.native
  val PathOp: SkEnumSkPathOpDifferenceS = js.native
  val PointMode: SkEnumSkPointModeLinesSkP = js.native
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
  val StrokeCap: SkEnumSkStrokeCapButtSkSt = js.native
  val StrokeJoin: SkEnumSkStrokeJoinBevelSk = js.native
  val TRANSPARENT: SkColor = js.native
  val TextAlign: SkEnumSkTextAlignCenterSk = js.native
  val TextDirection: SkEnumSkTextDirectionLTRS = js.native
  val TextStyle: TextStyleConstructor = js.native
  val TileMode: SkEnumSkTileModeClampSkTi = js.native
  val UnderlineDecoration: SkDecoration = js.native
  val VertexMode: SkEnumSkVertexModeTriangl = js.native
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

