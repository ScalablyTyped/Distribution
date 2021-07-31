package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDocumentsRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object IndexDocumentsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): IndexDocumentsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocumentsRequest]
  }
  
  @scala.inline
  implicit class IndexDocumentsRequestMutableBuilder[Self <: IndexDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
