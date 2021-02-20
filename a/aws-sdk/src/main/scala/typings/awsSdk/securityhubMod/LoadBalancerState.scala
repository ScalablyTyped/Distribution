package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerState extends StObject {
  
  /**
    * The state code. The initial state of the load balancer is provisioning. After the load balancer is fully set up and ready to route traffic, its state is active. If the load balancer could not be set up, its state is failed. 
    */
  var Code: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the state.
    */
  var Reason: js.UndefOr[NonEmptyString] = js.native
}
object LoadBalancerState {
  
  @scala.inline
  def apply(): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerState]
  }
  
  @scala.inline
  implicit class LoadBalancerStateMutableBuilder[Self <: LoadBalancerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NonEmptyString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setReason(value: NonEmptyString): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
