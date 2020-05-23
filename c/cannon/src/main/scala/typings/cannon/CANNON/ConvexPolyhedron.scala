package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexPolyhedron extends Shape {
  var faceNormals: js.Array[Vec3]
  var faces: js.Array[js.Array[Double]]
  var uniqueEdges: js.Array[Vec3]
  var vertices: js.Array[Vec3]
  var worldVertices: js.Array[Vec3]
  var worldVerticesNeedsUpdate: Boolean
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit
  def clipAgainstHull(
    posA: Vec3,
    quatA: Quaternion,
    hullB: Vec3,
    quatB: Quaternion,
    separatingNormal: Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit
  def clipFaceAgainstHull(
    separatingNormal: Vec3,
    posA: Vec3,
    quatA: Quaternion,
    worldVertsB1: js.Array[Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit
  def clipFaceAgainstPlane(inVertices: js.Array[Vec3], outVertices: js.Array[Vec3], planeNormal: Vec3, planeConstant: Double): Vec3
  def computeEdges(): Unit
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): Unit
  def computeNormals(): Unit
  def computeWorldFaceNormals(quat: Quaternion): Unit
  def computeWorldVertices(position: Vec3, quat: Quaternion): Unit
  def findSaparatingAxis(
    hullB: ConvexPolyhedron,
    posA: Vec3,
    quatA: Quaternion,
    posB: Vec3,
    quatB: Quaternion,
    target: Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
  ): Boolean
  def getAveragePointLocal(target: Vec3): Vec3
  def getFaceNormal(i: Double, target: Vec3): Vec3
  def getPlaneConstantOfFace(face_i: Double): Double
  def pointIsInside(p: Vec3): Boolean
  def testSepAxis(axis: Vec3, hullB: ConvexPolyhedron, posA: Vec3, quatA: Quaternion, posB: Vec3, quatB: Quaternion): Double
  def transformAllPoints(offset: Vec3, quat: Quaternion): Unit
}

object ConvexPolyhedron {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Vec3, Vec3) => Unit,
    clipAgainstHull: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[_]) => Unit,
    clipFaceAgainstHull: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[_]) => Unit,
    clipFaceAgainstPlane: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3,
    collisionResponse: Boolean,
    computeEdges: () => Unit,
    computeLocalAABB: (Vec3, Vec3) => Unit,
    computeNormals: () => Unit,
    computeWorldFaceNormals: Quaternion => Unit,
    computeWorldVertices: (Vec3, Quaternion) => Unit,
    faceNormals: js.Array[Vec3],
    faces: js.Array[js.Array[Double]],
    findSaparatingAxis: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[_], js.Array[_]) => Boolean,
    getAveragePointLocal: Vec3 => Vec3,
    getFaceNormal: (Double, Vec3) => Vec3,
    getPlaneConstantOfFace: Double => Double,
    pointIsInside: Vec3 => Boolean,
    testSepAxis: (Vec3, ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion) => Double,
    transformAllPoints: (Vec3, Quaternion) => Unit,
    `type`: Double,
    uniqueEdges: js.Array[Vec3],
    updateBoundingSphereRadius: () => Double,
    vertices: js.Array[Vec3],
    volume: () => Double,
    worldVertices: js.Array[Vec3],
    worldVerticesNeedsUpdate: Boolean
  ): ConvexPolyhedron = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), clipAgainstHull = js.Any.fromFunction8(clipAgainstHull), clipFaceAgainstHull = js.Any.fromFunction7(clipFaceAgainstHull), clipFaceAgainstPlane = js.Any.fromFunction4(clipFaceAgainstPlane), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeEdges = js.Any.fromFunction0(computeEdges), computeLocalAABB = js.Any.fromFunction2(computeLocalAABB), computeNormals = js.Any.fromFunction0(computeNormals), computeWorldFaceNormals = js.Any.fromFunction1(computeWorldFaceNormals), computeWorldVertices = js.Any.fromFunction2(computeWorldVertices), faceNormals = faceNormals.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], findSaparatingAxis = js.Any.fromFunction8(findSaparatingAxis), getAveragePointLocal = js.Any.fromFunction1(getAveragePointLocal), getFaceNormal = js.Any.fromFunction2(getFaceNormal), getPlaneConstantOfFace = js.Any.fromFunction1(getPlaneConstantOfFace), pointIsInside = js.Any.fromFunction1(pointIsInside), testSepAxis = js.Any.fromFunction6(testSepAxis), transformAllPoints = js.Any.fromFunction2(transformAllPoints), uniqueEdges = uniqueEdges.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), vertices = vertices.asInstanceOf[js.Any], volume = js.Any.fromFunction0(volume), worldVertices = worldVertices.asInstanceOf[js.Any], worldVerticesNeedsUpdate = worldVerticesNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexPolyhedron]
  }
}

