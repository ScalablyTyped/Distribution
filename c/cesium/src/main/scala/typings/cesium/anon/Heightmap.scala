package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heightmap extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var height: Double
  
  var heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array
  
  var isGeographic: js.UndefOr[Boolean] = js.undefined
  
  var nativeRectangle: typings.cesium.mod.Rectangle
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var relativetoCenter: js.UndefOr[Cartesian3] = js.undefined
  
  var skirtHeight: Double
  
  var structure: js.UndefOr[js.Any] = js.undefined
  
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  
  var structureheightScale: js.UndefOr[Double] = js.undefined
  
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  
  var structurestride: js.UndefOr[Double] = js.undefined
  
  var vertices: js.Array[js.Any] | Float32Array
  
  var width: Double
}
object Heightmap {
  
  @scala.inline
  def apply(
    height: Double,
    heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    nativeRectangle: typings.cesium.mod.Rectangle,
    skirtHeight: Double,
    vertices: js.Array[js.Any] | Float32Array,
    width: Double
  ): Heightmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle.asInstanceOf[js.Any], skirtHeight = skirtHeight.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightmap]
  }
  
  @scala.inline
  implicit class HeightmapMutableBuilder[Self <: Heightmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightmap(value: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array): Self = StObject.set(x, "heightmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGeographic(value: Boolean): Self = StObject.set(x, "isGeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGeographicUndefined: Self = StObject.set(x, "isGeographic", js.undefined)
    
    @scala.inline
    def setNativeRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "nativeRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setRelativetoCenter(value: Cartesian3): Self = StObject.set(x, "relativetoCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativetoCenterUndefined: Self = StObject.set(x, "relativetoCenter", js.undefined)
    
    @scala.inline
    def setSkirtHeight(value: Double): Self = StObject.set(x, "skirtHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    @scala.inline
    def setStructureelementMultiplier(value: Double): Self = StObject.set(x, "structureelementMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureelementMultiplierUndefined: Self = StObject.set(x, "structureelementMultiplier", js.undefined)
    
    @scala.inline
    def setStructureelementsPerHeight(value: Double): Self = StObject.set(x, "structureelementsPerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureelementsPerHeightUndefined: Self = StObject.set(x, "structureelementsPerHeight", js.undefined)
    
    @scala.inline
    def setStructureheightOffset(value: Double): Self = StObject.set(x, "structureheightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureheightOffsetUndefined: Self = StObject.set(x, "structureheightOffset", js.undefined)
    
    @scala.inline
    def setStructureheightScale(value: Double): Self = StObject.set(x, "structureheightScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureheightScaleUndefined: Self = StObject.set(x, "structureheightScale", js.undefined)
    
    @scala.inline
    def setStructureisBigEndian(value: Boolean): Self = StObject.set(x, "structureisBigEndian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureisBigEndianUndefined: Self = StObject.set(x, "structureisBigEndian", js.undefined)
    
    @scala.inline
    def setStructurestride(value: Double): Self = StObject.set(x, "structurestride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructurestrideUndefined: Self = StObject.set(x, "structurestride", js.undefined)
    
    @scala.inline
    def setVertices(value: js.Array[js.Any] | Float32Array): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: js.Any*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
