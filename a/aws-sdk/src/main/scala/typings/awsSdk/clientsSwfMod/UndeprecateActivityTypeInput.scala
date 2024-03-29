package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeprecateActivityTypeInput extends StObject {
  
  /**
    * The activity type to undeprecate.
    */
  var activityType: ActivityType
  
  /**
    * The name of the domain of the deprecated activity type.
    */
  var domain: DomainName
}
object UndeprecateActivityTypeInput {
  
  inline def apply(activityType: ActivityType, domain: DomainName): UndeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateActivityTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeprecateActivityTypeInput] (val x: Self) extends AnyVal {
    
    inline def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
