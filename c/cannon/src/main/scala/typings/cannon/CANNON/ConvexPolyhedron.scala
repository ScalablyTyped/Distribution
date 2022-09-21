package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvexPolyhedron
  extends StObject
     with Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit
  
  def clipAgainstHull(
    posA: Vec3,
    quatA: Quaternion,
    hullB: Vec3,
    quatB: Quaternion,
    separatingNormal: Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[Any]
  ): Unit
  
  def clipFaceAgainstHull(
    separatingNormal: Vec3,
    posA: Vec3,
    quatA: Quaternion,
    worldVertsB1: js.Array[Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[Any]
  ): Unit
  
  def clipFaceAgainstPlane(inVertices: js.Array[Vec3], outVertices: js.Array[Vec3], planeNormal: Vec3, planeConstant: Double): Vec3
  
  def computeEdges(): Unit
  
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): Unit
  
  def computeNormals(): Unit
  
  def computeWorldFaceNormals(quat: Quaternion): Unit
  
  def computeWorldVertices(position: Vec3, quat: Quaternion): Unit
  
  var faceNormals: js.Array[Vec3]
  
  var faces: js.Array[js.Array[Double]]
  
  def findSaparatingAxis(
    hullB: ConvexPolyhedron,
    posA: Vec3,
    quatA: Quaternion,
    posB: Vec3,
    quatB: Quaternion,
    target: Vec3,
    faceListA: js.Array[Any],
    faceListB: js.Array[Any]
  ): Boolean
  
  def getAveragePointLocal(target: Vec3): Vec3
  
  def getFaceNormal(i: Double, target: Vec3): Vec3
  
  def getPlaneConstantOfFace(face_i: Double): Double
  
  def pointIsInside(p: Vec3): Boolean
  
  def testSepAxis(axis: Vec3, hullB: ConvexPolyhedron, posA: Vec3, quatA: Quaternion, posB: Vec3, quatB: Quaternion): Double
  
  def transformAllPoints(offset: Vec3, quat: Quaternion): Unit
  
  var uniqueEdges: js.Array[Vec3]
  
  var vertices: js.Array[Vec3]
  
  var worldVertices: js.Array[Vec3]
  
  var worldVerticesNeedsUpdate: Boolean
}
object ConvexPolyhedron {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Vec3, Vec3) => Unit,
    clipAgainstHull: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[Any]) => Unit,
    clipFaceAgainstHull: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[Any]) => Unit,
    clipFaceAgainstPlane: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3,
    collisionResponse: Boolean,
    computeEdges: () => Unit,
    computeLocalAABB: (Vec3, Vec3) => Unit,
    computeNormals: () => Unit,
    computeWorldFaceNormals: Quaternion => Unit,
    computeWorldVertices: (Vec3, Quaternion) => Unit,
    faceNormals: js.Array[Vec3],
    faces: js.Array[js.Array[Double]],
    findSaparatingAxis: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[Any], js.Array[Any]) => Boolean,
    getAveragePointLocal: Vec3 => Vec3,
    getFaceNormal: (Double, Vec3) => Vec3,
    getPlaneConstantOfFace: Double => Double,
    id: Double,
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
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), clipAgainstHull = js.Any.fromFunction8(clipAgainstHull), clipFaceAgainstHull = js.Any.fromFunction7(clipFaceAgainstHull), clipFaceAgainstPlane = js.Any.fromFunction4(clipFaceAgainstPlane), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeEdges = js.Any.fromFunction0(computeEdges), computeLocalAABB = js.Any.fromFunction2(computeLocalAABB), computeNormals = js.Any.fromFunction0(computeNormals), computeWorldFaceNormals = js.Any.fromFunction1(computeWorldFaceNormals), computeWorldVertices = js.Any.fromFunction2(computeWorldVertices), faceNormals = faceNormals.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], findSaparatingAxis = js.Any.fromFunction8(findSaparatingAxis), getAveragePointLocal = js.Any.fromFunction1(getAveragePointLocal), getFaceNormal = js.Any.fromFunction2(getFaceNormal), getPlaneConstantOfFace = js.Any.fromFunction1(getPlaneConstantOfFace), id = id.asInstanceOf[js.Any], pointIsInside = js.Any.fromFunction1(pointIsInside), testSepAxis = js.Any.fromFunction6(testSepAxis), transformAllPoints = js.Any.fromFunction2(transformAllPoints), uniqueEdges = uniqueEdges.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), vertices = vertices.asInstanceOf[js.Any], volume = js.Any.fromFunction0(volume), worldVertices = worldVertices.asInstanceOf[js.Any], worldVerticesNeedsUpdate = worldVerticesNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexPolyhedron]
  }
  
  extension [Self <: ConvexPolyhedron](x: Self) {
    
    inline def setCalculateWorldAABB(value: (Vec3, Quaternion, Vec3, Vec3) => Unit): Self = StObject.set(x, "calculateWorldAABB", js.Any.fromFunction4(value))
    
    inline def setClipAgainstHull(value: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[Any]) => Unit): Self = StObject.set(x, "clipAgainstHull", js.Any.fromFunction8(value))
    
    inline def setClipFaceAgainstHull(value: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[Any]) => Unit): Self = StObject.set(x, "clipFaceAgainstHull", js.Any.fromFunction7(value))
    
    inline def setClipFaceAgainstPlane(value: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3): Self = StObject.set(x, "clipFaceAgainstPlane", js.Any.fromFunction4(value))
    
    inline def setComputeEdges(value: () => Unit): Self = StObject.set(x, "computeEdges", js.Any.fromFunction0(value))
    
    inline def setComputeLocalAABB(value: (Vec3, Vec3) => Unit): Self = StObject.set(x, "computeLocalAABB", js.Any.fromFunction2(value))
    
    inline def setComputeNormals(value: () => Unit): Self = StObject.set(x, "computeNormals", js.Any.fromFunction0(value))
    
    inline def setComputeWorldFaceNormals(value: Quaternion => Unit): Self = StObject.set(x, "computeWorldFaceNormals", js.Any.fromFunction1(value))
    
    inline def setComputeWorldVertices(value: (Vec3, Quaternion) => Unit): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction2(value))
    
    inline def setFaceNormals(value: js.Array[Vec3]): Self = StObject.set(x, "faceNormals", value.asInstanceOf[js.Any])
    
    inline def setFaceNormalsVarargs(value: Vec3*): Self = StObject.set(x, "faceNormals", js.Array(value*))
    
    inline def setFaces(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    inline def setFacesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "faces", js.Array(value*))
    
    inline def setFindSaparatingAxis(
      value: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[Any], js.Array[Any]) => Boolean
    ): Self = StObject.set(x, "findSaparatingAxis", js.Any.fromFunction8(value))
    
    inline def setGetAveragePointLocal(value: Vec3 => Vec3): Self = StObject.set(x, "getAveragePointLocal", js.Any.fromFunction1(value))
    
    inline def setGetFaceNormal(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "getFaceNormal", js.Any.fromFunction2(value))
    
    inline def setGetPlaneConstantOfFace(value: Double => Double): Self = StObject.set(x, "getPlaneConstantOfFace", js.Any.fromFunction1(value))
    
    inline def setPointIsInside(value: Vec3 => Boolean): Self = StObject.set(x, "pointIsInside", js.Any.fromFunction1(value))
    
    inline def setTestSepAxis(value: (Vec3, ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion) => Double): Self = StObject.set(x, "testSepAxis", js.Any.fromFunction6(value))
    
    inline def setTransformAllPoints(value: (Vec3, Quaternion) => Unit): Self = StObject.set(x, "transformAllPoints", js.Any.fromFunction2(value))
    
    inline def setUniqueEdges(value: js.Array[Vec3]): Self = StObject.set(x, "uniqueEdges", value.asInstanceOf[js.Any])
    
    inline def setUniqueEdgesVarargs(value: Vec3*): Self = StObject.set(x, "uniqueEdges", js.Array(value*))
    
    inline def setVertices(value: js.Array[Vec3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Vec3*): Self = StObject.set(x, "vertices", js.Array(value*))
    
    inline def setWorldVertices(value: js.Array[Vec3]): Self = StObject.set(x, "worldVertices", value.asInstanceOf[js.Any])
    
    inline def setWorldVerticesNeedsUpdate(value: Boolean): Self = StObject.set(x, "worldVerticesNeedsUpdate", value.asInstanceOf[js.Any])
    
    inline def setWorldVerticesVarargs(value: Vec3*): Self = StObject.set(x, "worldVertices", js.Array(value*))
  }
}
