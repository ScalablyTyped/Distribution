package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecordHistoryInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typings.awsSdk.servicecatalogMod.AccessLevelFilter] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The search filter to scope the results.
    */
  var SearchFilter: js.UndefOr[ListRecordHistorySearchFilter] = js.native
}
object ListRecordHistoryInput {
  
  @scala.inline
  def apply(): ListRecordHistoryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistoryInput]
  }
  
  @scala.inline
  implicit class ListRecordHistoryInputMutableBuilder[Self <: ListRecordHistoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setAccessLevelFilter(value: AccessLevelFilter): Self = StObject.set(x, "AccessLevelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelFilterUndefined: Self = StObject.set(x, "AccessLevelFilter", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setSearchFilter(value: ListRecordHistorySearchFilter): Self = StObject.set(x, "SearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFilterUndefined: Self = StObject.set(x, "SearchFilter", js.undefined)
  }
}
