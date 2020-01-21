package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateProductWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the source portfolio.
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.native
}

object AssociateProductWithPortfolioInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    ProductId: Id,
    AcceptLanguage: AcceptLanguage = null,
    SourcePortfolioId: Id = null
  ): AssociateProductWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (SourcePortfolioId != null) __obj.updateDynamic("SourcePortfolioId")(SourcePortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProductWithPortfolioInput]
  }
}

