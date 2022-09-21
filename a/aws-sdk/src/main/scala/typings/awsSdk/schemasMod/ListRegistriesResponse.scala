package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegistriesResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of registry summaries.
    */
  var Registries: js.UndefOr[listOfRegistrySummary] = js.undefined
}
object ListRegistriesResponse {
  
  inline def apply(): ListRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesResponse]
  }
  
  extension [Self <: ListRegistriesResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegistries(value: listOfRegistrySummary): Self = StObject.set(x, "Registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesUndefined: Self = StObject.set(x, "Registries", js.undefined)
    
    inline def setRegistriesVarargs(value: RegistrySummary*): Self = StObject.set(x, "Registries", js.Array(value*))
  }
}
