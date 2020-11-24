package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttributeGroupsResponse extends js.Object {
  
  /**
    * This list of attribute groups.
    */
  var attributeGroups: js.UndefOr[AttributeGroupSummaries] = js.native
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAttributeGroupsResponse {
  
  @scala.inline
  def apply(): ListAttributeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttributeGroupsResponse]
  }
  
  @scala.inline
  implicit class ListAttributeGroupsResponseOps[Self <: ListAttributeGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributeGroupsVarargs(value: AttributeGroupSummary*): Self = this.set("attributeGroups", js.Array(value :_*))
    
    @scala.inline
    def setAttributeGroups(value: AttributeGroupSummaries): Self = this.set("attributeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeGroups: Self = this.set("attributeGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
