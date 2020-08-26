package typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.UnmarshalledRepositoryTrigger
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object GetRepositoryTriggersOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
  @scala.inline
  implicit class GetRepositoryTriggersOutputOps[Self <: GetRepositoryTriggersOutput] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: String): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
    @scala.inline
    def setTriggersVarargs(value: UnmarshalledRepositoryTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[UnmarshalledRepositoryTrigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
  
}

