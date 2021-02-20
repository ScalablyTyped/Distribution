package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProductInput extends StObject {
  
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
  implicit class UpdateProductInputMutableBuilder[Self <: UpdateProductInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setAddTags(value: AddTags): Self = StObject.set(x, "AddTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTagsUndefined: Self = StObject.set(x, "AddTags", js.undefined)
    
    @scala.inline
    def setAddTagsVarargs(value: Tag*): Self = StObject.set(x, "AddTags", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: ProductViewShortDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDistributor(value: ProductViewOwner): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setRemoveTags(value: TagKeys): Self = StObject.set(x, "RemoveTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTagsUndefined: Self = StObject.set(x, "RemoveTags", js.undefined)
    
    @scala.inline
    def setRemoveTagsVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTags", js.Array(value :_*))
    
    @scala.inline
    def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    @scala.inline
    def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
  }
}
