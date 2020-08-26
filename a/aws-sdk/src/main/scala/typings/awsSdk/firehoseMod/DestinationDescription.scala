package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationDescription extends js.Object {
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsSdk.firehoseMod.DestinationId = js.native
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.ElasticsearchDestinationDescription] = js.native
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.ExtendedS3DestinationDescription] = js.native
  /**
    * Describes the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.HttpEndpointDestinationDescription] = js.native
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.RedshiftDestinationDescription] = js.native
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationDescription] = js.native
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.SplunkDestinationDescription] = js.native
}

object DestinationDescription {
  @scala.inline
  def apply(DestinationId: DestinationId): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationDescription]
  }
  @scala.inline
  implicit class DestinationDescriptionOps[Self <: DestinationDescription] (val x: Self) extends AnyVal {
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
    def setDestinationId(value: DestinationId): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setElasticsearchDestinationDescription(value: ElasticsearchDestinationDescription): Self = this.set("ElasticsearchDestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchDestinationDescription: Self = this.set("ElasticsearchDestinationDescription", js.undefined)
    @scala.inline
    def setExtendedS3DestinationDescription(value: ExtendedS3DestinationDescription): Self = this.set("ExtendedS3DestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedS3DestinationDescription: Self = this.set("ExtendedS3DestinationDescription", js.undefined)
    @scala.inline
    def setHttpEndpointDestinationDescription(value: HttpEndpointDestinationDescription): Self = this.set("HttpEndpointDestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEndpointDestinationDescription: Self = this.set("HttpEndpointDestinationDescription", js.undefined)
    @scala.inline
    def setRedshiftDestinationDescription(value: RedshiftDestinationDescription): Self = this.set("RedshiftDestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftDestinationDescription: Self = this.set("RedshiftDestinationDescription", js.undefined)
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = this.set("S3DestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DestinationDescription: Self = this.set("S3DestinationDescription", js.undefined)
    @scala.inline
    def setSplunkDestinationDescription(value: SplunkDestinationDescription): Self = this.set("SplunkDestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplunkDestinationDescription: Self = this.set("SplunkDestinationDescription", js.undefined)
  }
  
}

