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
  
  inline def apply(Suggesters: SuggesterStatusList): DescribeSuggestersResponse = {
    val __obj = js.Dynamic.literal(Suggesters = Suggesters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersResponse]
  }
  
  extension [Self <: DescribeSuggestersResponse](x: Self) {
    
    inline def setSuggesters(value: SuggesterStatusList): Self = StObject.set(x, "Suggesters", value.asInstanceOf[js.Any])
    
    inline def setSuggestersVarargs(value: SuggesterStatus*): Self = StObject.set(x, "Suggesters", js.Array(value :_*))
  }
}
