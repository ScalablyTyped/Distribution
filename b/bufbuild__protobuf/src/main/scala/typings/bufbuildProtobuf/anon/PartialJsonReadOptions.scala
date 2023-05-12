package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonReadOptions> */
trait PartialJsonReadOptions extends StObject {
  
  var ignoreUnknownFields: js.UndefOr[Boolean] = js.undefined
  
  var typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
}
object PartialJsonReadOptions {
  
  inline def apply(): PartialJsonReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJsonReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialJsonReadOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnknownFields(value: Boolean): Self = StObject.set(x, "ignoreUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownFieldsUndefined: Self = StObject.set(x, "ignoreUnknownFields", js.undefined)
    
    inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
  }
}
