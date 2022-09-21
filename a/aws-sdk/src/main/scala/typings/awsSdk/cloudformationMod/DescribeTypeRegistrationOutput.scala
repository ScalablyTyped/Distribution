package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTypeRegistrationOutput extends StObject {
  
  /**
    * The description of the extension registration request.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * The current status of the extension registration request.
    */
  var ProgressStatus: js.UndefOr[RegistrationStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the extension being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of this specific version of the extension being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeVersionArn: js.UndefOr[TypeArn] = js.undefined
}
object DescribeTypeRegistrationOutput {
  
  inline def apply(): DescribeTypeRegistrationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeRegistrationOutput]
  }
  
  extension [Self <: DescribeTypeRegistrationOutput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProgressStatus(value: RegistrationStatus): Self = StObject.set(x, "ProgressStatus", value.asInstanceOf[js.Any])
    
    inline def setProgressStatusUndefined: Self = StObject.set(x, "ProgressStatus", js.undefined)
    
    inline def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    inline def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    inline def setTypeVersionArn(value: TypeArn): Self = StObject.set(x, "TypeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionArnUndefined: Self = StObject.set(x, "TypeVersionArn", js.undefined)
  }
}
