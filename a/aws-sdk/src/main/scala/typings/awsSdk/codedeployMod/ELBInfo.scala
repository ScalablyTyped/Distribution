package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ELBInfo extends StObject {
  
  /**
    * For blue/green deployments, the name of the load balancer that is used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment is complete.
    */
  var name: js.UndefOr[ELBName] = js.undefined
}
object ELBInfo {
  
  @scala.inline
  def apply(): ELBInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ELBInfo]
  }
  
  @scala.inline
  implicit class ELBInfoMutableBuilder[Self <: ELBInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ELBName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
