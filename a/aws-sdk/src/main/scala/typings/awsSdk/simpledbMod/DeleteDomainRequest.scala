package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainRequest extends StObject {
  
  /**
    * The name of the domain to delete.
    */
  var DomainName: String = js.native
}
object DeleteDomainRequest {
  
  @scala.inline
  def apply(DomainName: String): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainRequestMutableBuilder[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
