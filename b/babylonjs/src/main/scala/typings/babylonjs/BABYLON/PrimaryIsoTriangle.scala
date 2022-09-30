package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryIsoTriangle extends StObject {
  
  var IDATA: PolyhedronData
  
  def MapToFace(faceNb: Double, geodesicData: PolyhedronData): Unit
  
  /**Creates a primary triangle
    * @internal
    */
  def build(m: Double, n: Double): this.type
  
  def calcCoeffs(): Unit
  
  var cartesian: js.Array[Vector3]
  
  var closestTo: js.Array[js.Array[Double]]
  
  var coau: Double
  
  var coav: Double
  
  var cobu: Double
  
  var cobv: Double
  
  def createInnerFacets(): Unit
  
  def edgeVecsABOB(): Unit
  
  var innerFacets: js.Array[js.Array[String]]
  
  var isoVecsABOB: js.Array[js.Array[IsoVector]]
  
  var isoVecsBAOA: js.Array[js.Array[IsoVector]]
  
  var isoVecsOBOA: js.Array[js.Array[IsoVector]]
  
  var m: Double
  
  def mapABOBtoBAOA(): Unit
  
  def mapABOBtoOBOA(): Unit
  
  var max: js.Array[Double]
  
  var min: js.Array[Double]
  
  var n: Double
  
  /**
    * Creates the PrimaryIsoTriangle Triangle OAB
    * @param m an integer
    * @param n an integer
    */
  def setIndices(): Unit
  
  var vecToidx: org.scalablytyped.runtime.StringDictionary[Double]
  
  var vertByDist: org.scalablytyped.runtime.StringDictionary[js.Array[Double]]
  
  var vertexTypes: js.Array[js.Array[Double]]
  
  var vertices: js.Array[IsoVector]
}
object PrimaryIsoTriangle {
  
