package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`true`
import typings.bufbuildProtobuf.distTypesFieldMod.fiEnum
import typings.bufbuildProtobuf.distTypesFieldMod.fiMap
import typings.bufbuildProtobuf.distTypesFieldMod.fiMessage
import typings.bufbuildProtobuf.distTypesFieldMod.fiScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonName[T /* <: fiScalar | fiMap | fiEnum | fiMessage */] extends StObject {
  
  var default: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['default'] */ js.Any
  ] = js.undefined
  
  val jsonName: js.UndefOr[String] = js.undefined
  
  val oneof: Unit
  
  val opt: `true`
  
  val packed: js.UndefOr[`false`] = js.undefined
  
  val repeated: js.UndefOr[`false`] = js.undefined
}
object JsonName {
  
  inline def apply[T /* <: fiScalar | fiMap | fiEnum | fiMessage */](oneof: Unit): JsonName[T] = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any], opt = true)
    __obj.asInstanceOf[JsonName[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonName[?], T /* <: fiScalar | fiMap | fiEnum | fiMessage */] (val x: Self & JsonName[T]) extends AnyVal {
    
    inline def setDefault(value: /* import warning: importer.ImportType#apply Failed type conversion: T['default'] */ js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setOneof(value: Unit): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOpt(value: `true`): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: `false`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
  }
}
