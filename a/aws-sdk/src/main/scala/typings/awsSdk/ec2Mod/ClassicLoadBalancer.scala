package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLoadBalancer extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ClassicLoadBalancer {
  
  @scala.inline
  def apply(): ClassicLoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancer]
  }
  
  @scala.inline
  implicit class ClassicLoadBalancerMutableBuilder[Self <: ClassicLoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
