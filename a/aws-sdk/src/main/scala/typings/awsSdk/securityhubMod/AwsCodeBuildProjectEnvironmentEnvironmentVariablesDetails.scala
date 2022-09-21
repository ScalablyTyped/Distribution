package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails extends StObject {
  
  /**
    * The name of the environment variable.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of environment variable.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the environment variable.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails {
  
  inline def apply(): AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails]
  }
  
  extension [Self <: AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
