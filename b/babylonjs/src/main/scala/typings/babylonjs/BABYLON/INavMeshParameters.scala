package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavMeshParameters extends StObject {
  
  /**
    * The size of the non-navigable border around the heightfield.
    */
  var borderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The y-axis cell size to use for fields. [Limit: > 0] [Units: wu]
    */
  var ch: Double
  
  /**
    * The xz-plane cell size to use for fields. [Limit: > 0] [Units: wu]
    */
  var cs: Double
  
  /**
    * Sets the sampling distance to use when generating the detail mesh.
    * (For height detail only.) [Limits: 0 or >= 0.9] [Units: wu]
    */
  var detailSampleDist: Double
  
  /**
    * The maximum distance the detail mesh surface should deviate from heightfield
    * data. (For height detail only.) [Limit: >=0] [Units: wu]
    */
  var detailSampleMaxError: Double
  
  /**
    * The maximum allowed length for contour edges along the border of the mesh. [Limit: >=0] [Units: vx]
    */
  var maxEdgeLen: Double
  
  /**
    * The maximum distance a simplified contour's border edges should deviate
    * the original raw contour. [Limit: >=0] [Units: vx]
    */
  var maxSimplificationError: Double
  
  /**
    * The maximum number of vertices allowed for polygons generated during the
    * contour to polygon conversion process. [Limit: >= 3]
    */
  var maxVertsPerPoly: Double
  
  /**
    * Any regions with a span count smaller than this value will, if possible,
    * be merged with larger regions. [Limit: >=0] [Units: vx]
    */
  var mergeRegionArea: Double
  
  /**
    * The minimum number of cells allowed to form isolated island areas. [Limit: >=0] [Units: vx]
    */
  var minRegionArea: Double
  
  /**
    * If using obstacles, the navmesh must be subdivided internaly by tiles.
    * This member defines the tile cube side length in world units.
    * If no obstacles are needed, leave it undefined or 0.
    */
  var tileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum ledge height that is considered to still be traversable. [Limit: >=0] [Units: vx]
    */
  var walkableClimb: Double
  
  /**
    * Minimum floor to 'ceiling' height that will still allow the floor area to
    * be considered walkable. [Limit: >= 3] [Units: vx]
    */
  var walkableHeight: Double
  
  /**
    * The distance to erode/shrink the walkable area of the heightfield away from
    * obstructions.  [Limit: >=0] [Units: vx]
    */
  var walkableRadius: Double
  
  /**
    * The maximum slope that is considered walkable. [Limits: 0 <= value < 90] [Units: Degrees]
    */
  var walkableSlopeAngle: Double
}
object INavMeshParameters {
  
  inline def apply(
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
  
  extension [Self <: INavMeshParameters](x: Self) {
    
    inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
    
    inline def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
    
    inline def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setCs(value: Double): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    inline def setDetailSampleDist(value: Double): Self = StObject.set(x, "detailSampleDist", value.asInstanceOf[js.Any])
    
    inline def setDetailSampleMaxError(value: Double): Self = StObject.set(x, "detailSampleMaxError", value.asInstanceOf[js.Any])
    
    inline def setMaxEdgeLen(value: Double): Self = StObject.set(x, "maxEdgeLen", value.asInstanceOf[js.Any])
    
    inline def setMaxSimplificationError(value: Double): Self = StObject.set(x, "maxSimplificationError", value.asInstanceOf[js.Any])
    
    inline def setMaxVertsPerPoly(value: Double): Self = StObject.set(x, "maxVertsPerPoly", value.asInstanceOf[js.Any])
    
    inline def setMergeRegionArea(value: Double): Self = StObject.set(x, "mergeRegionArea", value.asInstanceOf[js.Any])
    
    inline def setMinRegionArea(value: Double): Self = StObject.set(x, "minRegionArea", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setWalkableClimb(value: Double): Self = StObject.set(x, "walkableClimb", value.asInstanceOf[js.Any])
    
    inline def setWalkableHeight(value: Double): Self = StObject.set(x, "walkableHeight", value.asInstanceOf[js.Any])
    
    inline def setWalkableRadius(value: Double): Self = StObject.set(x, "walkableRadius", value.asInstanceOf[js.Any])
    
    inline def setWalkableSlopeAngle(value: Double): Self = StObject.set(x, "walkableSlopeAngle", value.asInstanceOf[js.Any])
  }
}
