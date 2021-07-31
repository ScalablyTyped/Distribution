package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceProxy extends StObject {
  
  /**
    * Get the supporting vertex index in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex index.
    **/
  def GetSupport(d: b2Vec2): Double
  
  /**
    * Get the supporting vertex in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex.
    **/
  def GetSupportVertex(d: b2Vec2): b2Vec2
  
  /**
    * Get a vertex by index.  Used by b2Distance.
    * @param index Vetex's index.
    * @return Vertex at the given index.
    **/
  def GetVertex(index: Double): b2Vec2
  
  /**
    * Get the vertex count.
    * @return The number of vertices. (m_vertices.length)
    **/
  def GetVertexCount(): Double
  
  /**
    * Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
    * @param shape Shape to initialize the distance proxy.
    **/
  def Set(shape: b2Shape): Unit
  
  /**
    * Count
    **/
  var m_count: Double
  
  /**
    * Radius
    **/
  var m_radius: Double
  
  /**
    * Verticies
    **/
  var m_vertices: js.Array[b2Vec2]
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
  implicit class b2DistanceProxyMutableBuilder[Self <: b2DistanceProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSupport(value: b2Vec2 => Double): Self = StObject.set(x, "GetSupport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportVertex(value: b2Vec2 => b2Vec2): Self = StObject.set(x, "GetSupportVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertex(value: Double => b2Vec2): Self = StObject.set(x, "GetVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertexCount(value: () => Double): Self = StObject.set(x, "GetVertexCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setM_count(value: Double): Self = StObject.set(x, "m_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_radius(value: Double): Self = StObject.set(x, "m_radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_vertices(value: js.Array[b2Vec2]): Self = StObject.set(x, "m_vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_verticesVarargs(value: b2Vec2*): Self = StObject.set(x, "m_vertices", js.Array(value :_*))
    
    @scala.inline
    def setSet(value: b2Shape => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
  }
}
