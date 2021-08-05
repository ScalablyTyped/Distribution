package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteAction extends StObject {
  
  /**
    * The AWS account ID to invite.
    */
  var Principal: PrincipalString
}
object InviteAction {
  
  inline def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAction]
  }
  
  extension [Self <: InviteAction](x: Self) {
    
    inline def setPrincipal(value: PrincipalString): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
  }
}
