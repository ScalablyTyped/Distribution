package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.PaginatedRequestOptions */
trait projectIdstringnumberunde
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var maxPages: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
  
  var projectId: js.UndefOr[String | Double] = js.undefined
  
  var showPagination: js.UndefOr[Boolean] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberunde {
  
  inline def apply(): projectIdstringnumberunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberunde]
  }
  
  extension [Self <: projectIdstringnumberunde](x: Self) {
    
    inline def setMaxPages(value: Double): Self = StObject.set(x, "maxPages", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesUndefined: Self = StObject.set(x, "maxPages", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
    
    inline def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
