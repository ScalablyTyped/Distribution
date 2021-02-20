package typings.box2d.global.Box2D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  object Math {
    
    @JSGlobal("Box2D.Common.Math.b2Mat22")
    @js.native
    /**
      * Empty constructor
      **/
    class b2Mat22 ()
      extends typings.box2d.Box2D.Common.Math.b2Mat22
    /* static members */
    object b2Mat22 {
      
      /**
        * Creates a rotation 2x2 matrix from the given angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @param angle Matrix angle (theta).
        * @return 2x2 matrix.
        **/
      @JSGlobal("Box2D.Common.Math.b2Mat22.FromAngle")
      @js.native
      def FromAngle(angle: Double): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Creates a 2x2 matrix from two columns.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        * @return 2x2 matrix.
        **/
      @JSGlobal("Box2D.Common.Math.b2Mat22.FromVV")
      @js.native
      def FromVV(c1: typings.box2d.Box2D.Common.Math.b2Vec2, c2: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
    }
    
    @JSGlobal("Box2D.Common.Math.b2Mat33")
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
    
    @JSGlobal("Box2D.Common.Math.b2Math")
    @js.native
    class b2Math ()
      extends typings.box2d.Box2D.Common.Math.b2Math
    /* static members */
    object b2Math {
      
      @JSGlobal("Box2D.Common.Math.b2Math")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates an ABS number.
        * @param a Number to ABS.
        * @return Absolute value of a.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Abs")
      @js.native
      def Abs(a: Double): Double = js.native
      
      /**
        * Creates an ABS matrix.
        * @param A Matrix to ABS all values.
        * @return Matrix with all positive values.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.AbsM")
      @js.native
      def AbsM(A: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Creates an ABS vector.
        * @param a Vector to ABS all values.
        * @return Vector with all positive values.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.AbsV")
      @js.native
      def AbsV(a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.AddMM")
      @js.native
      def AddMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Adds two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a + b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.AddVV")
      @js.native
      def AddVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Clamp a number to the range of low to high.
        * @param a Number to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Number a clamped to range of low to high.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Clamp")
      @js.native
      def Clamp(a: Double, low: Double, high: Double): Double = js.native
      
      /**
        * Clamps a vector to the range of low to high.
        * @param a Vector to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Vector a clamped to range of low to high.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.ClampV")
      @js.native
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
      @JSGlobal("Box2D.Common.Math.b2Math.CrossFV")
      @js.native
      def CrossFV(s: Double, a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Cross product of vector 2 and s.
        * @param a Vector 2 to use in cross product.
        * @param s s value.
        * @return Cross product of a and s.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.CrossVF")
      @js.native
      def CrossVF(a: typings.box2d.Box2D.Common.Math.b2Vec2, s: Double): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Cross product of two vector 2s.
        * @param a Vector 2 to use in cross product.
        * @param b Vector 2 to use in cross product.
        * @return Cross product of a and b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.CrossVV")
      @js.native
      def CrossVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      
      /**
        * Calculates the distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return Distance between a and b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Distance")
      @js.native
      def Distance(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      
      /**
        * Calculates the squared distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return dist^2 between a and b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.DistanceSquared")
      @js.native
      def DistanceSquared(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      
      /**
        * Dot product of two vector 2s.
        * @param a Vector 2 to use in dot product.
        * @param b Vector 2 to use in dot product.
        * @return Dot product of a and b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Dot")
      @js.native
      def Dot(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): Double = js.native
      
      /**
        * Check if a number is a power of 2.
        * @param x Number to check if it is a power of 2.
        * @return True if x is a power of 2, otherwise false.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.IsPowerOfTwo")
      @js.native
      def IsPowerOfTwo(x: Double): Boolean = js.native
      
      /**
        * Determines if a number is valid.  A number is valid if it is finite.
        * @param x Number to check for validity.
        * @return True if x is valid, otherwise false.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.IsValid")
      @js.native
      def IsValid(x: Double): Boolean = js.native
      
      /**
        * Determines the max number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the maximum.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Max")
      @js.native
      def Max(a: Double, b: Double): Double = js.native
      
      /**
        * Determines the max vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the maximum.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MaxV")
      @js.native
      def MaxV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Determines the minimum number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the minimum.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Min")
      @js.native
      def Min(a: Double, b: Double): Double = js.native
      
      /**
        * Determines the minimum vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the minimum.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MinV")
      @js.native
      def MinV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param s
        * @param a
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulFV")
      @js.native
      def MulFV(s: Double, a: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulMM")
      @js.native
      def MulMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Multiply matrix and vector.
        * @param A Matrix.
        * @param v Vector.
        * @return Result.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulMV")
      @js.native
      def MulMV(A: typings.box2d.Box2D.Common.Math.b2Mat22, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulTMM")
      @js.native
      def MulTMM(A: typings.box2d.Box2D.Common.Math.b2Mat22, B: typings.box2d.Box2D.Common.Math.b2Mat22): typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        *
        * @param A
        * @param v
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulTMV")
      @js.native
      def MulTMV(A: typings.box2d.Box2D.Common.Math.b2Mat22, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulX")
      @js.native
      def MulX(T: typings.box2d.Box2D.Common.Math.b2Transform, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.MulXT")
      @js.native
      def MulXT(T: typings.box2d.Box2D.Common.Math.b2Transform, v: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Calculates the next power of 2 after the given number.
        * @param x Number to start search for the next power of 2.
        * @return The next number that is a power of 2.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.NextPowerOfTwo")
      @js.native
      def NextPowerOfTwo(x: Double): Double = js.native
      
      /**
        * Generates a random number.
        * @param return Random number.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Random")
      @js.native
      def Random(): Double = js.native
      
      /**
        * Returns a random number between lo and hi.
        * @param lo Lowest random number.
        * @param hi Highest random number.
        * @return Number between lo and hi.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.RandomRange")
      @js.native
      def RandomRange(lo: Double, hi: Double): Double = js.native
      
      /**
        * Subtracts two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a - b.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.SubtractVV")
      @js.native
      def SubtractVV(a: typings.box2d.Box2D.Common.Math.b2Vec2, b: typings.box2d.Box2D.Common.Math.b2Vec2): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Swaps a and b objects.
        * @param a a -> b.
        * @param b b -> a.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.Swap")
      @js.native
      def Swap(a: js.Any, b: js.Any): Unit = js.native
      
      /**
        * Global instance of a 2x2 identity matrix.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Mat22_identity")
      @js.native
      def b2Mat22_identity: typings.box2d.Box2D.Common.Math.b2Mat22 = js.native
      @scala.inline
      def b2Mat22_identity_=(x: typings.box2d.Box2D.Common.Math.b2Mat22): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Mat22_identity")(x.asInstanceOf[js.Any])
      
      /**
        * Global instance of an identity transform.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Transform_identity")
      @js.native
      def b2Transform_identity: typings.box2d.Box2D.Common.Math.b2Transform = js.native
      @scala.inline
      def b2Transform_identity_=(x: typings.box2d.Box2D.Common.Math.b2Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Transform_identity")(x.asInstanceOf[js.Any])
      
      /**
        * Global instance of a zero'ed vector.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Vec2_zero")
      @js.native
      def b2Vec2_zero: typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
      @scala.inline
      def b2Vec2_zero_=(x: typings.box2d.Box2D.Common.Math.b2Vec2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Vec2_zero")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Box2D.Common.Math.b2Sweep")
    @js.native
    class b2Sweep ()
      extends typings.box2d.Box2D.Common.Math.b2Sweep
    
    @JSGlobal("Box2D.Common.Math.b2Transform")
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
    
    @JSGlobal("Box2D.Common.Math.b2Vec2")
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
    /* static members */
    object b2Vec2 {
      
      /**
        * Creates a new vector 2 from the given values.
        * @param x x value.
        * @param y y value.
        **/
      @JSGlobal("Box2D.Common.Math.b2Vec2.Make")
      @js.native
      def Make(x: Double, y: Double): typings.box2d.Box2D.Common.Math.b2Vec2 = js.native
    }
    
    @JSGlobal("Box2D.Common.Math.b2Vec3")
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
  }
  
  @JSGlobal("Box2D.Common.b2Color")
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
  
  @JSGlobal("Box2D.Common.b2Settings")
  @js.native
  class b2Settings ()
    extends typings.box2d.Box2D.Common.b2Settings
  /* static members */
  object b2Settings {
    
    @JSGlobal("Box2D.Common.b2Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Maximum unsigned short value.
      **/
    @JSGlobal("Box2D.Common.b2Settings.USHRT_MAX")
    @js.native
    def USHRT_MAX: Double = js.native
    @scala.inline
    def USHRT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USHRT_MAX")(x.asInstanceOf[js.Any])
    
    /**
      * The current version of Box2D.
      **/
    @JSGlobal("Box2D.Common.b2Settings.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /**
      * b2Assert is used internally to handle assertions. By default, calls are commented out to save performance, so they serve more as documentation than anything else.
      * @param a Asset an expression is true.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2Assert")
    @js.native
    def b2Assert(a: Boolean): Unit = js.native
    
    /**
      * Friction mixing law. Feel free to customize this.
      * Friction values are usually set between 0 and 1. (0 = no friction, 1 = high friction)
      * By default this is `return Math.sqrt(friction1, friction2);`
      * @param friction1 Friction 1 to mix.
      * @param friction2 Friction 2 to mix.
      * @return The two frictions mixed as one value.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2MixFriction")
    @js.native
    def b2MixFriction(friction1: Double, friction2: Double): Double = js.native
    
    /**
      * Restitution mixing law. Feel free to customize this.  Restitution is used to make objects bounce.
      * Restitution values are usually set between 0 and 1. (0 = no bounce (inelastic), 1 = perfect bounce (perfectly elastic))
      * By default this is `return Math.Max(restitution1, restitution2);`
      * @param restitution1 Restitution 1 to mix.
      * @param restitution2 Restitution 2 to mix.
      * @return The two restitutions mixed as one value.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2MixRestitution")
    @js.native
    def b2MixRestitution(restitution1: Double, restitution2: Double): Double = js.native
    
    /**
      * This is used to fatten AABBs in the dynamic tree. This allows proxies to move by a small amount without triggering a tree adjustment. This is in meters.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_aabbExtension")
    @js.native
    def b2_aabbExtension: Double = js.native
    @scala.inline
    def b2_aabbExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_aabbExtension")(x.asInstanceOf[js.Any])
    
    /**
      * This is used to fatten AABBs in the dynamic tree. This is used to predict the future position based on the current displacement. This is a dimensionless multiplier.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_aabbMultiplier")
    @js.native
    def b2_aabbMultiplier: Double = js.native
    @scala.inline
    def b2_aabbMultiplier_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_aabbMultiplier")(x.asInstanceOf[js.Any])
    
    /**
      * A body cannot sleep if its angular velocity is above this tolerance.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_angularSleepTolerance")
    @js.native
    def b2_angularSleepTolerance: Double = js.native
    @scala.inline
    def b2_angularSleepTolerance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_angularSleepTolerance")(x.asInstanceOf[js.Any])
    
    /**
      * A small angle used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_angularSlop")
    @js.native
    def b2_angularSlop: Double = js.native
    @scala.inline
    def b2_angularSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_angularSlop")(x.asInstanceOf[js.Any])
    
    /**
      * This scale factor controls how fast overlap is resolved. Ideally this would be 1 so that overlap is removed in one time step. However using values close to 1 often lead to overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_contactBaumgarte")
    @js.native
    def b2_contactBaumgarte: Double = js.native
    @scala.inline
    def b2_contactBaumgarte_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_contactBaumgarte")(x.asInstanceOf[js.Any])
    
    /**
      * A body cannot sleep if its linear velocity is above this tolerance.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_linearSleepTolerance")
    @js.native
    def b2_linearSleepTolerance: Double = js.native
    @scala.inline
    def b2_linearSleepTolerance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_linearSleepTolerance")(x.asInstanceOf[js.Any])
    
    /**
      * A small length used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_linearSlop")
    @js.native
    def b2_linearSlop: Double = js.native
    @scala.inline
    def b2_linearSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_linearSlop")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum angular position correction used when solving constraints. This helps to prevent overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxAngularCorrection")
    @js.native
    def b2_maxAngularCorrection: Double = js.native
    @scala.inline
    def b2_maxAngularCorrection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxAngularCorrection")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum linear position correction used when solving constraints. This helps to prevent overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxLinearCorrection")
    @js.native
    def b2_maxLinearCorrection: Double = js.native
    @scala.inline
    def b2_maxLinearCorrection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxLinearCorrection")(x.asInstanceOf[js.Any])
    
    /**
      * Number of manifold points in a b2Manifold. This should NEVER change.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxManifoldPoints")
    @js.native
    def b2_maxManifoldPoints: Double = js.native
    @scala.inline
    def b2_maxManifoldPoints_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxManifoldPoints")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum angular velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxRotation")
    @js.native
    def b2_maxRotation: Double = js.native
    
    /**
      * b2_maxRotation squared
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxRotationSquared")
    @js.native
    def b2_maxRotationSquared: Double = js.native
    @scala.inline
    def b2_maxRotationSquared_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxRotationSquared")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def b2_maxRotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxRotation")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of contacts to be handled to solve a TOI island.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTOIContactsPerIsland")
    @js.native
    def b2_maxTOIContactsPerIsland: Double = js.native
    @scala.inline
    def b2_maxTOIContactsPerIsland_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTOIContactsPerIsland")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of joints to be handled to solve a TOI island.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTOIJointsPerIsland")
    @js.native
    def b2_maxTOIJointsPerIsland: Double = js.native
    @scala.inline
    def b2_maxTOIJointsPerIsland_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTOIJointsPerIsland")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum linear velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTranslation")
    @js.native
    def b2_maxTranslation: Double = js.native
    
    /**
      * b2_maxTranslation squared
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTranslationSquared")
    @js.native
    def b2_maxTranslationSquared: Double = js.native
    @scala.inline
    def b2_maxTranslationSquared_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTranslationSquared")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def b2_maxTranslation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTranslation")(x.asInstanceOf[js.Any])
    
    /**
      * 3.141592653589793
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_pi")
    @js.native
    def b2_pi: Double = js.native
    @scala.inline
    def b2_pi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_pi")(x.asInstanceOf[js.Any])
    
    /**
      * The radius of the polygon/edge shape skin. This should not be modified. Making this smaller means polygons will have and insufficient for continuous collision. Making it larger may create artifacts for vertex collision.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_polygonRadius")
    @js.native
    def b2_polygonRadius: Double = js.native
    @scala.inline
    def b2_polygonRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_polygonRadius")(x.asInstanceOf[js.Any])
    
    /**
      * The time that a body must be still before it will go to sleep.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_timeToSleep")
    @js.native
    def b2_timeToSleep: Double = js.native
    @scala.inline
    def b2_timeToSleep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_timeToSleep")(x.asInstanceOf[js.Any])
    
    /**
      * Continuous collision detection (CCD) works with core, shrunken shapes. This is the amount by which shapes are automatically shrunk to work with CCD. This must be larger than b2_linearSlop.
      * @see also b2_linearSlop
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_toiSlop")
    @js.native
    def b2_toiSlop: Double = js.native
    @scala.inline
    def b2_toiSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_toiSlop")(x.asInstanceOf[js.Any])
    
    /**
      * A velocity threshold for elastic collisions. Any collision with a relative linear velocity below this threshold will be treated as inelastic.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_velocityThreshold")
    @js.native
    def b2_velocityThreshold: Double = js.native
    @scala.inline
    def b2_velocityThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_velocityThreshold")(x.asInstanceOf[js.Any])
  }
}
