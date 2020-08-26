package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  /**
    * The ID of the default version of the type. The default version is used when the type version is not specified. To set the default version of a type, use  SetTypeDefaultVersion . 
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.native
  /**
    * The deprecation status of the type. Valid values include:    LIVE: The type is registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The type has been deregistered and can no longer be used in CloudFormation operations.   
    */
  var DeprecatedStatus: js.UndefOr[typings.awsSdk.cloudformationMod.DeprecatedStatus] = js.native
  /**
    * The description of the registered type.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The URL of a page providing detailed documentation for this type.
    */
  var DocumentationUrl: js.UndefOr[OptionalSecureUrl] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * Whether the specified type version is set as the default version.
    */
  var IsDefaultVersion: js.UndefOr[typings.awsSdk.cloudformationMod.IsDefaultVersion] = js.native
  /**
    * When the specified type version was registered.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * Contains logging configuration information for a type.
    */
  var LoggingConfig: js.UndefOr[typings.awsSdk.cloudformationMod.LoggingConfig] = js.native
  /**
    * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted. Valid values include:    FULLY_MUTABLE: The type includes an update handler to process updates to the type during stack update operations.    IMMUTABLE: The type does not include an update handler, so the type cannot be updated and must instead be replaced during stack update operations.    NON_PROVISIONABLE: The type does not include all of the following handlers, and therefore cannot actually be provisioned.   create   read   delete    
    */
  var ProvisioningType: js.UndefOr[typings.awsSdk.cloudformationMod.ProvisioningType] = js.native
  /**
    * The schema that defines the type. For more information on type schemas, see Resource Provider Schema in the CloudFormation CLI User Guide.
    */
  var Schema: js.UndefOr[TypeSchema] = js.native
  /**
    * The URL of the source code for the type.
    */
  var SourceUrl: js.UndefOr[OptionalSecureUrl] = js.native
  /**
    * When the specified type version was registered.
    */
  var TimeCreated: js.UndefOr[Timestamp] = js.native
  /**
    * The kind of type.  Currently the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the registered type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
  /**
    * The scope at which the type is visible and usable in CloudFormation operations. Valid values include:    PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.    PUBLIC: The type is publically visible and usable within any Amazon account.  
    */
  var Visibility: js.UndefOr[typings.awsSdk.cloudformationMod.Visibility] = js.native
}

object DescribeTypeOutput {
  @scala.inline
  def apply(): DescribeTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeOutput]
  }
  @scala.inline
  implicit class DescribeTypeOutputOps[Self <: DescribeTypeOutput] (val x: Self) extends AnyVal {
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
    def setArn(value: TypeArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setDefaultVersionId(value: TypeVersionId): Self = this.set("DefaultVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("DefaultVersionId", js.undefined)
    @scala.inline
    def setDeprecatedStatus(value: DeprecatedStatus): Self = this.set("DeprecatedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedStatus: Self = this.set("DeprecatedStatus", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDocumentationUrl(value: OptionalSecureUrl): Self = this.set("DocumentationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationUrl: Self = this.set("DocumentationUrl", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = this.set("IsDefaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("IsDefaultVersion", js.undefined)
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("LoggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("LoggingConfig", js.undefined)
    @scala.inline
    def setProvisioningType(value: ProvisioningType): Self = this.set("ProvisioningType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningType: Self = this.set("ProvisioningType", js.undefined)
    @scala.inline
    def setSchema(value: TypeSchema): Self = this.set("Schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
    @scala.inline
    def setSourceUrl(value: OptionalSecureUrl): Self = this.set("SourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUrl: Self = this.set("SourceUrl", js.undefined)
    @scala.inline
    def setTimeCreated(value: Timestamp): Self = this.set("TimeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("TimeCreated", js.undefined)
    @scala.inline
    def setType(value: RegistryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setTypeName(value: TypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
    @scala.inline
    def setVisibility(value: Visibility): Self = this.set("Visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("Visibility", js.undefined)
  }
  
}

