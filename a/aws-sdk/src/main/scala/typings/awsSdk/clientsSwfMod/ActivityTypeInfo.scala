package typings.awsSdk.clientsSwfMod

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
  var creationDate: js.Date
  
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(activityType: ActivityType, creationDate: js.Date, status: RegistrationStatus): ActivityTypeInfo = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfo]
  }
  
  extension [Self <: ActivityTypeInfo](x: Self) {
    
    inline def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDate(value: js.Date): Self = StObject.set(x, "deprecationDate", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDateUndefined: Self = StObject.set(x, "deprecationDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(value: RegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
