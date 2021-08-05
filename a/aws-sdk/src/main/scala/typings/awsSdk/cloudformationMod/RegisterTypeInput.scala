package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTypeInput extends StObject {
  
  /**
    * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request token prevents CloudFormation from generating more than one version of a type from the same registeration request, even if the request is submitted multiple times. 
    */
  var ClientRequestToken: js.UndefOr[RequestToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the resource provider. If your resource type calls AWS APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the resource provider handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the resource provider handler, thereby supplying your resource provider with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Specifies logging configuration information for a type.
    */
  var LoggingConfig: js.UndefOr[typings.awsSdk.cloudformationMod.LoggingConfig] = js.undefined
  
  /**
    * A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register. For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.  The user registering the resource provider type must be able to access the the schema handler package in the S3 bucket. That is, the user needs to have GetObject permissions for the schema handler package. For more information, see Actions, Resources, and Condition Keys for Amazon S3 in the AWS Identity and Access Management User Guide. 
    */
  var SchemaHandlerPackage: S3Url
  
  /**
    * The kind of type. Currently, the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the type being registered. We recommend that type names adhere to the following pattern: company_or_organization::service::type.  The following organization namespaces are reserved and cannot be used in your resource type names:    Alexa     AMZN     Amazon     AWS     Custom     Dev    
    */
  var TypeName: typings.awsSdk.cloudformationMod.TypeName
}
object RegisterTypeInput {
  
  inline def apply(SchemaHandlerPackage: S3Url, TypeName: TypeName): RegisterTypeInput = {
    val __obj = js.Dynamic.literal(SchemaHandlerPackage = SchemaHandlerPackage.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTypeInput]
  }
  
  extension [Self <: RegisterTypeInput](x: Self) {
    
    inline def setClientRequestToken(value: RequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "LoggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "LoggingConfig", js.undefined)
    
    inline def setSchemaHandlerPackage(value: S3Url): Self = StObject.set(x, "SchemaHandlerPackage", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
