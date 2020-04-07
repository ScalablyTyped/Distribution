package typings.babylonjs.BABYLON

import typings.babylonjs.AnonInd
import typings.babylonjs.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON._FacetDataStorage")
@js.native
class FacetDataStorage () extends js.Object {
  var bbSize: Vector3 = js.native
  var depthSortedFacets: js.Array[AnonInd] = js.native
  var depthSortedIndices: IndicesArray = js.native
  var facetDataEnabled: Boolean = js.native
  var facetDepthSort: Boolean = js.native
  var facetDepthSortEnabled: Boolean = js.native
  var facetDepthSortFrom: Vector3 = js.native
  var facetDepthSortOrigin: Vector3 = js.native
  var facetNb: Double = js.native
  var facetNormals: js.Array[Vector3] = js.native
  var facetParameters: js.Any = js.native
  var facetPartitioning: js.Array[js.Array[Double]] = js.native
  var facetPositions: js.Array[Vector3] = js.native
  var invertedMatrix: Matrix = js.native
  var partitioningBBoxRatio: Double = js.native
  var partitioningSubdivisions: Double = js.native
  var subDiv: AnonX = js.native
  def facetDepthSortFunction(f1: AnonInd, f2: AnonInd): Double = js.native
}

