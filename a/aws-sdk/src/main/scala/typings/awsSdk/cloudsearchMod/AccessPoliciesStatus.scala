package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPoliciesStatus extends StObject {
  
  var Options: PolicyDocument = js.native
  
  var Status: OptionStatus = js.native
}
object AccessPoliciesStatus {
  
  @scala.inline
  def apply(Options: PolicyDocument, Status: OptionStatus): AccessPoliciesStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoliciesStatus]
  }
  
  @scala.inline
  implicit class AccessPoliciesStatusMutableBuilder[Self <: AccessPoliciesStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: PolicyDocument): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
