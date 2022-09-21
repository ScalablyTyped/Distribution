package typings.cannon.mod

import typings.cannon.cannonNumbers.`0`
import typings.cannon.cannonNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Trimesh")
@js.native
open class Trimesh protected ()
  extends StObject
     with typings.cannon.CANNON.Trimesh {
  def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def calculateWorldAABB(
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    min: typings.cannon.CANNON.Vec3,
    max: typings.cannon.CANNON.Vec3
  ): Unit = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeLocalAABB(aabb: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def createTorus(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double): typings.cannon.CANNON.Trimesh = js.native
  
  /* CompleteClass */
  override def getEdgeVector(edgeIndex: Double, vectorStore: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getEdgeVertex(edgeIndex: Double, firstOrSecond: `0` | `1`, vertexStore: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getNormal(i: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getTriangleVertices(
    i: Double,
    a: typings.cannon.CANNON.Vec3,
    b: typings.cannon.CANNON.Vec3,
    c: typings.cannon.CANNON.Vec3
  ): Unit = js.native
  
  /* CompleteClass */
  override def getTrianglesInAABB(aabb: typings.cannon.CANNON.AABB, result: js.Array[Double]): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getVertex(i: Double, out: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getWorldVertex(
    i: Double,
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    out: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var indices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var scale: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def setScale(scale: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateAABB(): Unit = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def updateEdges(): Unit = js.native
  
  /* CompleteClass */
  override def updateNormals(): Unit = js.native
  
  /* CompleteClass */
  override def updateTree(): Unit = js.native
  
  /* CompleteClass */
  var vertices: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
/* static members */
object Trimesh {
  
  @JSImport("cannon", "Trimesh")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNormal(
    va: typings.cannon.CANNON.Vec3,
    vb: typings.cannon.CANNON.Vec3,
    vc: typings.cannon.CANNON.Vec3,
    target: typings.cannon.CANNON.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(va.asInstanceOf[js.Any], vb.asInstanceOf[js.Any], vc.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
