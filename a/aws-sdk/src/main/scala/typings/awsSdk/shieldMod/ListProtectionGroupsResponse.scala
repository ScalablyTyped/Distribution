package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionGroupsResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults and you have more protection groups than the value of MaxResults, AWS Shield Advanced returns this token that you can use in your next request, to get the next batch of objects. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * 
    */
  var ProtectionGroups: typings.awsSdk.shieldMod.ProtectionGroups
}
object ListProtectionGroupsResponse {
  
  @scala.inline
  def apply(ProtectionGroups: ProtectionGroups): ListProtectionGroupsResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroups = ProtectionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectionGroupsResponse]
  }
  
  @scala.inline
  implicit class ListProtectionGroupsResponseMutableBuilder[Self <: ListProtectionGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProtectionGroups(value: ProtectionGroups): Self = StObject.set(x, "ProtectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionGroupsVarargs(value: ProtectionGroup*): Self = StObject.set(x, "ProtectionGroups", js.Array(value :_*))
  }
}
