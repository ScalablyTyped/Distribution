package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BInfo extends StObject {
  
  var bInfo: js.UndefOr[js.Any] = js.native
  
  var bbSize: js.UndefOr[Vector3] = js.native
  
  var depthSort: js.UndefOr[Boolean] = js.native
  
  var depthSortedFacets: js.UndefOr[js.Any] = js.native
  
  var distanceTo: js.UndefOr[Vector3] = js.native
  
  var facetNormals: js.UndefOr[js.Any] = js.native
  
  var facetPartitioning: js.UndefOr[js.Any] = js.native
  
  var facetPositions: js.UndefOr[js.Any] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var subDiv: js.UndefOr[js.Any] = js.native
  
  var useRightHandedSystem: js.UndefOr[Boolean] = js.native
}
object BInfo {
  
  @scala.inline
  def apply(): BInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BInfo]
  }
  
  @scala.inline
  implicit class BInfoMutableBuilder[Self <: BInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBInfo(value: js.Any): Self = StObject.set(x, "bInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBInfoUndefined: Self = StObject.set(x, "bInfo", js.undefined)
    
    @scala.inline
    def setBbSize(value: Vector3): Self = StObject.set(x, "bbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbSizeUndefined: Self = StObject.set(x, "bbSize", js.undefined)
    
    @scala.inline
    def setDepthSort(value: Boolean): Self = StObject.set(x, "depthSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSortUndefined: Self = StObject.set(x, "depthSort", js.undefined)
    
    @scala.inline
    def setDepthSortedFacets(value: js.Any): Self = StObject.set(x, "depthSortedFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSortedFacetsUndefined: Self = StObject.set(x, "depthSortedFacets", js.undefined)
    
    @scala.inline
    def setDistanceTo(value: Vector3): Self = StObject.set(x, "distanceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceToUndefined: Self = StObject.set(x, "distanceTo", js.undefined)
    
    @scala.inline
    def setFacetNormals(value: js.Any): Self = StObject.set(x, "facetNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNormalsUndefined: Self = StObject.set(x, "facetNormals", js.undefined)
    
    @scala.inline
    def setFacetPartitioning(value: js.Any): Self = StObject.set(x, "facetPartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetPartitioningUndefined: Self = StObject.set(x, "facetPartitioning", js.undefined)
    
    @scala.inline
    def setFacetPositions(value: js.Any): Self = StObject.set(x, "facetPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetPositionsUndefined: Self = StObject.set(x, "facetPositions", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setSubDiv(value: js.Any): Self = StObject.set(x, "subDiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDivUndefined: Self = StObject.set(x, "subDiv", js.undefined)
    
    @scala.inline
    def setUseRightHandedSystem(value: Boolean): Self = StObject.set(x, "useRightHandedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRightHandedSystemUndefined: Self = StObject.set(x, "useRightHandedSystem", js.undefined)
  }
}
