package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IndicesArray
import typings.babylonjs.anon.Ind
import typings.babylonjs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON._FacetDataStorage")
@js.native
class FacetDataStorage ()
  extends typings.babylonjs.BABYLON.FacetDataStorage {
  /* CompleteClass */
  override var bbSize: typings.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var depthSortedFacets: js.Array[Ind] = js.native
  /* CompleteClass */
  override var depthSortedIndices: IndicesArray = js.native
  /* CompleteClass */
  override var facetDataEnabled: Boolean = js.native
  /* CompleteClass */
  override var facetDepthSort: Boolean = js.native
  /* CompleteClass */
  override var facetDepthSortEnabled: Boolean = js.native
  /* CompleteClass */
  override var facetDepthSortFrom: typings.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var facetDepthSortOrigin: typings.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var facetNb: Double = js.native
  /* CompleteClass */
  override var facetNormals: js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  /* CompleteClass */
  override var facetParameters: js.Any = js.native
  /* CompleteClass */
  override var facetPartitioning: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var facetPositions: js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  /* CompleteClass */
  override var invertedMatrix: typings.babylonjs.BABYLON.Matrix = js.native
  /* CompleteClass */
  override var partitioningBBoxRatio: Double = js.native
  /* CompleteClass */
  override var partitioningSubdivisions: Double = js.native
  /* CompleteClass */
  override var subDiv: X = js.native
  /* CompleteClass */
  override def facetDepthSortFunction(f1: Ind, f2: Ind): Double = js.native
}

