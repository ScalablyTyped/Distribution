package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConformancePackRequest extends StObject {
  
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.undefined
  
  /**
    * Name of the conformance pack you want to create.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName
  
  /**
    * AWS Config stores intermediate files while processing conformance pack template.
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3Bucket] = js.undefined
  
  /**
    * The prefix for the Amazon S3 bucket. 
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.undefined
  
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.  You can only use a YAML template with one resource type, that is, config rule and a remediation action.  
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.configserviceMod.TemplateBody] = js.undefined
  
  /**
    * Location of file containing the template body (s3://bucketname/prefix). The uri must point to the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the conformance pack.   You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typings.awsSdk.configserviceMod.TemplateS3Uri] = js.undefined
}
object PutConformancePackRequest {
  
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): PutConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConformancePackRequest]
  }
  
  @scala.inline
  implicit class PutConformancePackRequestMutableBuilder[Self <: PutConformancePackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = StObject.set(x, "ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParametersUndefined: Self = StObject.set(x, "ConformancePackInputParameters", js.undefined)
    
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = StObject.set(x, "ConformancePackInputParameters", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = StObject.set(x, "DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3BucketUndefined: Self = StObject.set(x, "DeliveryS3Bucket", js.undefined)
    
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = StObject.set(x, "DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3KeyPrefixUndefined: Self = StObject.set(x, "DeliveryS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    @scala.inline
    def setTemplateS3Uri(value: TemplateS3Uri): Self = StObject.set(x, "TemplateS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateS3UriUndefined: Self = StObject.set(x, "TemplateS3Uri", js.undefined)
  }
}
