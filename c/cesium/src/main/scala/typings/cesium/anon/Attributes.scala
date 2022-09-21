package typings.cesium.anon

import typings.cesium.mod.GeometryAttributes
import typings.cesium.mod.PrimitiveType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: GeometryAttributes
  
  var boundingSphere: js.UndefOr[typings.cesium.mod.BoundingSphere] = js.undefined
  
  var indices: js.UndefOr[js.typedarray.Uint16Array | js.typedarray.Uint32Array] = js.undefined
  
  var primitiveType: js.UndefOr[PrimitiveType] = js.undefined
}
object Attributes {
  
  inline def apply(attributes: GeometryAttributes): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: GeometryAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBoundingSphere(value: typings.cesium.mod.BoundingSphere): Self = StObject.set(x, "boundingSphere", value.asInstanceOf[js.Any])
    
    inline def setBoundingSphereUndefined: Self = StObject.set(x, "boundingSphere", js.undefined)
    
    inline def setIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setPrimitiveType(value: PrimitiveType): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
