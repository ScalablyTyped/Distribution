package typings.awsSdk2Types.anon

import typings.awsSdk2Types.clientsSesMod.Identity
import typings.awsSdk2Types.clientsSesMod.IdentityList
import typings.awsSdk2Types.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk2-types.aws-sdk2-types/clients/ses.GetIdentityVerificationAttributesRequest & {  $waiter :aws-sdk2-types.aws-sdk2-types/lib/service.WaiterConfiguration | undefined} */
trait GetIdentityVerificationAt extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * A list of identities.
    */
  var Identities: IdentityList
}
object GetIdentityVerificationAt {
  
  inline def apply(Identities: IdentityList): GetIdentityVerificationAt = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityVerificationAt] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value*))
  }
}
