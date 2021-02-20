package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTypeRegistrationOutput extends StObject {
  
  /**
    * The description of the type registration request.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * The current status of the type registration request.
    */
  var ProgressStatus: js.UndefOr[RegistrationStatus] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of this specific version of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeVersionArn: js.UndefOr[TypeArn] = js.native
}
object DescribeTypeRegistrationOutput {
  
  @scala.inline
  def apply(): DescribeTypeRegistrationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeRegistrationOutput]
  }
  
  @scala.inline
  implicit class DescribeTypeRegistrationOutputMutableBuilder[Self <: DescribeTypeRegistrationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setProgressStatus(value: RegistrationStatus): Self = StObject.set(x, "ProgressStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressStatusUndefined: Self = StObject.set(x, "ProgressStatus", js.undefined)
    
    @scala.inline
    def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    @scala.inline
    def setTypeVersionArn(value: TypeArn): Self = StObject.set(x, "TypeVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVersionArnUndefined: Self = StObject.set(x, "TypeVersionArn", js.undefined)
  }
}
