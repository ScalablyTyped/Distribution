package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingSphere extends js.Object {
  
  var boundingSphere: typings.cesium.mod.BoundingSphere = js.native
  
  var childTileMask: js.UndefOr[Double] = js.native
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  
  var eastIndices: js.Array[Double] = js.native
  
  var eastSkirtHeight: Double = js.native
  
  var encodedNormals: js.UndefOr[Uint8Array] = js.native
  
  var horizonOcclusionPoint: Cartesian3 = js.native
  
  var indices: Uint16Array | Uint32Array = js.native
  
  var maximumHeight: Double = js.native
  
  var minimumHeight: Double = js.native
  
  var northIndices: js.Array[Double] = js.native
  
  var northSkirtHeight: Double = js.native
  
  var quantizedVertices: Uint16Array = js.native
  
  var southIndices: js.Array[Double] = js.native
  
  var southSkirtHeight: Double = js.native
  
  var waterMask: js.UndefOr[Uint8Array] = js.native
  
  var westIndices: js.Array[Double] = js.native
  
  var westSkirtHeight: Double = js.native
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
  implicit class BoundingSphereOps[Self <: BoundingSphere] (val x: Self) extends AnyVal {
    
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
    def setBoundingSphere(value: typings.cesium.mod.BoundingSphere): Self = this.set("boundingSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEastIndicesVarargs(value: Double*): Self = this.set("eastIndices", js.Array(value :_*))
    
    @scala.inline
    def setEastIndices(value: js.Array[Double]): Self = this.set("eastIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEastSkirtHeight(value: Double): Self = this.set("eastSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizonOcclusionPoint(value: Cartesian3): Self = this.set("horizonOcclusionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: Uint16Array | Uint32Array): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumHeight(value: Double): Self = this.set("maximumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumHeight(value: Double): Self = this.set("minimumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthIndicesVarargs(value: Double*): Self = this.set("northIndices", js.Array(value :_*))
    
    @scala.inline
    def setNorthIndices(value: js.Array[Double]): Self = this.set("northIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthSkirtHeight(value: Double): Self = this.set("northSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantizedVertices(value: Uint16Array): Self = this.set("quantizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthIndicesVarargs(value: Double*): Self = this.set("southIndices", js.Array(value :_*))
    
    @scala.inline
    def setSouthIndices(value: js.Array[Double]): Self = this.set("southIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthSkirtHeight(value: Double): Self = this.set("southSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWestIndicesVarargs(value: Double*): Self = this.set("westIndices", js.Array(value :_*))
    
    @scala.inline
    def setWestIndices(value: js.Array[Double]): Self = this.set("westIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWestSkirtHeight(value: Double): Self = this.set("westSkirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = this.set("childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildTileMask: Self = this.set("childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = this.set("createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUpsampling: Self = this.set("createdByUpsampling", js.undefined)
    
    @scala.inline
    def setEncodedNormals(value: Uint8Array): Self = this.set("encodedNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedNormals: Self = this.set("encodedNormals", js.undefined)
    
    @scala.inline
    def setWaterMask(value: Uint8Array): Self = this.set("waterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterMask: Self = this.set("waterMask", js.undefined)
  }
}
