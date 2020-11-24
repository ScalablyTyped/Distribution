package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortfolioShareStatusInput extends js.Object {
  
  /**
    * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by DeletePortfolioShare.
    */
  var PortfolioShareToken: Id = js.native
}
object DescribePortfolioShareStatusInput {
  
  @scala.inline
  def apply(PortfolioShareToken: Id): DescribePortfolioShareStatusInput = {
    val __obj = js.Dynamic.literal(PortfolioShareToken = PortfolioShareToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortfolioShareStatusInput]
  }
  
  @scala.inline
  implicit class DescribePortfolioShareStatusInputOps[Self <: DescribePortfolioShareStatusInput] (val x: Self) extends AnyVal {
    
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
    def setPortfolioShareToken(value: Id): Self = this.set("PortfolioShareToken", value.asInstanceOf[js.Any])
  }
}
