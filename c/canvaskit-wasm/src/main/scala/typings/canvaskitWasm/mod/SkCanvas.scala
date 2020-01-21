package typings.canvaskitWasm.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkCanvas extends SkObject[SkCanvas] {
  def clear(color: SkColor): Unit = js.native
  def clipPath(path: SkPath, op: SkClipOp, antialias: Boolean): Unit = js.native
  def clipRRect(rrect: SkRRect, op: SkClipOp, antialias: Boolean): Unit = js.native
  def clipRect(rect: SkRect, op: SkClipOp, antialias: Boolean): Unit = js.native
  def concat(matrix: SkMatrix): Unit = js.native
  def drawAnimatedImage(image: SkAnimatedImage, x: Double, y: Double): Unit = js.native
  def drawArc(rect: SkRect, from: Double, to: Double, close: Boolean, paint: SkPaint): Unit = js.native
  def drawCircle(cx: Double, cy: Double, radius: Double, paint: SkPaint): Unit = js.native
  def drawColor(color: SkColor, blend: SkBlendMode): Unit = js.native
  def drawDRRect(outer: SkRRect, inner: SkRRect, paint: SkPaint): Unit = js.native
  def drawImage(image: SkImage, dx: Double, dy: Double, paint: SkPaint): Unit = js.native
  def drawImageNine(image: SkImage, srcRect: SkRect, destRect: SkRect, paint: SkPaint): Unit = js.native
  def drawImageRect(image: SkImage, srcRect: SkRect, destRect: SkRect, paint: SkPaint, strict: Boolean): Unit = js.native
  def drawLine(x1: Double, y1: Double, x2: Double, y2: Double, paint: SkPaint): Unit = js.native
  def drawOval(rect: SkRect, paint: SkPaint): Unit = js.native
  def drawPaint(paint: SkPaint): Unit = js.native
  def drawParagraph(paragraph: SkParagraph, x: Double, y: Double): Unit = js.native
  def drawPath(path: SkPath, paint: SkPaint): Unit = js.native
  def drawPicture(picture: SkPicture): Unit = js.native
  def drawPoints(mode: SkPointMode, points: js.Array[SkPoint], paint: SkPaint): Unit = js.native
  def drawRRect(rect: SkRRect, paint: SkPaint): Unit = js.native
  def drawRect(rect: SkRect, paint: SkPaint): Unit = js.native
  def drawRoundRect(rect: SkRect, rx: Double, ry: Double, paint: SkPaint): Unit = js.native
  def drawText(text: String, x: Double, y: Double, paint: SkPaint, font: SkFont): Unit = js.native
  def drawText(text: SkShapedText, x: Double, y: Double, paint: SkPaint, font: SkFont): Unit = js.native
  def drawTextBlob(text: SkTextBlob, x: Double, y: Double, paint: SkPaint): Unit = js.native
  def drawVertices(vertices: js.Any, blendMode: SkBlendMode, paint: SkPaint): Unit = js.native
  def flush(): Unit = js.native
  def getSaveCount(): Double = js.native
  def getTotalMatrix(): SkMatrix = js.native
  def makeSurface(info: SkImageInfo): SkSurface = js.native
  def readPixels(x: Double, y: Double, w: Double, h: Double): Uint8Array = js.native
  def readPixels(x: Double, y: Double, w: Double, h: Double, alphaType: SkAlphaType): Uint8Array = js.native
  def readPixels(x: Double, y: Double, w: Double, h: Double, alphaType: SkAlphaType, colorType: SkColorType): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: SkAlphaType,
    colorType: SkColorType,
    dstRowBytes: Double
  ): Uint8Array = js.native
  def restore(): Unit = js.native
  def restoreToCount(count: Double): Unit = js.native
  def rotate(degree: Double, px: Double, py: Double): Unit = js.native
  def save(): Unit = js.native
  def saveLayer(bounds: SkRect, paint: SkPaint): Double = js.native
  def scale(sx: Double, sy: Double): Unit = js.native
  def skew(sx: Double, sy: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
  def writePixels(pixels: Uint8Array, srcWidth: Double, srcHeight: Double, destX: Double, destY: Double): Unit = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: SkAlphaType
  ): Unit = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: SkAlphaType,
    colorType: SkColorType
  ): Unit = js.native
}

