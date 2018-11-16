package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron () extends Shape {
  def this(points: js.Array[Vec3]) = this()
  def this(points: js.Array[Vec3], faces: js.Array[scala.Double]) = this()
  var faceNormals: js.Array[Vec3] = js.native
  var faces: js.Array[js.Array[scala.Double]] = js.native
  var uniqueEdges: js.Array[Vec3] = js.native
  var vertices: js.Array[Vec3] = js.native
  var worldVertices: js.Array[Vec3] = js.native
  var worldVerticesNeedsUpdate: scala.Boolean = js.native
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): scala.Unit = js.native
  def clipAgainstHull(
    posA: Vec3,
    quatA: Quaternion,
    hullB: Vec3,
    quatB: Quaternion,
    separatingNormal: Vec3,
    minDist: scala.Double,
    maxDist: scala.Double,
    result: js.Array[_]
  ): scala.Unit = js.native
  def clipFaceAgainstHull(
    separatingNormal: Vec3,
    posA: Vec3,
    quatA: Quaternion,
    worldVertsB1: js.Array[Vec3],
    minDist: scala.Double,
    maxDist: scala.Double,
    result: js.Array[_]
  ): scala.Unit = js.native
  def clipFaceAgainstPlane(
    inVertices: js.Array[Vec3],
    outVertices: js.Array[Vec3],
    planeNormal: Vec3,
    planeConstant: scala.Double
  ): Vec3 = js.native
  def computeEdges(): scala.Unit = js.native
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): scala.Unit = js.native
  def computeNormals(): scala.Unit = js.native
  def computeWorldFaceNormals(quat: Quaternion): scala.Unit = js.native
  def computeWorldVertices(position: Vec3, quat: Quaternion): scala.Unit = js.native
  def findSaparatingAxis(
    hullB: ConvexPolyhedron,
    posA: Vec3,
    quatA: Quaternion,
    posB: Vec3,
    quatB: Quaternion,
    target: Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
  ): scala.Boolean = js.native
  def getAveragePointLocal(target: Vec3): Vec3 = js.native
  def getFaceNormal(i: scala.Double, target: Vec3): Vec3 = js.native
  def getPlaneConstantOfFace(face_i: scala.Double): scala.Double = js.native
  def pointIsInside(p: Vec3): scala.Boolean = js.native
  def testSepAxis(axis: Vec3, hullB: ConvexPolyhedron, posA: Vec3, quatA: Quaternion, posB: Vec3, quatB: Quaternion): scala.Double = js.native
  def transformAllPoints(offset: Vec3, quat: Quaternion): scala.Unit = js.native
}

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: cannonLib.CANNONNs.Vec3,
    vb: cannonLib.CANNONNs.Vec3,
    vc: cannonLib.CANNONNs.Vec3,
    target: cannonLib.CANNONNs.Vec3
  ): scala.Unit = js.native
  def project(
    hull: cannonLib.CANNONNs.ConvexPolyhedron,
    axis: cannonLib.CANNONNs.Vec3,
    pos: cannonLib.CANNONNs.Vec3,
    quat: cannonLib.CANNONNs.Quaternion,
    result: js.Array[scala.Double]
  ): scala.Unit = js.native
}

