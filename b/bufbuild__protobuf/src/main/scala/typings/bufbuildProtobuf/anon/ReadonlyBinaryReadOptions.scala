package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-format.BinaryReadOptions> */
trait ReadonlyBinaryReadOptions extends StObject {
  
  val readUnknownFields: Boolean
  
  def readerFactory(bytes: js.typedarray.Uint8Array): IBinaryReader
}
object ReadonlyBinaryReadOptions {
  
  inline def apply(readUnknownFields: Boolean, readerFactory: js.typedarray.Uint8Array => IBinaryReader): ReadonlyBinaryReadOptions = {
    val __obj = js.Dynamic.literal(readUnknownFields = readUnknownFields.asInstanceOf[js.Any], readerFactory = js.Any.fromFunction1(readerFactory))
    __obj.asInstanceOf[ReadonlyBinaryReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyBinaryReadOptions] (val x: Self) extends AnyVal {
    
    inline def setReadUnknownFields(value: Boolean): Self = StObject.set(x, "readUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setReaderFactory(value: js.typedarray.Uint8Array => IBinaryReader): Self = StObject.set(x, "readerFactory", js.Any.fromFunction1(value))
  }
}
