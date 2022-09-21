package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointRequest extends StObject {
  
  /**
    * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon Comprehend will not return a ResourceInUseException. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend read access to trained custom models encrypted with a customer managed key (ModelKmsKeyId).
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger
  
  /**
    * This is the descriptive suffix that becomes part of the EndpointArn used for all subsequent requests to this resource. 
    */
  var EndpointName: ComprehendEndpointName
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
    */
  var ModelArn: ComprehendModelArn
  
  /**
    * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateEndpointRequest {
  
  inline def apply(
    DesiredInferenceUnits: InferenceUnitsInteger,
    EndpointName: ComprehendEndpointName,
    ModelArn: ComprehendModelArn
  ): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
  
  extension [Self <: CreateEndpointRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: ComprehendEndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