  inline def apply(
    IDATA: PolyhedronData,
    MapToFace: (Double, PolyhedronData) => Unit,
    build: (Double, Double) => PrimaryIsoTriangle,
    calcCoeffs: () => Unit,
    cartesian: js.Array[Vector3],
    closestTo: js.Array[js.Array[Double]],
    coau: Double,
    coav: Double,
    cobu: Double,
    cobv: Double,
    createInnerFacets: () => Unit,
    edgeVecsABOB: () => Unit,
    innerFacets: js.Array[js.Array[String]],
    isoVecsABOB: js.Array[js.Array[IsoVector]],
    isoVecsBAOA: js.Array[js.Array[IsoVector]],
    isoVecsOBOA: js.Array[js.Array[IsoVector]],
    m: Double,
    mapABOBtoBAOA: () => Unit,
    mapABOBtoOBOA: () => Unit,
    max: js.Array[Double],
    min: js.Array[Double],
    n: Double,
    setIndices: () => Unit,
    vecToidx: org.scalablytyped.runtime.StringDictionary[Double],
    vertByDist: org.scalablytyped.runtime.StringDictionary[js.Array[Double]],
    vertexTypes: js.Array[js.Array[Double]],
    vertices: js.Array[IsoVector]
  ): PrimaryIsoTriangle = {
    val __obj = js.Dynamic.literal(IDATA = IDATA.asInstanceOf[js.Any], MapToFace = js.Any.fromFunction2(MapToFace), build = js.Any.fromFunction2(build), calcCoeffs = js.Any.fromFunction0(calcCoeffs), cartesian = cartesian.asInstanceOf[js.Any], closestTo = closestTo.asInstanceOf[js.Any], coau = coau.asInstanceOf[js.Any], coav = coav.asInstanceOf[js.Any], cobu = cobu.asInstanceOf[js.Any], cobv = cobv.asInstanceOf[js.Any], createInnerFacets = js.Any.fromFunction0(createInnerFacets), edgeVecsABOB = js.Any.fromFunction0(edgeVecsABOB), innerFacets = innerFacets.asInstanceOf[js.Any], isoVecsABOB = isoVecsABOB.asInstanceOf[js.Any], isoVecsBAOA = isoVecsBAOA.asInstanceOf[js.Any], isoVecsOBOA = isoVecsOBOA.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mapABOBtoBAOA = js.Any.fromFunction0(mapABOBtoBAOA), mapABOBtoOBOA = js.Any.fromFunction0(mapABOBtoOBOA), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], setIndices = js.Any.fromFunction0(setIndices), vecToidx = vecToidx.asInstanceOf[js.Any], vertByDist = vertByDist.asInstanceOf[js.Any], vertexTypes = vertexTypes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryIsoTriangle]
  }
  
  extension [Self <: PrimaryIsoTriangle](x: Self) {
    
    inline def setBuild(value: (Double, Double) => PrimaryIsoTriangle): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
    
    inline def setCalcCoeffs(value: () => Unit): Self = StObject.set(x, "calcCoeffs", js.Any.fromFunction0(value))
    
    inline def setCartesian(value: js.Array[Vector3]): Self = StObject.set(x, "cartesian", value.asInstanceOf[js.Any])
    
    inline def setCartesianVarargs(value: Vector3*): Self = StObject.set(x, "cartesian", js.Array(value*))
    
    inline def setClosestTo(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "closestTo", value.asInstanceOf[js.Any])
    
    inline def setClosestToVarargs(value: js.Array[Double]*): Self = StObject.set(x, "closestTo", js.Array(value*))
    
    inline def setCoau(value: Double): Self = StObject.set(x, "coau", value.asInstanceOf[js.Any])
    
    inline def setCoav(value: Double): Self = StObject.set(x, "coav", value.asInstanceOf[js.Any])
    
    inline def setCobu(value: Double): Self = StObject.set(x, "cobu", value.asInstanceOf[js.Any])
    
    inline def setCobv(value: Double): Self = StObject.set(x, "cobv", value.asInstanceOf[js.Any])
    
    inline def setCreateInnerFacets(value: () => Unit): Self = StObject.set(x, "createInnerFacets", js.Any.fromFunction0(value))
    
    inline def setEdgeVecsABOB(value: () => Unit): Self = StObject.set(x, "edgeVecsABOB", js.Any.fromFunction0(value))
    
    inline def setIDATA(value: PolyhedronData): Self = StObject.set(x, "IDATA", value.asInstanceOf[js.Any])
    
    inline def setInnerFacets(value: js.Array[js.Array[String]]): Self = StObject.set(x, "innerFacets", value.asInstanceOf[js.Any])
    
    inline def setInnerFacetsVarargs(value: js.Array[String]*): Self = StObject.set(x, "innerFacets", js.Array(value*))
    
    inline def setIsoVecsABOB(value: js.Array[js.Array[IsoVector]]): Self = StObject.set(x, "isoVecsABOB", value.asInstanceOf[js.Any])
    
    inline def setIsoVecsABOBVarargs(value: js.Array[IsoVector]*): Self = StObject.set(x, "isoVecsABOB", js.Array(value*))
    
    inline def setIsoVecsBAOA(value: js.Array[js.Array[IsoVector]]): Self = StObject.set(x, "isoVecsBAOA", value.asInstanceOf[js.Any])
    
    inline def setIsoVecsBAOAVarargs(value: js.Array[IsoVector]*): Self = StObject.set(x, "isoVecsBAOA", js.Array(value*))
    
    inline def setIsoVecsOBOA(value: js.Array[js.Array[IsoVector]]): Self = StObject.set(x, "isoVecsOBOA", value.asInstanceOf[js.Any])
    
    inline def setIsoVecsOBOAVarargs(value: js.Array[IsoVector]*): Self = StObject.set(x, "isoVecsOBOA", js.Array(value*))
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMapABOBtoBAOA(value: () => Unit): Self = StObject.set(x, "mapABOBtoBAOA", js.Any.fromFunction0(value))
    
    inline def setMapABOBtoOBOA(value: () => Unit): Self = StObject.set(x, "mapABOBtoOBOA", js.Any.fromFunction0(value))
    
    inline def setMapToFace(value: (Double, PolyhedronData) => Unit): Self = StObject.set(x, "MapToFace", js.Any.fromFunction2(value))
    
    inline def setMax(value: js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMin(value: js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value*))
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setSetIndices(value: () => Unit): Self = StObject.set(x, "setIndices", js.Any.fromFunction0(value))
    
    inline def setVecToidx(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = StObject.set(x, "vecToidx", value.asInstanceOf[js.Any])
    
    inline def setVertByDist(value: org.scalablytyped.runtime.StringDictionary[js.Array[Double]]): Self = StObject.set(x, "vertByDist", value.asInstanceOf[js.Any])
    
    inline def setVertexTypes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertexTypes", value.asInstanceOf[js.Any])
    
    inline def setVertexTypesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertexTypes", js.Array(value*))
    
    inline def setVertices(value: js.Array[IsoVector]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: IsoVector*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
