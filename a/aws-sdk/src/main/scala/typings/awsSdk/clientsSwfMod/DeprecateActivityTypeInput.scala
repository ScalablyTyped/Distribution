package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateActivityTypeInput extends StObject {
  
  /**
    * The activity type to deprecate.
    */
  var activityType: ActivityType
  
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName
}
object DeprecateActivityTypeInput {
  
  inline def apply(activityType: ActivityType, domain: DomainName): DeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateActivityTypeInput]
  }
  
  extension [Self <: DeprecateActivityTypeInput](x: Self) {
    
    inline def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
