package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonReadOptions> */
trait ReadonlyJsonReadOptions extends StObject {
  
  val ignoreUnknownFields: Boolean
  
  val typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
}
object ReadonlyJsonReadOptions {
  
  inline def apply(ignoreUnknownFields: Boolean): ReadonlyJsonReadOptions = {
    val __obj = js.Dynamic.literal(ignoreUnknownFields = ignoreUnknownFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyJsonReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyJsonReadOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnknownFields(value: Boolean): Self = StObject.set(x, "ignoreUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
  }
}
