package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends StObject
     with EmbindObject[Path] {
  
  /**
    * Appends arc to Path, as the start of new contour. Arc added is part of ellipse
    * bounded by oval, from startAngle through sweepAngle. Both startAngle and
    * sweepAngle are measured in degrees, where zero degrees is aligned with the
    * positive x-axis, and positive sweeps extends arc clockwise.
    * Returns the modified path for easier chaining.
    * @param oval
    * @param startAngle
    * @param sweepAngle
    */
  def addArc(oval: InputRect, startAngle: AngleInDegrees, sweepAngle: AngleInDegrees): Path = js.native
  
  /**
    * Adds circle centered at (x, y) of size radius to the path.
    * Has no effect if radius is zero or negative.
    *
    * @param x       center of circle
    * @param y       center of circle
    * @param radius  distance from center to edge
    * @param isCCW - if the path should be drawn counter-clockwise or not
    * @return        reference to SkPath
    */
  def addCircle(x: Double, y: Double, r: Double): Path = js.native
  def addCircle(x: Double, y: Double, r: Double, isCCW: Boolean): Path = js.native
  
  /**
    * Adds oval to Path, appending kMove_Verb, four kConic_Verb, and kClose_Verb.
    * Oval is upright ellipse bounded by Rect oval with radii equal to half oval width
    * and half oval height. Oval begins at start and continues clockwise by default.
    * Returns the modified path for easier chaining.
    * @param oval
    * @param isCCW - if the path should be drawn counter-clockwise or not
    * @param startIndex - index of initial point of ellipse
    */
  def addOval(oval: InputRect): Path = js.native
  def addOval(oval: InputRect, isCCW: Boolean): Path = js.native
  def addOval(oval: InputRect, isCCW: Boolean, startIndex: Double): Path = js.native
  def addOval(oval: InputRect, isCCW: Unit, startIndex: Double): Path = js.native
  
  /**
    * Takes 1, 2, 7, or 10 required args, where the first arg is always the path.
    * The last arg is an optional boolean and chooses between add or extend mode.
    * The options for the remaining args are:
    *   - an array of 6 or 9 parameters (perspective is optional)
    *   - the 9 parameters of a full matrix or
    *     the 6 non-perspective params of a matrix.
    * Returns the modified path for easier chaining (or null if params were incorrect).
    * @param args
    */
  def addPath(args: Any*): Path | Null = js.native
  
  /**
    * Adds contour created from array of n points, adding (count - 1) line segments.
    * Contour added starts at pts[0], then adds a line for every additional point
    * in pts array. If close is true, appends kClose_Verb to Path, connecting
    * pts[count - 1] and pts[0].
    * Returns the modified path for easier chaining.
    * @param points
    * @param close - if true, will add a line connecting last point to the first point.
    */
  def addPoly(points: InputFlattenedPointArray, close: Boolean): Path = js.native
  
  /**
    * Adds rrect to Path, creating a new closed contour.
    * Returns the modified path for easier chaining.
    * @param rrect
    * @param isCCW
    */
  def addRRect(rrect: InputRRect): Path = js.native
  def addRRect(rrect: InputRRect, isCCW: Boolean): Path = js.native
  
  /**
    * Adds Rect to Path, appending kMove_Verb, three kLine_Verb, and kClose_Verb,
    * starting with top-left corner of Rect; followed by top-right, bottom-right,
    * and bottom-left if isCCW is false; or followed by bottom-left,
    * bottom-right, and top-right if isCCW is true.
    * Returns the modified path for easier chaining.
    * @param rect
    * @param isCCW
    */
  def addRect(rect: InputRect): Path = js.native
  def addRect(rect: InputRect, isCCW: Boolean): Path = js.native
  
  /**
    * Adds the given verbs and associated points/weights to the path. The process
    * reads the first verb from verbs and then the appropriate number of points from the
    * FlattenedPointArray (e.g. 2 points for moveTo, 4 points for quadTo, etc). If the verb is
    * a conic, a weight will be read from the WeightList.
    * Returns the modified path for easier chaining
    * @param verbs - the verbs that create this path, in the order of being drawn.
    * @param points - represents n points with 2n floats.
    * @param weights - used if any of the verbs are conics, can be omitted otherwise.
    */
  def addVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray): Path = js.native
  def addVerbsPointsWeights(verbs: VerbList, points: InputFlattenedPointArray, weights: WeightList): Path = js.native
  
  /**
    * Adds an arc to this path, emulating the Canvas2D behavior.
    * Returns the modified path for easier chaining.
    * @param x
    * @param y
    * @param radius
    * @param startAngle
    * @param endAngle
    * @param isCCW
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: AngleInRadians, endAngle: AngleInRadians): Path = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: AngleInRadians,
    endAngle: AngleInRadians,
    isCCW: Boolean
  ): Path = js.native
  
  /**
    * Appends arc to Path. Arc added is part of ellipse
    * bounded by oval, from startAngle through sweepAngle. Both startAngle and
    * sweepAngle are measured in degrees, where zero degrees is aligned with the
    * positive x-axis, and positive sweeps extends arc clockwise.
    * Returns the modified path for easier chaining.
    * @param oval
    * @param startAngle
    * @param endAngle
    * @param forceMoveTo
    */
  def arcToOval(oval: InputRect, startAngle: AngleInDegrees, endAngle: AngleInDegrees, forceMoveTo: Boolean): Path = js.native
  
  /**
    * Appends arc to Path. Arc is implemented by one or more conics weighted to
    * describe part of oval with radii (rx, ry) rotated by xAxisRotate degrees. Arc
    * curves from last Path Point to (x, y), choosing one of four possible routes:
    * clockwise or counterclockwise, and smaller or larger. See SkPath.h for more details.
    * Returns the modified path for easier chaining.
    * @param rx
    * @param ry
    * @param xAxisRotate
    * @param useSmallArc
    * @param isCCW
    * @param x
    * @param y
    */
  def arcToRotated(
    rx: Double,
    ry: Double,
    xAxisRotate: AngleInDegrees,
    useSmallArc: Boolean,
    isCCW: Boolean,
    x: Double,
    y: Double
  ): Path = js.native
  
  /**
    * Appends arc to Path, after appending line if needed. Arc is implemented by conic
    * weighted to describe part of circle. Arc is contained by tangent from
    * last Path point to (x1, y1), and tangent from (x1, y1) to (x2, y2). Arc
    * is part of circle sized to radius, positioned so it touches both tangent lines.
    * Returns the modified path for easier chaining.
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @param radius
    */
  def arcToTangent(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Path = js.native
  
  /**
    * Appends CLOSE_VERB to Path. A closed contour connects the first and last point
    * with a line, forming a continuous loop.
    * Returns the modified path for easier chaining.
    */
  def close(): Path = js.native
  
  /**
    * Returns minimum and maximum axes values of the lines and curves in Path.
    * Returns (0, 0, 0, 0) if Path contains no points.
    * Returned bounds width and height may be larger or smaller than area affected
    * when Path is drawn.
    *
    * Behaves identically to getBounds() when Path contains
    * only lines. If Path contains curves, computed bounds includes
    * the maximum extent of the quad, conic, or cubic; is slower than getBounds();
    * and unlike getBounds(), does not cache the result.
    * @param outputArray - if provided, the bounding box will be copied into this array instead of
    *                      allocating a new one.
    */
  def computeTightBounds(): js.typedarray.Float32Array = js.native
  def computeTightBounds(outputArray: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Adds conic from last point towards (x1, y1), to (x2, y2), weighted by w.
    * If Path is empty, or path is closed, the last point is set to (0, 0)
    * before adding conic.
    * Returns the modified path for easier chaining.
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @param w
    */
  def conicTo(x1: Double, y1: Double, x2: Double, y2: Double, w: Double): Path = js.native
  
  /**
    * Returns true if the point (x, y) is contained by Path, taking into
    * account FillType.
    * @param x
    * @param y
    */
  def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * Returns a copy of this Path.
    */
  def copy(): Path = js.native
  
  /**
    * Returns the number of points in this path. Initially zero.
    */
  def countPoints(): Double = js.native
  
  /**
    *  Adds cubic from last point towards (x1, y1), then towards (x2, y2), ending at
    * (x3, y3). If Path is empty, or path is closed, the last point is set to
    * (0, 0) before adding cubic.
    * @param cpx1
    * @param cpy1
    * @param cpx2
    * @param cpy2
    * @param x
    * @param y
    */
  def cubicTo(cpx1: Double, cpy1: Double, cpx2: Double, cpy2: Double, x: Double, y: Double): Path = js.native
  
  /**
    * Changes this path to be the dashed version of itself. This is the same effect as creating
    * a DashPathEffect and calling filterPath on this path.
    * @param on
    * @param off
    * @param phase
    */
  def dash(on: Double, off: Double, phase: Double): Boolean = js.native
  
  /**
    * Returns true if other path is equal to this path.
    * @param other
    */
  def equals(other: Path): Boolean = js.native
  
  /**
    * Returns minimum and maximum axes values of Point array.
    * Returns (0, 0, 0, 0) if Path contains no points. Returned bounds width and height may
    * be larger or smaller than area affected when Path is drawn.
    * @param outputArray - if provided, the bounding box will be copied into this array instead of
    *                      allocating a new one.
    */
  def getBounds(): js.typedarray.Float32Array = js.native
  def getBounds(outputArray: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Return the FillType for this path.
    */
  def getFillType(): FillType = js.native
  
  /**
    * Returns the Point at index in Point array. Valid range for index is
    * 0 to countPoints() - 1.
    * @param index
    * @param outputArray - if provided, the point will be copied into this array instead of
    *                      allocating a new one.
    */
  def getPoint(index: Double): js.typedarray.Float32Array = js.native
  def getPoint(index: Double, outputArray: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Returns true if there are no verbs in the path.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Returns true if the path is volatile; it will not be altered or discarded
    * by the caller after it is drawn. Path by default have volatile set false, allowing
    * Surface to attach a cache of data which speeds repeated drawing. If true, Surface
    * may not speed repeated drawing.
    */
  def isVolatile(): Boolean = js.native
  
  /**
    * Adds line from last point to (x, y). If Path is empty, or last path is closed,
    * last point is set to (0, 0) before adding line.
    * Returns the modified path for easier chaining.
    * @param x
    * @param y
    */
  def lineTo(x: Double, y: Double): Path = js.native
  
  /**
    * Returns a new path that covers the same area as the original path, but with the
    * Winding FillType. This may re-draw some contours in the path as counter-clockwise
    * instead of clockwise to achieve that effect. If such a transformation cannot
    * be done, null is returned.
    */
  def makeAsWinding(): Path | Null = js.native
  
  /**
    * Adds beginning of contour at the given point.
    * Returns the modified path for easier chaining.
    * @param x
    * @param y
    */
  def moveTo(x: Double, y: Double): Path = js.native
  
  /**
    * Translates all the points in the path by dx, dy.
    * Returns the modified path for easier chaining.
    * @param dx
    * @param dy
    */
  def offset(dx: Double, dy: Double): Path = js.native
  
  /**
    * Combines this path with the other path using the given PathOp. Returns false if the operation
    * fails.
    * @param other
    * @param op
    */
  def op(other: Path, op: PathOp): Boolean = js.native
  
  /**
    * Adds quad from last point towards (x1, y1), to (x2, y2).
    * If Path is empty, or path is closed, last point is set to (0, 0) before adding quad.
    * Returns the modified path for easier chaining.
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    */
  def quadTo(x1: Double, y1: Double, x2: Double, y2: Double): Path = js.native
  
  /**
    * Relative version of arcToRotated.
    * @param rx
    * @param ry
    * @param xAxisRotate
    * @param useSmallArc
    * @param isCCW
    * @param dx
    * @param dy
    */
  def rArcTo(
    rx: Double,
    ry: Double,
    xAxisRotate: AngleInDegrees,
    useSmallArc: Boolean,
    isCCW: Boolean,
    dx: Double,
    dy: Double
  ): Path = js.native
  
  /**
    * Relative version of conicTo.
    * @param dx1
    * @param dy1
    * @param dx2
    * @param dy2
    * @param w
    */
  def rConicTo(dx1: Double, dy1: Double, dx2: Double, dy2: Double, w: Double): Path = js.native
  
  /**
    * Relative version of cubicTo.
    * @param cpx1
    * @param cpy1
    * @param cpx2
    * @param cpy2
    * @param x
    * @param y
    */
  def rCubicTo(cpx1: Double, cpy1: Double, cpx2: Double, cpy2: Double, x: Double, y: Double): Path = js.native
  
  /**
    * Relative version of lineTo.
    * @param x
    * @param y
    */
  def rLineTo(x: Double, y: Double): Path = js.native
  
  /**
    * Relative version of moveTo.
    * @param x
    * @param y
    */
  def rMoveTo(x: Double, y: Double): Path = js.native
  
  /**
    * Relative version of quadTo.
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    */
  def rQuadTo(x1: Double, y1: Double, x2: Double, y2: Double): Path = js.native
  
  /**
    * Sets Path to its initial state.
    * Removes verb array, point array, and weights, and sets FillType to Winding.
    * Internal storage associated with Path is released
    */
  def reset(): Unit = js.native
  
  /**
    * Sets Path to its initial state.
    * Removes verb array, point array, and weights, and sets FillType to Winding.
    * Internal storage associated with Path is *not* released.
    * Use rewind() instead of reset() if Path storage will be reused and performance
    * is critical.
    */
  def rewind(): Unit = js.native
  
  /**
    * Sets FillType, the rule used to fill Path.
    * @param fill
    */
  def setFillType(fill: FillType): Unit = js.native
  
  /**
    * Specifies whether Path is volatile; whether it will be altered or discarded
    * by the caller after it is drawn. Path by default have volatile set false.
    *
    * Mark animating or temporary paths as volatile to improve performance.
    * Mark unchanging Path non-volatile to improve repeated rendering.
    * @param volatile
    */
  def setIsVolatile(volatile: Boolean): Unit = js.native
  
  /**
    * Set this path to a set of non-overlapping contours that describe the
    * same area as the original path.
    * The curve order is reduced where possible so that cubics may
    * be turned into quadratics, and quadratics maybe turned into lines.
    *
    * Returns true if operation was able to produce a result.
    */
  def simplify(): Boolean = js.native
  
  /**
    * Turns this path into the filled equivalent of the stroked path. Returns null if the operation
    * fails (e.g. the path is a hairline).
    * @param opts - describe how stroked path should look.
    */
  def stroke(): Path | Null = js.native
  def stroke(opts: StrokeOpts): Path | Null = js.native
  
  /**
    * Serializes the contents of this path as a series of commands.
    * The first item will be a verb, followed by any number of arguments needed. Then it will
    * be followed by another verb, more arguments and so on.
    */
  def toCmds(): js.typedarray.Float32Array = js.native
  
  /**
    * Returns this path as an SVG string.
    */
  def toSVGString(): String = js.native
  
  /**
    * Takes a 3x3 matrix as either an array or as 9 individual params.
    * @param args
    */
  def transform(args: Any*): Path = js.native
  
  /**
    * Take start and stop "t" values (values between 0...1), and modify this path such that
    * it is a subset of the original path.
    * The trim values apply to the entire path, so if it contains several contours, all of them
    * are including in the calculation.
    * Null is returned if either input value is NaN.
    * @param startT - a value in the range [0.0, 1.0]. 0.0 is the beginning of the path.
    * @param stopT  - a value in the range [0.0, 1.0]. 1.0 is the end of the path.
    * @param isComplement
    */
  def trim(startT: Double, stopT: Double, isComplement: Boolean): Path | Null = js.native
}
