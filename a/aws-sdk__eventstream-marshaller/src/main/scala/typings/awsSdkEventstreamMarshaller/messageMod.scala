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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @js.native
  trait BinaryHeaderValue extends MessageHeaderValue {
    
    var `type`: binary = js.native
    
    var value: Uint8Array = js.native
  }
  object BinaryHeaderValue {
    
    @scala.inline
    def apply(`type`: binary, value: Uint8Array): BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryHeaderValue]
    }
    
    @scala.inline
    implicit class BinaryHeaderValueMutableBuilder[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BooleanHeaderValue extends MessageHeaderValue {
    
    var `type`: boolean = js.native
    
    var value: Boolean = js.native
  }
  object BooleanHeaderValue {
    
    @scala.inline
    def apply(`type`: boolean, value: Boolean): BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BooleanHeaderValue]
    }
    
    @scala.inline
    implicit class BooleanHeaderValueMutableBuilder[Self <: BooleanHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ByteHeaderValue extends MessageHeaderValue {
    
    var `type`: byte = js.native
    
    var value: Double = js.native
  }
  object ByteHeaderValue {
    
    @scala.inline
    def apply(`type`: byte, value: Double): ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteHeaderValue]
    }
    
    @scala.inline
    implicit class ByteHeaderValueMutableBuilder[Self <: ByteHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntegerHeaderValue extends MessageHeaderValue {
    
    var `type`: integer = js.native
    
    var value: Double = js.native
  }
  object IntegerHeaderValue {
    
    @scala.inline
    def apply(`type`: integer, value: Double): IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegerHeaderValue]
    }
    
    @scala.inline
    implicit class IntegerHeaderValueMutableBuilder[Self <: IntegerHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LongHeaderValue extends MessageHeaderValue {
    
    var `type`: long = js.native
    
    var value: Int64 = js.native
  }
  object LongHeaderValue {
    
    @scala.inline
    def apply(`type`: long, value: Int64): LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongHeaderValue]
    }
    
    @scala.inline
    implicit class LongHeaderValueMutableBuilder[Self <: LongHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var body: Uint8Array = js.native
    
    var headers: MessageHeaders = js.native
  }
  object Message {
    
    @scala.inline
    def apply(body: Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def BinaryHeaderValue(`type`: binary, value: Uint8Array): typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue]
    }
    
    @scala.inline
    def BooleanHeaderValue(`type`: boolean, value: Boolean): typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue]
    }
    
    @scala.inline
    def ByteHeaderValue(`type`: byte, value: Double): typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue]
    }
    
    @scala.inline
    def IntegerHeaderValue(`type`: integer, value: Double): typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue]
    }
    
    @scala.inline
    def LongHeaderValue(`type`: long, value: Int64): typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue]
    }
    
    @scala.inline
    def ShortHeaderValue(`type`: short, value: Double): typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue]
    }
    
    @scala.inline
    def StringHeaderValue(`type`: string, value: String): typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue]
    }
    
    @scala.inline
    def TimestampHeaderValue(`type`: timestamp, value: Date): typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue]
    }
    
    @scala.inline
    def UuidHeaderValue(`type`: uuid, value: String): typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue]
    }
  }
  
  type MessageHeaders = StringDictionary[MessageHeaderValue]
  
  @js.native
  trait ShortHeaderValue extends MessageHeaderValue {
    
    var `type`: short = js.native
    
    var value: Double = js.native
  }
  object ShortHeaderValue {
    
    @scala.inline
    def apply(`type`: short, value: Double): ShortHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortHeaderValue]
    }
    
    @scala.inline
    implicit class ShortHeaderValueMutableBuilder[Self <: ShortHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StringHeaderValue extends MessageHeaderValue {
    
    var `type`: string = js.native
    
    var value: String = js.native
  }
  object StringHeaderValue {
    
    @scala.inline
    def apply(`type`: string, value: String): StringHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringHeaderValue]
    }
    
    @scala.inline
    implicit class StringHeaderValueMutableBuilder[Self <: StringHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimestampHeaderValue extends MessageHeaderValue {
    
    var `type`: timestamp = js.native
    
    var value: Date = js.native
  }
  object TimestampHeaderValue {
    
    @scala.inline
    def apply(`type`: timestamp, value: Date): TimestampHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampHeaderValue]
    }
    
    @scala.inline
    implicit class TimestampHeaderValueMutableBuilder[Self <: TimestampHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UuidHeaderValue extends MessageHeaderValue {
    
    var `type`: uuid = js.native
    
    var value: String = js.native
  }
  object UuidHeaderValue {
    
    @scala.inline
    def apply(`type`: uuid, value: String): UuidHeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UuidHeaderValue]
    }
    
    @scala.inline
    implicit class UuidHeaderValueMutableBuilder[Self <: UuidHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
