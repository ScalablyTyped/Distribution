package typings.box2d.Box2D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common")
@js.native
object Common extends js.Object {
  @js.native
  class b2Color protected () extends js.Object {
    /**
    		* Constructor
    		* @param rr Red value
    		* @param gg Green value
    		* @param bb Blue value
    		**/
    def this(rr: Double, gg: Double, bb: Double) = this()
    /**
    		* Blue
    		**/
    var b: Double = js.native
    /**
    		* RGB color as hex.
    		* @type uint
    		**/
    var color: Double = js.native
    /**
    		* Green
    		**/
    var g: Double = js.native
    /**
    		* Red
    		**/
    var r: Double = js.native
    /**
    		* Sets the Color to new RGB values.
    		* @param rr Red value
    		* @param gg Green value
    		* @param bb Blue value
    		**/
    def Set(rr: Double, gg: Double, bb: Double): Unit = js.native
  }
  
  @js.native
  class b2Settings () extends js.Object
  
  @js.native
  object Math extends js.Object {
    @js.native
    /**
    		* Empty constructor
    		**/
    class b2Mat22 () extends js.Object {
      /**
      		* Column 1
      		**/
      var col1: b2Vec2 = js.native
      /**
      		* Column 2
      		**/
      var col2: b2Vec2 = js.native
      /**
      		* Sets all internal matrix values to absolute values.
      		**/
      def Abs(): Unit = js.native
      /**
      		* Adds the two 2x2 matricies together and stores the result in this matrix.
      		* @param m 2x2 matrix to add.
      		**/
      def AddM(m: b2Mat22): Unit = js.native
      /**
      		* Creates a copy of the matrix.
      		* @return Copy of this 2x2 matrix.
      		**/
      def Copy(): b2Mat22 = js.native
      /**
      		* Gets the rotation matrix angle.
      		* R(theta) = [ cos(theta)  -sin(theta) ]
      		*            [ sin(theta)   cos(theta) ]
      		* @return The rotation matrix angle (theta).
      		**/
      def GetAngle(): Double = js.native
      /**
      		* Compute the inverse of this matrix, such that inv(A) A = identity.
      		* @param out Inverse matrix.
      		* @return Inverse matrix.
      		**/
      def GetInverse(out: b2Mat22): b2Mat22 = js.native
      /**
      		* Sets the 2x2 rotation matrix from the given angle.
      		* R(theta) = [ cos(theta)  -sin(theta) ]
      		*            [ sin(theta)   cos(theta) ]
      		* @param angle Matrix angle (theta).
      		**/
      def Set(angle: Double): Unit = js.native
      /**
      		* Sets the 2x2 matrix to identity.
      		**/
      def SetIdentity(): Unit = js.native
      /**
      		* Sets the 2x2 matrix from a 2x2 matrix.
      		* @param m 2x2 matrix values.
      		**/
      def SetM(m: b2Mat22): Unit = js.native
      /**
      		* Sets the 2x2 matrix from 2 column vectors.
      		* @param c1 Column 1 vector.
      		* @param c2 Column 2 vector.
      		**/
      def SetVV(c1: b2Vec2, c2: b2Vec2): Unit = js.native
      /**
      		* Sets the 2x2 matrix to all zeros.
      		**/
      def SetZero(): Unit = js.native
      /**
      		* TODO, has something to do with the determinant
      		* @param out Solved vector
      		* @param bX
      		* @param bY
      		* @return Solved vector
      		**/
      def Solve(out: b2Vec2, bX: Double, bY: Double): b2Vec2 = js.native
    }
    
    @js.native
    class b2Mat33 protected () extends js.Object {
      /**
      		* Constructor
      		* @param c1 Column 1
      		* @param c2 Column 2
      		* @param c3 Column 3
      		**/
      def this(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3) = this()
      /**
      		* Column 1
      		**/
      var col1: b2Vec3 = js.native
      /**
      		* Column 2
      		**/
      var col2: b2Vec3 = js.native
      /**
      		* Column 3
      		**/
      var col3: b2Vec3 = js.native
      /**
      		* Adds the two 3x3 matricies together and stores the result in this matrix.
      		* @param m 3x3 matrix to add.
      		**/
      def AddM(m: b2Mat33): Unit = js.native
      /**
      		* Creates a copy of the matrix.
      		* @return Copy of this 3x3 matrix.
      		**/
      def Copy(): b2Mat33 = js.native
      /**
      		* Sets the 3x3 matrix to identity.
      		**/
      def SetIdentity(): Unit = js.native
      /**
      		* Sets the 3x3 matrix from a 3x3 matrix.
      		* @param m 3x3 matrix values.
      		**/
      def SetM(m: b2Mat33): Unit = js.native
      /**
      		* Sets the 3x3 matrix from 3 column vectors.
      		* @param c1 Column 1 vector.
      		* @param c2 Column 2 vector.
      		* @param c3 Column 2 vector.
      		**/
      def SetVVV(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3): Unit = js.native
      /**
      		* Sets the 3x3 matrix to all zeros.
      		**/
      def SetZero(): Unit = js.native
      /**
      		* TODO, has something to do with the determinant
      		* @param out Solved vector
      		* @param bX
      		* @param bY
      		* @return Solved vector
      		**/
      def Solve22(out: b2Vec2, bX: Double, bY: Double): b2Vec2 = js.native
      /**
      		* TODO, has something to do with the determinant
      		* @param out Solved vector
      		* @param bX
      		* @param bY
      		* @param bZ
      		* @return Solved vector
      		**/
      def Solve33(out: b2Vec3, bX: Double, bY: Double, bZ: Double): b2Vec3 = js.native
    }
    
