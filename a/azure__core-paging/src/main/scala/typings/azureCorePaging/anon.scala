package typings.azureCorePaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NextPageLink[TPage, TLink] extends StObject {
    
    var nextPageLink: js.UndefOr[TLink] = js.undefined
    
    var page: TPage
  }
  object NextPageLink {
    
    inline def apply[TPage, TLink](page: TPage): NextPageLink[TPage, TLink] = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPageLink[TPage, TLink]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextPageLink[?, ?], TPage, TLink] (val x: Self & (NextPageLink[TPage, TLink])) extends AnyVal {
      
      inline def setNextPageLink(value: TLink): Self = StObject.set(x, "nextPageLink", value.asInstanceOf[js.Any])
      
      inline def setNextPageLinkUndefined: Self = StObject.set(x, "nextPageLink", js.undefined)
      
      inline def setPage(value: TPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
