package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2Sweep extends js.Object {
  
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
  implicit class b2SweepOps[Self <: b2Sweep] (val x: Self) extends AnyVal {
    
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
    def setAdvance(value: Double => Unit): Self = this.set("Advance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: () => b2Sweep): Self = this.set("Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransform(value: (b2Transform, Double) => Unit): Self = this.set("GetTransform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: b2Sweep => Unit): Self = this.set("Set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA0(value: Double): Self = this.set("a0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: b2Vec2): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC0(value: b2Vec2): Self = this.set("c0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCenter(value: b2Vec2): Self = this.set("localCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT0(value: b2Vec2): Self = this.set("t0", value.asInstanceOf[js.Any])
  }
}
