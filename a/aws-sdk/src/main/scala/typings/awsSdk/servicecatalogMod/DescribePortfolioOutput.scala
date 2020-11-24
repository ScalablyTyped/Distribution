package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortfolioOutput extends js.Object {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioDetail] = js.native
  
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}
object DescribePortfolioOutput {
  
  @scala.inline
  def apply(): DescribePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
  
  @scala.inline
  implicit class DescribePortfolioOutputOps[Self <: DescribePortfolioOutput] (val x: Self) extends AnyVal {
    
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
    def setBudgetsVarargs(value: BudgetDetail*): Self = this.set("Budgets", js.Array(value :_*))
    
    @scala.inline
    def setBudgets(value: Budgets): Self = this.set("Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgets: Self = this.set("Budgets", js.undefined)
    
    @scala.inline
    def setPortfolioDetail(value: PortfolioDetail): Self = this.set("PortfolioDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioDetail: Self = this.set("PortfolioDetail", js.undefined)
    
    @scala.inline
    def setTagOptionsVarargs(value: TagOptionDetail*): Self = this.set("TagOptions", js.Array(value :_*))
    
    @scala.inline
    def setTagOptions(value: TagOptionDetails): Self = this.set("TagOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagOptions: Self = this.set("TagOptions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
