package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineSuggesterResponse extends StObject {
  
  var Suggester: SuggesterStatus = js.native
}
object DefineSuggesterResponse {
  
  @scala.inline
  def apply(Suggester: SuggesterStatus): DefineSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineSuggesterResponse]
  }
  
  @scala.inline
  implicit class DefineSuggesterResponseMutableBuilder[Self <: DefineSuggesterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggester(value: SuggesterStatus): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
