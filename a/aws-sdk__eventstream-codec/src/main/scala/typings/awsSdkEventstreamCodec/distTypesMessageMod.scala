package typings.awsSdkEventstreamCodec

import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.binary
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.boolean
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.byte
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.integer
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.long
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.short
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.string
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.timestamp
import typings.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.uuid
import typings.awsSdkEventstreamCodec.distTypesInt64Mod.Int64
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageMod {
  
  type BinaryHeaderValue = HeaderValue[binary, js.typedarray.Uint8Array]
  
  type BooleanHeaderValue = HeaderValue[boolean, Boolean]
  
  type ByteHeaderValue = HeaderValue[byte, Double]
  
  trait HeaderValue[K /* <: String */, V] extends StObject {
    
    var `type`: K
    
    var value: V
  }
  object HeaderValue {
    
    inline def apply[K /* <: String */, V](`type`: K, value: V): HeaderValue[K, V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderValue[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderValue[?, ?], K /* <: String */, V] (val x: Self & (HeaderValue[K, V])) extends AnyVal {
      
      inline def setType(value: K): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type IntegerHeaderValue = HeaderValue[integer, Double]
  
  type LongHeaderValue = HeaderValue[long, Int64]
  
  trait Message extends StObject {
    
    var body: js.typedarray.Uint8Array
    
    var headers: MessageHeaders
  }
  object Message {
    
    inline def apply(body: js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHeaderValue = BooleanHeaderValue | ByteHeaderValue | ShortHeaderValue | IntegerHeaderValue | LongHeaderValue | BinaryHeaderValue | StringHeaderValue | TimestampHeaderValue | UuidHeaderValue
  
  type MessageHeaders = Record[String, MessageHeaderValue]
  
  type ShortHeaderValue = HeaderValue[short, Double]
  
  type StringHeaderValue = HeaderValue[string, String]
  
  type TimestampHeaderValue = HeaderValue[timestamp, js.Date]
  
  type UuidHeaderValue = HeaderValue[uuid, String]
}
