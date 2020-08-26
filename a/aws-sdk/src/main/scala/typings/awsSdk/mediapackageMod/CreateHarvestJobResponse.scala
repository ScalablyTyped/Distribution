package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHarvestJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the HarvestJob.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The ID of the Channel that the HarvestJob will harvest from.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The time the HarvestJob was submitted
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The end of the time-window which will be harvested.
    */
  var EndTime: js.UndefOr[string] = js.native
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: js.UndefOr[string] = js.native
  var S3Destination: js.UndefOr[typings.awsSdk.mediapackageMod.S3Destination] = js.native
  /**
    * The start of the time-window which will be harvested.
    */
  var StartTime: js.UndefOr[string] = js.native
  /**
    * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for
  HarvestJobs as they succeed or fail. In the event of failure, the CloudWatch Event will
  include an explanation of why the HarvestJob failed.
    */
  var Status: js.UndefOr[typings.awsSdk.mediapackageMod.Status] = js.native
}

object CreateHarvestJobResponse {
  @scala.inline
  def apply(): CreateHarvestJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHarvestJobResponse]
  }
  @scala.inline
  implicit class CreateHarvestJobResponseOps[Self <: CreateHarvestJobResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("ChannelId", js.undefined)
    @scala.inline
    def setCreatedAt(value: string): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setEndTime(value: string): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setOriginEndpointId(value: string): Self = this.set("OriginEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginEndpointId: Self = this.set("OriginEndpointId", js.undefined)
    @scala.inline
    def setS3Destination(value: S3Destination): Self = this.set("S3Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Destination: Self = this.set("S3Destination", js.undefined)
    @scala.inline
    def setStartTime(value: string): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

