package typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod.UnmarshalledRepositoryTriggerExecutionFailure
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var failedExecutions: js.UndefOr[js.Array[UnmarshalledRepositoryTriggerExecutionFailure]] = js.native
  /**
    * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
    */
  var successfulExecutions: js.UndefOr[js.Array[String]] = js.native
}

object TestRepositoryTriggersOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
  @scala.inline
  implicit class TestRepositoryTriggersOutputOps[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedExecutionsVarargs(value: UnmarshalledRepositoryTriggerExecutionFailure*): Self = this.set("failedExecutions", js.Array(value :_*))
    @scala.inline
    def setFailedExecutions(value: js.Array[UnmarshalledRepositoryTriggerExecutionFailure]): Self = this.set("failedExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedExecutions: Self = this.set("failedExecutions", js.undefined)
    @scala.inline
    def setSuccessfulExecutionsVarargs(value: String*): Self = this.set("successfulExecutions", js.Array(value :_*))
    @scala.inline
    def setSuccessfulExecutions(value: js.Array[String]): Self = this.set("successfulExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulExecutions: Self = this.set("successfulExecutions", js.undefined)
  }
  
}

