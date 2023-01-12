package typings.cannon.CANNON

import typings.cannon.cannonInts.`0`
import typings.cannon.cannonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trimesh
  extends StObject
     with Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit
  
  def computeLocalAABB(aabb: Vec3): Unit
  
  def createTorus(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double): Trimesh
  
  def getEdgeVector(edgeIndex: Double, vectorStore: Vec3): Unit
  
  def getEdgeVertex(edgeIndex: Double, firstOrSecond: `0` | `1`, vertexStore: Vec3): Unit
  
  def getNormal(i: Double, target: Vec3): Vec3
  
  def getTriangleVertices(i: Double, a: Vec3, b: Vec3, c: Vec3): Unit
  
  def getTrianglesInAABB(aabb: AABB, result: js.Array[Double]): js.Array[Double]
  
  def getVertex(i: Double, out: Vec3): Vec3
  
  def getWorldVertex(i: Double, pos: Vec3, quat: Quaternion, out: Vec3): Vec3
  
  var indices: js.Array[Double]
  
  var scale: Vec3
  
  def setScale(scale: Vec3): Unit
  
  def updateAABB(): Unit
  
  def updateEdges(): Unit
  
  def updateNormals(): Unit
  
  def updateTree(): Unit
  
  var vertices: js.Array[Double]
}
object Trimesh {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Vec3, Vec3) => Unit,
    collisionResponse: Boolean,
    computeLocalAABB: Vec3 => Unit,
    createTorus: (Double, Double, Double, Double, Double) => Trimesh,
    getEdgeVector: (Double, Vec3) => Unit,
    getEdgeVertex: (Double, `0` | `1`, Vec3) => Unit,
    getNormal: (Double, Vec3) => Vec3,
    getTriangleVertices: (Double, Vec3, Vec3, Vec3) => Unit,
    getTrianglesInAABB: (AABB, js.Array[Double]) => js.Array[Double],
    getVertex: (Double, Vec3) => Vec3,
    getWorldVertex: (Double, Vec3, Quaternion, Vec3) => Vec3,
    id: Double,
    indices: js.Array[Double],
    scale: Vec3,
    setScale: Vec3 => Unit,
    `type`: Double,
    updateAABB: () => Unit,
    updateBoundingSphereRadius: () => Double,
    updateEdges: () => Unit,
    updateNormals: () => Unit,
    updateTree: () => Unit,
    vertices: js.Array[Double],
    volume: () => Double
  ): Trimesh = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeLocalAABB = js.Any.fromFunction1(computeLocalAABB), createTorus = js.Any.fromFunction5(createTorus), getEdgeVector = js.Any.fromFunction2(getEdgeVector), getEdgeVertex = js.Any.fromFunction3(getEdgeVertex), getNormal = js.Any.fromFunction2(getNormal), getTriangleVertices = js.Any.fromFunction4(getTriangleVertices), getTrianglesInAABB = js.Any.fromFunction2(getTrianglesInAABB), getVertex = js.Any.fromFunction2(getVertex), getWorldVertex = js.Any.fromFunction4(getWorldVertex), id = id.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setScale = js.Any.fromFunction1(setScale), updateAABB = js.Any.fromFunction0(updateAABB), updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), updateEdges = js.Any.fromFunction0(updateEdges), updateNormals = js.Any.fromFunction0(updateNormals), updateTree = js.Any.fromFunction0(updateTree), vertices = vertices.asInstanceOf[js.Any], volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trimesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trimesh] (val x: Self) extends AnyVal {
    
    inline def setCalculateWorldAABB(value: (Vec3, Quaternion, Vec3, Vec3) => Unit): Self = StObject.set(x, "calculateWorldAABB", js.Any.fromFunction4(value))
    
    inline def setComputeLocalAABB(value: Vec3 => Unit): Self = StObject.set(x, "computeLocalAABB", js.Any.fromFunction1(value))
    
    inline def setCreateTorus(value: (Double, Double, Double, Double, Double) => Trimesh): Self = StObject.set(x, "createTorus", js.Any.fromFunction5(value))
    
    inline def setGetEdgeVector(value: (Double, Vec3) => Unit): Self = StObject.set(x, "getEdgeVector", js.Any.fromFunction2(value))
    
    inline def setGetEdgeVertex(value: (Double, `0` | `1`, Vec3) => Unit): Self = StObject.set(x, "getEdgeVertex", js.Any.fromFunction3(value))
    
    inline def setGetNormal(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "getNormal", js.Any.fromFunction2(value))
    
    inline def setGetTriangleVertices(value: (Double, Vec3, Vec3, Vec3) => Unit): Self = StObject.set(x, "getTriangleVertices", js.Any.fromFunction4(value))
    
    inline def setGetTrianglesInAABB(value: (AABB, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "getTrianglesInAABB", js.Any.fromFunction2(value))
    
    inline def setGetVertex(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "getVertex", js.Any.fromFunction2(value))
    
    inline def setGetWorldVertex(value: (Double, Vec3, Quaternion, Vec3) => Vec3): Self = StObject.set(x, "getWorldVertex", js.Any.fromFunction4(value))
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setScale(value: Vec3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSetScale(value: Vec3 => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction1(value))
    
    inline def setUpdateAABB(value: () => Unit): Self = StObject.set(x, "updateAABB", js.Any.fromFunction0(value))
    
    inline def setUpdateEdges(value: () => Unit): Self = StObject.set(x, "updateEdges", js.Any.fromFunction0(value))
    
    inline def setUpdateNormals(value: () => Unit): Self = StObject.set(x, "updateNormals", js.Any.fromFunction0(value))
    
    inline def setUpdateTree(value: () => Unit): Self = StObject.set(x, "updateTree", js.Any.fromFunction0(value))
    
    inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
