package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeConfigurationDetails extends StObject {
  
  /**
    * The alias specified for this configuration, if one was specified when the configuration was set.
    */
  var Alias: js.UndefOr[TypeConfigurationAlias] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
    */
  var Arn: js.UndefOr[TypeConfigurationArn] = js.undefined
  
  /**
    * A JSON string specifying the configuration data for the extension, in this account and region. If a configuration hasn't been set for a specified extension, CloudFormation returns {}.
    */
  var Configuration: js.UndefOr[TypeConfiguration] = js.undefined
  
  /**
    * Whether this configuration data is the default configuration for the extension.
    */
  var IsDefaultConfiguration: js.UndefOr[typings.awsSdk.cloudformationMod.IsDefaultConfiguration] = js.undefined
  
  /**
    * When the configuration data was last updated for this extension. If a configuration hasn't been set for a specified extension, CloudFormation returns null.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the extension, in this account and region. For public extensions, this will be the ARN assigned when you activate the type in this account and region. For private extensions, this will be the ARN assigned when you register the type in this account and region.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.undefined
  
  /**
    * The name of the extension.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
}
object TypeConfigurationDetails {
  
  inline def apply(): TypeConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeConfigurationDetails]
  }
  
  extension [Self <: TypeConfigurationDetails](x: Self) {
    
    inline def setAlias(value: TypeConfigurationAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setArn(value: TypeConfigurationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setConfiguration(value: TypeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setIsDefaultConfiguration(value: IsDefaultConfiguration): Self = StObject.set(x, "IsDefaultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultConfigurationUndefined: Self = StObject.set(x, "IsDefaultConfiguration", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    inline def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
