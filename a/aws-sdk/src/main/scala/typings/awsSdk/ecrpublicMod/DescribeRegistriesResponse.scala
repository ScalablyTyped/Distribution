package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistriesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object containing the details for a public registry.
    */
  var registries: RegistryList
}
object DescribeRegistriesResponse {
  
  inline def apply(registries: RegistryList): DescribeRegistriesResponse = {
    val __obj = js.Dynamic.literal(registries = registries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistriesResponse]
  }
  
  extension [Self <: DescribeRegistriesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistries(value: RegistryList): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesVarargs(value: Registry*): Self = StObject.set(x, "registries", js.Array(value*))
  }
}
