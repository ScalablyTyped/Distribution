package typings.awsSdkEventstreamMarshaller

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.byte
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.short
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.timestamp
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import typings.awsSdkEventstreamMarshaller.int64Mod.Int64
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  trait BinaryHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: binary
    
    var value: Uint8Array
  }
  object BinaryHeaderValue {
    
    inline def apply(value: Uint8Array): BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("binary")
      __obj.asInstanceOf[BinaryHeaderValue]
    }
    
    extension [Self <: BinaryHeaderValue](x: Self) {
      
      inline def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BooleanHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: boolean
    
    var value: Boolean
  }
  object BooleanHeaderValue {
    
    inline def apply(value: Boolean): BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[BooleanHeaderValue]
    }
    
    extension [Self <: BooleanHeaderValue](x: Self) {
      
      inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: byte
    
    var value: Double
  }
  object ByteHeaderValue {
    
    inline def apply(value: Double): ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("byte")
      __obj.asInstanceOf[ByteHeaderValue]
    }
    
    extension [Self <: ByteHeaderValue](x: Self) {
      
      inline def setType(value: byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntegerHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: integer
    
    var value: Double
  }
  object IntegerHeaderValue {
    
    inline def apply(value: Double): IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[IntegerHeaderValue]
    }
    
    extension [Self <: IntegerHeaderValue](x: Self) {
      
      inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LongHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: long
    
    var value: Int64
  }
  object LongHeaderValue {
    
    inline def apply(value: Int64): LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("long")
      __obj.asInstanceOf[LongHeaderValue]
    }
    
    extension [Self <: LongHeaderValue](x: Self) {
      
      inline def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var body: Uint8Array
    
    var headers: MessageHeaders
  }
  object Message {
    
    inline def apply(body: Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue
    - typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue
  */
  trait MessageHeaderValue extends StObject
  object MessageHeaderValue {
    
    inline def BinaryHeaderValue(value: Uint8Array): typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("binary")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue]
    }
    
    inline def BooleanHeaderValue(value: Boolean): typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue]
    }
    
    inline def ByteHeaderValue(value: Double): typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("byte")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue]
    }
    
    inline def IntegerHeaderValue(value: Double): typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue]
    }
    
    inline def LongHeaderValue(value: Int64): typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("long")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue]
    }
    
    inline def ShortHeaderValue(value: Double): typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("short")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue]
    }
    
    inline def StringHeaderValue(value: String): typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue]
    }
    
    inline def TimestampHeaderValue(value: Date): typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("timestamp")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue]
    }
    
    inline def UuidHeaderValue(value: String): typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("uuid")
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue]
    }
  }
  
  type MessageHeaders = StringDictionary[MessageHeaderValue]
  
  trait ShortHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: short
    
    var value: Double
  }
  object ShortHeaderValue {
    
    inline def apply(value: Double): ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("short")
      __obj.asInstanceOf[ShortHeaderValue]
    }
    
    extension [Self <: ShortHeaderValue](x: Self) {
      
      inline def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: string
    
    var value: String
  }
  object StringHeaderValue {
    
    inline def apply(value: String): StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[StringHeaderValue]
    }
    
    extension [Self <: StringHeaderValue](x: Self) {
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimestampHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: timestamp
    
    var value: Date
  }
  object TimestampHeaderValue {
    
    inline def apply(value: Date): TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("timestamp")
      __obj.asInstanceOf[TimestampHeaderValue]
    }
    
    extension [Self <: TimestampHeaderValue](x: Self) {
      
      inline def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UuidHeaderValue
    extends StObject
       with MessageHeaderValue {
    
    var `type`: uuid
    
    var value: String
  }
  object UuidHeaderValue {
    
    inline def apply(value: String): UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("uuid")
      __obj.asInstanceOf[UuidHeaderValue]
    }
    
    extension [Self <: UuidHeaderValue](x: Self) {
      
      inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
