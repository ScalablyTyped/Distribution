package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommitOutputMod {
  
  trait GetCommitOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A commit data type object that contains information about the specified commit.</p>
      */
    var commit: UnmarshalledCommit
  }
  object GetCommitOutput {
    
    inline def apply($metadata: ResponseMetadata, commit: UnmarshalledCommit): GetCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommitOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCommitOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: UnmarshalledCommit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    }
  }
}
