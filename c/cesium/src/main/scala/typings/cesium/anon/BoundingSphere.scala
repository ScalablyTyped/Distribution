package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingSphere extends StObject {
  
  var boundingSphere: typings.cesium.mod.BoundingSphere
  
  var childTileMask: js.UndefOr[Double] = js.undefined
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  
  var eastIndices: js.Array[Double]
  
  var eastSkirtHeight: Double
  
  var encodedNormals: js.UndefOr[Uint8Array] = js.undefined
  
  var horizonOcclusionPoint: Cartesian3
  
  var indices: Uint16Array | Uint32Array
  
  var maximumHeight: Double
  
  var minimumHeight: Double
  
  var northIndices: js.Array[Double]
  
  var northSkirtHeight: Double
  
  var quantizedVertices: Uint16Array
  
  var southIndices: js.Array[Double]
  
  var southSkirtHeight: Double
  
  var waterMask: js.UndefOr[Uint8Array] = js.undefined
  
  var westIndices: js.Array[Double]
  
  var westSkirtHeight: Double
}
object BoundingSphere {
  
  @scala.inline
  def apply(
    boundingSphere: typings.cesium.mod.BoundingSphere,
    eastIndices: js.Array[Double],
    eastSkirtHeight: Double,
    horizonOcclusionPoint: Cartesian3,
    indices: Uint16Array | Uint32Array,
    maximumHeight: Double,
    minimumHeight: Double,
    northIndices: js.Array[Double],
    northSkirtHeight: Double,
    quantizedVertices: Uint16Array,
    southIndices: js.Array[Double],
    southSkirtHeight: Double,
    westIndices: js.Array[Double],
    westSkirtHeight: Double
  ): BoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere.asInstanceOf[js.Any], eastIndices = eastIndices.asInstanceOf[js.Any], eastSkirtHeight = eastSkirtHeight.asInstanceOf[js.Any], horizonOcclusionPoint = horizonOcclusionPoint.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight.asInstanceOf[js.Any], minimumHeight = minimumHeight.asInstanceOf[js.Any], northIndices = northIndices.asInstanceOf[js.Any], northSkirtHeight = northSkirtHeight.asInstanceOf[js.Any], quantizedVertices = quantizedVertices.asInstanceOf[js.Any], southIndices = southIndices.asInstanceOf[js.Any], southSkirtHeight = southSkirtHeight.asInstanceOf[js.Any], westIndices = westIndices.asInstanceOf[js.Any], westSkirtHeight = westSkirtHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingSphere]
  }
  
  @scala.inline
  implicit class BoundingSphereMutableBuilder[Self <: BoundingSphere] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingSphere(value: typings.cesium.mod.BoundingSphere): Self = StObject.set(x, "boundingSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    @scala.inline
    def setEastIndices(value: js.Array[Double]): Self = StObject.set(x, "eastIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEastIndicesVarargs(value: Double*): Self = StObject.set(x, "eastIndices", js.Array(value :_*))
    
    @scala.inline
    def setEastSkirtHeight(value: Double): Self = StObject.set(x, "eastSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedNormals(value: Uint8Array): Self = StObject.set(x, "encodedNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedNormalsUndefined: Self = StObject.set(x, "encodedNormals", js.undefined)
    
    @scala.inline
    def setHorizonOcclusionPoint(value: Cartesian3): Self = StObject.set(x, "horizonOcclusionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: Uint16Array | Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthIndices(value: js.Array[Double]): Self = StObject.set(x, "northIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthIndicesVarargs(value: Double*): Self = StObject.set(x, "northIndices", js.Array(value :_*))
    
    @scala.inline
    def setNorthSkirtHeight(value: Double): Self = StObject.set(x, "northSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantizedVertices(value: Uint16Array): Self = StObject.set(x, "quantizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthIndices(value: js.Array[Double]): Self = StObject.set(x, "southIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthIndicesVarargs(value: Double*): Self = StObject.set(x, "southIndices", js.Array(value :_*))
    
    @scala.inline
    def setSouthSkirtHeight(value: Double): Self = StObject.set(x, "southSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterMask(value: Uint8Array): Self = StObject.set(x, "waterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterMaskUndefined: Self = StObject.set(x, "waterMask", js.undefined)
    
    @scala.inline
    def setWestIndices(value: js.Array[Double]): Self = StObject.set(x, "westIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWestIndicesVarargs(value: Double*): Self = StObject.set(x, "westIndices", js.Array(value :_*))
    
    @scala.inline
    def setWestSkirtHeight(value: Double): Self = StObject.set(x, "westSkirtHeight", value.asInstanceOf[js.Any])
  }
}
