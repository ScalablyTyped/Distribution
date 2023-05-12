package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-format.BinaryReadOptions> */
trait PartialBinaryReadOptions extends StObject {
  
  var readUnknownFields: js.UndefOr[Boolean] = js.undefined
  
  var readerFactory: js.UndefOr[js.Function1[/* bytes */ js.typedarray.Uint8Array, IBinaryReader]] = js.undefined
}
object PartialBinaryReadOptions {
  
  inline def apply(): PartialBinaryReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBinaryReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBinaryReadOptions] (val x: Self) extends AnyVal {
    
    inline def setReadUnknownFields(value: Boolean): Self = StObject.set(x, "readUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setReadUnknownFieldsUndefined: Self = StObject.set(x, "readUnknownFields", js.undefined)
    
    inline def setReaderFactory(value: /* bytes */ js.typedarray.Uint8Array => IBinaryReader): Self = StObject.set(x, "readerFactory", js.Any.fromFunction1(value))
    
    inline def setReaderFactoryUndefined: Self = StObject.set(x, "readerFactory", js.undefined)
  }
}
