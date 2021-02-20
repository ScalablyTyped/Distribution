package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantAccessRequest extends StObject {
  
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: String = js.native
  
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires at the end of this period, the user will no longer be able to use the credentials to log in. If the user is logged in at the time, he or she automatically will be logged out.
    */
  var ValidForInMinutes: js.UndefOr[typings.awsSdk.opsworksMod.ValidForInMinutes] = js.native
}
object GrantAccessRequest {
  
  @scala.inline
  def apply(InstanceId: String): GrantAccessRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantAccessRequest]
  }
  
  @scala.inline
  implicit class GrantAccessRequestMutableBuilder[Self <: GrantAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForInMinutes(value: ValidForInMinutes): Self = StObject.set(x, "ValidForInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForInMinutesUndefined: Self = StObject.set(x, "ValidForInMinutes", js.undefined)
  }
}
