package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociatedAttributeGroupsResponse extends js.Object {
  
  /**
    * A list of attribute group IDs.
    */
  var attributeGroups: js.UndefOr[AttributeGroupIds] = js.native
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAssociatedAttributeGroupsResponse {
  
  @scala.inline
  def apply(): ListAssociatedAttributeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedAttributeGroupsResponse]
  }
  
  @scala.inline
  implicit class ListAssociatedAttributeGroupsResponseOps[Self <: ListAssociatedAttributeGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributeGroupsVarargs(value: AttributeGroupId*): Self = this.set("attributeGroups", js.Array(value :_*))
    
    @scala.inline
    def setAttributeGroups(value: AttributeGroupIds): Self = this.set("attributeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeGroups: Self = this.set("attributeGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
