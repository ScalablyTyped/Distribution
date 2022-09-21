package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails extends StObject {
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The secret to expose to the container. The value is either the full ARN of the Secrets Manager secret or the full ARN of the parameter in the Systems Manager Parameter Store.
    */
  var ValueFrom: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValueFrom(value: NonEmptyString): Self = StObject.set(x, "ValueFrom", value.asInstanceOf[js.Any])
    
    inline def setValueFromUndefined: Self = StObject.set(x, "ValueFrom", js.undefined)
  }
}
