package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInputSchemaRequest extends js.Object {
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration] = js.native
  /**
    * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN] = js.native
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3Configuration] = js.native
  /**
    * The ARN of the role that is used to access the streaming source.
    */
  var ServiceExecutionRole: RoleARN = js.native
}

object DiscoverInputSchemaRequest {
  @scala.inline
  def apply(ServiceExecutionRole: RoleARN): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal(ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
  @scala.inline
  implicit class DiscoverInputSchemaRequestOps[Self <: DiscoverInputSchemaRequest] (val x: Self) extends AnyVal {
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
    def setServiceExecutionRole(value: RoleARN): Self = this.set("ServiceExecutionRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = this.set("InputProcessingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProcessingConfiguration: Self = this.set("InputProcessingConfiguration", js.undefined)
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = this.set("InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStartingPositionConfiguration: Self = this.set("InputStartingPositionConfiguration", js.undefined)
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    @scala.inline
    def setS3Configuration(value: S3Configuration): Self = this.set("S3Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Configuration: Self = this.set("S3Configuration", js.undefined)
  }
  
}

