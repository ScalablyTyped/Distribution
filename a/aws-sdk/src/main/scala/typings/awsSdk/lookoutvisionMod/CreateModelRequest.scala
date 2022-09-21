package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to CreateModel completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from CreateModel. In this case, safely retry your call to CreateModel by using the same ClientToken parameter value.  If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from starting multiple training jobs. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to CreateModel. An idempotency token is active for 8 hours.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.lookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * A description for the version of the model.
    */
  var Description: js.UndefOr[ModelDescriptionMessage] = js.undefined
  
  /**
    * The identifier for your AWS KMS key. The key is used to encrypt training and test images copied into the service for model training. Your source images are unaffected. If this parameter is not specified, the copied images are encrypted by a key that AWS owns and manages.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.lookoutvisionMod.KmsKeyId] = js.undefined
  
  /**
    * The location where Amazon Lookout for Vision saves the training results.
    */
  var OutputConfig: typings.awsSdk.lookoutvisionMod.OutputConfig
  
  /**
    * The name of the project in which you want to create a model version.
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
  
  /**
    * A set of tags (key-value pairs) that you want to attach to the model.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelRequest {
  
  inline def apply(OutputConfig: OutputConfig, ProjectName: ProjectName): CreateModelRequest = {
    val __obj = js.Dynamic.literal(OutputConfig = OutputConfig.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
  
  extension [Self <: CreateModelRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: ModelDescriptionMessage): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
