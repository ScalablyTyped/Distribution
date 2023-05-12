package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.HeightmapEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildTileMask extends StObject {
  
  var buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  var childTileMask: js.UndefOr[Double] = js.undefined
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[HeightmapEncoding] = js.undefined
  
  var height: Double
  
  var structure: js.UndefOr[ElementMultiplier] = js.undefined
  
  var waterMask: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var width: Double
}
object ChildTileMask {
  
  inline def apply(
    buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
    height: Double,
    width: Double
  ): ChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildTileMask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildTileMask] (val x: Self) extends AnyVal {
    
    inline def setBuffer(
      value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    inline def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    inline def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    inline def setEncoding(value: HeightmapEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStructure(value: ElementMultiplier): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setWaterMask(value: js.typedarray.Uint8Array): Self = StObject.set(x, "waterMask", value.asInstanceOf[js.Any])
    
    inline def setWaterMaskUndefined: Self = StObject.set(x, "waterMask", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
