package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryReader
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryWriter
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType
import typings.bufbuildProtobuf.distTypesBinaryFormatMod.BinaryReadOptions
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-format.BinaryFormat, 'writeMessage'> */
trait OmitBinaryFormatwriteMess extends StObject {
  
  def discardUnknownFields(message: Message[AnyMessage]): Unit
  @JSName("discardUnknownFields")
  var discardUnknownFields_Original: js.Function1[/* message */ Message[AnyMessage], Unit]
  
  def listUnknownFields(message: Message[AnyMessage]): js.Array[Data]
  @JSName("listUnknownFields")
  var listUnknownFields_Original: js.Function1[/* message */ Message[AnyMessage], js.Array[Data]]
  
  def makeReadOptions(): ReadonlyBinaryReadOptions
  def makeReadOptions(options: PartialBinaryReadOptions): ReadonlyBinaryReadOptions
  @JSName("makeReadOptions")
  var makeReadOptions_Original: js.Function1[/* options */ js.UndefOr[PartialBinaryReadOptions], ReadonlyBinaryReadOptions]
  
  def makeWriteOptions(): ReadonlyBinaryWriteOption
  def makeWriteOptions(options: PartialBinaryWriteOptions): ReadonlyBinaryWriteOption
  @JSName("makeWriteOptions")
  var makeWriteOptions_Original: js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], ReadonlyBinaryWriteOption]
  
  def onUnknownField(message: Message[AnyMessage], no: Double, wireType: WireType, data: js.typedarray.Uint8Array): Unit
  @JSName("onUnknownField")
  var onUnknownField_Original: js.Function4[
    /* message */ Message[AnyMessage], 
    /* no */ Double, 
    /* wireType */ WireType, 
    /* data */ js.typedarray.Uint8Array, 
    Unit
  ]
  
  def readMessage(message: Message[AnyMessage], reader: IBinaryReader, length: Double, options: BinaryReadOptions): Unit
  @JSName("readMessage")
  var readMessage_Original: js.Function4[
    /* message */ Message[AnyMessage], 
    /* reader */ IBinaryReader, 
    /* length */ Double, 
    /* options */ BinaryReadOptions, 
    Unit
  ]
  
  def writeUnknownFields(message: Message[AnyMessage], writer: IBinaryWriter): Unit
  @JSName("writeUnknownFields")
  var writeUnknownFields_Original: js.Function2[/* message */ Message[AnyMessage], /* writer */ IBinaryWriter, Unit]
}
object OmitBinaryFormatwriteMess {
  
  inline def apply(
    discardUnknownFields: /* message */ Message[AnyMessage] => Unit,
    listUnknownFields: /* message */ Message[AnyMessage] => js.Array[Data],
    makeReadOptions: /* options */ js.UndefOr[PartialBinaryReadOptions] => ReadonlyBinaryReadOptions,
    makeWriteOptions: /* options */ js.UndefOr[PartialBinaryWriteOptions] => ReadonlyBinaryWriteOption,
    onUnknownField: (/* message */ Message[AnyMessage], /* no */ Double, /* wireType */ WireType, /* data */ js.typedarray.Uint8Array) => Unit,
    readMessage: (/* message */ Message[AnyMessage], /* reader */ IBinaryReader, /* length */ Double, /* options */ BinaryReadOptions) => Unit,
    writeUnknownFields: (/* message */ Message[AnyMessage], /* writer */ IBinaryWriter) => Unit
  ): OmitBinaryFormatwriteMess = {
    val __obj = js.Dynamic.literal(discardUnknownFields = js.Any.fromFunction1(discardUnknownFields), listUnknownFields = js.Any.fromFunction1(listUnknownFields), makeReadOptions = js.Any.fromFunction1(makeReadOptions), makeWriteOptions = js.Any.fromFunction1(makeWriteOptions), onUnknownField = js.Any.fromFunction4(onUnknownField), readMessage = js.Any.fromFunction4(readMessage), writeUnknownFields = js.Any.fromFunction2(writeUnknownFields))
    __obj.asInstanceOf[OmitBinaryFormatwriteMess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitBinaryFormatwriteMess] (val x: Self) extends AnyVal {
    
    inline def setDiscardUnknownFields(value: /* message */ Message[AnyMessage] => Unit): Self = StObject.set(x, "discardUnknownFields", js.Any.fromFunction1(value))
    
    inline def setListUnknownFields(value: /* message */ Message[AnyMessage] => js.Array[Data]): Self = StObject.set(x, "listUnknownFields", js.Any.fromFunction1(value))
    
    inline def setMakeReadOptions(value: /* options */ js.UndefOr[PartialBinaryReadOptions] => ReadonlyBinaryReadOptions): Self = StObject.set(x, "makeReadOptions", js.Any.fromFunction1(value))
    
    inline def setMakeWriteOptions(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => ReadonlyBinaryWriteOption): Self = StObject.set(x, "makeWriteOptions", js.Any.fromFunction1(value))
    
    inline def setOnUnknownField(
      value: (/* message */ Message[AnyMessage], /* no */ Double, /* wireType */ WireType, /* data */ js.typedarray.Uint8Array) => Unit
    ): Self = StObject.set(x, "onUnknownField", js.Any.fromFunction4(value))
    
    inline def setReadMessage(
      value: (/* message */ Message[AnyMessage], /* reader */ IBinaryReader, /* length */ Double, /* options */ BinaryReadOptions) => Unit
    ): Self = StObject.set(x, "readMessage", js.Any.fromFunction4(value))
    
    inline def setWriteUnknownFields(value: (/* message */ Message[AnyMessage], /* writer */ IBinaryWriter) => Unit): Self = StObject.set(x, "writeUnknownFields", js.Any.fromFunction2(value))
  }
}
