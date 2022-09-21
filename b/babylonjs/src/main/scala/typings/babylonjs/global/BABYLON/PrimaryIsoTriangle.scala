package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON._PrimaryIsoTriangle")
@js.native
open class PrimaryIsoTriangle ()
  extends StObject
     with typings.babylonjs.BABYLON.PrimaryIsoTriangle {
  
  /* CompleteClass */
  var IDATA: typings.babylonjs.BABYLON.PolyhedronData = js.native
  
  /* CompleteClass */
  override def MapToFace(faceNb: Double, geodesicData: typings.babylonjs.BABYLON.PolyhedronData): Unit = js.native
  
  /**Creates a primary triangle
    * @param m
    * @param n
    * @hidden
    */
  /* CompleteClass */
  override def build(m: Double, n: Double): this.type = js.native
  
  /* CompleteClass */
  override def calcCoeffs(): Unit = js.native
  
  /* CompleteClass */
  var cartesian: js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  
  /* CompleteClass */
  var closestTo: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var coau: Double = js.native
  
  /* CompleteClass */
  var coav: Double = js.native
  
  /* CompleteClass */
  var cobu: Double = js.native
  
  /* CompleteClass */
  var cobv: Double = js.native
  
  /* CompleteClass */
  override def createInnerFacets(): Unit = js.native
  
  /* CompleteClass */
  override def edgeVecsABOB(): Unit = js.native
  
  /* CompleteClass */
  var innerFacets: js.Array[js.Array[String]] = js.native
  
  /* CompleteClass */
  var isoVecsABOB: js.Array[js.Array[typings.babylonjs.BABYLON.IsoVector]] = js.native
  
  /* CompleteClass */
  var isoVecsBAOA: js.Array[js.Array[typings.babylonjs.BABYLON.IsoVector]] = js.native
  
  /* CompleteClass */
  var isoVecsOBOA: js.Array[js.Array[typings.babylonjs.BABYLON.IsoVector]] = js.native
  
  /* CompleteClass */
  var m: Double = js.native
  
  /* CompleteClass */
  override def mapABOBtoBAOA(): Unit = js.native
  
  /* CompleteClass */
  override def mapABOBtoOBOA(): Unit = js.native
  
  /* CompleteClass */
  var max: js.Array[Double] = js.native
  
  /* CompleteClass */
  var min: js.Array[Double] = js.native
  
  /* CompleteClass */
  var n: Double = js.native
  
  /**
    * Creates the PrimaryIsoTriangle Triangle OAB
    * @param m an integer
    * @param n an integer
    */
  /* CompleteClass */
  override def setIndices(): Unit = js.native
  
  /* CompleteClass */
  var vecToidx: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
  /* CompleteClass */
  var vertByDist: org.scalablytyped.runtime.StringDictionary[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var vertexTypes: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var vertices: js.Array[typings.babylonjs.BABYLON.IsoVector] = js.native
}
