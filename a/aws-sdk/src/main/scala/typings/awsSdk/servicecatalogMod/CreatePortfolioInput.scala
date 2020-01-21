package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.native
  /**
    * The name to use for display purposes.
    */
  var DisplayName: PortfolioDisplayName = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The name of the portfolio provider.
    */
  var ProviderName: typings.awsSdk.servicecatalogMod.ProviderName = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.native
}

object CreatePortfolioInput {
  @scala.inline
  def apply(
    DisplayName: PortfolioDisplayName,
    IdempotencyToken: IdempotencyToken,
    ProviderName: ProviderName,
    AcceptLanguage: AcceptLanguage = null,
    Description: PortfolioDescription = null,
    Tags: AddTags = null
  ): CreatePortfolioInput = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortfolioInput]
  }
}

