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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageSettings] (val x: Self) extends AnyVal {
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
      
      inline def setMaxPageSize(value: Double): Self = StObject.set(x, "maxPageSize", value.asInstanceOf[js.Any])
      
      inline def setMaxPageSizeUndefined: Self = StObject.set(x, "maxPageSize", js.undefined)
    }
  }
  
  trait Paged[T] extends StObject {
    
    /**
      * The link to the next page of items
      */
    var nextLink: js.UndefOr[String] = js.undefined
    
    /**
      * The T items on this page
      */
    var value: js.Array[T]
  }
  object Paged {
    
    inline def apply[T](value: js.Array[T]): Paged[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paged[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Paged[?], T] (val x: Self & Paged[T]) extends AnyVal {
      
      inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
      
      inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
      
      inline def setValue(value: js.Array[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: T*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  @js.native
  trait PagedAsyncIterableIterator[TElement, TPage, TPageSettings] extends StObject {
    
    /**
      * Return an AsyncIterableIterator that works a page at a time
      */
    def byPage(): AsyncIterableIterator[TPage] = js.native
    def byPage(settings: TPageSettings): AsyncIterableIterator[TPage] = js.native
    
    /**
      * The next method, part of the iteration protocol
      */
    def next(): js.Promise[IteratorResult[TElement, Any]] = js.native
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
    def getPage(pageLink: TLink): js.Promise[js.UndefOr[NextPageLink[TPage, TLink]]] = js.native
    def getPage(pageLink: TLink, maxPageSize: Double): js.Promise[js.UndefOr[NextPageLink[TPage, TLink]]] = js.native
    
    /**
      * A function to extract elements from a page.
      */
    var toElements: js.UndefOr[js.Function1[/* page */ TPage, js.Array[Any]]] = js.native
  }
}
