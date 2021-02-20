package typings.box2d.Box2D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  object Math {
    
    @js.native
    trait b2Mat22 extends StObject {
      
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
      
      /**
        * Column 1
        **/
      var col1: b2Vec2 = js.native
      
      /**
        * Column 2
        **/
      var col2: b2Vec2 = js.native
    }
    object b2Mat22 {
      
      @scala.inline
      def apply(
        Abs: () => Unit,
        AddM: b2Mat22 => Unit,
        Copy: () => b2Mat22,
        GetAngle: () => Double,
        GetInverse: b2Mat22 => b2Mat22,
        Set: Double => Unit,
        SetIdentity: () => Unit,
        SetM: b2Mat22 => Unit,
        SetVV: (b2Vec2, b2Vec2) => Unit,
        SetZero: () => Unit,
        Solve: (b2Vec2, Double, Double) => b2Vec2,
        col1: b2Vec2,
        col2: b2Vec2
      ): b2Mat22 = {
        val __obj = js.Dynamic.literal(Abs = js.Any.fromFunction0(Abs), AddM = js.Any.fromFunction1(AddM), Copy = js.Any.fromFunction0(Copy), GetAngle = js.Any.fromFunction0(GetAngle), GetInverse = js.Any.fromFunction1(GetInverse), Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), SetM = js.Any.fromFunction1(SetM), SetVV = js.Any.fromFunction2(SetVV), SetZero = js.Any.fromFunction0(SetZero), Solve = js.Any.fromFunction3(Solve), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Mat22]
      }
      
      @scala.inline
      implicit class b2Mat22MutableBuilder[Self <: b2Mat22] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbs(value: () => Unit): Self = StObject.set(x, "Abs", js.Any.fromFunction0(value))
        
        @scala.inline
        def setAddM(value: b2Mat22 => Unit): Self = StObject.set(x, "AddM", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCol1(value: b2Vec2): Self = StObject.set(x, "col1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol2(value: b2Vec2): Self = StObject.set(x, "col2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopy(value: () => b2Mat22): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAngle(value: () => Double): Self = StObject.set(x, "GetAngle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetInverse(value: b2Mat22 => b2Mat22): Self = StObject.set(x, "GetInverse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSet(value: Double => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetIdentity(value: () => Unit): Self = StObject.set(x, "SetIdentity", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetM(value: b2Mat22 => Unit): Self = StObject.set(x, "SetM", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetVV(value: (b2Vec2, b2Vec2) => Unit): Self = StObject.set(x, "SetVV", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetZero(value: () => Unit): Self = StObject.set(x, "SetZero", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSolve(value: (b2Vec2, Double, Double) => b2Vec2): Self = StObject.set(x, "Solve", js.Any.fromFunction3(value))
      }
    }
    
    @js.native
    trait b2Mat33 extends StObject {
      
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
    }
    object b2Mat33 {
      
      @scala.inline
      def apply(
        AddM: b2Mat33 => Unit,
        Copy: () => b2Mat33,
        SetIdentity: () => Unit,
        SetM: b2Mat33 => Unit,
        SetVVV: (b2Vec3, b2Vec3, b2Vec3) => Unit,
        SetZero: () => Unit,
        Solve22: (b2Vec2, Double, Double) => b2Vec2,
        Solve33: (b2Vec3, Double, Double, Double) => b2Vec3,
        col1: b2Vec3,
        col2: b2Vec3,
        col3: b2Vec3
      ): b2Mat33 = {
        val __obj = js.Dynamic.literal(AddM = js.Any.fromFunction1(AddM), Copy = js.Any.fromFunction0(Copy), SetIdentity = js.Any.fromFunction0(SetIdentity), SetM = js.Any.fromFunction1(SetM), SetVVV = js.Any.fromFunction3(SetVVV), SetZero = js.Any.fromFunction0(SetZero), Solve22 = js.Any.fromFunction3(Solve22), Solve33 = js.Any.fromFunction4(Solve33), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any], col3 = col3.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Mat33]
      }
      
      @scala.inline
      implicit class b2Mat33MutableBuilder[Self <: b2Mat33] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddM(value: b2Mat33 => Unit): Self = StObject.set(x, "AddM", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCol1(value: b2Vec3): Self = StObject.set(x, "col1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol2(value: b2Vec3): Self = StObject.set(x, "col2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol3(value: b2Vec3): Self = StObject.set(x, "col3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopy(value: () => b2Mat33): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetIdentity(value: () => Unit): Self = StObject.set(x, "SetIdentity", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetM(value: b2Mat33 => Unit): Self = StObject.set(x, "SetM", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetVVV(value: (b2Vec3, b2Vec3, b2Vec3) => Unit): Self = StObject.set(x, "SetVVV", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetZero(value: () => Unit): Self = StObject.set(x, "SetZero", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSolve22(value: (b2Vec2, Double, Double) => b2Vec2): Self = StObject.set(x, "Solve22", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSolve33(value: (b2Vec3, Double, Double, Double) => b2Vec3): Self = StObject.set(x, "Solve33", js.Any.fromFunction4(value))
      }
    }
    
    @js.native
    trait b2Math extends StObject
    
    @js.native
    trait b2Sweep extends StObject {
      
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
    }
    object b2Sweep {
      
      @scala.inline
      def apply(
        Advance: Double => Unit,
        Copy: () => b2Sweep,
        GetTransform: (b2Transform, Double) => Unit,
        Set: b2Sweep => Unit,
        a: Double,
        a0: Double,
        c: b2Vec2,
        c0: b2Vec2,
        localCenter: b2Vec2,
        t0: b2Vec2
      ): b2Sweep = {
        val __obj = js.Dynamic.literal(Advance = js.Any.fromFunction1(Advance), Copy = js.Any.fromFunction0(Copy), GetTransform = js.Any.fromFunction2(GetTransform), Set = js.Any.fromFunction1(Set), a = a.asInstanceOf[js.Any], a0 = a0.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], c0 = c0.asInstanceOf[js.Any], localCenter = localCenter.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Sweep]
      }
      
      @scala.inline
      implicit class b2SweepMutableBuilder[Self <: b2Sweep] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setA0(value: Double): Self = StObject.set(x, "a0", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdvance(value: Double => Unit): Self = StObject.set(x, "Advance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setC(value: b2Vec2): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setC0(value: b2Vec2): Self = StObject.set(x, "c0", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopy(value: () => b2Sweep): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetTransform(value: (b2Transform, Double) => Unit): Self = StObject.set(x, "GetTransform", js.Any.fromFunction2(value))
        
        @scala.inline
        def setLocalCenter(value: b2Vec2): Self = StObject.set(x, "localCenter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSet(value: b2Sweep => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
        
        @scala.inline
        def setT0(value: b2Vec2): Self = StObject.set(x, "t0", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait b2Transform extends StObject {
      
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
        * Transform rotation.
        **/
      var R: b2Mat22 = js.native
      
      /**
        * Sets the transfrom from a transfrom.
        * @param x Transform to copy values from.
        **/
      def Set(x: b2Transform): Unit = js.native
      
      /**
        * Set this to the identity transform.
        **/
      def SetIdentity(): Unit = js.native
      
      /**
        * Transform position.
        **/
      var position: b2Vec2 = js.native
    }
    object b2Transform {
      
      @scala.inline
      def apply(
        GetAngle: () => Double,
        Initialize: (b2Vec2, b2Mat22) => Unit,
        R: b2Mat22,
        Set: b2Transform => Unit,
        SetIdentity: () => Unit,
        position: b2Vec2
      ): b2Transform = {
        val __obj = js.Dynamic.literal(GetAngle = js.Any.fromFunction0(GetAngle), Initialize = js.Any.fromFunction2(Initialize), R = R.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), position = position.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Transform]
      }
      
      @scala.inline
      implicit class b2TransformMutableBuilder[Self <: b2Transform] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetAngle(value: () => Double): Self = StObject.set(x, "GetAngle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInitialize(value: (b2Vec2, b2Mat22) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR(value: b2Mat22): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSet(value: b2Transform => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetIdentity(value: () => Unit): Self = StObject.set(x, "SetIdentity", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait b2Vec2 extends StObject {
      
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
      def Set(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
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
      
      /**
        * x value
        **/
      var x: Double = js.native
      
      /**
        * y value
        **/
      var y: Double = js.native
    }
    
    @js.native
    trait b2Vec3 extends StObject {
      
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
      def Set(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Unit = js.native
      def Set(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
      def Set(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Unit = js.native
      def Set(x: Double): Unit = js.native
      def Set(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Unit = js.native
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
    }
  }
  
  @js.native
  trait b2Color extends StObject {
    
    /**
      * Sets the Color to new RGB values.
      * @param rr Red value
      * @param gg Green value
      * @param bb Blue value
      **/
    def Set(rr: Double, gg: Double, bb: Double): Unit = js.native
    
    /**
      * Blue
      **/
    var b: Double = js.native
    
    /**
      * RGB color as hex.
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
  }
  object b2Color {
    
    @scala.inline
    def apply(Set: (Double, Double, Double) => Unit, b: Double, color: Double, g: Double, r: Double): b2Color = {
      val __obj = js.Dynamic.literal(Set = js.Any.fromFunction3(Set), b = b.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2Color]
    }
    
    @scala.inline
    implicit class b2ColorMutableBuilder[Self <: b2Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait b2Settings extends StObject
}
