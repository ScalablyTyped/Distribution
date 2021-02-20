package typings.awsSdkEventstreamMarshaller

import typings.std.ArrayBufferView
import typings.std.DataView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMessageMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/splitMessage", "splitMessage")
  @js.native
  def splitMessage(hasByteLengthByteOffsetBuffer: ArrayBufferView): MessageParts = js.native
  
  @js.native
  trait MessageParts extends StObject {
    
    var body: Uint8Array = js.native
    
    var headers: DataView = js.native
  }
  object MessageParts {
    
    @scala.inline
    def apply(body: Uint8Array, headers: DataView): MessageParts = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageParts]
    }
    
    @scala.inline
    implicit class MessagePartsMutableBuilder[Self <: MessageParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: DataView): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
