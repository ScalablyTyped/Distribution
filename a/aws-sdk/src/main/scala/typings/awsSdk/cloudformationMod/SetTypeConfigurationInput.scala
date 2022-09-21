package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTypeConfigurationInput extends StObject {
  
  /**
    * The configuration data for the extension, in this account and region. The configuration data must be formatted as JSON, and validate against the schema returned in the ConfigurationSchema response element of API_DescribeType. For more information, see Defining account-level configuration data for an extension in the CloudFormation CLI User Guide.
    */
  var Configuration: TypeConfiguration
  
  /**
    * An alias by which to refer to this extension configuration data. Conditional: Specifying a configuration alias is required when setting a configuration for a resource type extension.
    */
  var ConfigurationAlias: js.UndefOr[TypeConfigurationAlias] = js.undefined
  
  /**
    * The type of extension. Conditional: You must specify ConfigurationArn, or Type and TypeName.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the extension, in this account and region. For public extensions, this will be the ARN assigned when you activate the type in this account and region. For private extensions, this will be the ARN assigned when you register the type in this account and region. Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an extension, but not for a specific extension version.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.undefined
  
  /**
    * The name of the extension. Conditional: You must specify ConfigurationArn, or Type and TypeName.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
}
object SetTypeConfigurationInput {
  
  inline def apply(Configuration: TypeConfiguration): SetTypeConfigurationInput = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTypeConfigurationInput]
  }
  
  extension [Self <: SetTypeConfigurationInput](x: Self) {
    
    inline def setConfiguration(value: TypeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAlias(value: TypeConfigurationAlias): Self = StObject.set(x, "ConfigurationAlias", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAliasUndefined: Self = StObject.set(x, "ConfigurationAlias", js.undefined)
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    inline def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
