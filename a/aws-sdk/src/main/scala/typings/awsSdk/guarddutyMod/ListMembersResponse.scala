package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersResponse extends StObject {
  
  /**
    * A list of members.
    */
  var Members: js.UndefOr[typings.awsSdk.guarddutyMod.Members] = js.undefined
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMembersResponse {
  
  @scala.inline
  def apply(): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersResponse]
  }
  
  @scala.inline
  implicit class ListMembersResponseMutableBuilder[Self <: ListMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: Members): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
