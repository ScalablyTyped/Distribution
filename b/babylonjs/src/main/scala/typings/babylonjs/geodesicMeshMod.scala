package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.mathIsovectorMod.IsoVector
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geodesicMeshMod {
  
  @JSImport("babylonjs/Meshes/geodesicMesh", "GeodesicData")
  @js.native
  open class GeodesicData protected () extends PolyhedronData {
    def this(
      name: String,
      category: String,
      vertex: js.Array[js.Array[Double]],
      face: js.Array[js.Array[Double]]
    ) = this()
    
    /**
      * @internal
      */
    var adjacentFaces: js.Array[js.Array[Double]] = js.native
    
    /**
      * @internal
      */
    def innerToData(face: Double, primTri: PrimaryIsoTriangle): Unit = js.native
    
    /**
      * @internal
      */
    def mapABOBtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit = js.native
    
    /**
      * @internal
      */
    def mapBAOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit = js.native
    
    /**
      * @internal
      */
    def mapOBOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit = js.native
    
    /**
      * @internal
      */
    def orderData(primTri: PrimaryIsoTriangle): Unit = js.native
    
    /**
      * @internal
      */
    var poleNodes: Double = js.native
    
    /**
      * @internal
      */
    def setOrder(m: Double, faces: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * @internal
      */
    var sharedNodes: Double = js.native
    
    /**
      * @internal
      */
    def toGoldbergPolyhedronData(): PolyhedronData = js.native
  }
  /* static members */
  object GeodesicData {
    
    @JSImport("babylonjs/Meshes/geodesicMesh", "GeodesicData")
    @js.native
    val ^ : js.Any = js.native
    
    /**Builds the data for a Geodesic Polyhedron from a primary triangle
      * @param primTri the primary triangle
      * @internal
      */
    inline def BuildGeodesicData(primTri: PrimaryIsoTriangle): GeodesicData = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildGeodesicData")(primTri.asInstanceOf[js.Any]).asInstanceOf[GeodesicData]
  }
  
  @JSImport("babylonjs/Meshes/geodesicMesh", "PolyhedronData")
  @js.native
  open class PolyhedronData protected () extends StObject {
    def this(
      name: String,
      category: String,
      vertex: js.Array[js.Array[Double]],
      face: js.Array[js.Array[Double]]
    ) = this()
    
    var category: String = js.native
    
    var edgematch: js.Array[js.Array[Double | String]] = js.native
    
    var face: js.Array[js.Array[Double]] = js.native
    
    var name: String = js.native
    
    var vertex: js.Array[js.Array[Double]] = js.native
  }
  
  @JSImport("babylonjs/Meshes/geodesicMesh", "_PrimaryIsoTriangle")
  @js.native
  open class PrimaryIsoTriangle () extends StObject {
    
    var IDATA: PolyhedronData = js.native
    
    def MapToFace(faceNb: Double, geodesicData: PolyhedronData): Unit = js.native
    
    /**Creates a primary triangle
      * @internal
      */
    def build(m: Double, n: Double): this.type = js.native
    
    def calcCoeffs(): Unit = js.native
    
    var cartesian: js.Array[Vector3] = js.native
    
    var closestTo: js.Array[js.Array[Double]] = js.native
    
    var coau: Double = js.native
    
    var coav: Double = js.native
    
    var cobu: Double = js.native
    
    var cobv: Double = js.native
    
    def createInnerFacets(): Unit = js.native
    
    def edgeVecsABOB(): Unit = js.native
    
    var innerFacets: js.Array[js.Array[String]] = js.native
    
    var isoVecsABOB: js.Array[js.Array[IsoVector]] = js.native
    
    var isoVecsBAOA: js.Array[js.Array[IsoVector]] = js.native
    
    var isoVecsOBOA: js.Array[js.Array[IsoVector]] = js.native
    
    var m: Double = js.native
    
    def mapABOBtoBAOA(): Unit = js.native
    
    def mapABOBtoOBOA(): Unit = js.native
    
    var max: js.Array[Double] = js.native
    
    var min: js.Array[Double] = js.native
    
    var n: Double = js.native
    
    /**
      * Creates the PrimaryIsoTriangle Triangle OAB
      * @param m an integer
      * @param n an integer
      */
    def setIndices(): Unit = js.native
    
    var vecToidx: StringDictionary[Double] = js.native
    
    var vertByDist: StringDictionary[js.Array[Double]] = js.native
    
    var vertexTypes: js.Array[js.Array[Double]] = js.native
    
    var vertices: js.Array[IsoVector] = js.native
  }
}
