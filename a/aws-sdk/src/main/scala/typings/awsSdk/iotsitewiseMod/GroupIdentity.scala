package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdentity extends StObject {
  
  /**
    * The Amazon Web Services SSO ID of the group.
    */
  var id: IdentityId
}
object GroupIdentity {
  
  inline def apply(id: IdentityId): GroupIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdentity]
  }
  
  extension [Self <: GroupIdentity](x: Self) {
    
    inline def setId(value: IdentityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
