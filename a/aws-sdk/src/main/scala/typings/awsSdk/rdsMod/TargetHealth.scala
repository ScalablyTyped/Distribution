package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHealth extends StObject {
  
  /**
    * A description of the health of the RDS Proxy target. If the State is AVAILABLE, a description is not included.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The reason for the current health State of the RDS Proxy target.
    */
  var Reason: js.UndefOr[TargetHealthReason] = js.native
  
  /**
    * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical lifecycle example for the states of an RDS Proxy target:   registering &gt; unavailable &gt; available &gt; unavailable &gt; available 
    */
  var State: js.UndefOr[TargetState] = js.native
}
object TargetHealth {
  
  @scala.inline
  def apply(): TargetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealth]
  }
  
  @scala.inline
  implicit class TargetHealthMutableBuilder[Self <: TargetHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setReason(value: TargetHealthReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setState(value: TargetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
