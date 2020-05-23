package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typings.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typings.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typings.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var faceNormals: js.Array[typings.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var faces: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override var uniqueEdges: js.Array[typings.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var vertices: js.Array[typings.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var worldVertices: js.Array[typings.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var worldVerticesNeedsUpdate: Boolean = js.native
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
    result: js.Array[_]
  ): Unit = js.native
  /* CompleteClass */
  override def clipFaceAgainstHull(
    separatingNormal: typings.cannon.CANNON.Vec3,
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    worldVertsB1: js.Array[typings.cannon.CANNON.Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  /* CompleteClass */
  override def clipFaceAgainstPlane(
    inVertices: js.Array[typings.cannon.CANNON.Vec3],
    outVertices: js.Array[typings.cannon.CANNON.Vec3],
    planeNormal: typings.cannon.CANNON.Vec3,
    planeConstant: Double
  ): typings.cannon.CANNON.Vec3 = js.native
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
  override def findSaparatingAxis(
    hullB: typings.cannon.CANNON.ConvexPolyhedron,
    posA: typings.cannon.CANNON.Vec3,
    quatA: typings.cannon.CANNON.Quaternion,
    posB: typings.cannon.CANNON.Vec3,
    quatB: typings.cannon.CANNON.Quaternion,
    target: typings.cannon.CANNON.Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
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
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

/* static members */
@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: typings.cannon.CANNON.Vec3,
    vb: typings.cannon.CANNON.Vec3,
    vc: typings.cannon.CANNON.Vec3,
    target: typings.cannon.CANNON.Vec3
  ): Unit = js.native
  def project(
    hull: typings.cannon.CANNON.ConvexPolyhedron,
    axis: typings.cannon.CANNON.Vec3,
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}

