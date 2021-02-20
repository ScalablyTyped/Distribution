package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityProfilesResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of security profile identifiers (names and ARNs).
    */
  var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.native
}
object ListSecurityProfilesResponse {
  
  @scala.inline
  def apply(): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
  
  @scala.inline
  implicit class ListSecurityProfilesResponseMutableBuilder[Self <: ListSecurityProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileIdentifiers(value: SecurityProfileIdentifiers): Self = StObject.set(x, "securityProfileIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileIdentifiersUndefined: Self = StObject.set(x, "securityProfileIdentifiers", js.undefined)
    
    @scala.inline
    def setSecurityProfileIdentifiersVarargs(value: SecurityProfileIdentifier*): Self = StObject.set(x, "securityProfileIdentifiers", js.Array(value :_*))
  }
}
