package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTypeInfo extends StObject {
  
  /**
    * The ActivityType type structure representing the activity type.
    */
  var activityType: ActivityType
  
  /**
    * The date and time this activity type was created through RegisterActivityType.
    */
  var creationDate: Timestamp
  
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the activity type provided in RegisterActivityType.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The current status of the activity type.
    */
  var status: RegistrationStatus
}
object ActivityTypeInfo {
  
  @scala.inline
  def apply(activityType: ActivityType, creationDate: Timestamp, status: RegistrationStatus): ActivityTypeInfo = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfo]
  }
  
  @scala.inline
  implicit class ActivityTypeInfoMutableBuilder[Self <: ActivityTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDate(value: Timestamp): Self = StObject.set(x, "deprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDateUndefined: Self = StObject.set(x, "deprecationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setStatus(value: RegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
