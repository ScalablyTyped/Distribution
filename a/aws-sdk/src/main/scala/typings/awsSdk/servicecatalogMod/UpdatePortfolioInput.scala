package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[typings.awsSdk.servicecatalogMod.AddTags] = js.native
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.native
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The portfolio identifier.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id = js.native
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProviderName] = js.native
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.native
}

object UpdatePortfolioInput {
  @scala.inline
  def apply(Id: Id): UpdatePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
  @scala.inline
  implicit class UpdatePortfolioInputOps[Self <: UpdatePortfolioInput] (val x: Self) extends AnyVal {
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
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setAddTagsVarargs(value: Tag*): Self = this.set("AddTags", js.Array(value :_*))
    @scala.inline
    def setAddTags(value: AddTags): Self = this.set("AddTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddTags: Self = this.set("AddTags", js.undefined)
    @scala.inline
    def setDescription(value: PortfolioDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: PortfolioDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
    @scala.inline
    def setRemoveTagsVarargs(value: TagKey*): Self = this.set("RemoveTags", js.Array(value :_*))
    @scala.inline
    def setRemoveTags(value: TagKeys): Self = this.set("RemoveTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveTags: Self = this.set("RemoveTags", js.undefined)
  }
  
}

