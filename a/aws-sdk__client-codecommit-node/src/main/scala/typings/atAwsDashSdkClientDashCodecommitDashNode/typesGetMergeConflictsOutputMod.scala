package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetMergeConflictsOutput", JSImport.Namespace)
@js.native
object typesGetMergeConflictsOutputMod extends js.Object {
  @js.native
  trait GetMergeConflictsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The commit ID of the destination commit specifier that was used in the merge evaluation.</p>
      */
    var destinationCommitId: String = js.native
    /**
      * <p>A Boolean value that indicates whether the code is mergable by the specified merge option.</p>
      */
    var mergeable: Boolean = js.native
    /**
      * <p>The commit ID of the source commit specifier that was used in the merge evaluation.</p>
      */
    var sourceCommitId: String = js.native
  }
  
}

