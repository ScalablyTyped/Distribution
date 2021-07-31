package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSuggesterRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * Specifies the name of the suggester you want to delete.
    */
  var SuggesterName: StandardName
}
object DeleteSuggesterRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, SuggesterName: StandardName): DeleteSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterRequest]
  }
  
  @scala.inline
  implicit class DeleteSuggesterRequestMutableBuilder[Self <: DeleteSuggesterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggesterName(value: StandardName): Self = StObject.set(x, "SuggesterName", value.asInstanceOf[js.Any])
  }
}
