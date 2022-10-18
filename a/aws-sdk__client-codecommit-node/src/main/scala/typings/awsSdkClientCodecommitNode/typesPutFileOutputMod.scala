package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutFileOutputMod {
  
  trait PutFileOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The ID of the blob, which is its SHA-1 pointer.</p>
      */
    var blobId: String
    
    /**
      * <p>The full SHA of the commit that contains this file change.</p>
      */
    var commitId: String
    
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains this file change.</p>
      */
    var treeId: String
  }
  object PutFileOutput {
    
    inline def apply($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): PutFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutFileOutput]
    }
    
    extension [Self <: PutFileOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    }
  }
}
