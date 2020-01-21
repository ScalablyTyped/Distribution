package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The tags to add to the product.
    */
  var AddTags: js.UndefOr[typings.awsSdk.servicecatalogMod.AddTags] = js.native
  /**
    * The updated description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The updated distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The product identifier.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id = js.native
  /**
    * The updated product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.native
  /**
    * The updated owner of the product.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The tags to remove from the product.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.native
  /**
    * The updated support description for the product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The updated support email for the product.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The updated support URL for the product.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportUrl] = js.native
}

object UpdateProductInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    AddTags: AddTags = null,
    Description: ProductViewShortDescription = null,
    Distributor: ProductViewOwner = null,
    Name: ProductViewName = null,
    Owner: ProductViewOwner = null,
    RemoveTags: TagKeys = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null
  ): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (AddTags != null) __obj.updateDynamic("AddTags")(AddTags.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (RemoveTags != null) __obj.updateDynamic("RemoveTags")(RemoveTags.asInstanceOf[js.Any])
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription.asInstanceOf[js.Any])
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail.asInstanceOf[js.Any])
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductInput]
  }
}

