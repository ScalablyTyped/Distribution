package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputSecurityGroupsResponse extends StObject {
  
  /**
    * List of input security groups
    */
  var InputSecurityGroups: js.UndefOr[listOfInputSecurityGroup] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputSecurityGroupsResponse {
  
  @scala.inline
  def apply(): ListInputSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputSecurityGroupsResponse]
  }
  
  @scala.inline
  implicit class ListInputSecurityGroupsResponseMutableBuilder[Self <: ListInputSecurityGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSecurityGroups(value: listOfInputSecurityGroup): Self = StObject.set(x, "InputSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSecurityGroupsUndefined: Self = StObject.set(x, "InputSecurityGroups", js.undefined)
    
    @scala.inline
    def setInputSecurityGroupsVarargs(value: InputSecurityGroup*): Self = StObject.set(x, "InputSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
