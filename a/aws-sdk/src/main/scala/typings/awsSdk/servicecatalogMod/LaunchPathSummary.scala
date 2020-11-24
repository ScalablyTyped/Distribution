package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchPathSummary extends js.Object {
  
  /**
    * The constraints on the portfolio-product relationship.
    */
  var ConstraintSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  
  /**
    * The identifier of the product path.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * The name of the portfolio to which the user was assigned.
    */
  var Name: js.UndefOr[PortfolioName] = js.native
  
  /**
    * The tags associated with this product path.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}
object LaunchPathSummary {
  
  @scala.inline
  def apply(): LaunchPathSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPathSummary]
  }
  
  @scala.inline
  implicit class LaunchPathSummaryOps[Self <: LaunchPathSummary] (val x: Self) extends AnyVal {
    
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
    def setConstraintSummariesVarargs(value: ConstraintSummary*): Self = this.set("ConstraintSummaries", js.Array(value :_*))
    
    @scala.inline
    def setConstraintSummaries(value: ConstraintSummaries): Self = this.set("ConstraintSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintSummaries: Self = this.set("ConstraintSummaries", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: PortfolioName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
