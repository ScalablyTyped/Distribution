package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/DeleteFileOutput", JSImport.Namespace)
@js.native
object typesDeleteFileOutputMod extends js.Object {
  @js.native
  trait DeleteFileOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The blob ID removed from the tree as part of deleting the file.</p>
      */
    var blobId: String = js.native
    /**
      * <p>The full commit ID of the commit that contains the change that deletes the file.</p>
      */
    var commitId: String = js.native
    /**
      * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file.</p>
      */
    var filePath: String = js.native
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the delete file change.</p>
      */
    var treeId: String = js.native
  }
  
}

