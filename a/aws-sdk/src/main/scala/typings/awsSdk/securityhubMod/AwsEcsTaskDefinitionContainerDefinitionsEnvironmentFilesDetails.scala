package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails extends StObject {
  
  /**
    * The type of environment file. The valid value is s3.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the S3 object that contains the environment variable file.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails](x: Self) {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
