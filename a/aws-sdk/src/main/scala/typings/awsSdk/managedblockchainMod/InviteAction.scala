package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteAction extends StObject {
  
  /**
    * The AWS account ID to invite.
    */
  var Principal: PrincipalString = js.native
}
object InviteAction {
  
  @scala.inline
  def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAction]
  }
  
  @scala.inline
  implicit class InviteActionMutableBuilder[Self <: InviteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipal(value: PrincipalString): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
  }
}
