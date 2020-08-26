package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePortfolioShareOutput extends js.Object {
  /**
    * The portfolio share unique identifier. This will only be returned if portfolio is shared to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
}

object CreatePortfolioShareOutput {
  @scala.inline
  def apply(): CreatePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePortfolioShareOutput]
  }
  @scala.inline
  implicit class CreatePortfolioShareOutputOps[Self <: CreatePortfolioShareOutput] (val x: Self) extends AnyVal {
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

