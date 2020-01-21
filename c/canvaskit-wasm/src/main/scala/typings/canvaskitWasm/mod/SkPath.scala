package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkPath extends SkObject[SkPath] {
  def addArc(oval: SkRect, startAngle: Double, sweepAngle: Double): Unit = js.native
  def addOval(oval: SkRect, isCCW: Boolean, startIndex: Double): Unit = js.native
  def addPath(path: SkPath): Unit = js.native
  def addPath(path: SkPath, extend: Boolean): Unit = js.native
  def addPath(path: SkPath, m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double): Unit = js.native
  def addPath(
    path: SkPath,
    m00: Double,
    m01: Double,
    m02: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    extend: Boolean
  ): Unit = js.native
  def addPath(
    path: SkPath,
    m00: Double,
    m01: Double,
    m02: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m20: Double,
    m21: Double,
    m22: Double
  ): Unit = js.native
  def addPath(
    path: SkPath,
    m00: Double,
    m01: Double,
    m02: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m20: Double,
    m21: Double,
    m22: Double,
    extend: Boolean
  ): Unit = js.native
  def addPoly(points: js.Array[SkPoint], close: Boolean): Unit = js.native
  def addRect(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def addRect(left: Double, top: Double, right: Double, bottom: Double, isCCW: Boolean): Unit = js.native
  def addRect(rect: SkRect): Unit = js.native
  def addRect(rect: SkRect, isCCW: Boolean): Unit = js.native
  def addRoundRect(left: Double, top: Double, right: Double, bottom: Double, rx: Double, ry: Double, isCCW: Boolean): Unit = js.native
  def addRoundRect(rect: SkRect, rx: Double, ry: Double, isCCW: Boolean): Unit = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, isCCW: Boolean): Unit = js.native
  def arcTo(oval: SkRect, startAngle: Double, sweepAngle: Double, forceMoveTo: Boolean): Unit = js.native
  def close(): Unit = js.native
  def conicTo(x1: Double, y1: Double, x2: Double, y2: Double, w: Double): Unit = js.native
  def cubicTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def dash(on: Double, off: Double, phase: Double): Unit = js.native
  def equals(other: SkPath): Boolean = js.native
  def getBounds(): SkRect = js.native
  def getFillType(): SkFillType = js.native
  def getPoint(index: Double): SkPoint = js.native
  def isEmpty(): Boolean = js.native
  def isVolatile(): Boolean = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def offset(dx: Double, dy: Double): Unit = js.native
  def op(other: SkPath, op: SkPathOp): Unit = js.native
  def quadTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def rArcTo(
    rx: Double,
    ry: Double,
    xAxisRotate: Double,
    useSmallArc: Boolean,
    isCCW: Boolean,
    dx: Double,
    dy: Double
  ): Unit = js.native
  def rConicTo(dx1: Double, dy1: Double, dx2: Double, dy2: Double, w: Double): Unit = js.native
  def rCubicTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def rLineTo(dx: Double, dy: Double): Unit = js.native
  def rMoveTo(dx: Double, dy: Double): Unit = js.native
  def rQuadTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def reset(): Unit = js.native
  def rewind(): Unit = js.native
  def setFillType(value: SkFillType): Unit = js.native
  def setIsVolatile(value: Boolean): Unit = js.native
  def simplify(): Unit = js.native
  def stroke(config: SkStrokeConfig): Unit = js.native
  def toCmds(): js.Array[SkPathCommand] = js.native
  def toSVGString(): String = js.native
  def transform(
    m00: Double,
    m01: Double,
    m02: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m20: Double,
    m21: Double,
    m22: Double
  ): Unit = js.native
  def transform(matrix: SkMatrix): Unit = js.native
  def trim(startT: js.Any, stopT: js.Any, isComplement: Boolean): Unit = js.native
}

