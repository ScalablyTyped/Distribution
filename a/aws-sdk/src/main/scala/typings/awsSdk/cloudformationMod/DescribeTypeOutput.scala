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
  def apply(
    Arn: TypeArn = null,
    DefaultVersionId: TypeVersionId = null,
    DeprecatedStatus: DeprecatedStatus = null,
    Description: Description = null,
    DocumentationUrl: OptionalSecureUrl = null,
    ExecutionRoleArn: RoleArn = null,
    LastUpdated: Timestamp = null,
    LoggingConfig: LoggingConfig = null,
    ProvisioningType: ProvisioningType = null,
    Schema: TypeSchema = null,
    SourceUrl: OptionalSecureUrl = null,
    TimeCreated: Timestamp = null,
    Type: RegistryType = null,
    TypeName: TypeName = null,
    Visibility: Visibility = null
  ): DescribeTypeOutput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DefaultVersionId != null) __obj.updateDynamic("DefaultVersionId")(DefaultVersionId.asInstanceOf[js.Any])
    if (DeprecatedStatus != null) __obj.updateDynamic("DeprecatedStatus")(DeprecatedStatus.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DocumentationUrl != null) __obj.updateDynamic("DocumentationUrl")(DocumentationUrl.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (LoggingConfig != null) __obj.updateDynamic("LoggingConfig")(LoggingConfig.asInstanceOf[js.Any])
    if (ProvisioningType != null) __obj.updateDynamic("ProvisioningType")(ProvisioningType.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    if (SourceUrl != null) __obj.updateDynamic("SourceUrl")(SourceUrl.asInstanceOf[js.Any])
    if (TimeCreated != null) __obj.updateDynamic("TimeCreated")(TimeCreated.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTypeOutput]
  }
}

