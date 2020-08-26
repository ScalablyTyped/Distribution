package typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesReplicaSettingsDescriptionMod.UnmarshalledReplicaSettingsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The name of the global table.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.native
  /**
    * <p>The region specific settings for the global table.</p>
    */
  var ReplicaSettings: js.UndefOr[js.Array[UnmarshalledReplicaSettingsDescription]] = js.native
}

object DescribeGlobalTableSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
  @scala.inline
  implicit class DescribeGlobalTableSettingsOutputOps[Self <: DescribeGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
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
    def setGlobalTableName(value: String): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableName: Self = this.set("GlobalTableName", js.undefined)
    @scala.inline
    def setReplicaSettingsVarargs(value: UnmarshalledReplicaSettingsDescription*): Self = this.set("ReplicaSettings", js.Array(value :_*))
    @scala.inline
    def setReplicaSettings(value: js.Array[UnmarshalledReplicaSettingsDescription]): Self = this.set("ReplicaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaSettings: Self = this.set("ReplicaSettings", js.undefined)
  }
  
}

