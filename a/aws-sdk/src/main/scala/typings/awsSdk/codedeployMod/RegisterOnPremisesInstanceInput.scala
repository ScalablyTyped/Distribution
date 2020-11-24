package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOnPremisesInstanceInput extends js.Object {
  
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
  implicit class RegisterOnPremisesInstanceInputOps[Self <: RegisterOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamSessionArn(value: IamSessionArn): Self = this.set("iamSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamSessionArn: Self = this.set("iamSessionArn", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: IamUserArn): Self = this.set("iamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUserArn: Self = this.set("iamUserArn", js.undefined)
  }
}
