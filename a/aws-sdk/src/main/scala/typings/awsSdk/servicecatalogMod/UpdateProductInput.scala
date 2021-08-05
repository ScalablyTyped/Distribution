package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The tags to add to the product.
    */
  var AddTags: js.UndefOr[typings.awsSdk.servicecatalogMod.AddTags] = js.undefined
  
  /**
    * The updated description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
  
  /**
    * The updated distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * The product identifier.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id
  
  /**
    * The updated product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The updated owner of the product.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * The tags to remove from the product.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
  
  /**
    * The updated support description for the product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportDescription] = js.undefined
  
  /**
    * The updated support email for the product.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportEmail] = js.undefined
  
  /**
    * The updated support URL for the product.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportUrl] = js.undefined
}
object UpdateProductInput {
  
  inline def apply(Id: Id): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductInput]
  }
  
  extension [Self <: UpdateProductInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAddTags(value: AddTags): Self = StObject.set(x, "AddTags", value.asInstanceOf[js.Any])
    
    inline def setAddTagsUndefined: Self = StObject.set(x, "AddTags", js.undefined)
    
    inline def setAddTagsVarargs(value: Tag*): Self = StObject.set(x, "AddTags", js.Array(value :_*))
    
    inline def setDescription(value: ProductViewShortDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDistributor(value: ProductViewOwner): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    inline def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setRemoveTags(value: TagKeys): Self = StObject.set(x, "RemoveTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveTagsUndefined: Self = StObject.set(x, "RemoveTags", js.undefined)
    
    inline def setRemoveTagsVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTags", js.Array(value :_*))
    
    inline def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    inline def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    inline def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
  }
}
