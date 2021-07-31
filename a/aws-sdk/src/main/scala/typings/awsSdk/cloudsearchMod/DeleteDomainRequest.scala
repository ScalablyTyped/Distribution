package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainRequest extends StObject {
  
  /**
    * The name of the domain you want to permanently delete.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DeleteDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainRequestMutableBuilder[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
