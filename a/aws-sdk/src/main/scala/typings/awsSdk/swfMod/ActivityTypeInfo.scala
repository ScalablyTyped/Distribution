package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTypeInfo extends js.Object {
  
  /**
    * The ActivityType type structure representing the activity type.
    */
  var activityType: ActivityType = js.native
  
  /**
    * The date and time this activity type was created through RegisterActivityType.
    */
  var creationDate: Timestamp = js.native
  
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the activity type provided in RegisterActivityType.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The current status of the activity type.
    */
  var status: RegistrationStatus = js.native
}
object ActivityTypeInfo {
  
  @scala.inline
  def apply(activityType: ActivityType, creationDate: Timestamp, status: RegistrationStatus): ActivityTypeInfo = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfo]
  }
  
  @scala.inline
  implicit class ActivityTypeInfoOps[Self <: ActivityTypeInfo] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: RegistrationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDate(value: Timestamp): Self = this.set("deprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationDate: Self = this.set("deprecationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
