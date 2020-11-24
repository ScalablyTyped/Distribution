package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecoveryOptionType extends js.Object {
  
  /**
    * Specifies the recovery method for a user.
    */
  var Name: RecoveryOptionNameType = js.native
  
  /**
    * A positive integer specifying priority of a method with 1 being the highest priority.
    */
  var Priority: PriorityType = js.native
}
object RecoveryOptionType {
  
  @scala.inline
  def apply(Name: RecoveryOptionNameType, Priority: PriorityType): RecoveryOptionType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryOptionType]
  }
  
  @scala.inline
  implicit class RecoveryOptionTypeOps[Self <: RecoveryOptionType] (val x: Self) extends AnyVal {
    
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
    def setName(value: RecoveryOptionNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: PriorityType): Self = this.set("Priority", value.asInstanceOf[js.Any])
  }
}
