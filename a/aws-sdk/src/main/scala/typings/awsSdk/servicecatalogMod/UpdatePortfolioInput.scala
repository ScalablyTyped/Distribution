package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortfolioInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[typings.awsSdk.servicecatalogMod.AddTags] = js.undefined
  
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id
  
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProviderName] = js.undefined
  
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
}
object UpdatePortfolioInput {
  
  @scala.inline
  def apply(Id: Id): UpdatePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
  
  @scala.inline
  implicit class UpdatePortfolioInputMutableBuilder[Self <: UpdatePortfolioInput] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: PortfolioDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: PortfolioDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    @scala.inline
    def setRemoveTags(value: TagKeys): Self = StObject.set(x, "RemoveTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTagsUndefined: Self = StObject.set(x, "RemoveTags", js.undefined)
    
    @scala.inline
    def setRemoveTagsVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTags", js.Array(value :_*))
  }
}
