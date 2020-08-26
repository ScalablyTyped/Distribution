package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the conformance pack.
    */
  var ConformancePackArn: typings.awsSdk.configserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsSdk.configserviceMod.ConformancePackId = js.native
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * AWS service that created the conformance pack.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * Conformance pack template that is used to create a pack. The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *".
    */
  var DeliveryS3Bucket: typings.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * Last time when conformation pack update was requested. 
    */
  var LastUpdateRequestedTime: js.UndefOr[Date] = js.native
}

object ConformancePackDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    DeliveryS3Bucket: DeliveryS3Bucket
  ): ConformancePackDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackDetail]
  }
  @scala.inline
  implicit class ConformancePackDetailOps[Self <: ConformancePackDetail] (val x: Self) extends AnyVal {
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
    def setConformancePackArn(value: ConformancePackArn): Self = this.set("ConformancePackArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackId(value: ConformancePackId): Self = this.set("ConformancePackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = this.set("DeliveryS3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = this.set("ConformancePackInputParameters", js.Array(value :_*))
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = this.set("ConformancePackInputParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformancePackInputParameters: Self = this.set("ConformancePackInputParameters", js.undefined)
    @scala.inline
    def setCreatedBy(value: StringWithCharLimit256): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = this.set("DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryS3KeyPrefix: Self = this.set("DeliveryS3KeyPrefix", js.undefined)
    @scala.inline
    def setLastUpdateRequestedTime(value: Date): Self = this.set("LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateRequestedTime: Self = this.set("LastUpdateRequestedTime", js.undefined)
  }
  
}

