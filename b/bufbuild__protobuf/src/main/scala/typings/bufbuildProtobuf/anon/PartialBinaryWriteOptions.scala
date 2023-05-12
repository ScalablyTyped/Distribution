package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-format.BinaryWriteOptions> */
trait PartialBinaryWriteOptions extends StObject {
  
  var writeUnknownFields: js.UndefOr[Boolean] = js.undefined
  
  var writerFactory: js.UndefOr[js.Function0[IBinaryWriter]] = js.undefined
}
object PartialBinaryWriteOptions {
  
  inline def apply(): PartialBinaryWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBinaryWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBinaryWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setWriteUnknownFields(value: Boolean): Self = StObject.set(x, "writeUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setWriteUnknownFieldsUndefined: Self = StObject.set(x, "writeUnknownFields", js.undefined)
    
    inline def setWriterFactory(value: () => IBinaryWriter): Self = StObject.set(x, "writerFactory", js.Any.fromFunction0(value))
    
    inline def setWriterFactoryUndefined: Self = StObject.set(x, "writerFactory", js.undefined)
  }
}
