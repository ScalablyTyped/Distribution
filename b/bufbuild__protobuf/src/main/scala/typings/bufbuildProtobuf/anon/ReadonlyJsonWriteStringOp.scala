package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonWriteStringOptions> */
trait ReadonlyJsonWriteStringOp extends StObject {
  
  val emitDefaultValues: Boolean
  
  val enumAsInteger: Boolean
  
  val prettySpaces: Double
  
  val typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
  
  val useProtoFieldName: Boolean
}
object ReadonlyJsonWriteStringOp {
  
  inline def apply(
    emitDefaultValues: Boolean,
    enumAsInteger: Boolean,
    prettySpaces: Double,
    useProtoFieldName: Boolean
  ): ReadonlyJsonWriteStringOp = {
    val __obj = js.Dynamic.literal(emitDefaultValues = emitDefaultValues.asInstanceOf[js.Any], enumAsInteger = enumAsInteger.asInstanceOf[js.Any], prettySpaces = prettySpaces.asInstanceOf[js.Any], useProtoFieldName = useProtoFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyJsonWriteStringOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyJsonWriteStringOp] (val x: Self) extends AnyVal {
    
    inline def setEmitDefaultValues(value: Boolean): Self = StObject.set(x, "emitDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setEnumAsInteger(value: Boolean): Self = StObject.set(x, "enumAsInteger", value.asInstanceOf[js.Any])
    
    inline def setPrettySpaces(value: Double): Self = StObject.set(x, "prettySpaces", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
    
    inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
    
    inline def setUseProtoFieldName(value: Boolean): Self = StObject.set(x, "useProtoFieldName", value.asInstanceOf[js.Any])
  }
}
