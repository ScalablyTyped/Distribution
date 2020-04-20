package typings.babylonjs.abstractMeshMod

import typings.babylonjs.AnonInd
import typings.babylonjs.AnonX
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.IndicesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait FacetDataStorage extends js.Object {
  var bbSize: Vector3
  var depthSortedFacets: js.Array[AnonInd]
  var depthSortedIndices: IndicesArray
  var facetDataEnabled: Boolean
  var facetDepthSort: Boolean
  var facetDepthSortEnabled: Boolean
  var facetDepthSortFrom: Vector3
  var facetDepthSortOrigin: Vector3
  var facetNb: Double
  var facetNormals: js.Array[Vector3]
  var facetParameters: js.Any
  var facetPartitioning: js.Array[js.Array[Double]]
  var facetPositions: js.Array[Vector3]
  var invertedMatrix: Matrix
  var partitioningBBoxRatio: Double
  var partitioningSubdivisions: Double
  var subDiv: AnonX
  def facetDepthSortFunction(f1: AnonInd, f2: AnonInd): Double
}

object FacetDataStorage {
  @scala.inline
  def apply(
    bbSize: Vector3,
    depthSortedFacets: js.Array[AnonInd],
    depthSortedIndices: IndicesArray,
    facetDataEnabled: Boolean,
    facetDepthSort: Boolean,
    facetDepthSortEnabled: Boolean,
    facetDepthSortFrom: Vector3,
    facetDepthSortFunction: (AnonInd, AnonInd) => Double,
    facetDepthSortOrigin: Vector3,
    facetNb: Double,
    facetNormals: js.Array[Vector3],
    facetParameters: js.Any,
    facetPartitioning: js.Array[js.Array[Double]],
    facetPositions: js.Array[Vector3],
    invertedMatrix: Matrix,
    partitioningBBoxRatio: Double,
    partitioningSubdivisions: Double,
    subDiv: AnonX
  ): FacetDataStorage = {
    val __obj = js.Dynamic.literal(bbSize = bbSize.asInstanceOf[js.Any], depthSortedFacets = depthSortedFacets.asInstanceOf[js.Any], depthSortedIndices = depthSortedIndices.asInstanceOf[js.Any], facetDataEnabled = facetDataEnabled.asInstanceOf[js.Any], facetDepthSort = facetDepthSort.asInstanceOf[js.Any], facetDepthSortEnabled = facetDepthSortEnabled.asInstanceOf[js.Any], facetDepthSortFrom = facetDepthSortFrom.asInstanceOf[js.Any], facetDepthSortFunction = js.Any.fromFunction2(facetDepthSortFunction), facetDepthSortOrigin = facetDepthSortOrigin.asInstanceOf[js.Any], facetNb = facetNb.asInstanceOf[js.Any], facetNormals = facetNormals.asInstanceOf[js.Any], facetParameters = facetParameters.asInstanceOf[js.Any], facetPartitioning = facetPartitioning.asInstanceOf[js.Any], facetPositions = facetPositions.asInstanceOf[js.Any], invertedMatrix = invertedMatrix.asInstanceOf[js.Any], partitioningBBoxRatio = partitioningBBoxRatio.asInstanceOf[js.Any], partitioningSubdivisions = partitioningSubdivisions.asInstanceOf[js.Any], subDiv = subDiv.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetDataStorage]
  }
}

