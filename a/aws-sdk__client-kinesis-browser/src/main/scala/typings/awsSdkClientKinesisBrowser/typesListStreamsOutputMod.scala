package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListStreamsOutputMod {
  
  trait ListStreamsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>If set to <code>true</code>, there are more streams available to list.</p>
      */
    var HasMoreStreams: Boolean
    
    /**
      * <p>The names of the streams that are associated with the AWS account making the <code>ListStreams</code> request.</p>
      */
    var StreamNames: js.Array[String]
  }
  object ListStreamsOutput {
    
    inline def apply($metadata: ResponseMetadata, HasMoreStreams: Boolean, StreamNames: js.Array[String]): ListStreamsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStreamsOutput]
    }
    
    extension [Self <: ListStreamsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setHasMoreStreams(value: Boolean): Self = StObject.set(x, "HasMoreStreams", value.asInstanceOf[js.Any])
      
      inline def setStreamNames(value: js.Array[String]): Self = StObject.set(x, "StreamNames", value.asInstanceOf[js.Any])
      
      inline def setStreamNamesVarargs(value: String*): Self = StObject.set(x, "StreamNames", js.Array(value :_*))
    }
  }
}
