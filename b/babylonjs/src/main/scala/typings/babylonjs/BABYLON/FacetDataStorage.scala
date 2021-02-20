package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Ind
import typings.babylonjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait FacetDataStorage extends StObject {
  
  var bbSize: Vector3 = js.native
  
  var depthSortedFacets: js.Array[Ind] = js.native
  
  var depthSortedIndices: IndicesArray = js.native
  
  var facetDataEnabled: Boolean = js.native
  
  var facetDepthSort: Boolean = js.native
  
  var facetDepthSortEnabled: Boolean = js.native
  
  var facetDepthSortFrom: Vector3 = js.native
  
  def facetDepthSortFunction(f1: Ind, f2: Ind): Double = js.native
  
  var facetDepthSortOrigin: Vector3 = js.native
  
  var facetNb: Double = js.native
  
  var facetNormals: js.Array[Vector3] = js.native
  
  var facetParameters: js.Any = js.native
  
  var facetPartitioning: js.Array[js.Array[Double]] = js.native
  
  var facetPositions: js.Array[Vector3] = js.native
  
  var invertedMatrix: Matrix = js.native
  
  var partitioningBBoxRatio: Double = js.native
  
  var partitioningSubdivisions: Double = js.native
  
  var subDiv: X = js.native
}
object FacetDataStorage {
  
  @scala.inline
  def apply(
    bbSize: Vector3,
    depthSortedFacets: js.Array[Ind],
    depthSortedIndices: IndicesArray,
    facetDataEnabled: Boolean,
    facetDepthSort: Boolean,
    facetDepthSortEnabled: Boolean,
    facetDepthSortFrom: Vector3,
    facetDepthSortFunction: (Ind, Ind) => Double,
    facetDepthSortOrigin: Vector3,
    facetNb: Double,
    facetNormals: js.Array[Vector3],
    facetParameters: js.Any,
    facetPartitioning: js.Array[js.Array[Double]],
    facetPositions: js.Array[Vector3],
    invertedMatrix: Matrix,
    partitioningBBoxRatio: Double,
    partitioningSubdivisions: Double,
    subDiv: X
  ): FacetDataStorage = {
    val __obj = js.Dynamic.literal(bbSize = bbSize.asInstanceOf[js.Any], depthSortedFacets = depthSortedFacets.asInstanceOf[js.Any], depthSortedIndices = depthSortedIndices.asInstanceOf[js.Any], facetDataEnabled = facetDataEnabled.asInstanceOf[js.Any], facetDepthSort = facetDepthSort.asInstanceOf[js.Any], facetDepthSortEnabled = facetDepthSortEnabled.asInstanceOf[js.Any], facetDepthSortFrom = facetDepthSortFrom.asInstanceOf[js.Any], facetDepthSortFunction = js.Any.fromFunction2(facetDepthSortFunction), facetDepthSortOrigin = facetDepthSortOrigin.asInstanceOf[js.Any], facetNb = facetNb.asInstanceOf[js.Any], facetNormals = facetNormals.asInstanceOf[js.Any], facetParameters = facetParameters.asInstanceOf[js.Any], facetPartitioning = facetPartitioning.asInstanceOf[js.Any], facetPositions = facetPositions.asInstanceOf[js.Any], invertedMatrix = invertedMatrix.asInstanceOf[js.Any], partitioningBBoxRatio = partitioningBBoxRatio.asInstanceOf[js.Any], partitioningSubdivisions = partitioningSubdivisions.asInstanceOf[js.Any], subDiv = subDiv.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetDataStorage]
  }
  
  @scala.inline
  implicit class FacetDataStorageMutableBuilder[Self <: FacetDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBbSize(value: Vector3): Self = StObject.set(x, "bbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSortedFacets(value: js.Array[Ind]): Self = StObject.set(x, "depthSortedFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSortedFacetsVarargs(value: Ind*): Self = StObject.set(x, "depthSortedFacets", js.Array(value :_*))
    
    @scala.inline
    def setDepthSortedIndices(value: IndicesArray): Self = StObject.set(x, "depthSortedIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSortedIndicesVarargs(value: Double*): Self = StObject.set(x, "depthSortedIndices", js.Array(value :_*))
    
    @scala.inline
    def setFacetDataEnabled(value: Boolean): Self = StObject.set(x, "facetDataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetDepthSort(value: Boolean): Self = StObject.set(x, "facetDepthSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetDepthSortEnabled(value: Boolean): Self = StObject.set(x, "facetDepthSortEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetDepthSortFrom(value: Vector3): Self = StObject.set(x, "facetDepthSortFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetDepthSortFunction(value: (Ind, Ind) => Double): Self = StObject.set(x, "facetDepthSortFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFacetDepthSortOrigin(value: Vector3): Self = StObject.set(x, "facetDepthSortOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNormals(value: js.Array[Vector3]): Self = StObject.set(x, "facetNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNormalsVarargs(value: Vector3*): Self = StObject.set(x, "facetNormals", js.Array(value :_*))
    
    @scala.inline
    def setFacetParameters(value: js.Any): Self = StObject.set(x, "facetParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetPartitioning(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "facetPartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetPartitioningVarargs(value: js.Array[Double]*): Self = StObject.set(x, "facetPartitioning", js.Array(value :_*))
    
    @scala.inline
    def setFacetPositions(value: js.Array[Vector3]): Self = StObject.set(x, "facetPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetPositionsVarargs(value: Vector3*): Self = StObject.set(x, "facetPositions", js.Array(value :_*))
    
    @scala.inline
    def setInvertedMatrix(value: Matrix): Self = StObject.set(x, "invertedMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitioningBBoxRatio(value: Double): Self = StObject.set(x, "partitioningBBoxRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitioningSubdivisions(value: Double): Self = StObject.set(x, "partitioningSubdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDiv(value: X): Self = StObject.set(x, "subDiv", value.asInstanceOf[js.Any])
  }
}
