package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends StObject
     with typings.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typings.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typings.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
  def this(points: Unit, faces: js.Array[Double]) = this()
  
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
  override def clipAgainstHull(
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    hullB: typings.cannon.CANNON.Vec3,
    quatB: typings.cannon.CANNON.Quaternion,
    separatingNormal: typings.cannon.CANNON.Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[js.Any]
  ): Unit = js.native
  
  /* CompleteClass */
  override def clipFaceAgainstHull(
    separatingNormal: typings.cannon.CANNON.Vec3,
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    worldVertsB1: js.Array[typings.cannon.CANNON.Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[js.Any]
  ): Unit = js.native
  
  /* CompleteClass */
  override def clipFaceAgainstPlane(
    inVertices: js.Array[typings.cannon.CANNON.Vec3],
    outVertices: js.Array[typings.cannon.CANNON.Vec3],
    planeNormal: typings.cannon.CANNON.Vec3,
    planeConstant: Double
  ): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeEdges(): Unit = js.native
  
  /* CompleteClass */
  override def computeLocalAABB(aabbmin: typings.cannon.CANNON.Vec3, aabbmax: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def computeNormals(): Unit = js.native
  
  /* CompleteClass */
  override def computeWorldFaceNormals(quat: typings.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(position: typings.cannon.CANNON.Vec3, quat: typings.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var faceNormals: js.Array[typings.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  var faces: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  override def findSaparatingAxis(
    hullB: typings.cannon.CANNON.ConvexPolyhedron,
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    posB: typings.cannon.CANNON.Vec3,
    quatB: typings.cannon.CANNON.Quaternion,
    target: typings.cannon.CANNON.Vec3,
    faceListA: js.Array[js.Any],
    faceListB: js.Array[js.Any]
  ): Boolean = js.native
  
  /* CompleteClass */
  override def getAveragePointLocal(target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getFaceNormal(i: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getPlaneConstantOfFace(face_i: Double): Double = js.native
  
  /* CompleteClass */
  override def pointIsInside(p: typings.cannon.CANNON.Vec3): Boolean = js.native
  
  /* CompleteClass */
  override def testSepAxis(
    axis: typings.cannon.CANNON.Vec3,
    hullB: typings.cannon.CANNON.ConvexPolyhedron,
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    posB: typings.cannon.CANNON.Vec3,
    quatB: typings.cannon.CANNON.Quaternion
  ): Double = js.native
  
  /* CompleteClass */
  override def transformAllPoints(offset: typings.cannon.CANNON.Vec3, quat: typings.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  var uniqueEdges: js.Array[typings.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  var vertices: js.Array[typings.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
  
  /* CompleteClass */
  var worldVertices: js.Array[typings.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  var worldVerticesNeedsUpdate: Boolean = js.native
}
/* static members */
object ConvexPolyhedron {
  
  @JSGlobal("CANNON.ConvexPolyhedron")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeNormal(
    va: typings.cannon.CANNON.Vec3,
    vb: typings.cannon.CANNON.Vec3,
    vc: typings.cannon.CANNON.Vec3,
    target: typings.cannon.CANNON.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(va.asInstanceOf[js.Any], vb.asInstanceOf[js.Any], vc.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def project(
    hull: typings.cannon.CANNON.ConvexPolyhedron,
    axis: typings.cannon.CANNON.Vec3,
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(hull.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
