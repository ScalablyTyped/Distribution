package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Collision.b2AABB
import typings.box2d.Box2D.Collision.b2RayCastInput
import typings.box2d.Box2D.Collision.b2RayCastOutput
import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2EdgeShape extends b2Shape {
  
  /**
    * Determines if the first corner of this edge bends towards the solid side.
    * @return True if convex, otherwise false.
    **/
  def Corner1IsConvex(): Boolean = js.native
  
  /**
    * Determines if the second corner of this edge bends towards the solid side.
    * @return True if convex, otherwise false.
    **/
  def Corner2IsConvex(): Boolean = js.native
  
  /**
    * Get a core vertex 1 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
    * @return core vertex 1 in local coordinates.
    **/
  def GetCoreVertex1(): b2Vec2 = js.native
  
  /**
    * Get a core vertex 2 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
    * @return core vertex 2 in local coordinates.
    **/
  def GetCoreVertex2(): b2Vec2 = js.native
  
  /**
    * Returns a unit vector halfway between direction and previous direction.
    * @return Halfway unit vector between direction and previous direction.
    **/
  def GetCorner1Vector(): b2Vec2 = js.native
  
  /**
    * Returns a unit vector halfway between direction and previous direction.
    * @return Halfway unit vector between direction and previous direction.
    **/
  def GetCorner2Vector(): b2Vec2 = js.native
  
  /**
    * Get a parallel unit vector, pointing from vertex 1 to vertex 2.
    * @return Vertex 1 to vertex 2 directional vector.
    **/
  def GetDirectionVector(): b2Vec2 = js.native
  
  /**
    * Get the first vertex and apply the supplied transform.
    * @param xf Transform to apply.
    * @return First vertex with xf transform applied.
    **/
  def GetFirstVertex(xf: b2Transform): b2Vec2 = js.native
  
  /**
    * Get the distance from vertex1 to vertex2.
    * @return Distance from vertex1 to vertex2.
    **/
  def GetLength(): Double = js.native
  
  /**
    * Get the next edge in the chain.
    * @return Next edge shape or null if there is no next edge shape.
    **/
  def GetNextEdge(): b2EdgeShape = js.native
  
  /**
    * Get a perpendicular unit vector, pointing from the solid side to the empty side.
    * @return Normal vector.
    **/
  def GetNormalVector(): b2Vec2 = js.native
  
  /**
    * Get the previous edge in the chain.
    * @return Previous edge shape or null if there is no previous edge shape.
    **/
  def GetPrevEdge(): b2EdgeShape = js.native
  
  /**
    * Get the local position of vertex1 in the parent body.
    * @return Local position of vertex1 in the parent body.
    **/
  def GetVertex1(): b2Vec2 = js.native
  
  /**
    * Get the local position of vertex2 in the parent body.
    * @return Local position of vertex2 in the parent body.
    **/
  def GetVertex2(): b2Vec2 = js.native
  
  /**
    * Get the support point in the given world direction with the supplied transform.
    * @param xf Transform to apply.
    * @param dX X world direction.
    * @param dY Y world direction.
    * @return Support point.
    **/
  def Support(xf: b2Transform, dX: Double, dY: Double): b2Vec2 = js.native
}
object b2EdgeShape {
  
  @scala.inline
  def apply(
    ComputeAABB: (b2AABB, b2Transform) => Unit,
    ComputeMass: (b2MassData, Double) => Unit,
    ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
    Copy: () => b2Shape,
    Corner1IsConvex: () => Boolean,
    Corner2IsConvex: () => Boolean,
    GetCoreVertex1: () => b2Vec2,
    GetCoreVertex2: () => b2Vec2,
    GetCorner1Vector: () => b2Vec2,
    GetCorner2Vector: () => b2Vec2,
    GetDirectionVector: () => b2Vec2,
    GetFirstVertex: b2Transform => b2Vec2,
    GetLength: () => Double,
    GetNextEdge: () => b2EdgeShape,
    GetNormalVector: () => b2Vec2,
    GetPrevEdge: () => b2EdgeShape,
    GetType: () => Double,
    GetVertex1: () => b2Vec2,
    GetVertex2: () => b2Vec2,
    RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
    Set: b2Shape => Unit,
    Support: (b2Transform, Double, Double) => b2Vec2,
    TestPoint: (b2Transform, b2Vec2) => Boolean
  ): b2EdgeShape = {
    val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), Corner1IsConvex = js.Any.fromFunction0(Corner1IsConvex), Corner2IsConvex = js.Any.fromFunction0(Corner2IsConvex), GetCoreVertex1 = js.Any.fromFunction0(GetCoreVertex1), GetCoreVertex2 = js.Any.fromFunction0(GetCoreVertex2), GetCorner1Vector = js.Any.fromFunction0(GetCorner1Vector), GetCorner2Vector = js.Any.fromFunction0(GetCorner2Vector), GetDirectionVector = js.Any.fromFunction0(GetDirectionVector), GetFirstVertex = js.Any.fromFunction1(GetFirstVertex), GetLength = js.Any.fromFunction0(GetLength), GetNextEdge = js.Any.fromFunction0(GetNextEdge), GetNormalVector = js.Any.fromFunction0(GetNormalVector), GetPrevEdge = js.Any.fromFunction0(GetPrevEdge), GetType = js.Any.fromFunction0(GetType), GetVertex1 = js.Any.fromFunction0(GetVertex1), GetVertex2 = js.Any.fromFunction0(GetVertex2), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), Support = js.Any.fromFunction3(Support), TestPoint = js.Any.fromFunction2(TestPoint))
    __obj.asInstanceOf[b2EdgeShape]
  }
  
  @scala.inline
  implicit class b2EdgeShapeOps[Self <: b2EdgeShape] (val x: Self) extends AnyVal {
    
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
    def setCorner1IsConvex(value: () => Boolean): Self = this.set("Corner1IsConvex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCorner2IsConvex(value: () => Boolean): Self = this.set("Corner2IsConvex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCoreVertex1(value: () => b2Vec2): Self = this.set("GetCoreVertex1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCoreVertex2(value: () => b2Vec2): Self = this.set("GetCoreVertex2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCorner1Vector(value: () => b2Vec2): Self = this.set("GetCorner1Vector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCorner2Vector(value: () => b2Vec2): Self = this.set("GetCorner2Vector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionVector(value: () => b2Vec2): Self = this.set("GetDirectionVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstVertex(value: b2Transform => b2Vec2): Self = this.set("GetFirstVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("GetLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextEdge(value: () => b2EdgeShape): Self = this.set("GetNextEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNormalVector(value: () => b2Vec2): Self = this.set("GetNormalVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrevEdge(value: () => b2EdgeShape): Self = this.set("GetPrevEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertex1(value: () => b2Vec2): Self = this.set("GetVertex1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertex2(value: () => b2Vec2): Self = this.set("GetVertex2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupport(value: (b2Transform, Double, Double) => b2Vec2): Self = this.set("Support", js.Any.fromFunction3(value))
  }
}
