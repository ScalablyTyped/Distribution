package typings.awsSdkEventstreamCodec

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSplitMessageMod {
  
  @JSImport("@aws-sdk/eventstream-codec/dist-types/splitMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitMessage(hasByteLengthByteOffsetBuffer: js.typedarray.ArrayBufferView): MessageParts = ^.asInstanceOf[js.Dynamic].applyDynamic("splitMessage")(hasByteLengthByteOffsetBuffer.asInstanceOf[js.Any]).asInstanceOf[MessageParts]
  
  trait MessageParts extends StObject {
    
    var body: js.typedarray.Uint8Array
    
    var headers: js.typedarray.DataView
  }
  object MessageParts {
    
    inline def apply(body: js.typedarray.Uint8Array, headers: js.typedarray.DataView): MessageParts = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageParts]
    }
    
    extension [Self <: MessageParts](x: Self) {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.typedarray.DataView): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
