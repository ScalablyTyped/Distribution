package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentDeliveryDestination extends js.Object {
  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.native
  /**
    * Configuration information for delivery of data set contents to Amazon S3.
    */
  var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.native
}

object DatasetContentDeliveryDestination {
  @scala.inline
  def apply(): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
  @scala.inline
  implicit class DatasetContentDeliveryDestinationOps[Self <: DatasetContentDeliveryDestination] (val x: Self) extends AnyVal {
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
    def setIotEventsDestinationConfiguration(value: IotEventsDestinationConfiguration): Self = this.set("iotEventsDestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotEventsDestinationConfiguration: Self = this.set("iotEventsDestinationConfiguration", js.undefined)
    @scala.inline
    def setS3DestinationConfiguration(value: S3DestinationConfiguration): Self = this.set("s3DestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DestinationConfiguration: Self = this.set("s3DestinationConfiguration", js.undefined)
  }
  
}

