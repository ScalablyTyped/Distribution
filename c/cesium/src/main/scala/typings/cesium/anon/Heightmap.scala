package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heightmap extends js.Object {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var height: Double = js.native
  
  var heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array = js.native
  
  var isGeographic: js.UndefOr[Boolean] = js.native
  
  var nativeRectangle: typings.cesium.mod.Rectangle = js.native
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  
  var relativetoCenter: js.UndefOr[Cartesian3] = js.native
  
  var skirtHeight: Double = js.native
  
  var structure: js.UndefOr[js.Any] = js.native
  
  var structureelementMultiplier: js.UndefOr[Double] = js.native
  
  var structureelementsPerHeight: js.UndefOr[Double] = js.native
  
  var structureheightOffset: js.UndefOr[Double] = js.native
  
  var structureheightScale: js.UndefOr[Double] = js.native
  
  var structureisBigEndian: js.UndefOr[Boolean] = js.native
  
  var structurestride: js.UndefOr[Double] = js.native
  
  var vertices: js.Array[_] | Float32Array = js.native
  
  var width: Double = js.native
}
object Heightmap {
  
  @scala.inline
  def apply(
    height: Double,
    heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    nativeRectangle: typings.cesium.mod.Rectangle,
    skirtHeight: Double,
    vertices: js.Array[_] | Float32Array,
    width: Double
  ): Heightmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle.asInstanceOf[js.Any], skirtHeight = skirtHeight.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightmap]
  }
  
  @scala.inline
  implicit class HeightmapOps[Self <: Heightmap] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightmap(value: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array): Self = this.set("heightmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("nativeRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkirtHeight(value: Double): Self = this.set("skirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: js.Any*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[_] | Float32Array): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setIsGeographic(value: Boolean): Self = this.set("isGeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGeographic: Self = this.set("isGeographic", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    
    @scala.inline
    def setRelativetoCenter(value: Cartesian3): Self = this.set("relativetoCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativetoCenter: Self = this.set("relativetoCenter", js.undefined)
    
    @scala.inline
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    
    @scala.inline
    def setStructureelementMultiplier(value: Double): Self = this.set("structureelementMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureelementMultiplier: Self = this.set("structureelementMultiplier", js.undefined)
    
    @scala.inline
    def setStructureelementsPerHeight(value: Double): Self = this.set("structureelementsPerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureelementsPerHeight: Self = this.set("structureelementsPerHeight", js.undefined)
    
    @scala.inline
    def setStructureheightOffset(value: Double): Self = this.set("structureheightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureheightOffset: Self = this.set("structureheightOffset", js.undefined)
    
    @scala.inline
    def setStructureheightScale(value: Double): Self = this.set("structureheightScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureheightScale: Self = this.set("structureheightScale", js.undefined)
    
    @scala.inline
    def setStructureisBigEndian(value: Boolean): Self = this.set("structureisBigEndian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureisBigEndian: Self = this.set("structureisBigEndian", js.undefined)
    
    @scala.inline
    def setStructurestride(value: Double): Self = this.set("structurestride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructurestride: Self = this.set("structurestride", js.undefined)
  }
}
