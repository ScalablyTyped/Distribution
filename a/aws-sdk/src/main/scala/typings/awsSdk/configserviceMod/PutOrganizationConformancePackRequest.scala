package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOrganizationConformancePackRequest extends js.Object {
  
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results. AWS Config stores intermediate files while processing conformance pack template.  The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *". For more information, see Permissions for cross account bucket access.
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3Bucket] = js.native
  
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  
  /**
    * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  
  /**
    * Name of the organization conformance pack you want to create.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
  
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.configserviceMod.TemplateBody] = js.native
  
  /**
    * Location of file containing the template body. The uri must point to the conformance pack template (max size: 300 KB).  You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typings.awsSdk.configserviceMod.TemplateS3Uri] = js.native
}
object PutOrganizationConformancePackRequest {
  
  @scala.inline
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): PutOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConformancePackRequest]
  }
  
  @scala.inline
  implicit class PutOrganizationConformancePackRequestOps[Self <: PutOrganizationConformancePackRequest] (val x: Self) extends AnyVal {
    
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
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = this.set("OrganizationConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = this.set("ConformancePackInputParameters", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = this.set("ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConformancePackInputParameters: Self = this.set("ConformancePackInputParameters", js.undefined)
    
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = this.set("DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryS3Bucket: Self = this.set("DeliveryS3Bucket", js.undefined)
    
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = this.set("DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryS3KeyPrefix: Self = this.set("DeliveryS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = this.set("ExcludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = this.set("ExcludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAccounts: Self = this.set("ExcludedAccounts", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("TemplateBody", js.undefined)
    
    @scala.inline
    def setTemplateS3Uri(value: TemplateS3Uri): Self = this.set("TemplateS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateS3Uri: Self = this.set("TemplateS3Uri", js.undefined)
  }
}