    @js.native
    class b2Math () extends js.Object
    
    @js.native
    class b2Sweep () extends js.Object {
      /**
      		* World angle.
      		**/
      var a: Double = js.native
      /**
      		* World angle.
      		**/
      var a0: Double = js.native
      /**
      		* Center world position.
      		**/
      var c: b2Vec2 = js.native
      /**
      		* Center world position.
      		**/
      var c0: b2Vec2 = js.native
      /**
      		* Local center of mass position.
      		**/
      var localCenter: b2Vec2 = js.native
      /**
      		* Time interval = [t0,1], where t0 is in [0,1].
      		**/
      var t0: b2Vec2 = js.native
      /**
      		* Advance the sweep forward, yielding a new initial state.
      		* @t The new initial time.
      		**/
      def Advance(t: Double): Unit = js.native
      /**
      		* Creates a copy of the sweep.
      		**/
      def Copy(): b2Sweep = js.native
      /**
      		* Get the interpolated transform at a specific time.
      		* @param xf Transform at specified time, this is an out parameter.
      		* @param alpha Is a factor in [0,1], where 0 indicates t0.
      		**/
      def GetTransform(xf: b2Transform, alpha: Double): Unit = js.native
      /**
      		* Sets the sweep from a sweep.
      		* @param other Sweep values to copy from.
      		**/
      def Set(other: b2Sweep): Unit = js.native
    }
    
    @js.native
    class b2Transform protected () extends js.Object {
      /**
      		* The default constructor does nothing (for performance).
      		* @param pos Position
      		* @param r Rotation
      		**/
      def this(pos: b2Vec2, r: b2Mat22) = this()
      /**
      		* Transform rotation.
      		**/
      var R: b2Mat22 = js.native
      /**
      		* Transform position.
      		**/
      var position: b2Vec2 = js.native
      /**
      		* Calculate the angle that the rotation matrix represents.
      		* @return Rotation matrix angle.
      		**/
      def GetAngle(): Double = js.native
      /**
      		* Initialize using a position vector and rotation matrix.
      		* @param pos Position
      		* @param r Rotation
      		**/
      def Initialize(pos: b2Vec2, r: b2Mat22): Unit = js.native
      /**
      		* Sets the transfrom from a transfrom.
      		* @param x Transform to copy values from.
      		**/
      def Set(x: b2Transform): Unit = js.native
      /**
      		* Set this to the identity transform.
      		**/
      def SetIdentity(): Unit = js.native
    }
    
