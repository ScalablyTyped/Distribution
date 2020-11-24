package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2WorldManifold extends js.Object {
  
  /**
    * Evaluate the manifold with supplied transforms. This assumes modest motion from the original state. This does not change the point count, impulses, etc. The radii must come from the shapes that generated the manifold.
    * @param manifold Manifold to evaluate.
    * @param xfA A transform.
    * @param radiusA A radius.
    * @param xfB B transform.
    * @param radiusB B radius.
    **/
  def Initialize(manifold: b2Manifold, xfA: b2Transform, radiusA: Double, xfB: b2Transform, radiusB: Double): Unit = js.native
  
  /**
    * World vector pointing from A to B.
    **/
  var m_normal: b2Vec2 = js.native
  
  /**
    * World contact point (point of intersection).
    **/
  var m_points: js.Array[b2Vec2] = js.native
}
object b2WorldManifold {
  
  @scala.inline
  def apply(
    Initialize: (b2Manifold, b2Transform, Double, b2Transform, Double) => Unit,
    m_normal: b2Vec2,
    m_points: js.Array[b2Vec2]
  ): b2WorldManifold = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction5(Initialize), m_normal = m_normal.asInstanceOf[js.Any], m_points = m_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2WorldManifold]
  }
  
  @scala.inline
  implicit class b2WorldManifoldOps[Self <: b2WorldManifold] (val x: Self) extends AnyVal {
    
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
    def setInitialize(value: (b2Manifold, b2Transform, Double, b2Transform, Double) => Unit): Self = this.set("Initialize", js.Any.fromFunction5(value))
    
    @scala.inline
    def setM_normal(value: b2Vec2): Self = this.set("m_normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_pointsVarargs(value: b2Vec2*): Self = this.set("m_points", js.Array(value :_*))
    
    @scala.inline
    def setM_points(value: js.Array[b2Vec2]): Self = this.set("m_points", value.asInstanceOf[js.Any])
  }
}
