package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeprecateActivityTypeInput extends StObject {
  
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
  implicit class UndeprecateActivityTypeInputMutableBuilder[Self <: UndeprecateActivityTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
