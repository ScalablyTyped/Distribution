package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.Eof
import typings.bufbuildProtobuf.anon.Offset
import typings.bufbuildProtobuf.distTypesBinaryFormatMod.BinaryReadOptions
import typings.bufbuildProtobuf.distTypesBinaryFormatMod.BinaryWriteOptions
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protoDelimited {
  
  @JSImport("@bufbuild/protobuf", "protoDelimited")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a size-delimited message, ignoring extra bytes.
    */
  inline def dec[T /* <: typings.bufbuildProtobuf.distTypesMessageMod.Message[T] */](`type`: MessageType[T], bytes: js.typedarray.Uint8Array): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dec")(`type`.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dec[T /* <: typings.bufbuildProtobuf.distTypesMessageMod.Message[T] */](`type`: MessageType[T], bytes: js.typedarray.Uint8Array, options: BinaryReadOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dec")(`type`.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Parse a stream of size-delimited messages.
    */
  inline def decStream[T_1 /* <: typings.bufbuildProtobuf.distTypesMessageMod.Message[T_1] */](`type`: MessageType[T_1], iterable: AsyncIterable[js.typedarray.Uint8Array]): AsyncGenerator[T_1, Unit, scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decStream")(`type`.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T_1, Unit, scala.Any]]
  
  /**
    * Serialize a message, prefixing it with its size.
    */
  inline def enc(message: typings.bufbuildProtobuf.distTypesMessageMod.Message[AnyMessage]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("enc")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def enc(
    message: typings.bufbuildProtobuf.distTypesMessageMod.Message[AnyMessage],
    options: BinaryWriteOptions
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("enc")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Decodes the size from the given size-delimited message, which may be
    * incomplete.
    *
    * Returns an object with the following properties:
    * - size: The size of the delimited message in bytes
    * - offset: The offset in the given byte array where the message starts
    * - eof: true
    *
    * If the size-delimited data does not include all bytes of the varint size,
    * the following object is returned:
    * - size: null
    * - offset: null
    * - eof: false
    *
    * This function can be used to implement parsing of size-delimited messages
    * from a stream.
    */
  inline def peekSize(data: js.typedarray.Uint8Array): Eof | Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("peekSize")(data.asInstanceOf[js.Any]).asInstanceOf[Eof | Offset]
}
