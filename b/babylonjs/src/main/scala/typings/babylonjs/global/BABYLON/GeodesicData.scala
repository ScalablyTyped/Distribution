package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GeodesicData")
@js.native
open class GeodesicData ()
  extends StObject
     with typings.babylonjs.BABYLON.GeodesicData {
  
  /**
    * @internal
    */
  /* CompleteClass */
  var adjacentFaces: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var category: String = js.native
  
  /* CompleteClass */
  var edgematch: js.Array[js.Array[Double | String]] = js.native
  
  /* CompleteClass */
  var face: js.Array[js.Array[Double]] = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def innerToData(face: Double, primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): Unit = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def mapABOBtoDATA(faceNb: Double, primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): Unit = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def mapBAOAtoDATA(faceNb: Double, primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): Unit = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def mapOBOAtoDATA(faceNb: Double, primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): Unit = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def orderData(primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): Unit = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var poleNodes: Double = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def setOrder(m: Double, faces: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var sharedNodes: Double = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def toGoldbergPolyhedronData(): typings.babylonjs.BABYLON.PolyhedronData = js.native
  
  /* CompleteClass */
  var vertex: js.Array[js.Array[Double]] = js.native
}
/* static members */
object GeodesicData {
  
  @JSGlobal("BABYLON.GeodesicData")
  @js.native
  val ^ : js.Any = js.native
  
  /**Builds the data for a Geodesic Polyhedron from a primary triangle
    * @param primTri the primary triangle
    * @internal
    */
  inline def BuildGeodesicData(primTri: typings.babylonjs.BABYLON.PrimaryIsoTriangle): typings.babylonjs.BABYLON.GeodesicData = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildGeodesicData")(primTri.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.GeodesicData]
}
