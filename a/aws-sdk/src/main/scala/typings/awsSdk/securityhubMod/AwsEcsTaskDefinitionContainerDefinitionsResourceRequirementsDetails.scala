package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails extends StObject {
  
  /**
    * The type of resource to assign to a container. Valid values are GPU or InferenceAccelerator.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value for the specified resource type. For GPU, the value is the number of physical GPUs the Amazon ECS container agent reserves for the container. For InferenceAccelerator, the value should match the DeviceName attribute of an entry in InferenceAccelerators.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails](x: Self) {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
