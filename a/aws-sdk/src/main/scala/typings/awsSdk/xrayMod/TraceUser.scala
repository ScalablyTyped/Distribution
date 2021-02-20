package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceUser extends StObject {
  
  /**
    * Services that the user's request hit.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.xrayMod.ServiceIds] = js.native
  
  /**
    * The user's name.
    */
  var UserName: js.UndefOr[String] = js.native
}
object TraceUser {
  
  @scala.inline
  def apply(): TraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceUser]
  }
  
  @scala.inline
  implicit class TraceUserMutableBuilder[Self <: TraceUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceIds(value: ServiceIds): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
