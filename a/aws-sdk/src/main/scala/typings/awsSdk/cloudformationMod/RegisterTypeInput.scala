package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTypeInput extends js.Object {
  
  /**
    * A unique identifier that acts as an idempotency key for this registration request. Specifying a client request token prevents CloudFormation from generating more than one version of a type from the same registeration request, even if the request is submitted multiple times. 
    */
  var ClientRequestToken: js.UndefOr[RequestToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the resource provider. If your resource type calls AWS APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the resource provider handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the resource provider handler, thereby supplying your resource provider with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * Specifies logging configuration information for a type.
    */
  var LoggingConfig: js.UndefOr[typings.awsSdk.cloudformationMod.LoggingConfig] = js.native
  
  /**
    * A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register. For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.  The user registering the resource provider type must be able to access the the schema handler package in the S3 bucket. That is, the user needs to have GetObject permissions for the schema handler package. For more information, see Actions, Resources, and Condition Keys for Amazon S3 in the AWS Identity and Access Management User Guide. 
    */
  var SchemaHandlerPackage: S3Url = js.native
  
  /**
    * The kind of type. Currently, the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  
  /**
    * The name of the type being registered. We recommend that type names adhere to the following pattern: company_or_organization::service::type.  The following organization namespaces are reserved and cannot be used in your resource type names:    Alexa     AMZN     Amazon     AWS     Custom     Dev    
    */
  var TypeName: typings.awsSdk.cloudformationMod.TypeName = js.native
}
object RegisterTypeInput {
  
  @scala.inline
  def apply(SchemaHandlerPackage: S3Url, TypeName: TypeName): RegisterTypeInput = {
    val __obj = js.Dynamic.literal(SchemaHandlerPackage = SchemaHandlerPackage.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTypeInput]
  }
  
  @scala.inline
  implicit class RegisterTypeInputOps[Self <: RegisterTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchemaHandlerPackage(value: S3Url): Self = this.set("SchemaHandlerPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: RequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("LoggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("LoggingConfig", js.undefined)
    
    @scala.inline
    def setType(value: RegistryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
