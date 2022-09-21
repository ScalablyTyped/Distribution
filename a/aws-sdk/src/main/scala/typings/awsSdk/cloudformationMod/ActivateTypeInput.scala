package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateTypeInput extends StObject {
  
  /**
    * Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated. The default is true.
    */
  var AutoUpdate: js.UndefOr[typings.awsSdk.cloudformationMod.AutoUpdate] = js.undefined
  
  /**
    * The name of the IAM execution role to use to activate the extension.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  var LoggingConfig: js.UndefOr[typings.awsSdk.cloudformationMod.LoggingConfig] = js.undefined
  
  /**
    * The major version of this extension you want to activate, if multiple major versions are available. The default is the latest major version. CloudFormation uses the latest available minor version of the major version selected. You can specify MajorVersion or VersionBump, but not both.
    */
  var MajorVersion: js.UndefOr[typings.awsSdk.cloudformationMod.MajorVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the public extension. Conditional: You must specify PublicTypeArn, or TypeName, Type, and PublisherId.
    */
  var PublicTypeArn: js.UndefOr[ThirdPartyTypeArn] = js.undefined
  
  /**
    * The ID of the extension publisher. Conditional: You must specify PublicTypeArn, or TypeName, Type, and PublisherId.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.cloudformationMod.PublisherId] = js.undefined
  
  /**
    * The extension type. Conditional: You must specify PublicTypeArn, or TypeName, Type, and PublisherId.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The name of the extension. Conditional: You must specify PublicTypeArn, or TypeName, Type, and PublisherId.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
  
  /**
    * An alias to assign to the public extension, in this account and region. If you specify an alias for the extension, CloudFormation treats the alias as the extension type name within this account and region. You must use the alias to refer to the extension in your templates, API calls, and CloudFormation console. An extension alias must be unique within a given account and region. You can activate the same public resource multiple times in the same account and region, using different type name aliases.
    */
  var TypeNameAlias: js.UndefOr[TypeName] = js.undefined
  
  /**
    * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdate.    MAJOR: CloudFormation updates the extension to the newest major version, if one is available.    MINOR: CloudFormation updates the extension to the newest minor version, if one is available.  
    */
  var VersionBump: js.UndefOr[typings.awsSdk.cloudformationMod.VersionBump] = js.undefined
}
object ActivateTypeInput {
  
  inline def apply(): ActivateTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateTypeInput]
  }
  
  extension [Self <: ActivateTypeInput](x: Self) {
    
    inline def setAutoUpdate(value: AutoUpdate): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "AutoUpdate", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "LoggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "LoggingConfig", js.undefined)
    
    inline def setMajorVersion(value: MajorVersion): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "MajorVersion", js.undefined)
    
    inline def setPublicTypeArn(value: ThirdPartyTypeArn): Self = StObject.set(x, "PublicTypeArn", value.asInstanceOf[js.Any])
    
    inline def setPublicTypeArnUndefined: Self = StObject.set(x, "PublicTypeArn", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameAlias(value: TypeName): Self = StObject.set(x, "TypeNameAlias", value.asInstanceOf[js.Any])
    
    inline def setTypeNameAliasUndefined: Self = StObject.set(x, "TypeNameAlias", js.undefined)
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionBump(value: VersionBump): Self = StObject.set(x, "VersionBump", value.asInstanceOf[js.Any])
    
    inline def setVersionBumpUndefined: Self = StObject.set(x, "VersionBump", js.undefined)
  }
}
