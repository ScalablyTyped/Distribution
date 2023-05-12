package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-format.BinaryWriteOptions> */
trait ReadonlyBinaryWriteOption extends StObject {
  
  val writeUnknownFields: Boolean
  
  def writerFactory(): IBinaryWriter
}
object ReadonlyBinaryWriteOption {
  
  inline def apply(writeUnknownFields: Boolean, writerFactory: () => IBinaryWriter): ReadonlyBinaryWriteOption = {
    val __obj = js.Dynamic.literal(writeUnknownFields = writeUnknownFields.asInstanceOf[js.Any], writerFactory = js.Any.fromFunction0(writerFactory))
    __obj.asInstanceOf[ReadonlyBinaryWriteOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyBinaryWriteOption] (val x: Self) extends AnyVal {
    
    inline def setWriteUnknownFields(value: Boolean): Self = StObject.set(x, "writeUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setWriterFactory(value: () => IBinaryWriter): Self = StObject.set(x, "writerFactory", js.Any.fromFunction0(value))
  }
}
