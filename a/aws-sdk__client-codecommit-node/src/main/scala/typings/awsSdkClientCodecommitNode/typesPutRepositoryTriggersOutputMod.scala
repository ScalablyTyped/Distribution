package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PutRepositoryTriggersOutput", JSImport.Namespace)
@js.native
object typesPutRepositoryTriggersOutputMod extends js.Object {
  @js.native
  trait PutRepositoryTriggersOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The system-generated unique ID for the create or update operation.</p>
      */
    var configurationId: js.UndefOr[String] = js.native
  }
  
}

