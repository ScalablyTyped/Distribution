package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseOptions extends AccessConditionsOptions {
  
  var leaseDuration: js.UndefOr[String] = js.native
  
  var proposedLeaseId: js.UndefOr[String] = js.native
}
object LeaseOptions {
  
  @scala.inline
  def apply(): LeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseOptions]
  }
  
  @scala.inline
  implicit class LeaseOptionsMutableBuilder[Self <: LeaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaseDuration(value: String): Self = StObject.set(x, "leaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseDurationUndefined: Self = StObject.set(x, "leaseDuration", js.undefined)
    
    @scala.inline
    def setProposedLeaseId(value: String): Self = StObject.set(x, "proposedLeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedLeaseIdUndefined: Self = StObject.set(x, "proposedLeaseId", js.undefined)
  }
}
