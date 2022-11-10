package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMathDotpathMod {
  
  @JSImport("babylonjs/Maths/math.path", "Angle")
  @js.native
  open class Angle protected () extends StObject {
    /**
      * Creates an Angle object of "radians" radians (float).
      * @param radians the angle in radians
      */
    def this(radians: Double) = this()
    
    /* private */ var _radians: Any = js.native
    
    /**
      * Get value in degrees
      * @returns the Angle value in degrees (float)
      */
    def degrees(): Double = js.native
    
    /**
      * Get value in radians
      * @returns the Angle value in radians (float)
      */
    def radians(): Double = js.native
  }
  /* static members */
  object Angle {
    
    @JSImport("babylonjs/Maths/math.path", "Angle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a new Angle object valued with the gradient angle, in radians, of the line joining two points
      * @param a defines first point as the origin
      * @param b defines point
      * @returns a new Angle
      */
    inline def BetweenTwoPoints(a: DeepImmutable[Vector2], b: DeepImmutable[Vector2]): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenTwoPoints")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Angle]
    
    /**
      * Gets a new Angle object from the given float in degrees
      * @param degrees defines the angle value in degrees
      * @returns a new Angle
      */
    inline def FromDegrees(degrees: Double): Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDegrees")(degrees.asInstanceOf[js.Any]).asInstanceOf[Angle]
    
    /**
      * Gets a new Angle object from the given float in radians
      * @param radians defines the angle value in radians
      * @returns a new Angle
      */
    inline def FromRadians(radians: Double): Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRadians")(radians.asInstanceOf[js.Any]).asInstanceOf[Angle]
  }
  
  @JSImport("babylonjs/Maths/math.path", "Arc2")
  @js.native
  open class Arc2 protected () extends StObject {
    /**
      * Creates an Arc object from the three given points : start, middle and end.
      * @param startPoint Defines the start point of the arc
      * @param midPoint Defines the middle point of the arc
      * @param endPoint Defines the end point of the arc
      */
    def this(
      /** Defines the start point of the arc */
    startPoint: Vector2,
      /** Defines the mid point of the arc */
    midPoint: Vector2,
      /** Defines the end point of the arc */
    endPoint: Vector2
    ) = this()
    
    /**
      * Defines the angle of the arc (from mid point to end point).
      */
    var angle: Angle = js.native
    
    /**
      * Defines the center point of the arc.
      */
    var centerPoint: Vector2 = js.native
    
    /** Defines the end point of the arc */
    var endPoint: Vector2 = js.native
    
    /** Defines the mid point of the arc */
    var midPoint: Vector2 = js.native
    
    /**
      * Defines the orientation of the arc (clock wise/counter clock wise).
      */
    var orientation: Orientation = js.native
    
    /**
      * Defines the radius of the arc.
      */
    var radius: Double = js.native
    
    /**
      * Defines the start angle of the arc (from start point to middle point).
      */
    var startAngle: Angle = js.native
    
    /** Defines the start point of the arc */
    var startPoint: Vector2 = js.native
  }
  
  @JSImport("babylonjs/Maths/math.path", "BezierCurve")
  @js.native
  open class BezierCurve () extends StObject
  /* static members */
  object BezierCurve {
    
    @JSImport("babylonjs/Maths/math.path", "BezierCurve")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the cubic Bezier interpolated value (float) at "t" (float) from the given x1, y1, x2, y2 floats
      * @param t defines the time
      * @param x1 defines the left coordinate on X axis
      * @param y1 defines the left coordinate on Y axis
      * @param x2 defines the right coordinate on X axis
      * @param y2 defines the right coordinate on Y axis
      * @returns the interpolated value
      */
    inline def Interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(t.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("babylonjs/Maths/math.path", "Curve3")
  @js.native
  open class Curve3 protected () extends StObject {
    /**
      * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
      * A Curve3 is designed from a series of successive Vector3.
      * Tuto : https://doc.babylonjs.com/how_to/how_to_use_curve3#curve3-object
      * @param points points which make up the curve
      */
    def this(points: js.Array[Vector3]) = this()
    
    /* private */ var _computeLength: Any = js.native
    
    /* private */ var _length: Any = js.native
    
    /* private */ var _points: Any = js.native
    
    /**
      * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
      * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
      * curveA and curveB keep unchanged.
      * @param curve the curve to continue from this curve
      * @returns the newly constructed curve
      */
    def continue(curve: DeepImmutable[Curve3]): Curve3 = js.native
    
    /**
      * @returns the Curve3 stored array of successive Vector3
      */
    def getPoints(): js.Array[Vector3] = js.native
    
    /**
      * @returns the computed length (float) of the curve.
      */
    def length(): Double = js.native
  }
  /* static members */
  object Curve3 {
    
    @JSImport("babylonjs/Maths/math.path", "Curve3")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Curve3 object along an arc through three vector3 points:
      * The three points should not be colinear. When they are the Curve3 is empty.
      * @param first (Vector3) the first point the arc must pass through.
      * @param second (Vector3) the second point the arc must pass through.
      * @param third (Vector3) the third point the arc must pass through.
      * @param steps (number) the larger the number of steps the more detailed the arc.
      * @param closed (boolean) optional with default false, when true forms the chord from the first and third point
      * @param fullCircle Circle (boolean) optional with default false, when true forms the complete circle through the three points
      * @returns the created Curve3
      */
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Double): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Double, closed: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(
      first: Vector3,
      second: Vector3,
      third: Vector3,
      steps: Double,
      closed: Boolean,
      fullCircle: Boolean
    ): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Double, closed: Unit, fullCircle: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Unit, closed: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Unit, closed: Boolean, fullCircle: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def ArcThru3Points(first: Vector3, second: Vector3, third: Vector3, steps: Unit, closed: Unit, fullCircle: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    
    /**
      * Returns a Curve3 object along a CatmullRom Spline curve :
      * @param points (array of Vector3) the points the spline must pass through. At least, four points required
      * @param nbPoints (integer) the wanted number of points between each curve control points
      * @param closed (boolean) optional with default false, when true forms a closed loop from the points
      * @returns the created Curve3
      */
    inline def CreateCatmullRomSpline(points: DeepImmutable[js.Array[Vector3]], nbPoints: Double): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCatmullRomSpline")(points.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    inline def CreateCatmullRomSpline(points: DeepImmutable[js.Array[Vector3]], nbPoints: Double, closed: Boolean): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCatmullRomSpline")(points.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    
    /**
      * Returns a Curve3 object along a Cubic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#cubic-bezier-curve
      * @param v0 (Vector3) the origin point of the Cubic Bezier
      * @param v1 (Vector3) the first control point
      * @param v2 (Vector3) the second control point
      * @param v3 (Vector3) the end point of the Cubic Bezier
      * @param nbPoints (integer) the wanted number of points in the curve
      * @returns the created Curve3
      */
    inline def CreateCubicBezier(
      v0: DeepImmutable[Vector3],
      v1: DeepImmutable[Vector3],
      v2: DeepImmutable[Vector3],
      v3: DeepImmutable[Vector3],
      nbPoints: Double
    ): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCubicBezier")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    
    /**
      * Returns a Curve3 object along a Hermite Spline curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#hermite-spline
      * @param p1 (Vector3) the origin point of the Hermite Spline
      * @param t1 (Vector3) the tangent vector at the origin point
      * @param p2 (Vector3) the end point of the Hermite Spline
      * @param t2 (Vector3) the tangent vector at the end point
      * @param nSeg (integer) the number of curve segments or nSeg + 1 points in the array
      * @returns the created Curve3
      */
    inline def CreateHermiteSpline(
      p1: DeepImmutable[Vector3],
      t1: DeepImmutable[Vector3],
      p2: DeepImmutable[Vector3],
      t2: DeepImmutable[Vector3],
      nSeg: Double
    ): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHermiteSpline")(p1.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], nSeg.asInstanceOf[js.Any])).asInstanceOf[Curve3]
    
    /**
      * Returns a Curve3 object along a Quadratic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#quadratic-bezier-curve
      * @param v0 (Vector3) the origin point of the Quadratic Bezier
      * @param v1 (Vector3) the control point
      * @param v2 (Vector3) the end point of the Quadratic Bezier
      * @param nbPoints (integer) the wanted number of points in the curve
      * @returns the created Curve3
      */
    inline def CreateQuadraticBezier(
      v0: DeepImmutable[Vector3],
      v1: DeepImmutable[Vector3],
      v2: DeepImmutable[Vector3],
      nbPoints: Double
    ): Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateQuadraticBezier")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[Curve3]
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSImport("babylonjs/Maths/math.path", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Orientation & Double] = js.native
    
    /** Counter clockwise */
    @js.native
    sealed trait CCW
      extends StObject
         with Orientation
    /* 1 */ val CCW: typings.babylonjs.mathsMathDotpathMod.Orientation.CCW & Double = js.native
    
    /**
      * Clockwise
      */
    @js.native
    sealed trait CW
      extends StObject
         with Orientation
    /* 0 */ val CW: typings.babylonjs.mathsMathDotpathMod.Orientation.CW & Double = js.native
  }
  
  @JSImport("babylonjs/Maths/math.path", "Path2")
  @js.native
  open class Path2 protected () extends StObject {
    /**
      * Creates a Path2 object from the starting 2D coordinates x and y.
      * @param x the starting points x value
      * @param y the starting points y value
      */
    def this(x: Double, y: Double) = this()
    
    /* private */ var _length: Any = js.native
    
    /* private */ var _points: Any = js.native
    
    /**
      * Adds _numberOfSegments_ segments according to the arc definition (middle point coordinates, end point coordinates, the arc start point being the current Path2 last point) to the current Path2.
      * @param midX middle point x value
      * @param midY middle point y value
      * @param endX end point x value
      * @param endY end point y value
      * @param numberOfSegments (default: 36)
      * @returns the updated Path2.
      */
    def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double): Path2 = js.native
    def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double, numberOfSegments: Double): Path2 = js.native
    
    /**
      * Adds a new segment until the given coordinates (x, y) to the current Path2.
      * @param x the added points x value
      * @param y the added points y value
      * @returns the updated Path2.
      */
    def addLineTo(x: Double, y: Double): Path2 = js.native
    
    /**
      * Closes the Path2.
      * @returns the Path2.
      */
    def close(): Path2 = js.native
    
    /**
      * If the path start and end point are the same
      */
    var closed: Boolean = js.native
    
    /**
      * Retreives the point at the distance aways from the starting point
      * @param normalizedLengthPosition the length along the path to retrieve the point from
      * @returns a new Vector2 located at a percentage of the Path2 total length on this path.
      */
    def getPointAtLengthPosition(normalizedLengthPosition: Double): Vector2 = js.native
    
    /**
      * Gets the points which construct the path
      * @returns the Path2 internal array of points.
      */
    def getPoints(): js.Array[Vector2] = js.native
    
    /**
      * Gets the sum of the distance between each sequential point in the path
      * @returns the Path2 total length (float).
      */
    def length(): Double = js.native
  }
  /* static members */
  object Path2 {
    
    @JSImport("babylonjs/Maths/math.path", "Path2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new path starting from an x and y position
      * @param x starting x value
      * @param y starting y value
      * @returns a new Path2 starting at the coordinates (x, y).
      */
    inline def StartingAt(x: Double, y: Double): Path2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StartingAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Path2]
  }
  
  @JSImport("babylonjs/Maths/math.path", "Path3D")
  @js.native
  open class Path3D protected () extends StObject {
    /**
      * new Path3D(path, normal, raw)
      * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
      * please read the description in the tutorial : https://doc.babylonjs.com/how_to/how_to_use_path3d
      * @param path an array of Vector3, the curve axis of the Path3D
      * @param firstNormal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
      * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
      * @param alignTangentsWithPath (optional, default false) : boolean, if true the tangents will be aligned with the path.
      */
    def this(/**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3]) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Nullable[Vector3]
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Unit,
      raw: Boolean
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Nullable[Vector3],
      raw: Boolean
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Unit,
      raw: Boolean,
      alignTangentsWithPath: Boolean
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Unit,
      raw: Unit,
      alignTangentsWithPath: Boolean
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Nullable[Vector3],
      raw: Boolean,
      alignTangentsWithPath: Boolean
    ) = this()
    def this(
      /**
      * an array of Vector3, the curve axis of the Path3D
      */
    path: js.Array[Vector3],
      firstNormal: Nullable[Vector3],
      raw: Unit,
      alignTangentsWithPath: Boolean
    ) = this()
    
    /* private */ var _alignTangentsWithPath: Any = js.native
    
    /* private */ var _binormals: Any = js.native
    
    /* private */ var _compute: Any = js.native
    
    /* private */ var _curve: Any = js.native
    
    /* private */ var _distances: Any = js.native
    
    /* private */ var _getFirstNonNullVector: Any = js.native
    
    /* private */ var _getLastNonNullVector: Any = js.native
    
    /* private */ var _normalVector: Any = js.native
    
    /* private */ var _normals: Any = js.native
    
    /* private */ val _pointAtData: Any = js.native
    
    /* private */ var _raw: Any = js.native
    
    /**
      * Updates the point at data from the specified parameters
      * @param position where along the path the interpolated point is, from 0.0 to 1.0
      * @param subPosition
      * @param point the interpolated point
      * @param parentIndex the index of an existing curve point that is on, or else positionally the first behind, the interpolated point
      * @param interpolateTNB
      */
    /* private */ var _setPointAtData: Any = js.native
    
    /* private */ var _tangents: Any = js.native
    
    /**
      * Updates the point at interpolation matrix for the tangents, normals and binormals
      */
    /* private */ var _updateInterpolationMatrix: Any = js.native
    
    /**
      * Updates the point at data for an interpolated point along this curve
      * @param position the position of the point along this curve, from 0.0 to 1.0
      * @param interpolateTNB
      * @interpolateTNB whether to compute the interpolated tangent, normal and binormal
      * @returns the (updated) point at data
      */
    /* private */ var _updatePointAtData: Any = js.native
    
    /**
      * Returns the binormal vector of an interpolated Path3D curve point at the specified position along this path.
      * @param position the position of the point along this path, from 0.0 to 1.0
      * @param interpolated (optional, default false) : boolean, if true returns an interpolated binormal instead of the binormal of the previous path point.
      * @returns a binormal vector corresponding to the interpolated Path3D curve point, if not interpolated, the binormal is taken from the precomputed binormals array.
      */
    def getBinormalAt(position: Double): Vector3 = js.native
    def getBinormalAt(position: Double, interpolated: Boolean): Vector3 = js.native
    
    /**
      * Returns an array populated with binormal vectors on each Path3D curve point.
      * @returns an array populated with binormal vectors on each Path3D curve point.
      */
    def getBinormals(): js.Array[Vector3] = js.native
    
    /**
      * Returns the position of the closest virtual point on this path to an arbitrary Vector3, from 0.0 to 1.0
      * @param target the vector of which to get the closest position to
      * @returns the position of the closest virtual point on this path to the target vector
      */
    def getClosestPositionTo(target: Vector3): Double = js.native
    
    /**
      * Returns the Path3D array of successive Vector3 designing its curve.
      * @returns the Path3D array of successive Vector3 designing its curve.
      */
    def getCurve(): js.Array[Vector3] = js.native
    
    /**
      * Returns the distance (float) of an interpolated Path3D curve point at the specified position along this path.
      * @param position the position of the point along this path, from 0.0 to 1.0
      * @returns the distance of the interpolated Path3D curve point at the specified position along this path.
      */
    def getDistanceAt(position: Double): Double = js.native
    
    /**
      * Returns an array populated with distances (float) of the i-th point from the first curve point.
      * @returns an array populated with distances (float) of the i-th point from the first curve point.
      */
    def getDistances(): js.Array[Double] = js.native
    
    /**
      * Returns the tangent vector of an interpolated Path3D curve point at the specified position along this path.
      * @param position the position of the point along this path, from 0.0 to 1.0
      * @param interpolated (optional, default false) : boolean, if true returns an interpolated normal instead of the normal of the previous path point.
      * @returns a normal vector corresponding to the interpolated Path3D curve point, if not interpolated, the normal is taken from the precomputed normals array.
      */
    def getNormalAt(position: Double): Vector3 = js.native
    def getNormalAt(position: Double, interpolated: Boolean): Vector3 = js.native
    
    /**
      * Returns an array populated with normal vectors on each Path3D curve point.
      * @returns an array populated with normal vectors on each Path3D curve point.
      */
    def getNormals(): js.Array[Vector3] = js.native
    
    /**
      * Returns an interpolated point along this path
      * @param position the position of the point along this path, from 0.0 to 1.0
      * @returns a new Vector3 as the point
      */
    def getPointAt(position: Double): Vector3 = js.native
    
    /**
      * Returns the Path3D array of successive Vector3 designing its curve.
      * @returns the Path3D array of successive Vector3 designing its curve.
      */
    def getPoints(): js.Array[Vector3] = js.native
    
    /**
      * Returns the array index of the previous point of an interpolated point along this path
      * @param position the position of the point to interpolate along this path, from 0.0 to 1.0
      * @returns the array index
      */
    def getPreviousPointIndexAt(position: Double): Double = js.native
    
    /**
      * Returns the position of an interpolated point relative to the two path points it lies between, from 0.0 (point A) to 1.0 (point B)
      * @param position the position of the point to interpolate along this path, from 0.0 to 1.0
      * @returns the sub position
      */
    def getSubPositionAt(position: Double): Double = js.native
    
    /**
      * Returns the tangent vector of an interpolated Path3D curve point at the specified position along this path.
      * @param position the position of the point along this path, from 0.0 to 1.0
      * @param interpolated (optional, default false) : boolean, if true returns an interpolated tangent instead of the tangent of the previous path point.
      * @returns a tangent vector corresponding to the interpolated Path3D curve point, if not interpolated, the tangent is taken from the precomputed tangents array.
      */
    def getTangentAt(position: Double): Vector3 = js.native
    def getTangentAt(position: Double, interpolated: Boolean): Vector3 = js.native
    
    /**
      * Returns an array populated with tangent vectors on each Path3D curve point.
      * @returns an array populated with tangent vectors on each Path3D curve point.
      */
    def getTangents(): js.Array[Vector3] = js.native
    
    /**
      * @returns the computed length (float) of the path.
      */
    def length(): Double = js.native
    
    /**
      * an array of Vector3, the curve axis of the Path3D
      */
    var path: js.Array[Vector3] = js.native
    
    /**
      * Returns a sub path (slice) of this path
      * @param start the position of the fist path point, from 0.0 to 1.0, or a negative value, which will get wrapped around from the end of the path to 0.0 to 1.0 values
      * @param end the position of the last path point, from 0.0 to 1.0, or a negative value, which will get wrapped around from the end of the path to 0.0 to 1.0 values
      * @returns a sub path (slice) of this path
      */
    def slice(): Path3D = js.native
    def slice(start: Double): Path3D = js.native
    def slice(start: Double, end: Double): Path3D = js.native
    def slice(start: Unit, end: Double): Path3D = js.native
    
    /**
      * Forces the Path3D tangent, normal, binormal and distance recomputation.
      * @param path path which all values are copied into the curves points
      * @param firstNormal which should be projected onto the curve
      * @param alignTangentsWithPath (optional, default false) : boolean, if true the tangents will be aligned with the path
      * @returns the same object updated.
      */
    def update(path: js.Array[Vector3]): Path3D = js.native
    def update(path: js.Array[Vector3], firstNormal: Unit, alignTangentsWithPath: Boolean): Path3D = js.native
    def update(path: js.Array[Vector3], firstNormal: Nullable[Vector3]): Path3D = js.native
    def update(path: js.Array[Vector3], firstNormal: Nullable[Vector3], alignTangentsWithPath: Boolean): Path3D = js.native
  }
}
