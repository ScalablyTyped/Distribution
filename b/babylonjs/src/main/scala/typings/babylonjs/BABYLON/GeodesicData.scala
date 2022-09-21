package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeodesicData
  extends StObject
     with PolyhedronData {
  
  /**
    * @hidden
    */
  var adjacentFaces: js.Array[js.Array[Double]]
  
  /**
    * @param face
    * @param primTri
    * @hidden
    */
  def innerToData(face: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @param faceNb
    * @param primTri
    * @hidden
    */
  def mapABOBtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @param faceNb
    * @param primTri
    * @hidden
    */
  def mapBAOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @param faceNb
    * @param primTri
    * @hidden
    */
  def mapOBOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @param primTri
    * @hidden
    */
  def orderData(primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @hidden
    */
  var poleNodes: Double
  
  /**
    * @param m
    * @param faces
    * @hidden
    */
  def setOrder(m: Double, faces: js.Array[Double]): js.Array[Double]
  
  /**
    * @hidden
    */
  var sharedNodes: Double
  
  /**
    * @hidden
    */
  def toGoldbergPolyhedronData(): PolyhedronData
}
object GeodesicData {
  
  inline def apply(
    adjacentFaces: js.Array[js.Array[Double]],
    category: String,
    edgematch: js.Array[js.Array[Double | String]],
    face: js.Array[js.Array[Double]],
    innerToData: (Double, PrimaryIsoTriangle) => Unit,
    mapABOBtoDATA: (Double, PrimaryIsoTriangle) => Unit,
    mapBAOAtoDATA: (Double, PrimaryIsoTriangle) => Unit,
    mapOBOAtoDATA: (Double, PrimaryIsoTriangle) => Unit,
    name: String,
    orderData: PrimaryIsoTriangle => Unit,
    poleNodes: Double,
    setOrder: (Double, js.Array[Double]) => js.Array[Double],
    sharedNodes: Double,
    toGoldbergPolyhedronData: () => PolyhedronData,
    vertex: js.Array[js.Array[Double]]
  ): GeodesicData = {
    val __obj = js.Dynamic.literal(adjacentFaces = adjacentFaces.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], edgematch = edgematch.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], innerToData = js.Any.fromFunction2(innerToData), mapABOBtoDATA = js.Any.fromFunction2(mapABOBtoDATA), mapBAOAtoDATA = js.Any.fromFunction2(mapBAOAtoDATA), mapOBOAtoDATA = js.Any.fromFunction2(mapOBOAtoDATA), name = name.asInstanceOf[js.Any], orderData = js.Any.fromFunction1(orderData), poleNodes = poleNodes.asInstanceOf[js.Any], setOrder = js.Any.fromFunction2(setOrder), sharedNodes = sharedNodes.asInstanceOf[js.Any], toGoldbergPolyhedronData = js.Any.fromFunction0(toGoldbergPolyhedronData), vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeodesicData]
  }
  
  extension [Self <: GeodesicData](x: Self) {
    
    inline def setAdjacentFaces(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "adjacentFaces", value.asInstanceOf[js.Any])
    
    inline def setAdjacentFacesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "adjacentFaces", js.Array(value*))
    
    inline def setInnerToData(value: (Double, PrimaryIsoTriangle) => Unit): Self = StObject.set(x, "innerToData", js.Any.fromFunction2(value))
    
    inline def setMapABOBtoDATA(value: (Double, PrimaryIsoTriangle) => Unit): Self = StObject.set(x, "mapABOBtoDATA", js.Any.fromFunction2(value))
    
    inline def setMapBAOAtoDATA(value: (Double, PrimaryIsoTriangle) => Unit): Self = StObject.set(x, "mapBAOAtoDATA", js.Any.fromFunction2(value))
    
    inline def setMapOBOAtoDATA(value: (Double, PrimaryIsoTriangle) => Unit): Self = StObject.set(x, "mapOBOAtoDATA", js.Any.fromFunction2(value))
    
    inline def setOrderData(value: PrimaryIsoTriangle => Unit): Self = StObject.set(x, "orderData", js.Any.fromFunction1(value))
    
    inline def setPoleNodes(value: Double): Self = StObject.set(x, "poleNodes", value.asInstanceOf[js.Any])
    
    inline def setSetOrder(value: (Double, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "setOrder", js.Any.fromFunction2(value))
    
    inline def setSharedNodes(value: Double): Self = StObject.set(x, "sharedNodes", value.asInstanceOf[js.Any])
    
    inline def setToGoldbergPolyhedronData(value: () => PolyhedronData): Self = StObject.set(x, "toGoldbergPolyhedronData", js.Any.fromFunction0(value))
  }
}
