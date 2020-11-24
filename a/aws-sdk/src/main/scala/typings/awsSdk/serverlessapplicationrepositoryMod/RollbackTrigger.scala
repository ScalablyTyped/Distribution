package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackTrigger extends js.Object {
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Arn: string = js.native
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Type: string = js.native
}
object RollbackTrigger {
  
  @scala.inline
  def apply(Arn: string, Type: string): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTrigger]
  }
  
  @scala.inline
  implicit class RollbackTriggerOps[Self <: RollbackTrigger] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
