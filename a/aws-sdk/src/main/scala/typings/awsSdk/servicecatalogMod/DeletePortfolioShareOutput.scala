package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePortfolioShareOutput extends js.Object {
  
  /**
    * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
}
object DeletePortfolioShareOutput {
  
  @scala.inline
  def apply(): DeletePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePortfolioShareOutput]
  }
  
  @scala.inline
  implicit class DeletePortfolioShareOutputOps[Self <: DeletePortfolioShareOutput] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deletePortfolioShareToken: Self = this.set("PortfolioShareToken", js.undefined)
  }
}
