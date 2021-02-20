package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityProfilesForTargetResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of security profiles and their associated targets.
    */
  var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.native
}
object ListSecurityProfilesForTargetResponse {
  
  @scala.inline
  def apply(): ListSecurityProfilesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
  }
  
  @scala.inline
  implicit class ListSecurityProfilesForTargetResponseMutableBuilder[Self <: ListSecurityProfilesForTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileTargetMappings(value: SecurityProfileTargetMappings): Self = StObject.set(x, "securityProfileTargetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileTargetMappingsUndefined: Self = StObject.set(x, "securityProfileTargetMappings", js.undefined)
    
    @scala.inline
    def setSecurityProfileTargetMappingsVarargs(value: SecurityProfileTargetMapping*): Self = StObject.set(x, "securityProfileTargetMappings", js.Array(value :_*))
  }
}
