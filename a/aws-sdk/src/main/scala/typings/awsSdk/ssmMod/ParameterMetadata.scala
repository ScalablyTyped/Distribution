package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterMetadata extends StObject {
  
  /**
    * A parameter name can include only the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[typings.awsSdk.ssmMod.AllowedPattern] = js.undefined
  
  /**
    * The data type of the parameter, such as text or aws:ec2:image. The default is text.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.undefined
  
  /**
    * Description of the parameter actions.
    */
  var Description: js.UndefOr[ParameterDescription] = js.undefined
  
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
  
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.undefined
  
  /**
    * The parameter name.
    */
  var Name: js.UndefOr[PSParameterName] = js.undefined
  
  /**
    * A list of policies associated with a parameter.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.undefined
  
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.undefined
  
  /**
    * The type of parameter. Valid parameter types include the following: String, StringList, and SecureString.
    */
  var Type: js.UndefOr[ParameterType] = js.undefined
  
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.undefined
}
object ParameterMetadata {
  
  inline def apply(): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMetadata]
  }
  
  extension [Self <: ParameterMetadata](x: Self) {
    
    inline def setAllowedPattern(value: AllowedPattern): Self = StObject.set(x, "AllowedPattern", value.asInstanceOf[js.Any])
    
    inline def setAllowedPatternUndefined: Self = StObject.set(x, "AllowedPattern", js.undefined)
    
    inline def setDataType(value: ParameterDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setDescription(value: ParameterDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKeyId(value: ParameterKeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setLastModifiedDate(value: DateTime): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLastModifiedUser(value: String): Self = StObject.set(x, "LastModifiedUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUserUndefined: Self = StObject.set(x, "LastModifiedUser", js.undefined)
    
    inline def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPolicies(value: ParameterPolicyList): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: ParameterInlinePolicy*): Self = StObject.set(x, "Policies", js.Array(value :_*))
    
    inline def setTier(value: ParameterTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setType(value: ParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersion(value: PSParameterVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
