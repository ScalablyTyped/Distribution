package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2ManifoldPoint extends js.Object {
  
  /**
    * Resets this manifold point.
    **/
  def Reset(): Unit = js.native
  
  /**
    * Sets this manifold point from a manifold point.
    * @param m The manifold point to copy values from.
    **/
  def Set(m: b2ManifoldPoint): Unit = js.native
  
  /**
    * Contact ID.
    **/
  var m_id: b2ContactID = js.native
  
  /**
    * Local contact point.
    **/
  var m_localpoint: b2Vec2 = js.native
  
  /**
    * Normal impluse for this contact point.
    **/
  var m_normalImpulse: Double = js.native
  
  /**
    * Tangent impulse for contact point.
    **/
  var m_tangentImpulse: Double = js.native
}
object b2ManifoldPoint {
  
  @scala.inline
  def apply(
    Reset: () => Unit,
    Set: b2ManifoldPoint => Unit,
    m_id: b2ContactID,
    m_localpoint: b2Vec2,
    m_normalImpulse: Double,
    m_tangentImpulse: Double
  ): b2ManifoldPoint = {
    val __obj = js.Dynamic.literal(Reset = js.Any.fromFunction0(Reset), Set = js.Any.fromFunction1(Set), m_id = m_id.asInstanceOf[js.Any], m_localpoint = m_localpoint.asInstanceOf[js.Any], m_normalImpulse = m_normalImpulse.asInstanceOf[js.Any], m_tangentImpulse = m_tangentImpulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ManifoldPoint]
  }
  
  @scala.inline
  implicit class b2ManifoldPointOps[Self <: b2ManifoldPoint] (val x: Self) extends AnyVal {
    
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
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: b2ManifoldPoint => Unit): Self = this.set("Set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setM_id(value: b2ContactID): Self = this.set("m_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_localpoint(value: b2Vec2): Self = this.set("m_localpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_normalImpulse(value: Double): Self = this.set("m_normalImpulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_tangentImpulse(value: Double): Self = this.set("m_tangentImpulse", value.asInstanceOf[js.Any])
  }
}
