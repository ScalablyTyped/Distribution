package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtectionGroupsResponse extends js.Object {
  
  /**
    * If you specify a value for MaxResults and you have more protection groups than the value of MaxResults, AWS Shield Advanced returns this token that you can use in your next request, to get the next batch of objects. 
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * 
    */
  var ProtectionGroups: typings.awsSdk.shieldMod.ProtectionGroups = js.native
}
object ListProtectionGroupsResponse {
  
  @scala.inline
  def apply(ProtectionGroups: ProtectionGroups): ListProtectionGroupsResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroups = ProtectionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectionGroupsResponse]
  }
  
  @scala.inline
  implicit class ListProtectionGroupsResponseOps[Self <: ListProtectionGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProtectionGroupsVarargs(value: ProtectionGroup*): Self = this.set("ProtectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setProtectionGroups(value: ProtectionGroups): Self = this.set("ProtectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
