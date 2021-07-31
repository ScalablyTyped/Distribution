package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivityTypeInput extends StObject {
  
  /**
    * The activity type to get information about. Activity types are identified by the name and version that were supplied when the activity was registered.
    */
  var activityType: ActivityType
  
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName
}
object DescribeActivityTypeInput {
  
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DescribeActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivityTypeInput]
  }
  
  @scala.inline
  implicit class DescribeActivityTypeInputMutableBuilder[Self <: DescribeActivityTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
