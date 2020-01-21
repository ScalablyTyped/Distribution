package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetBranchOutput", JSImport.Namespace)
@js.native
object typesGetBranchOutputMod extends js.Object {
  @js.native
  trait GetBranchOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The name of the branch.</p>
      */
    var branch: js.UndefOr[UnmarshalledBranchInfo] = js.native
  }
  
}

