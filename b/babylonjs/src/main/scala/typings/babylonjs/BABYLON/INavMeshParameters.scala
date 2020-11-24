package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavMeshParameters extends js.Object {
  
  /**
    * The y-axis cell size to use for fields. [Limit: > 0] [Units: wu]
    */
  var ch: Double = js.native
  
  /**
    * The xz-plane cell size to use for fields. [Limit: > 0] [Units: wu]
    */
  var cs: Double = js.native
  
  /**
    * Sets the sampling distance to use when generating the detail mesh.
    * (For height detail only.) [Limits: 0 or >= 0.9] [Units: wu]
    */
  var detailSampleDist: Double = js.native
  
  /**
    * The maximum distance the detail mesh surface should deviate from heightfield
    * data. (For height detail only.) [Limit: >=0] [Units: wu]
    */
  var detailSampleMaxError: Double = js.native
  
  /**
    * The maximum allowed length for contour edges along the border of the mesh. [Limit: >=0] [Units: vx]
    */
  var maxEdgeLen: Double = js.native
  
  /**
    * The maximum distance a simplfied contour's border edges should deviate
    * the original raw contour. [Limit: >=0] [Units: vx]
    */
  var maxSimplificationError: Double = js.native
  
  /**
    * The maximum number of vertices allowed for polygons generated during the
    * contour to polygon conversion process. [Limit: >= 3]
    */
  var maxVertsPerPoly: Double = js.native
  
  /**
    * Any regions with a span count smaller than this value will, if possible,
    * be merged with larger regions. [Limit: >=0] [Units: vx]
    */
  var mergeRegionArea: Double = js.native
  
  /**
    * The minimum number of cells allowed to form isolated island areas. [Limit: >=0] [Units: vx]
    */
  var minRegionArea: Double = js.native
  
  /**
    * Maximum ledge height that is considered to still be traversable. [Limit: >=0] [Units: vx]
    */
  var walkableClimb: Double = js.native
  
  /**
    * Minimum floor to 'ceiling' height that will still allow the floor area to
    * be considered walkable. [Limit: >= 3] [Units: vx]
    */
  var walkableHeight: Double = js.native
  
  /**
    * The distance to erode/shrink the walkable area of the heightfield away from
    * obstructions.  [Limit: >=0] [Units: vx]
    */
  var walkableRadius: Double = js.native
  
  /**
    * The maximum slope that is considered walkable. [Limits: 0 <= value < 90] [Units: Degrees]
    */
  var walkableSlopeAngle: Double = js.native
}
object INavMeshParameters {
  
  @scala.inline
  def apply(
    ch: Double,
    cs: Double,
    detailSampleDist: Double,
    detailSampleMaxError: Double,
    maxEdgeLen: Double,
    maxSimplificationError: Double,
    maxVertsPerPoly: Double,
    mergeRegionArea: Double,
    minRegionArea: Double,
    walkableClimb: Double,
    walkableHeight: Double,
    walkableRadius: Double,
    walkableSlopeAngle: Double
  ): INavMeshParameters = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], detailSampleDist = detailSampleDist.asInstanceOf[js.Any], detailSampleMaxError = detailSampleMaxError.asInstanceOf[js.Any], maxEdgeLen = maxEdgeLen.asInstanceOf[js.Any], maxSimplificationError = maxSimplificationError.asInstanceOf[js.Any], maxVertsPerPoly = maxVertsPerPoly.asInstanceOf[js.Any], mergeRegionArea = mergeRegionArea.asInstanceOf[js.Any], minRegionArea = minRegionArea.asInstanceOf[js.Any], walkableClimb = walkableClimb.asInstanceOf[js.Any], walkableHeight = walkableHeight.asInstanceOf[js.Any], walkableRadius = walkableRadius.asInstanceOf[js.Any], walkableSlopeAngle = walkableSlopeAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavMeshParameters]
  }
  
  @scala.inline
  implicit class INavMeshParametersOps[Self <: INavMeshParameters] (val x: Self) extends AnyVal {
    
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
    def setCh(value: Double): Self = this.set("ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCs(value: Double): Self = this.set("cs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailSampleDist(value: Double): Self = this.set("detailSampleDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailSampleMaxError(value: Double): Self = this.set("detailSampleMaxError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEdgeLen(value: Double): Self = this.set("maxEdgeLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSimplificationError(value: Double): Self = this.set("maxSimplificationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVertsPerPoly(value: Double): Self = this.set("maxVertsPerPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeRegionArea(value: Double): Self = this.set("mergeRegionArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRegionArea(value: Double): Self = this.set("minRegionArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkableClimb(value: Double): Self = this.set("walkableClimb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkableHeight(value: Double): Self = this.set("walkableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkableRadius(value: Double): Self = this.set("walkableRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkableSlopeAngle(value: Double): Self = this.set("walkableSlopeAngle", value.asInstanceOf[js.Any])
  }
}
