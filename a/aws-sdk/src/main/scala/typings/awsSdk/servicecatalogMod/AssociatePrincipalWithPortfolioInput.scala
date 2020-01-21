package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePrincipalWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: typings.awsSdk.servicecatalogMod.PrincipalARN = js.native
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: typings.awsSdk.servicecatalogMod.PrincipalType = js.native
}

object AssociatePrincipalWithPortfolioInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    PrincipalARN: PrincipalARN,
    PrincipalType: PrincipalType,
    AcceptLanguage: AcceptLanguage = null
  ): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], PrincipalARN = PrincipalARN.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
}

