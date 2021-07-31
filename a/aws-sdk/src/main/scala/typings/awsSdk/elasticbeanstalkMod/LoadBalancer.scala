package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancer extends StObject {
  
  /**
    * The name of the LoadBalancer.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}
object LoadBalancer {
  
  @scala.inline
  def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  @scala.inline
  implicit class LoadBalancerMutableBuilder[Self <: LoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
