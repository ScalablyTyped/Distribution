package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyDomainDkimRequest extends StObject {
  
  /**
    * The name of the domain to be verified for Easy DKIM signing.
    */
  var Domain: typings.awsSdk.sesMod.Domain = js.native
}
object VerifyDomainDkimRequest {
  
  @scala.inline
  def apply(Domain: Domain): VerifyDomainDkimRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainDkimRequest]
  }
  
  @scala.inline
  implicit class VerifyDomainDkimRequestMutableBuilder[Self <: VerifyDomainDkimRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
