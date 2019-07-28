package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron () extends Shape {
  def this(points: js.Array[Vec3]) = this()
  def this(points: js.Array[Vec3], faces: js.Array[Double]) = this()
  var faceNormals: js.Array[Vec3] = js.native
  var faces: js.Array[js.Array[Double]] = js.native
  var uniqueEdges: js.Array[Vec3] = js.native
  var vertices: js.Array[Vec3] = js.native
  var worldVertices: js.Array[Vec3] = js.native
  var worldVerticesNeedsUpdate: Boolean = js.native
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit = js.native
  def clipAgainstHull(
    posA: Vec3,
    quatA: Quaternion,
    hullB: Vec3,
    quatB: Quaternion,
    separatingNormal: Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  def clipFaceAgainstHull(
    separatingNormal: Vec3,
    posA: Vec3,
    quatA: Quaternion,
    worldVertsB1: js.Array[Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  def clipFaceAgainstPlane(inVertices: js.Array[Vec3], outVertices: js.Array[Vec3], planeNormal: Vec3, planeConstant: Double): Vec3 = js.native
  def computeEdges(): Unit = js.native
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): Unit = js.native
  def computeNormals(): Unit = js.native
  def computeWorldFaceNormals(quat: Quaternion): Unit = js.native
  def computeWorldVertices(position: Vec3, quat: Quaternion): Unit = js.native
  def findSaparatingAxis(
    hullB: ConvexPolyhedron,
    posA: Vec3,
    quatA: Quaternion,
    posB: Vec3,
    quatB: Quaternion,
    target: Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
  ): Boolean = js.native
  def getAveragePointLocal(target: Vec3): Vec3 = js.native
  def getFaceNormal(i: Double, target: Vec3): Vec3 = js.native
  def getPlaneConstantOfFace(face_i: Double): Double = js.native
  def pointIsInside(p: Vec3): Boolean = js.native
  def testSepAxis(axis: Vec3, hullB: ConvexPolyhedron, posA: Vec3, quatA: Quaternion, posB: Vec3, quatB: Quaternion): Double = js.native
  def transformAllPoints(offset: Vec3, quat: Quaternion): Unit = js.native
}

/* static members */
@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(va: Vec3, vb: Vec3, vc: Vec3, target: Vec3): Unit = js.native
  def project(hull: ConvexPolyhedron, axis: Vec3, pos: Vec3, quat: Quaternion, result: js.Array[Double]): Unit = js.native
}

