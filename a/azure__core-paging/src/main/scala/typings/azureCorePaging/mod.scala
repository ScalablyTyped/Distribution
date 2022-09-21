package typings.azureCorePaging

import typings.azureCorePaging.anon.NextPageLink
import typings.std.AsyncIterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-paging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPagedAsyncIterator[TElement, TPage, TPageSettings, TLink](pagedResult: PagedResult[TPage, TPageSettings, TLink]): PagedAsyncIterableIterator[TElement, TPage, TPageSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPagedAsyncIterator")(pagedResult.asInstanceOf[js.Any]).asInstanceOf[PagedAsyncIterableIterator[TElement, TPage, TPageSettings]]
  
  trait PageSettings extends StObject {
    
    /**
      * The token that keeps track of where to continue the iterator
      */
    var continuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * The size of the page during paged iteration
      */
    var maxPageSize: js.UndefOr[Double] = js.undefined
  }
  object PageSettings {
    
    inline def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    extension [Self <: PageSettings](x: Self) {
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
      
      inline def setMaxPageSize(value: Double): Self = StObject.set(x, "maxPageSize", value.asInstanceOf[js.Any])
      
      inline def setMaxPageSizeUndefined: Self = StObject.set(x, "maxPageSize", js.undefined)
    }
  }
  
  @js.native
  trait PagedAsyncIterableIterator[T, PageT, PageSettingsT] extends StObject {
    
    /**
      * Return an AsyncIterableIterator that works a page at a time
      */
    def byPage(): AsyncIterableIterator[PageT] = js.native
    def byPage(settings: PageSettingsT): AsyncIterableIterator[PageT] = js.native
    
    /**
      * The next method, part of the iteration protocol
      */
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
  }
  
  @js.native
  trait PagedResult[TPage, TPageSettings, TLink] extends StObject {
    
    /**
      * a function to implement the `byPage` method on the paged async iterator. The default is
      * one that sets the `maxPageSizeParam` from `settings.maxPageSize`.
      */
    var byPage: js.UndefOr[
        js.Function1[/* settings */ js.UndefOr[TPageSettings], AsyncIterableIterator[TPage]]
      ] = js.native
    
    /**
      * Link to the first page of results.
      */
    var firstPageLink: TLink = js.native
    
    /**
      * A method that returns a page of results.
      */
    def getPage(pageLink: TLink): js.Promise[NextPageLink[TPage, TLink]] = js.native
    def getPage(pageLink: TLink, maxPageSize: Double): js.Promise[NextPageLink[TPage, TLink]] = js.native
  }
}
