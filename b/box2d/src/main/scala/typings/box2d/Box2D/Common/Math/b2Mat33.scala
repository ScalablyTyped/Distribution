package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Mat33 extends js.Object {
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
  implicit class b2Mat33Ops[Self <: b2Mat33] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddM(value: b2Mat33 => Unit): Self = this.set("AddM", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: () => b2Mat33): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIdentity(value: () => Unit): Self = this.set("SetIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def setSetM(value: b2Mat33 => Unit): Self = this.set("SetM", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVVV(value: (b2Vec3, b2Vec3, b2Vec3) => Unit): Self = this.set("SetVVV", js.Any.fromFunction3(value))
    @scala.inline
    def setSetZero(value: () => Unit): Self = this.set("SetZero", js.Any.fromFunction0(value))
    @scala.inline
    def setSolve22(value: (b2Vec2, Double, Double) => b2Vec2): Self = this.set("Solve22", js.Any.fromFunction3(value))
    @scala.inline
    def setSolve33(value: (b2Vec3, Double, Double, Double) => b2Vec3): Self = this.set("Solve33", js.Any.fromFunction4(value))
    @scala.inline
    def setCol1(value: b2Vec3): Self = this.set("col1", value.asInstanceOf[js.Any])
    @scala.inline
    def setCol2(value: b2Vec3): Self = this.set("col2", value.asInstanceOf[js.Any])
    @scala.inline
    def setCol3(value: b2Vec3): Self = this.set("col3", value.asInstanceOf[js.Any])
  }
  
}

