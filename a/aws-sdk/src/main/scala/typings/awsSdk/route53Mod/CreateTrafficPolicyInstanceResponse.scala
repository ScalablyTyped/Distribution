package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficPolicyInstanceResponse extends StObject {
  
  /**
    * A unique URL that represents a new traffic policy instance.
    */
  var Location: ResourceURI = js.native
  
  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}
object CreateTrafficPolicyInstanceResponse {
  
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicyInstance: TrafficPolicyInstance): CreateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyInstanceResponse]
  }
  
  @scala.inline
  implicit class CreateTrafficPolicyInstanceResponseMutableBuilder[Self <: CreateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = StObject.set(x, "TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
}
