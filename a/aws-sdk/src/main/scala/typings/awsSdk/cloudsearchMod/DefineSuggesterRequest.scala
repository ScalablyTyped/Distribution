package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineSuggesterRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  var Suggester: typings.awsSdk.cloudsearchMod.Suggester
}
object DefineSuggesterRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
  
  @scala.inline
  implicit class DefineSuggesterRequestMutableBuilder[Self <: DefineSuggesterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggester(value: Suggester): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
