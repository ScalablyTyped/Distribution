package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeprecateActivityTypeInput extends js.Object {
  
  /**
    * The activity type to undeprecate.
    */
  var activityType: ActivityType = js.native
  
  /**
    * The name of the domain of the deprecated activity type.
    */
  var domain: DomainName = js.native
}
object UndeprecateActivityTypeInput {
  
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): UndeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateActivityTypeInput]
  }
  
  @scala.inline
  implicit class UndeprecateActivityTypeInputOps[Self <: UndeprecateActivityTypeInput] (val x: Self) extends AnyVal {
    
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
    def setActivityType(value: ActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
  }
}
