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
  def apply(PortfolioId: Id, PrincipalARN: PrincipalARN, PrincipalType: PrincipalType): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], PrincipalARN = PrincipalARN.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
  @scala.inline
  implicit class AssociatePrincipalWithPortfolioInputOps[Self <: AssociatePrincipalWithPortfolioInput] (val x: Self) extends AnyVal {
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
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalARN(value: PrincipalARN): Self = this.set("PrincipalARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
  }
  
}

