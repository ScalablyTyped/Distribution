package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesMessageMod.UnmarshalledMessage
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReceiveMessageOutputMod {
  
  trait ReceiveMessageOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of messages.</p>
      */
    var Messages: js.UndefOr[js.Array[UnmarshalledMessage]] = js.undefined
  }
  object ReceiveMessageOutput {
    
    inline def apply($metadata: ResponseMetadata): ReceiveMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveMessageOutput]
    }
    
    extension [Self <: ReceiveMessageOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[UnmarshalledMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
      
      inline def setMessagesVarargs(value: UnmarshalledMessage*): Self = StObject.set(x, "Messages", js.Array(value*))
    }
  }
}
