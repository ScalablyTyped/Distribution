package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.UnmarshalledRepositoryTrigger
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetRepositoryTriggersOutput", JSImport.Namespace)
@js.native
object typesGetRepositoryTriggersOutputMod extends js.Object {
  @js.native
  trait GetRepositoryTriggersOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The system-generated unique ID for the trigger.</p>
      */
    var configurationId: js.UndefOr[String] = js.native
    /**
      * <p>The JSON block of configuration information for each trigger.</p>
      */
    var triggers: js.UndefOr[js.Array[UnmarshalledRepositoryTrigger]] = js.native
  }
  
}

