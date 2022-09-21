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
    * The Amazon Web Services service that created the conformance pack.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket where Config stores conformance pack templates.   This field is optional. 
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3Bucket] = js.undefined
  
  /**
    * The prefix for the Amazon S3 bucket.  This field is optional. 
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.undefined
  
  /**
    * The last time a conformation pack update was requested. 
    */
  var LastUpdateRequestedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that contains the name or Amazon Resource Name (ARN) of the Amazon Web Services Systems Manager document (SSM document) and the version of the SSM document that is used to create a conformance pack.
    */
  var TemplateSSMDocumentDetails: js.UndefOr[typings.awsSdk.configserviceMod.TemplateSSMDocumentDetails] = js.undefined
}
object ConformancePackDetail {
  
  inline def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName
  ): ConformancePackDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackDetail]
  }
  
  extension [Self <: ConformancePackDetail](x: Self) {
    
    inline def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    inline def setConformancePackId(value: ConformancePackId): Self = StObject.set(x, "ConformancePackId", value.asInstanceOf[js.Any])
    
    inline def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = StObject.set(x, "ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    inline def setConformancePackInputParametersUndefined: Self = StObject.set(x, "ConformancePackInputParameters", js.undefined)
    
    inline def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = StObject.set(x, "ConformancePackInputParameters", js.Array(value*))
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: StringWithCharLimit256): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = StObject.set(x, "DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3BucketUndefined: Self = StObject.set(x, "DeliveryS3Bucket", js.undefined)
    
    inline def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = StObject.set(x, "DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3KeyPrefixUndefined: Self = StObject.set(x, "DeliveryS3KeyPrefix", js.undefined)
    
    inline def setLastUpdateRequestedTime(value: js.Date): Self = StObject.set(x, "LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateRequestedTimeUndefined: Self = StObject.set(x, "LastUpdateRequestedTime", js.undefined)
    
    inline def setTemplateSSMDocumentDetails(value: TemplateSSMDocumentDetails): Self = StObject.set(x, "TemplateSSMDocumentDetails", value.asInstanceOf[js.Any])
    
    inline def setTemplateSSMDocumentDetailsUndefined: Self = StObject.set(x, "TemplateSSMDocumentDetails", js.undefined)
  }
}
