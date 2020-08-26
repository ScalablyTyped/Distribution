package typings.box2d.global.Box2D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common")
@js.native
object Common extends js.Object {
  @js.native
  class b2Color protected ()
    extends typings.box2d.Box2D.Common.b2Color {
    /**
      * Constructor
      * @param rr Red value
      * @param gg Green value
      * @param bb Blue value
      **/
    def this(rr: Double, gg: Double, bb: Double) = this()
  }
  
  @js.native
  class b2Settings ()
    extends typings.box2d.Box2D.Common.b2Settings
  
  @js.native
  object Math extends js.Object {
    @js.native
    /**
      * Empty constructor
      **/
    class b2Mat22 ()
      extends typings.box2d.Box2D.Common.Math.b2Mat22
    
    @js.native
    class b2Mat33 protected ()
      extends typings.box2d.Box2D.Common.Math.b2Mat33 {
      /**
        * Constructor
        * @param c1 Column 1
        * @param c2 Column 2
        * @param c3 Column 3
        **/
      def this(
        c1: typings.box2d.Box2D.Common.Math.b2Vec3,
        c2: typings.box2d.Box2D.Common.Math.b2Vec3,
        c3: typings.box2d.Box2D.Common.Math.b2Vec3
      ) = this()
    }
    
    @js.native
    class b2Math ()
      extends typings.box2d.Box2D.Common.Math.b2Math
    
    @js.native
    class b2Sweep ()
      extends typings.box2d.Box2D.Common.Math.b2Sweep
    
    @js.native
    class b2Transform protected ()
      extends typings.box2d.Box2D.Common.Math.b2Transform {
      /**
        * The default constructor does nothing (for performance).
        * @param pos Position
        * @param r Rotation
        **/
      def this(pos: typings.box2d.Box2D.Common.Math.b2Vec2, r: typings.box2d.Box2D.Common.Math.b2Mat22) = this()
    }
    
