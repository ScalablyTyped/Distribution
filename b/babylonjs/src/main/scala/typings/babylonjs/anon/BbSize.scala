package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BbSize extends js.Object {
  
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
object BbSize {
  
  @scala.inline
  def apply(): BbSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BbSize]
  }
  
  @scala.inline
  implicit class BbSizeOps[Self <: BbSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBInfo(value: js.Any): Self = this.set("bInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBInfo: Self = this.set("bInfo", js.undefined)
    
    @scala.inline
    def setBbSize(value: Vector3): Self = this.set("bbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbSize: Self = this.set("bbSize", js.undefined)
    
    @scala.inline
    def setDepthSort(value: Boolean): Self = this.set("depthSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthSort: Self = this.set("depthSort", js.undefined)
    
    @scala.inline
    def setDepthSortedFacets(value: js.Any): Self = this.set("depthSortedFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthSortedFacets: Self = this.set("depthSortedFacets", js.undefined)
    
    @scala.inline
    def setDistanceTo(value: Vector3): Self = this.set("distanceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceTo: Self = this.set("distanceTo", js.undefined)
    
    @scala.inline
    def setFacetNormals(value: js.Any): Self = this.set("facetNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetNormals: Self = this.set("facetNormals", js.undefined)
    
    @scala.inline
    def setFacetPartitioning(value: js.Any): Self = this.set("facetPartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetPartitioning: Self = this.set("facetPartitioning", js.undefined)
    
    @scala.inline
    def setFacetPositions(value: js.Any): Self = this.set("facetPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetPositions: Self = this.set("facetPositions", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setSubDiv(value: js.Any): Self = this.set("subDiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubDiv: Self = this.set("subDiv", js.undefined)
    
    @scala.inline
    def setUseRightHandedSystem(value: Boolean): Self = this.set("useRightHandedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRightHandedSystem: Self = this.set("useRightHandedSystem", js.undefined)
  }
}
