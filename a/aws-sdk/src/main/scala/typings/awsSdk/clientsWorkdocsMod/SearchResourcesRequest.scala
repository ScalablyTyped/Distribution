package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesRequest extends StObject {
  
  /**
    * A list of attributes to include in the response. Used to request fields that are not normally returned in a standard response.
    */
  var AdditionalResponseFields: js.UndefOr[AdditionalResponseFieldsList] = js.undefined
  
  /**
    * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * Filters results based on entity metadata.
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.Filters] = js.undefined
  
  /**
    * Max results count per page.
    */
  var Limit: js.UndefOr[SearchResultsLimitType] = js.undefined
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[NextMarkerType] = js.undefined
  
  /**
    * Order by results in one or more categories.
    */
  var OrderBy: js.UndefOr[SearchResultSortList] = js.undefined
  
  /**
    * Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4 credentials.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no name. A Document or Document Version has a name and content
    */
  var QueryScopes: js.UndefOr[SearchQueryScopeTypeList] = js.undefined
  
  /**
    * The String to search for. Searches across different text fields based on request parameters. Use double quotes around the query string for exact phrase matches.
    */
  var QueryText: js.UndefOr[SearchQueryType] = js.undefined
}
object SearchResourcesRequest {
  
  inline def apply(): SearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalResponseFields(value: AdditionalResponseFieldsList): Self = StObject.set(x, "AdditionalResponseFields", value.asInstanceOf[js.Any])
    
    inline def setAdditionalResponseFieldsUndefined: Self = StObject.set(x, "AdditionalResponseFields", js.undefined)
    
    inline def setAdditionalResponseFieldsVarargs(value: AdditionalResponseFieldType*): Self = StObject.set(x, "AdditionalResponseFields", js.Array(value*))
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setLimit(value: SearchResultsLimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: NextMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOrderBy(value: SearchResultSortList): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "OrderBy", js.undefined)
    
    inline def setOrderByVarargs(value: SearchSortResult*): Self = StObject.set(x, "OrderBy", js.Array(value*))
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setQueryScopes(value: SearchQueryScopeTypeList): Self = StObject.set(x, "QueryScopes", value.asInstanceOf[js.Any])
    
    inline def setQueryScopesUndefined: Self = StObject.set(x, "QueryScopes", js.undefined)
    
    inline def setQueryScopesVarargs(value: SearchQueryScopeType*): Self = StObject.set(x, "QueryScopes", js.Array(value*))
    
    inline def setQueryText(value: SearchQueryType): Self = StObject.set(x, "QueryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "QueryText", js.undefined)
  }
}
