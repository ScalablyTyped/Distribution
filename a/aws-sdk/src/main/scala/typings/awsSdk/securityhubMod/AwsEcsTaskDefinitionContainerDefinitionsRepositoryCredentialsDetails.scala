package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails extends StObject {
  
  /**
    * The ARN of the secret that contains the private repository credentials.
    */
  var CredentialsParameter: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails](x: Self) {
    
    inline def setCredentialsParameter(value: NonEmptyString): Self = StObject.set(x, "CredentialsParameter", value.asInstanceOf[js.Any])
    
    inline def setCredentialsParameterUndefined: Self = StObject.set(x, "CredentialsParameter", js.undefined)
  }
}
