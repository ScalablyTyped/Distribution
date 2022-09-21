package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeConfigurationIdentifier extends StObject {
  
  /**
    * The type of extension.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the extension, in this account and region. For public extensions, this will be the ARN assigned when you activate the type in this account and region. For private extensions, this will be the ARN assigned when you register the type in this account and region.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.undefined
  
  /**
    * The alias specified for this configuration, if one was specified when the configuration was set.
    */
  var TypeConfigurationAlias: js.UndefOr[typings.awsSdk.cloudformationMod.TypeConfigurationAlias] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the configuration, in this account and region.
    */
  var TypeConfigurationArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeConfigurationArn] = js.undefined
  
  /**
    * The name of the extension type to which this configuration applies.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
}
object TypeConfigurationIdentifier {
  
  inline def apply(): TypeConfigurationIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeConfigurationIdentifier]
  }
  
  extension [Self <: TypeConfigurationIdentifier](x: Self) {
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    inline def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    inline def setTypeConfigurationAlias(value: TypeConfigurationAlias): Self = StObject.set(x, "TypeConfigurationAlias", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationAliasUndefined: Self = StObject.set(x, "TypeConfigurationAlias", js.undefined)
    
    inline def setTypeConfigurationArn(value: TypeConfigurationArn): Self = StObject.set(x, "TypeConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationArnUndefined: Self = StObject.set(x, "TypeConfigurationArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
