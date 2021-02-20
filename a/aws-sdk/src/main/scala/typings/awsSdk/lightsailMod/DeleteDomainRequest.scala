package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainRequest extends StObject {
  
  /**
    * The specific domain name to delete.
    */
  var domainName: DomainName = js.native
}
object DeleteDomainRequest {
  
  @scala.inline
  def apply(domainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainRequestMutableBuilder[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