    @js.native
    /**
    		* Creates a new vector 2.
    		* @param x x value, default = 0.
    		* @param y y value, default = 0.
    		**/
    class b2Vec2 () extends js.Object {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      /**
      		* x value
      		**/
      var x: Double = js.native
      /**
      		* y value
      		**/
      var y: Double = js.native
      /**
      		* Sets x and y to absolute values.
      		**/
      def Abs(): Unit = js.native
      /**
      		* Adds the vector 2 to this vector 2.  The result is stored in this vector 2.
      		* @param v Vector 2 to add.
      		**/
      def Add(v: b2Vec2): Unit = js.native
      /**
      		* Creates a copy of the vector 2.
      		* @return Copy of this vector 2.
      		**/
      def Copy(): b2Vec2 = js.native
      /**
      		* Cross F V
      		* @param s
      		**/
      def CrossFV(s: Double): Unit = js.native
      /**
      		* Cross V F
      		* @param s
      		**/
      def CrossVF(s: Double): Unit = js.native
      /**
      		* Gets the negative of this vector 2.
      		* @return Negative copy of this vector 2.
      		**/
      def GetNegative(): b2Vec2 = js.native
      /**
      		* True if the vector 2 is valid, otherwise false.  A valid vector has finite values.
      		* @return True if the vector 2 is valid, otherwise false.
      		**/
      def IsValid(): Boolean = js.native
      /**
      		* Calculates the length of the vector 2.
      		* @return The length of the vector 2.
      		**/
      def Length(): Double = js.native
      /**
      		* Calculates the length squared of the vector2.
      		* @return The length squared of the vector 2.
      		**/
      def LengthSquared(): Double = js.native
      /**
      		* Calculates which vector has the maximum values and sets this vector to those values.
      		* @param b Vector 2 to compare for maximum values.
      		**/
      def MaxV(b: b2Vec2): Unit = js.native
      /**
      		* Calculates which vector has the minimum values and sets this vector to those values.
      		* @param b Vector 2 to compare for minimum values.
      		**/
      def MinV(b: b2Vec2): Unit = js.native
      /**
      		* Matrix multiplication.  Stores the result in this vector 2.
      		* @param A Matrix to muliply by.
      		**/
      def MulM(A: b2Mat22): Unit = js.native
      /**
      		* Dot product multiplication.  Stores the result in this vector 2.
      		* @param A Matrix to multiply by.
      		**/
      def MulTM(A: b2Mat22): Unit = js.native
      /**
      		* Vector multiplication.  Stores the result in this vector 2.
      		* @param a Value to multiple the vector's values by.
      		**/
      def Multiply(a: Double): Unit = js.native
      /**
      		* Sets this vector 2 to its negative.
      		**/
      def NegativeSelf(): Unit = js.native
      /**
      		* Normalizes the vector 2 [0,1].
      		* @return Length.
      		**/
      def Normalize(): Double = js.native
      /**
      		* Sets the vector 2.
      		* @param x x value, default is 0.
      		* @param y y value, default is 0.
      		**/
      def Set(): Unit = js.native
      def Set(x: Double): Unit = js.native
      def Set(x: Double, y: Double): Unit = js.native
      /**
      		* Sets the vector 2 from a vector 2.
      		* @param v Vector 2 to copy values from.
      		**/
      def SetV(v: b2Vec2): Unit = js.native
      /**
      		* Sets the vector 2 to zero values.
      		**/
      def SetZero(): Unit = js.native
      /**
      		* Subtracts the vector 2 from this vector 2.  The result is stored in this vector 2.
      		* @param v Vector 2 to subtract.
      		**/
      def Subtract(v: b2Vec2): Unit = js.native
    }
    
    @js.native
    /**
    		* Construct using coordinates x,y,z.
    		* @param x x value, default = 0.
    		* @param y y value, default = 0.
    		* @param z z value, default = 0.
    		**/
    class b2Vec3 () extends js.Object {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
      /**
      		* x value.
      		**/
      var x: Double = js.native
      /**
      		* y value.
      		**/
      var y: Double = js.native
      /**
      		* z value.
      		**/
      var z: Double = js.native
      /**
      		* Adds the vector 3 to this vector 3.  The result is stored in this vector 3.
      		* @param v Vector 3 to add.
      		**/
      def Add(v: b2Vec3): Unit = js.native
      /**
      		* Creates a copy of the vector 3.
      		* @return Copy of this vector 3.
      		**/
      def Copy(): b2Vec3 = js.native
      /**
      		* Gets the negative of this vector 3.
      		* @return Negative copy of this vector 3.
      		**/
      def GetNegative(): b2Vec3 = js.native
      /**
      		* Vector multiplication.  Stores the result in this vector 3.
      		* @param a Value to multiple the vector's values by.
      		**/
      def Multiply(a: Double): Unit = js.native
      /**
      		* Sets this vector 3 to its negative.
      		**/
      def NegativeSelf(): Unit = js.native
      /**
      		* Sets the vector 3.
      		* @param x x value, default is 0.
      		* @param y y value, default is 0.
      		* @param z z value, default is 0.
      		**/
      def Set(): Unit = js.native
      def Set(x: Double): Unit = js.native
      def Set(x: Double, y: Double): Unit = js.native
      def Set(x: Double, y: Double, z: Double): Unit = js.native
      /**
      		* Sets the vector 3 from a vector 3.
      		* @param v Vector 3 to copy values from.
      		**/
      def SetV(v: b2Vec3): Unit = js.native
      /**
      		* Sets the vector 3 to zero values.
      		**/
      def SetZero(): Unit = js.native
      /**
      		* Subtracts the vector 3 from this vector 3.  The result is stored in this vector 3.
      		* @param v Vector 3 to subtract.
      		**/
      def Subtract(v: b2Vec3): Unit = js.native
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
      def FromAngle(angle: Double): b2Mat22 = js.native
      /**
      		* Creates a 2x2 matrix from two columns.
      		* @param c1 Column 1 vector.
      		* @param c2 Column 2 vector.
      		* @return 2x2 matrix.
      		**/
      def FromVV(c1: b2Vec2, c2: b2Vec2): b2Mat22 = js.native
    }
    
