package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  /**
    * Filter based on resource’s path.
    */
  var AncestorIds: js.UndefOr[SearchAncestorIdList] = js.undefined
  
  /**
    * Filters by content category.
    */
  var ContentCategories: js.UndefOr[SearchContentCategoryTypeList] = js.undefined
  
  /**
    * Filter based on resource’s creation timestamp.
    */
  var CreatedRange: js.UndefOr[DateRangeType] = js.undefined
  
  /**
    * Filter by labels using exact match.
    */
  var Labels: js.UndefOr[SearchLabelList] = js.undefined
  
  /**
    * Filter based on resource’s modified timestamp.
    */
  var ModifiedRange: js.UndefOr[DateRangeType] = js.undefined
  
  /**
    * Filter based on UserIds or GroupIds.
    */
  var Principals: js.UndefOr[SearchPrincipalTypeList] = js.undefined
  
  /**
    * Filters based on entity type.
    */
  var ResourceTypes: js.UndefOr[SearchResourceTypeList] = js.undefined
  
  /**
    * Filter based on file groupings.
    */
  var SearchCollectionTypes: js.UndefOr[SearchCollectionTypeList] = js.undefined
  
  /**
    * Filter based on size (in bytes).
    */
  var SizeRange: js.UndefOr[LongRangeType] = js.undefined
  
  /**
    * Filters by the locale of the content or comment.
    */
  var TextLocales: js.UndefOr[TextLocaleTypeList] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    inline def setAncestorIds(value: SearchAncestorIdList): Self = StObject.set(x, "AncestorIds", value.asInstanceOf[js.Any])
    
    inline def setAncestorIdsUndefined: Self = StObject.set(x, "AncestorIds", js.undefined)
    
    inline def setAncestorIdsVarargs(value: SearchAncestorId*): Self = StObject.set(x, "AncestorIds", js.Array(value*))
    
    inline def setContentCategories(value: SearchContentCategoryTypeList): Self = StObject.set(x, "ContentCategories", value.asInstanceOf[js.Any])
    
    inline def setContentCategoriesUndefined: Self = StObject.set(x, "ContentCategories", js.undefined)
    
    inline def setContentCategoriesVarargs(value: ContentCategoryType*): Self = StObject.set(x, "ContentCategories", js.Array(value*))
    
    inline def setCreatedRange(value: DateRangeType): Self = StObject.set(x, "CreatedRange", value.asInstanceOf[js.Any])
    
    inline def setCreatedRangeUndefined: Self = StObject.set(x, "CreatedRange", js.undefined)
    
    inline def setLabels(value: SearchLabelList): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: SearchLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setModifiedRange(value: DateRangeType): Self = StObject.set(x, "ModifiedRange", value.asInstanceOf[js.Any])
    
    inline def setModifiedRangeUndefined: Self = StObject.set(x, "ModifiedRange", js.undefined)
    
    inline def setPrincipals(value: SearchPrincipalTypeList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: SearchPrincipalType*): Self = StObject.set(x, "Principals", js.Array(value*))
    
    inline def setResourceTypes(value: SearchResourceTypeList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: SearchResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setSearchCollectionTypes(value: SearchCollectionTypeList): Self = StObject.set(x, "SearchCollectionTypes", value.asInstanceOf[js.Any])
    
    inline def setSearchCollectionTypesUndefined: Self = StObject.set(x, "SearchCollectionTypes", js.undefined)
    
    inline def setSearchCollectionTypesVarargs(value: SearchCollectionType*): Self = StObject.set(x, "SearchCollectionTypes", js.Array(value*))
    
    inline def setSizeRange(value: LongRangeType): Self = StObject.set(x, "SizeRange", value.asInstanceOf[js.Any])
    
    inline def setSizeRangeUndefined: Self = StObject.set(x, "SizeRange", js.undefined)
    
    inline def setTextLocales(value: TextLocaleTypeList): Self = StObject.set(x, "TextLocales", value.asInstanceOf[js.Any])
    
    inline def setTextLocalesUndefined: Self = StObject.set(x, "TextLocales", js.undefined)
    
    inline def setTextLocalesVarargs(value: LanguageCodeType*): Self = StObject.set(x, "TextLocales", js.Array(value*))
  }
}
