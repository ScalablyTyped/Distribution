package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Ind
import typings.babylonjs.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait FacetDataStorage extends StObject {
  
  var bbSize: Vector3
  
  var depthSortedFacets: js.Array[Ind]
  
  var depthSortedIndices: IndicesArray
  
  var facetDataEnabled: Boolean
  
  var facetDepthSort: Boolean
  
  var facetDepthSortEnabled: Boolean
  
  var facetDepthSortFrom: Vector3
  
  def facetDepthSortFunction(f1: Ind, f2: Ind): Double
  
  var facetDepthSortOrigin: Vector3
  
  var facetNb: Double
  
  var facetNormals: js.Array[Vector3]
  
  var facetParameters: Any
  
  var facetPartitioning: js.Array[js.Array[Double]]
  
  var facetPositions: js.Array[Vector3]
  
  var invertedMatrix: Matrix
  
  var partitioningBBoxRatio: Double
  
  var partitioningSubdivisions: Double
  
  var subDiv: Y
}
object FacetDataStorage {
  
  inline def apply(
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
    facetParameters: Any,
    facetPartitioning: js.Array[js.Array[Double]],
    facetPositions: js.Array[Vector3],
    invertedMatrix: Matrix,
    partitioningBBoxRatio: Double,
    partitioningSubdivisions: Double,
    subDiv: Y
  ): FacetDataStorage = {
    val __obj = js.Dynamic.literal(bbSize = bbSize.asInstanceOf[js.Any], depthSortedFacets = depthSortedFacets.asInstanceOf[js.Any], depthSortedIndices = depthSortedIndices.asInstanceOf[js.Any], facetDataEnabled = facetDataEnabled.asInstanceOf[js.Any], facetDepthSort = facetDepthSort.asInstanceOf[js.Any], facetDepthSortEnabled = facetDepthSortEnabled.asInstanceOf[js.Any], facetDepthSortFrom = facetDepthSortFrom.asInstanceOf[js.Any], facetDepthSortFunction = js.Any.fromFunction2(facetDepthSortFunction), facetDepthSortOrigin = facetDepthSortOrigin.asInstanceOf[js.Any], facetNb = facetNb.asInstanceOf[js.Any], facetNormals = facetNormals.asInstanceOf[js.Any], facetParameters = facetParameters.asInstanceOf[js.Any], facetPartitioning = facetPartitioning.asInstanceOf[js.Any], facetPositions = facetPositions.asInstanceOf[js.Any], invertedMatrix = invertedMatrix.asInstanceOf[js.Any], partitioningBBoxRatio = partitioningBBoxRatio.asInstanceOf[js.Any], partitioningSubdivisions = partitioningSubdivisions.asInstanceOf[js.Any], subDiv = subDiv.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetDataStorage]
  }
  
  extension [Self <: FacetDataStorage](x: Self) {
    
    inline def setBbSize(value: Vector3): Self = StObject.set(x, "bbSize", value.asInstanceOf[js.Any])
    
    inline def setDepthSortedFacets(value: js.Array[Ind]): Self = StObject.set(x, "depthSortedFacets", value.asInstanceOf[js.Any])
    
    inline def setDepthSortedFacetsVarargs(value: Ind*): Self = StObject.set(x, "depthSortedFacets", js.Array(value*))
    
    inline def setDepthSortedIndices(value: IndicesArray): Self = StObject.set(x, "depthSortedIndices", value.asInstanceOf[js.Any])
    
    inline def setDepthSortedIndicesVarargs(value: Double*): Self = StObject.set(x, "depthSortedIndices", js.Array(value*))
    
    inline def setFacetDataEnabled(value: Boolean): Self = StObject.set(x, "facetDataEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacetDepthSort(value: Boolean): Self = StObject.set(x, "facetDepthSort", value.asInstanceOf[js.Any])
    
    inline def setFacetDepthSortEnabled(value: Boolean): Self = StObject.set(x, "facetDepthSortEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacetDepthSortFrom(value: Vector3): Self = StObject.set(x, "facetDepthSortFrom", value.asInstanceOf[js.Any])
    
    inline def setFacetDepthSortFunction(value: (Ind, Ind) => Double): Self = StObject.set(x, "facetDepthSortFunction", js.Any.fromFunction2(value))
    
    inline def setFacetDepthSortOrigin(value: Vector3): Self = StObject.set(x, "facetDepthSortOrigin", value.asInstanceOf[js.Any])
    
    inline def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
    
    inline def setFacetNormals(value: js.Array[Vector3]): Self = StObject.set(x, "facetNormals", value.asInstanceOf[js.Any])
    
    inline def setFacetNormalsVarargs(value: Vector3*): Self = StObject.set(x, "facetNormals", js.Array(value*))
    
    inline def setFacetParameters(value: Any): Self = StObject.set(x, "facetParameters", value.asInstanceOf[js.Any])
    
    inline def setFacetPartitioning(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "facetPartitioning", value.asInstanceOf[js.Any])
    
    inline def setFacetPartitioningVarargs(value: js.Array[Double]*): Self = StObject.set(x, "facetPartitioning", js.Array(value*))
    
    inline def setFacetPositions(value: js.Array[Vector3]): Self = StObject.set(x, "facetPositions", value.asInstanceOf[js.Any])
    
    inline def setFacetPositionsVarargs(value: Vector3*): Self = StObject.set(x, "facetPositions", js.Array(value*))
    
    inline def setInvertedMatrix(value: Matrix): Self = StObject.set(x, "invertedMatrix", value.asInstanceOf[js.Any])
    
    inline def setPartitioningBBoxRatio(value: Double): Self = StObject.set(x, "partitioningBBoxRatio", value.asInstanceOf[js.Any])
    
    inline def setPartitioningSubdivisions(value: Double): Self = StObject.set(x, "partitioningSubdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubDiv(value: Y): Self = StObject.set(x, "subDiv", value.asInstanceOf[js.Any])
  }
}
