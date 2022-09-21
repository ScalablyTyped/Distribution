package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BbSize extends StObject {
  
  var bInfo: js.UndefOr[Any] = js.undefined
  
  var bbSize: js.UndefOr[Vector3] = js.undefined
  
  var depthSort: js.UndefOr[Boolean] = js.undefined
  
  var depthSortedFacets: js.UndefOr[Any] = js.undefined
  
  var distanceTo: js.UndefOr[Vector3] = js.undefined
  
  var facetNormals: js.UndefOr[Any] = js.undefined
  
  var facetPartitioning: js.UndefOr[Any] = js.undefined
  
  var facetPositions: js.UndefOr[Any] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var subDiv: js.UndefOr[Any] = js.undefined
  
  var useRightHandedSystem: js.UndefOr[Boolean] = js.undefined
}
object BbSize {
  
  inline def apply(): BbSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BbSize]
  }
  
  extension [Self <: BbSize](x: Self) {
    
    inline def setBInfo(value: Any): Self = StObject.set(x, "bInfo", value.asInstanceOf[js.Any])
    
    inline def setBInfoUndefined: Self = StObject.set(x, "bInfo", js.undefined)
    
    inline def setBbSize(value: Vector3): Self = StObject.set(x, "bbSize", value.asInstanceOf[js.Any])
    
    inline def setBbSizeUndefined: Self = StObject.set(x, "bbSize", js.undefined)
    
    inline def setDepthSort(value: Boolean): Self = StObject.set(x, "depthSort", value.asInstanceOf[js.Any])
    
    inline def setDepthSortUndefined: Self = StObject.set(x, "depthSort", js.undefined)
    
    inline def setDepthSortedFacets(value: Any): Self = StObject.set(x, "depthSortedFacets", value.asInstanceOf[js.Any])
    
    inline def setDepthSortedFacetsUndefined: Self = StObject.set(x, "depthSortedFacets", js.undefined)
    
    inline def setDistanceTo(value: Vector3): Self = StObject.set(x, "distanceTo", value.asInstanceOf[js.Any])
    
    inline def setDistanceToUndefined: Self = StObject.set(x, "distanceTo", js.undefined)
    
    inline def setFacetNormals(value: Any): Self = StObject.set(x, "facetNormals", value.asInstanceOf[js.Any])
    
    inline def setFacetNormalsUndefined: Self = StObject.set(x, "facetNormals", js.undefined)
    
    inline def setFacetPartitioning(value: Any): Self = StObject.set(x, "facetPartitioning", value.asInstanceOf[js.Any])
    
    inline def setFacetPartitioningUndefined: Self = StObject.set(x, "facetPartitioning", js.undefined)
    
    inline def setFacetPositions(value: Any): Self = StObject.set(x, "facetPositions", value.asInstanceOf[js.Any])
    
    inline def setFacetPositionsUndefined: Self = StObject.set(x, "facetPositions", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setSubDiv(value: Any): Self = StObject.set(x, "subDiv", value.asInstanceOf[js.Any])
    
    inline def setSubDivUndefined: Self = StObject.set(x, "subDiv", js.undefined)
    
    inline def setUseRightHandedSystem(value: Boolean): Self = StObject.set(x, "useRightHandedSystem", value.asInstanceOf[js.Any])
    
    inline def setUseRightHandedSystemUndefined: Self = StObject.set(x, "useRightHandedSystem", js.undefined)
  }
}
