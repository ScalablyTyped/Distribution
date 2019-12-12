package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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

