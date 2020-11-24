package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DistanceProxy extends js.Object {
  
  /**
    * Get the supporting vertex index in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex index.
    **/
  def GetSupport(d: b2Vec2): Double = js.native
  
  /**
    * Get the supporting vertex in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex.
    **/
  def GetSupportVertex(d: b2Vec2): b2Vec2 = js.native
  
  /**
    * Get a vertex by index.  Used by b2Distance.
    * @param index Vetex's index.
    * @return Vertex at the given index.
    **/
  def GetVertex(index: Double): b2Vec2 = js.native
  
  /**
    * Get the vertex count.
    * @return The number of vertices. (m_vertices.length)
    **/
  def GetVertexCount(): Double = js.native
  
  /**
    * Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
    * @param shape Shape to initialize the distance proxy.
    **/
  def Set(shape: b2Shape): Unit = js.native
  
  /**
    * Count
    **/
  var m_count: Double = js.native
  
  /**
    * Radius
    **/
  var m_radius: Double = js.native
  
  /**
    * Verticies
    **/
  var m_vertices: js.Array[b2Vec2] = js.native
}
object b2DistanceProxy {
  
  @scala.inline
  def apply(
    GetSupport: b2Vec2 => Double,
    GetSupportVertex: b2Vec2 => b2Vec2,
    GetVertex: Double => b2Vec2,
    GetVertexCount: () => Double,
    Set: b2Shape => Unit,
    m_count: Double,
    m_radius: Double,
    m_vertices: js.Array[b2Vec2]
  ): b2DistanceProxy = {
    val __obj = js.Dynamic.literal(GetSupport = js.Any.fromFunction1(GetSupport), GetSupportVertex = js.Any.fromFunction1(GetSupportVertex), GetVertex = js.Any.fromFunction1(GetVertex), GetVertexCount = js.Any.fromFunction0(GetVertexCount), Set = js.Any.fromFunction1(Set), m_count = m_count.asInstanceOf[js.Any], m_radius = m_radius.asInstanceOf[js.Any], m_vertices = m_vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceProxy]
  }
  
  @scala.inline
  implicit class b2DistanceProxyOps[Self <: b2DistanceProxy] (val x: Self) extends AnyVal {
    
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
    def setGetSupport(value: b2Vec2 => Double): Self = this.set("GetSupport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportVertex(value: b2Vec2 => b2Vec2): Self = this.set("GetSupportVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertex(value: Double => b2Vec2): Self = this.set("GetVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertexCount(value: () => Double): Self = this.set("GetVertexCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: b2Shape => Unit): Self = this.set("Set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setM_count(value: Double): Self = this.set("m_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_radius(value: Double): Self = this.set("m_radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_verticesVarargs(value: b2Vec2*): Self = this.set("m_vertices", js.Array(value :_*))
    
    @scala.inline
    def setM_vertices(value: js.Array[b2Vec2]): Self = this.set("m_vertices", value.asInstanceOf[js.Any])
  }
}
