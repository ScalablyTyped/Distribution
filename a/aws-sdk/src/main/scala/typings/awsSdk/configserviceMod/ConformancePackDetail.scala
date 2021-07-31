package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackDetail extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the conformance pack.
    */
  var ConformancePackArn: typings.awsSdk.configserviceMod.ConformancePackArn
  
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsSdk.configserviceMod.ConformancePackId
  
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.undefined
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName
  
  /**
    * AWS service that created the conformance pack.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * Conformance pack template that is used to create a pack. The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *".
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3Bucket] = js.undefined
  
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.undefined
  
  /**
    * Last time when conformation pack update was requested. 
    */
  var LastUpdateRequestedTime: js.UndefOr[Date] = js.undefined
}
object ConformancePackDetail {
  
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName
  ): ConformancePackDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackDetail]
  }
  
  @scala.inline
  implicit class ConformancePackDetailMutableBuilder[Self <: ConformancePackDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackId(value: ConformancePackId): Self = StObject.set(x, "ConformancePackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = StObject.set(x, "ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParametersUndefined: Self = StObject.set(x, "ConformancePackInputParameters", js.undefined)
    
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = StObject.set(x, "ConformancePackInputParameters", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: StringWithCharLimit256): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = StObject.set(x, "DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3BucketUndefined: Self = StObject.set(x, "DeliveryS3Bucket", js.undefined)
    
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = StObject.set(x, "DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3KeyPrefixUndefined: Self = StObject.set(x, "DeliveryS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setLastUpdateRequestedTime(value: Date): Self = StObject.set(x, "LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateRequestedTimeUndefined: Self = StObject.set(x, "LastUpdateRequestedTime", js.undefined)
  }
}
