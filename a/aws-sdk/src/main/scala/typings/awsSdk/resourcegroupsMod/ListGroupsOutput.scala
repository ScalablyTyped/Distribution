package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupsOutput extends js.Object {
  
  /**
    * A list of GroupIdentifier objects. Each identifier is an object that contains both the Name and the GroupArn.
    */
  var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * This output element is deprecated and shouldn't be used. Refer to GroupIdentifiers instead.
    */
  var Groups: js.UndefOr[GroupList] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.resourcegroupsMod.NextToken] = js.native
}
object ListGroupsOutput {
  
  @scala.inline
  def apply(): ListGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsOutput]
  }
  
  @scala.inline
  implicit class ListGroupsOutputOps[Self <: ListGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupIdentifiersVarargs(value: GroupIdentifier*): Self = this.set("GroupIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setGroupIdentifiers(value: GroupIdentifierList): Self = this.set("GroupIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIdentifiers: Self = this.set("GroupIdentifiers", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
