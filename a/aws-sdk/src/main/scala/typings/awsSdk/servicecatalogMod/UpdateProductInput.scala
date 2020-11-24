package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Id: Id): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductInput]
  }
  
  @scala.inline
  implicit class UpdateProductInputOps[Self <: UpdateProductInput] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: ProductViewShortDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDistributor(value: ProductViewOwner): Self = this.set("Distributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributor: Self = this.set("Distributor", js.undefined)
    
    @scala.inline
    def setName(value: ProductViewName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwner(value: ProductViewOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setRemoveTagsVarargs(value: TagKey*): Self = this.set("RemoveTags", js.Array(value :_*))
    
    @scala.inline
    def setRemoveTags(value: TagKeys): Self = this.set("RemoveTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTags: Self = this.set("RemoveTags", js.undefined)
    
    @scala.inline
    def setSupportDescription(value: SupportDescription): Self = this.set("SupportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportDescription: Self = this.set("SupportDescription", js.undefined)
    
    @scala.inline
    def setSupportEmail(value: SupportEmail): Self = this.set("SupportEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportEmail: Self = this.set("SupportEmail", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: SupportUrl): Self = this.set("SupportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportUrl: Self = this.set("SupportUrl", js.undefined)
  }
}
