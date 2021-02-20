package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsForSecurityProfileResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups to which the security profile is attached.
    */
  var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.native
}
object ListTargetsForSecurityProfileResponse {
  
  @scala.inline
  def apply(): ListTargetsForSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
  }
  
  @scala.inline
  implicit class ListTargetsForSecurityProfileResponseMutableBuilder[Self <: ListTargetsForSecurityProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileTargets(value: SecurityProfileTargets): Self = StObject.set(x, "securityProfileTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileTargetsUndefined: Self = StObject.set(x, "securityProfileTargets", js.undefined)
    
    @scala.inline
    def setSecurityProfileTargetsVarargs(value: SecurityProfileTarget*): Self = StObject.set(x, "securityProfileTargets", js.Array(value :_*))
  }
}
