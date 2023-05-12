package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonWriteOptions> */
trait PartialJsonWriteOptions extends StObject {
  
  var emitDefaultValues: js.UndefOr[Boolean] = js.undefined
  
  var enumAsInteger: js.UndefOr[Boolean] = js.undefined
  
  var typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
  
  var useProtoFieldName: js.UndefOr[Boolean] = js.undefined
}
object PartialJsonWriteOptions {
  
  inline def apply(): PartialJsonWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJsonWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialJsonWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setEmitDefaultValues(value: Boolean): Self = StObject.set(x, "emitDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setEmitDefaultValuesUndefined: Self = StObject.set(x, "emitDefaultValues", js.undefined)
    
    inline def setEnumAsInteger(value: Boolean): Self = StObject.set(x, "enumAsInteger", value.asInstanceOf[js.Any])
    
    inline def setEnumAsIntegerUndefined: Self = StObject.set(x, "enumAsInteger", js.undefined)
    
    inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
    
    inline def setUseProtoFieldName(value: Boolean): Self = StObject.set(x, "useProtoFieldName", value.asInstanceOf[js.Any])
    
    inline def setUseProtoFieldNameUndefined: Self = StObject.set(x, "useProtoFieldName", js.undefined)
  }
}
