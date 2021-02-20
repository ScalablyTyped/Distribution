package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroupMembership extends StObject {
  
  /**
    * The name of the option group that the instance belongs to.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * The status of the DB instance's option group membership. Valid values are: in-sync, pending-apply, pending-removal, pending-maintenance-apply, pending-maintenance-removal, applying, removing, and failed. 
    */
  var Status: js.UndefOr[String] = js.native
}
object OptionGroupMembership {
  
  @scala.inline
  def apply(): OptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupMembership]
  }
  
  @scala.inline
  implicit class OptionGroupMembershipMutableBuilder[Self <: OptionGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
