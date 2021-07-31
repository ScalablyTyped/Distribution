package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSuggestersResponse extends StObject {
  
  /**
    * The suggesters configured for the domain specified in the request.
    */
  var Suggesters: SuggesterStatusList
}
object DescribeSuggestersResponse {
  
  @scala.inline
  def apply(Suggesters: SuggesterStatusList): DescribeSuggestersResponse = {
    val __obj = js.Dynamic.literal(Suggesters = Suggesters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersResponse]
  }
  
  @scala.inline
  implicit class DescribeSuggestersResponseMutableBuilder[Self <: DescribeSuggestersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggesters(value: SuggesterStatusList): Self = StObject.set(x, "Suggesters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestersVarargs(value: SuggesterStatus*): Self = StObject.set(x, "Suggesters", js.Array(value :_*))
  }
}
