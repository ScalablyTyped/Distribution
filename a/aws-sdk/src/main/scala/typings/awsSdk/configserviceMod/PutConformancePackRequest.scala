package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConformancePackRequest extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Name of the conformance pack you want to create.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * AWS Config stores intermediate files while processing conformance pack template.
    */
  var DeliveryS3Bucket: typings.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket. 
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.  You can only use a YAML template with one resource type, that is, config rule and a remediation action.  
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.configserviceMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body (s3://bucketname/prefix). The uri must point to the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the conformance pack.   You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typings.awsSdk.configserviceMod.TemplateS3Uri] = js.native
}

object PutConformancePackRequest {
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    DeliveryS3Bucket: DeliveryS3Bucket,
    ConformancePackInputParameters: ConformancePackInputParameters = null,
    DeliveryS3KeyPrefix: DeliveryS3KeyPrefix = null,
    TemplateBody: TemplateBody = null,
    TemplateS3Uri: TemplateS3Uri = null
  ): PutConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any], DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any])
    if (ConformancePackInputParameters != null) __obj.updateDynamic("ConformancePackInputParameters")(ConformancePackInputParameters.asInstanceOf[js.Any])
    if (DeliveryS3KeyPrefix != null) __obj.updateDynamic("DeliveryS3KeyPrefix")(DeliveryS3KeyPrefix.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    if (TemplateS3Uri != null) __obj.updateDynamic("TemplateS3Uri")(TemplateS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConformancePackRequest]
  }
}

