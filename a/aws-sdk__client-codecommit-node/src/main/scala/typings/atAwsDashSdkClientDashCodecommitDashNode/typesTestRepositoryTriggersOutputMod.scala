package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryTriggerExecutionFailureMod._UnmarshalledRepositoryTriggerExecutionFailure
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/TestRepositoryTriggersOutput", JSImport.Namespace)
@js.native
object typesTestRepositoryTriggersOutputMod extends js.Object {
  @js.native
  trait TestRepositoryTriggersOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.</p>
      */
    var failedExecutions: js.UndefOr[js.Array[_UnmarshalledRepositoryTriggerExecutionFailure]] = js.native
    /**
      * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
      */
    var successfulExecutions: js.UndefOr[js.Array[String]] = js.native
  }
  
}

