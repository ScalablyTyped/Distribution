package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOrganizationalUnitsForParentResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * A list of the OUs in the specified root or parent OU.
    */
  var OrganizationalUnits: js.UndefOr[typings.awsSdk.organizationsMod.OrganizationalUnits] = js.native
}
object ListOrganizationalUnitsForParentResponse {
  
  @scala.inline
  def apply(): ListOrganizationalUnitsForParentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
  }
  
  @scala.inline
  implicit class ListOrganizationalUnitsForParentResponseMutableBuilder[Self <: ListOrganizationalUnitsForParentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationalUnits(value: OrganizationalUnits): Self = StObject.set(x, "OrganizationalUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitsUndefined: Self = StObject.set(x, "OrganizationalUnits", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitsVarargs(value: OrganizationalUnit*): Self = StObject.set(x, "OrganizationalUnits", js.Array(value :_*))
  }
}
