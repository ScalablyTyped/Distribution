package typings.cesium.anon

import typings.cesium.mod.GeometryAttributes
import typings.cesium.mod.PrimitiveType
import typings.std.Uint16Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends StObject {
  
  var attributes: GeometryAttributes = js.native
  
  var boundingSphere: js.UndefOr[typings.cesium.mod.BoundingSphere] = js.native
  
  var indices: js.UndefOr[Uint16Array | Uint32Array] = js.native
  
  var primitiveType: js.UndefOr[PrimitiveType] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(attributes: GeometryAttributes): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: GeometryAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingSphere(value: typings.cesium.mod.BoundingSphere): Self = StObject.set(x, "boundingSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingSphereUndefined: Self = StObject.set(x, "boundingSphere", js.undefined)
    
    @scala.inline
    def setIndices(value: Uint16Array | Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setPrimitiveType(value: PrimitiveType): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
