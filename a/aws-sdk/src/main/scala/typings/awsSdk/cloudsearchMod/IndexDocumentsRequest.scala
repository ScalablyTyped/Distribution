package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDocumentsRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object IndexDocumentsRequest {
  
  inline def apply(DomainName: DomainName): IndexDocumentsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocumentsRequest]
  }
  
  extension [Self <: IndexDocumentsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