    /* static members */
    @js.native
    object b2Math extends js.Object {
      /**
      		* Global instance of a 2x2 identity matrix.  Use as read-only.
      		**/
      var b2Mat22_identity: b2Mat22 = js.native
      /**
      		* Global instance of an identity transform.  Use as read-only.
      		**/
      var b2Transform_identity: b2Transform = js.native
      /**
      		* Global instance of a zero'ed vector.  Use as read-only.
      		**/
      var b2Vec2_zero: b2Vec2 = js.native
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
      def AbsM(A: b2Mat22): b2Mat22 = js.native
      /**
      		* Creates an ABS vector.
      		* @param a Vector to ABS all values.
      		* @return Vector with all positive values.
      		**/
      def AbsV(a: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param A
      		* @param B
      		* @return
      		**/
      def AddMM(A: b2Mat22, B: b2Mat22): b2Mat22 = js.native
      /**
      		* Adds two vectors.
      		* @param a First vector.
      		* @param b Second vector.
      		* @return a + b.
      		**/
      def AddVV(a: b2Vec2, b: b2Vec2): b2Vec2 = js.native
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
      def ClampV(a: b2Vec2, low: b2Vec2, high: b2Vec2): b2Vec2 = js.native
      /**
      		* Cross product of s and vector 2.
      		* @param s s value.
      		* @param a Vector 2 to use in cross product.
      		* @return Cross product of s and a.
      		**/
      def CrossFV(s: Double, a: b2Vec2): b2Vec2 = js.native
      /**
      		* Cross product of vector 2 and s.
      		* @param a Vector 2 to use in cross product.
      		* @param s s value.
      		* @return Cross product of a and s.
      		**/
      def CrossVF(a: b2Vec2, s: Double): b2Vec2 = js.native
      /**
      		* Cross product of two vector 2s.
      		* @param a Vector 2 to use in cross product.
      		* @param b Vector 2 to use in cross product.
      		* @return Cross product of a and b.
      		**/
      def CrossVV(a: b2Vec2, b: b2Vec2): Double = js.native
      /**
      		* Calculates the distance between two vectors.
      		* @param a First vector.
      		* @param b Second vector.
      		* @return Distance between a and b.
      		**/
      def Distance(a: b2Vec2, b: b2Vec2): Double = js.native
      /**
      		* Calculates the squared distance between two vectors.
      		* @param a First vector.
      		* @param b Second vector.
      		* @return dist^2 between a and b.
      		**/
      def DistanceSquared(a: b2Vec2, b: b2Vec2): Double = js.native
      /**
      		* Dot product of two vector 2s.
      		* @param a Vector 2 to use in dot product.
      		* @param b Vector 2 to use in dot product.
      		* @return Dot product of a and b.
      		**/
      def Dot(a: b2Vec2, b: b2Vec2): Double = js.native
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
      def MaxV(a: b2Vec2, b: b2Vec2): b2Vec2 = js.native
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
      def MinV(a: b2Vec2, b: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param s
      		* @param a
      		* @return
      		**/
      def MulFV(s: Double, a: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param A
      		* @param B
      		* @return
      		**/
      def MulMM(A: b2Mat22, B: b2Mat22): b2Mat22 = js.native
      /**
      		* Multiply matrix and vector.
      		* @param A Matrix.
      		* @param v Vector.
      		* @return Result.
      		**/
      def MulMV(A: b2Mat22, v: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param A
      		* @param B
      		* @return
      		**/
      def MulTMM(A: b2Mat22, B: b2Mat22): b2Mat22 = js.native
      /**
      		*
      		* @param A
      		* @param v
      		* @return
      		**/
      def MulTMV(A: b2Mat22, v: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param T
      		* @param v
      		* @return
      		**/
      def MulX(T: b2Transform, v: b2Vec2): b2Vec2 = js.native
      /**
      		*
      		* @param T
      		* @param v
      		* @return
      		**/
      def MulXT(T: b2Transform, v: b2Vec2): b2Vec2 = js.native
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
      def SubtractVV(a: b2Vec2, b: b2Vec2): b2Vec2 = js.native
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
      def Make(x: Double, y: Double): b2Vec2 = js.native
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

