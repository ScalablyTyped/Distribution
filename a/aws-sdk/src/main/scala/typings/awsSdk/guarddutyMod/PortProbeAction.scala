package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortProbeAction extends StObject {
  
  /**
    * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of objects related to port probe details.
    */
  var PortProbeDetails: js.UndefOr[typings.awsSdk.guarddutyMod.PortProbeDetails] = js.native
}
object PortProbeAction {
  
  @scala.inline
  def apply(): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeAction]
  }
  
  @scala.inline
  implicit class PortProbeActionMutableBuilder[Self <: PortProbeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    @scala.inline
    def setPortProbeDetails(value: PortProbeDetails): Self = StObject.set(x, "PortProbeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortProbeDetailsUndefined: Self = StObject.set(x, "PortProbeDetails", js.undefined)
    
    @scala.inline
    def setPortProbeDetailsVarargs(value: PortProbeDetail*): Self = StObject.set(x, "PortProbeDetails", js.Array(value :_*))
  }
}
