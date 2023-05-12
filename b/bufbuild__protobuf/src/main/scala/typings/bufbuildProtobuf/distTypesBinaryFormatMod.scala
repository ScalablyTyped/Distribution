package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.Data
import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialBinaryWriteOptions
import typings.bufbuildProtobuf.anon.ReadonlyBinaryReadOptions
import typings.bufbuildProtobuf.anon.ReadonlyBinaryWriteOption
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryReader
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryWriter
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBinaryFormatMod {
  
  @js.native
  trait BinaryFormat extends StObject {
    
    /**
      * Discard unknown fields for the given message.
      */
    def discardUnknownFields(message: Message[AnyMessage]): Unit = js.native
    
    /**
      * Retrieve the unknown fields for the given message.
      *
      * Unknown fields are well-formed protocol buffer serialized data for
      * fields that the parserdoes not recognize.
      *
      * For more details see https://developers.google.com/protocol-buffers/docs/proto3#unknowns
      */
    def listUnknownFields(message: Message[AnyMessage]): js.Array[Data] = js.native
    
    /**
      * Provide options for parsing binary data.
      */
    def makeReadOptions(): ReadonlyBinaryReadOptions = js.native
    def makeReadOptions(options: PartialBinaryReadOptions): ReadonlyBinaryReadOptions = js.native
    
    /**
      * Provide options for serializing binary data.
      */
    def makeWriteOptions(): ReadonlyBinaryWriteOption = js.native
    def makeWriteOptions(options: PartialBinaryWriteOptions): ReadonlyBinaryWriteOption = js.native
    
    /**
      * Store an unknown field for the given message. The parser will use this
      * method if it does not recognize a field, unless the option
      * `readUnknownFields` has been disabled.
      */
    def onUnknownField(message: Message[AnyMessage], no: Double, wireType: WireType, data: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Parse a message from binary data, merging fields.
      */
    def readMessage(message: Message[AnyMessage], reader: IBinaryReader, length: Double, options: BinaryReadOptions): Unit = js.native
    
    /**
      * Serialize a message to binary data.
      */
    def writeMessage(message: Message[AnyMessage], writer: IBinaryWriter, options: BinaryWriteOptions): Unit = js.native
    
    /**
      * Retrieve the unknown fields for the given message and write them to
      * the given writer. This method is called when a message is serialized,
      * so the fields that are unknown to the parser persist through a round
      * trip.
      */
    def writeUnknownFields(message: Message[AnyMessage], writer: IBinaryWriter): Unit = js.native
  }
  
  trait BinaryReadOptions extends StObject {
    
    /**
      * Retain unknown fields during parsing? The default behavior is to retain
      * unknown fields and include them in the serialized output.
      *
      * For more details see https://developers.google.com/protocol-buffers/docs/proto3#unknowns
      */
    var readUnknownFields: Boolean
    
    /**
      * Allows to use a custom implementation to decode binary data.
      */
    def readerFactory(bytes: js.typedarray.Uint8Array): IBinaryReader
  }
  object BinaryReadOptions {
    
    inline def apply(readUnknownFields: Boolean, readerFactory: js.typedarray.Uint8Array => IBinaryReader): BinaryReadOptions = {
      val __obj = js.Dynamic.literal(readUnknownFields = readUnknownFields.asInstanceOf[js.Any], readerFactory = js.Any.fromFunction1(readerFactory))
      __obj.asInstanceOf[BinaryReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryReadOptions] (val x: Self) extends AnyVal {
      
      inline def setReadUnknownFields(value: Boolean): Self = StObject.set(x, "readUnknownFields", value.asInstanceOf[js.Any])
      
      inline def setReaderFactory(value: js.typedarray.Uint8Array => IBinaryReader): Self = StObject.set(x, "readerFactory", js.Any.fromFunction1(value))
    }
  }
  
  trait BinaryWriteOptions extends StObject {
    
    /**
      * Include unknown fields in the serialized output? The default behavior
      * is to retain unknown fields and include them in the serialized output.
      *
      * For more details see https://developers.google.com/protocol-buffers/docs/proto3#unknowns
      */
    var writeUnknownFields: Boolean
    
    /**
      * Allows to use a custom implementation to encode binary data.
      */
    def writerFactory(): IBinaryWriter
  }
  object BinaryWriteOptions {
    
    inline def apply(writeUnknownFields: Boolean, writerFactory: () => IBinaryWriter): BinaryWriteOptions = {
      val __obj = js.Dynamic.literal(writeUnknownFields = writeUnknownFields.asInstanceOf[js.Any], writerFactory = js.Any.fromFunction0(writerFactory))
      __obj.asInstanceOf[BinaryWriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryWriteOptions] (val x: Self) extends AnyVal {
      
      inline def setWriteUnknownFields(value: Boolean): Self = StObject.set(x, "writeUnknownFields", value.asInstanceOf[js.Any])
      
      inline def setWriterFactory(value: () => IBinaryWriter): Self = StObject.set(x, "writerFactory", js.Any.fromFunction0(value))
    }
  }
}