    @js.native
    /**
      * Creates a new vector 2.
      * @param x x value, default = 0.
      * @param y y value, default = 0.
      **/
    class b2Vec2 ()
      extends typings.box2d.Box2D.Common.Math.b2Vec2 {
      def this(x: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
      def this(x: Double, y: Double) = this()
    }
    
    @js.native
    /**
      * Construct using coordinates x,y,z.
      * @param x x value, default = 0.
      * @param y y value, default = 0.
      * @param z z value, default = 0.
      **/
    class b2Vec3 ()
      extends typings.box2d.Box2D.Common.Math.b2Vec3 {
      def this(x: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
      def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
    }
    
    /* static members */
    @js.native
    object b2Mat22 extends js.Object {
      /**
        * Creates a rotation 2x2 matrix from the given angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @param angle Matrix angle (theta).
        * @return 2x2 matrix.
        **/
      def FromAngle(angle: Double): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        * Creates a 2x2 matrix from two columns.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        * @return 2x2 matrix.
        **/
      def FromVV(c1: typings.box2d.Box2D.Common.Math.b2Vec2, c2: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
    }
    
    /* static members */
    @js.native
    object b2Math extends js.Object {
      /**
        * Global instance of a 2x2 identity matrix.  Use as read-only.
        **/
      var b2Mat22_identity: typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        * Global instance of an identity transform.  Use as read-only.
        **/
      var b2Transform_identity: typings.box2d.Box2D.Common.Math.b2Transform = js.native
      /**
        * Global instance of a zero'ed vector.  Use as read-only.
        **/
      var b2Vec2_zero: typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Creates an ABS number.
        * @param a Number to ABS.
        * @return Absolute value of a.
        **/
      def Abs(a: Double): Double = js.native
      /**
        * Creates an ABS matrix.
        * @param A Matrix to ABS all values.
        * @return Matrix with all positive values.
        **/
      def AbsM(A: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        * Creates an ABS vector.
        * @param a Vector to ABS all values.
        * @return Vector with all positive values.
        **/
      def AbsV(a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      def AddMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        * Adds two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a + b.
        **/
      def AddVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Clamp a number to the range of low to high.
        * @param a Number to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Number a clamped to range of low to high.
        **/
      def Clamp(a: Double, low: Double, high: Double): Double = js.native
      /**
        * Clamps a vector to the range of low to high.
        * @param a Vector to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Vector a clamped to range of low to high.
        **/
      def ClampV(
        a: typings.box2d.Box2D.Common.Math.b2Vec2,
        low: typings.box2d.Box2D.Common.Math.b2Vec2,
        high: typings.box2d.Box2D.Common.Math.b2Vec2
      ): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Cross product of s and vector 2.
        * @param s s value.
        * @param a Vector 2 to use in cross product.
        * @return Cross product of s and a.
        **/
      def CrossFV(s: Double, a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Cross product of vector 2 and s.
        * @param a Vector 2 to use in cross product.
        * @param s s value.
        * @return Cross product of a and s.
        **/
      def CrossVF(a: typings.box2d.Box2D.Common.Math.b2Vec2, s: Double): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Cross product of two vector 2s.
        * @param a Vector 2 to use in cross product.
        * @param b Vector 2 to use in cross product.
        * @return Cross product of a and b.
        **/
      def CrossVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      /**
        * Calculates the distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return Distance between a and b.
        **/
      def Distance(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      /**
        * Calculates the squared distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return dist^2 between a and b.
        **/
      def DistanceSquared(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      /**
        * Dot product of two vector 2s.
        * @param a Vector 2 to use in dot product.
        * @param b Vector 2 to use in dot product.
        * @return Dot product of a and b.
        **/
      def Dot(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      /**
        * Check if a number is a power of 2.
        * @param x Number to check if it is a power of 2.
        * @return True if x is a power of 2, otherwise false.
        **/
      def IsPowerOfTwo(x: Double): Boolean = js.native
      /**
        * Determines if a number is valid.  A number is valid if it is finite.
        * @param x Number to check for validity.
        * @return True if x is valid, otherwise false.
        **/
      def IsValid(x: Double): Boolean = js.native
      /**
        * Determines the max number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the maximum.
        **/
      def Max(a: Double, b: Double): Double = js.native
      /**
        * Determines the max vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the maximum.
        **/
      def MaxV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Determines the minimum number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the minimum.
        **/
      def Min(a: Double, b: Double): Double = js.native
      /**
        * Determines the minimum vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the minimum.
        **/
      def MinV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param s
        * @param a
        * @return
        **/
      def MulFV(s: Double, a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      def MulMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        * Multiply matrix and vector.
        * @param A Matrix.
        * @param v Vector.
        * @return Result.
        **/
      def MulMV(A: typings.box2d.Box2D.Common.Math.b2Mat22, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      def MulTMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      /**
        *
        * @param A
        * @param v
        * @return
        **/
      def MulTMV(A: typings.box2d.Box2D.Common.Math.b2Mat22, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      def MulX(T: typings.box2d.Box2D.Common.Math.b2Transform, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      def MulXT(T: typings.box2d.Box2D.Common.Math.b2Transform, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Calculates the next power of 2 after the given number.
        * @param x Number to start search for the next power of 2.
        * @return The next number that is a power of 2.
        **/
      def NextPowerOfTwo(x: Double): Double = js.native
      /**
        * Generates a random number.
        * @param return Random number.
        **/
      def Random(): Double = js.native
      /**
        * Returns a random number between lo and hi.
        * @param lo Lowest random number.
        * @param hi Highest random number.
        * @return Number between lo and hi.
        **/
      def RandomRange(lo: Double, hi: Double): Double = js.native
      /**
        * Subtracts two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a - b.
        **/
      def SubtractVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      /**
        * Swaps a and b objects.
        * @param a a -> b.
        * @param b b -> a.
        **/
      def Swap(a: js.Any, b: js.Any): Unit = js.native
    }
    
    /* static members */
    @js.native
    object b2Vec2 extends js.Object {
      /**
        * Creates a new vector 2 from the given values.
        * @param x x value.
        * @param y y value.
        **/
      def Make(x: Double, y: Double): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object b2Settings extends js.Object {
    /**
      * Maximum unsigned short value.
      **/
    var USHRT_MAX: Double = js.native
    /**
      * The current version of Box2D.
      **/
    var VERSION: String = js.native
    /**
      * This is used to fatten AABBs in the dynamic tree. This allows proxies to move by a small amount without triggering a tree adjustment. This is in meters.
      **/
    var b2_aabbExtension: Double = js.native
    /**
      * This is used to fatten AABBs in the dynamic tree. This is used to predict the future position based on the current displacement. This is a dimensionless multiplier.
      **/
    var b2_aabbMultiplier: Double = js.native
    /**
      * A body cannot sleep if its angular velocity is above this tolerance.
      **/
    var b2_angularSleepTolerance: Double = js.native
    /**
      * A small angle used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    var b2_angularSlop: Double = js.native
    /**
      * This scale factor controls how fast overlap is resolved. Ideally this would be 1 so that overlap is removed in one time step. However using values close to 1 often lead to overshoot.
      **/
    var b2_contactBaumgarte: Double = js.native
    /**
      * A body cannot sleep if its linear velocity is above this tolerance.
      **/
    var b2_linearSleepTolerance: Double = js.native
    /**
      * A small length used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    var b2_linearSlop: Double = js.native
    /**
      * The maximum angular position correction used when solving constraints. This helps to prevent overshoot.
      **/
    var b2_maxAngularCorrection: Double = js.native
    /**
      * The maximum linear position correction used when solving constraints. This helps to prevent overshoot.
      **/
    var b2_maxLinearCorrection: Double = js.native
    /**
      * Number of manifold points in a b2Manifold. This should NEVER change.
      **/
    var b2_maxManifoldPoints: Double = js.native
    /**
      * The maximum angular velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    var b2_maxRotation: Double = js.native
    /**
      * b2_maxRotation squared
      **/
    var b2_maxRotationSquared: Double = js.native
    /**
      * Maximum number of contacts to be handled to solve a TOI island.
      **/
    var b2_maxTOIContactsPerIsland: Double = js.native
    /**
      * Maximum number of joints to be handled to solve a TOI island.
      **/
    var b2_maxTOIJointsPerIsland: Double = js.native
    /**
      * The maximum linear velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    var b2_maxTranslation: Double = js.native
    /**
      * b2_maxTranslation squared
      **/
    var b2_maxTranslationSquared: Double = js.native
    /**
      * 3.141592653589793
      **/
    var b2_pi: Double = js.native
    /**
      * The radius of the polygon/edge shape skin. This should not be modified. Making this smaller means polygons will have and insufficient for continuous collision. Making it larger may create artifacts for vertex collision.
      **/
    var b2_polygonRadius: Double = js.native
    /**
      * The time that a body must be still before it will go to sleep.
      **/
    var b2_timeToSleep: Double = js.native
    /**
      * Continuous collision detection (CCD) works with core, shrunken shapes. This is the amount by which shapes are automatically shrunk to work with CCD. This must be larger than b2_linearSlop.
      * @see also b2_linearSlop
      **/
    var b2_toiSlop: Double = js.native
    /**
      * A velocity threshold for elastic collisions. Any collision with a relative linear velocity below this threshold will be treated as inelastic.
      **/
    var b2_velocityThreshold: Double = js.native
    /**
      * b2Assert is used internally to handle assertions. By default, calls are commented out to save performance, so they serve more as documentation than anything else.
      * @param a Asset an expression is true.
      **/
    def b2Assert(a: Boolean): Unit = js.native
    /**
      * Friction mixing law. Feel free to customize this.
      * Friction values are usually set between 0 and 1. (0 = no friction, 1 = high friction)
      * By default this is `return Math.sqrt(friction1, friction2);`
      * @param friction1 Friction 1 to mix.
      * @param friction2 Friction 2 to mix.
      * @return The two frictions mixed as one value.
      **/
    def b2MixFriction(friction1: Double, friction2: Double): Double = js.native
    /**
      * Restitution mixing law. Feel free to customize this.  Restitution is used to make objects bounce.
      * Restitution values are usually set between 0 and 1. (0 = no bounce (inelastic), 1 = perfect bounce (perfectly elastic))
      * By default this is `return Math.Max(restitution1, restitution2);`
      * @param restitution1 Restitution 1 to mix.
      * @param restitution2 Restitution 2 to mix.
      * @return The two restitutions mixed as one value.
      **/
    def b2MixRestitution(restitution1: Double, restitution2: Double): Double = js.native
  }
  
}

