package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvexPolyhedron extends Shape {
  
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
  
  var faceNormals: js.Array[Vec3] = js.native
  
  var faces: js.Array[js.Array[Double]] = js.native
  
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
  
  var uniqueEdges: js.Array[Vec3] = js.native
  
  var vertices: js.Array[Vec3] = js.native
  
  var worldVertices: js.Array[Vec3] = js.native
  
  var worldVerticesNeedsUpdate: Boolean = js.native
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
  
  @scala.inline
  implicit class ConvexPolyhedronOps[Self <: ConvexPolyhedron] (val x: Self) extends AnyVal {
    
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
    def setCalculateWorldAABB(value: (Vec3, Quaternion, Vec3, Vec3) => Unit): Self = this.set("calculateWorldAABB", js.Any.fromFunction4(value))
    
    @scala.inline
    def setClipAgainstHull(value: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[_]) => Unit): Self = this.set("clipAgainstHull", js.Any.fromFunction8(value))
    
    @scala.inline
    def setClipFaceAgainstHull(value: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[_]) => Unit): Self = this.set("clipFaceAgainstHull", js.Any.fromFunction7(value))
    
    @scala.inline
    def setClipFaceAgainstPlane(value: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3): Self = this.set("clipFaceAgainstPlane", js.Any.fromFunction4(value))
    
    @scala.inline
    def setComputeEdges(value: () => Unit): Self = this.set("computeEdges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeLocalAABB(value: (Vec3, Vec3) => Unit): Self = this.set("computeLocalAABB", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComputeNormals(value: () => Unit): Self = this.set("computeNormals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeWorldFaceNormals(value: Quaternion => Unit): Self = this.set("computeWorldFaceNormals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputeWorldVertices(value: (Vec3, Quaternion) => Unit): Self = this.set("computeWorldVertices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFaceNormalsVarargs(value: Vec3*): Self = this.set("faceNormals", js.Array(value :_*))
    
    @scala.inline
    def setFaceNormals(value: js.Array[Vec3]): Self = this.set("faceNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesVarargs(value: js.Array[Double]*): Self = this.set("faces", js.Array(value :_*))
    
    @scala.inline
    def setFaces(value: js.Array[js.Array[Double]]): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindSaparatingAxis(
      value: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[_], js.Array[_]) => Boolean
    ): Self = this.set("findSaparatingAxis", js.Any.fromFunction8(value))
    
    @scala.inline
    def setGetAveragePointLocal(value: Vec3 => Vec3): Self = this.set("getAveragePointLocal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFaceNormal(value: (Double, Vec3) => Vec3): Self = this.set("getFaceNormal", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPlaneConstantOfFace(value: Double => Double): Self = this.set("getPlaneConstantOfFace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointIsInside(value: Vec3 => Boolean): Self = this.set("pointIsInside", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestSepAxis(value: (Vec3, ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion) => Double): Self = this.set("testSepAxis", js.Any.fromFunction6(value))
    
    @scala.inline
    def setTransformAllPoints(value: (Vec3, Quaternion) => Unit): Self = this.set("transformAllPoints", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUniqueEdgesVarargs(value: Vec3*): Self = this.set("uniqueEdges", js.Array(value :_*))
    
    @scala.inline
    def setUniqueEdges(value: js.Array[Vec3]): Self = this.set("uniqueEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: Vec3*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Vec3]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldVerticesVarargs(value: Vec3*): Self = this.set("worldVertices", js.Array(value :_*))
    
    @scala.inline
    def setWorldVertices(value: js.Array[Vec3]): Self = this.set("worldVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldVerticesNeedsUpdate(value: Boolean): Self = this.set("worldVerticesNeedsUpdate", value.asInstanceOf[js.Any])
  }
}
