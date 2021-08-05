package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDocumentAnalysisRequest extends StObject {
  
  /**
    * The idempotent token that you use to identify the start request. If you use the same token with multiple StartDocumentAnalysis requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. For more information, see Calling Amazon Textract Asynchronous Operations.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.textractMod.ClientRequestToken] = js.undefined
  
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: typings.awsSdk.textractMod.DocumentLocation
  
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected form data. To perform both types of analysis, add TABLES and FORMS to FeatureTypes. All lines and words detected in the document are included in the response (including text that isn't related to the value of FeatureTypes). 
    */
  var FeatureTypes: typings.awsSdk.textractMod.FeatureTypes
  
  /**
    * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document that the completion notification corresponds to (such as a tax form or a receipt).
    */
  var JobTag: js.UndefOr[typings.awsSdk.textractMod.JobTag] = js.undefined
  
  /**
    * The KMS key used to encrypt the inference results. This can be in either Key ID or Key Alias format. When a KMS key is provided, the KMS key will be used for server-side encryption of the objects in the customer bucket. When this parameter is not enabled, the result will be encrypted server side,using SSE-S3.
    */
  var KMSKeyId: js.UndefOr[typings.awsSdk.textractMod.KMSKeyId] = js.undefined
  
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.textractMod.NotificationChannel] = js.undefined
  
  /**
    * Sets if the output will go to a customer defined bucket. By default, Amazon Textract will save the results internally to be accessed by the GetDocumentAnalysis operation.
    */
  var OutputConfig: js.UndefOr[typings.awsSdk.textractMod.OutputConfig] = js.undefined
}
object StartDocumentAnalysisRequest {
  
  inline def apply(DocumentLocation: DocumentLocation, FeatureTypes: FeatureTypes): StartDocumentAnalysisRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any], FeatureTypes = FeatureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentAnalysisRequest]
  }
  
  extension [Self <: StartDocumentAnalysisRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDocumentLocation(value: DocumentLocation): Self = StObject.set(x, "DocumentLocation", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypes(value: FeatureTypes): Self = StObject.set(x, "FeatureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesVarargs(value: FeatureType*): Self = StObject.set(x, "FeatureTypes", js.Array(value :_*))
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
  }
}
