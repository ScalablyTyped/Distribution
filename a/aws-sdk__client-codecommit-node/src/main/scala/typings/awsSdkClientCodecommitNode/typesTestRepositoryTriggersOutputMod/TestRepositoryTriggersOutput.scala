package typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod.UnmarshalledRepositoryTriggerExecutionFailure
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRepositoryTriggersOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.</p>
    */
  var failedExecutions: js.UndefOr[js.Array[UnmarshalledRepositoryTriggerExecutionFailure]] = js.undefined
  /**
    * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
    */
  var successfulExecutions: js.UndefOr[js.Array[String]] = js.undefined
}

object TestRepositoryTriggersOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    failedExecutions: js.Array[UnmarshalledRepositoryTriggerExecutionFailure] = null,
    successfulExecutions: js.Array[String] = null
  ): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (failedExecutions != null) __obj.updateDynamic("failedExecutions")(failedExecutions.asInstanceOf[js.Any])
    if (successfulExecutions != null) __obj.updateDynamic("successfulExecutions")(successfulExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
}

