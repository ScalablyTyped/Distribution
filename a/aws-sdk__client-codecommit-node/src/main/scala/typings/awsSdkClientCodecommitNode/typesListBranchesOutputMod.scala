package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/ListBranchesOutput", JSImport.Namespace)
@js.native
object typesListBranchesOutputMod extends js.Object {
  @js.native
  trait ListBranchesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The list of branch names.</p>
      */
    var branches: js.UndefOr[js.Array[String]] = js.native
    /**
      * <p>An enumeration token that returns the batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
  }
  
}

