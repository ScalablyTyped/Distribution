package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOnPremisesInstanceInput extends StObject {
  
  /**
    * The ARN of the IAM session to associate with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  
  /**
    * The ARN of the IAM user to associate with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  
  /**
    * The name of the on-premises instance to register.
    */
  var instanceName: InstanceName = js.native
}
object RegisterOnPremisesInstanceInput {
  
  @scala.inline
  def apply(instanceName: InstanceName): RegisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOnPremisesInstanceInput]
  }
  
  @scala.inline
  implicit class RegisterOnPremisesInstanceInputMutableBuilder[Self <: RegisterOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamSessionArn(value: IamSessionArn): Self = StObject.set(x, "iamSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamSessionArnUndefined: Self = StObject.set(x, "iamSessionArn", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: IamUserArn): Self = StObject.set(x, "iamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArnUndefined: Self = StObject.set(x, "iamUserArn", js.undefined)
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
