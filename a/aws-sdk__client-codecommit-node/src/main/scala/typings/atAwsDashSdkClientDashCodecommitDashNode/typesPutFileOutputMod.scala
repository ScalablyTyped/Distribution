package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PutFileOutput", JSImport.Namespace)
@js.native
object typesPutFileOutputMod extends js.Object {
  @js.native
  trait PutFileOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The ID of the blob, which is its SHA-1 pointer.</p>
      */
    var blobId: String = js.native
    /**
      * <p>The full SHA of the commit that contains this file change.</p>
      */
    var commitId: String = js.native
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains this file change.</p>
      */
    var treeId: String = js.native
  }
  
}

