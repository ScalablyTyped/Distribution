package typings.cesium.anon

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array
  
  var childTileMask: js.UndefOr[Double] = js.undefined
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  
  var height: Double
  
  var structure: js.UndefOr[js.Any] = js.undefined
  
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  
  var structureheightScale: js.UndefOr[Double] = js.undefined
  
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  
  var structurestride: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object Buffer {
  
  inline def apply(
    buffer: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    height: Double,
    width: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  extension [Self <: Buffer](x: Self) {
    
    inline def setBuffer(value: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    inline def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    inline def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setStructureelementMultiplier(value: Double): Self = StObject.set(x, "structureelementMultiplier", value.asInstanceOf[js.Any])
    
    inline def setStructureelementMultiplierUndefined: Self = StObject.set(x, "structureelementMultiplier", js.undefined)
    
    inline def setStructureelementsPerHeight(value: Double): Self = StObject.set(x, "structureelementsPerHeight", value.asInstanceOf[js.Any])
    
    inline def setStructureelementsPerHeightUndefined: Self = StObject.set(x, "structureelementsPerHeight", js.undefined)
    
    inline def setStructureheightOffset(value: Double): Self = StObject.set(x, "structureheightOffset", value.asInstanceOf[js.Any])
    
    inline def setStructureheightOffsetUndefined: Self = StObject.set(x, "structureheightOffset", js.undefined)
    
    inline def setStructureheightScale(value: Double): Self = StObject.set(x, "structureheightScale", value.asInstanceOf[js.Any])
    
    inline def setStructureheightScaleUndefined: Self = StObject.set(x, "structureheightScale", js.undefined)
    
    inline def setStructureisBigEndian(value: Boolean): Self = StObject.set(x, "structureisBigEndian", value.asInstanceOf[js.Any])
    
    inline def setStructureisBigEndianUndefined: Self = StObject.set(x, "structureisBigEndian", js.undefined)
    
    inline def setStructurestride(value: Double): Self = StObject.set(x, "structurestride", value.asInstanceOf[js.Any])
    
    inline def setStructurestrideUndefined: Self = StObject.set(x, "structurestride", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
