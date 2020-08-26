package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastExportJobRequest extends js.Object {
  /**
    * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket. If encryption is used, Destination must include an AWS Key Management Service (KMS) key. The IAM role must allow Amazon Forecast permission to access the key.
    */
  var Destination: DataDestination = js.native
  /**
    * The Amazon Resource Name (ARN) of the forecast that you want to export.
    */
  var ForecastArn: Arn = js.native
  /**
    * The name for the forecast export job.
    */
  var ForecastExportJobName: Name = js.native
  /**
    * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.native
}

object CreateForecastExportJobRequest {
  @scala.inline
  def apply(Destination: DataDestination, ForecastArn: Arn, ForecastExportJobName: Name): CreateForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], ForecastArn = ForecastArn.asInstanceOf[js.Any], ForecastExportJobName = ForecastExportJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastExportJobRequest]
  }
  @scala.inline
  implicit class CreateForecastExportJobRequestOps[Self <: CreateForecastExportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestination(value: DataDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setForecastArn(value: Arn): Self = this.set("ForecastArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setForecastExportJobName(value: Name): Self = this.set("ForecastExportJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

