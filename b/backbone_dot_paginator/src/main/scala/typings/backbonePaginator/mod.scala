package typings.backbonePaginator

import typings.backbone.mod.Collection
import typings.backbone.mod.CollectionFetchOptions
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.Silenceable
import typings.backbonePaginator.anon.TypeofPageableCollection
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("backbone", "PageableCollection")
  @js.native
  class PageableCollection[TModel /* <: Model[_, ModelSetOptions, js.Object] */] () extends Collection[TModel] {
    def this(models: js.Array[TModel]) = this()
    def this(models: js.UndefOr[scala.Nothing], options: PageableInitialOptions) = this()
    def this(models: js.Array[TModel], options: PageableInitialOptions) = this()
    
    var fullCollection: Collection[TModel] = js.native
    
    def getFirstPage(): JQueryXHR | PageableCollection[TModel] = js.native
    def getFirstPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def getLastPage(): JQueryXHR | PageableCollection[TModel] = js.native
    def getLastPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def getNextPage(): JQueryXHR | PageableCollection[TModel] = js.native
    def getNextPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def getPage(index: String): JQueryXHR | PageableCollection[TModel] = js.native
    def getPage(index: String, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    def getPage(index: Double): JQueryXHR | PageableCollection[TModel] = js.native
    def getPage(index: Double, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def getPageByOffset(offset: Double): JQueryXHR | PageableCollection[TModel] = js.native
    def getPageByOffset(offset: Double, options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def getPreviousPage(): JQueryXHR | PageableCollection[TModel] = js.native
    def getPreviousPage(options: PageableGetPageOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def hasNextPage(): Boolean = js.native
    
    def hasPreviousPage(): Boolean = js.native
    
    var mode: String = js.native
    
    def parse(resp: js.Any): js.Array[_] = js.native
    def parse(resp: js.Any, options: js.Any): js.Array[_] = js.native
    
    def parseLinks(resp: js.Any): js.Any = js.native
    def parseLinks(resp: js.Any, options: PageableParseLinksOptions): js.Any = js.native
    
    def parseRecords(resp: js.Any): js.Array[_] = js.native
    def parseRecords(resp: js.Any, options: js.Any): js.Array[_] = js.native
    
    def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState): PageableState = js.native
    def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState, options: js.Any): PageableState = js.native
    
    var queryParams: PageableQueryParams = js.native
    
    def setPageSize(pageSize: Double): JQueryXHR | PageableCollection[TModel] = js.native
    def setPageSize(pageSize: Double, options: CollectionFetchOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def setSorting(sortKey: String): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: js.UndefOr[scala.Nothing], options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: Double): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: Double, options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
    
    var state: PageableState = js.native
    
    def switchMode(): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: js.UndefOr[scala.Nothing], options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: String): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: String, options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def sync(method: String, model: TModel): JQueryXHR = js.native
    def sync(method: String, model: TModel, options: js.Any): JQueryXHR = js.native
    def sync(method: String, model: Collection[TModel]): JQueryXHR = js.native
    def sync(method: String, model: Collection[TModel], options: js.Any): JQueryXHR = js.native
  }
  /* static members */
  object PageableCollection {
    
    @JSImport("backbone", "PageableCollection.noConflict")
    @js.native
    def noConflict(): TypeofPageableCollection = js.native
  }
  
  type PageableGetPageOptions = CollectionFetchOptions | Silenceable
  
  @js.native
  trait PageableInitialOptions extends StObject {
    
    var comparator: js.UndefOr[js.Function1[/* repeated */ js.Any, Double]] = js.native
    
    var full: js.UndefOr[Boolean] = js.native
    
    var queryParam: js.UndefOr[PageableQueryParams] = js.native
    
    var state: js.UndefOr[PageableState] = js.native
  }
  object PageableInitialOptions {
    
    @scala.inline
    def apply(): PageableInitialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableInitialOptions]
    }
    
    @scala.inline
    implicit class PageableInitialOptionsMutableBuilder[Self <: PageableInitialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparator(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setQueryParam(value: PageableQueryParams): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamUndefined: Self = StObject.set(x, "queryParam", js.undefined)
      
      @scala.inline
      def setState(value: PageableState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait PageableParseLinksOptions extends StObject {
    
    var xhr: js.UndefOr[JQueryXHR] = js.native
  }
  object PageableParseLinksOptions {
    
    @scala.inline
    def apply(): PageableParseLinksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableParseLinksOptions]
    }
    
    @scala.inline
    implicit class PageableParseLinksOptionsMutableBuilder[Self <: PageableParseLinksOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait PageableQueryParams extends StObject {
    
    var currentPage: js.UndefOr[String] = js.native
    
    var directions: js.UndefOr[js.Any] = js.native
    
    var order: js.UndefOr[String] = js.native
    
    var pageSize: js.UndefOr[String] = js.native
    
    var sortKey: js.UndefOr[String] = js.native
    
    var totalPages: js.UndefOr[String] = js.native
    
    var totalRecords: js.UndefOr[String] = js.native
  }
  object PageableQueryParams {
    
    @scala.inline
    def apply(): PageableQueryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableQueryParams]
    }
    
    @scala.inline
    implicit class PageableQueryParamsMutableBuilder[Self <: PageableQueryParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setDirections(value: js.Any): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPageSize(value: String): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      @scala.inline
      def setTotalPages(value: String): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      @scala.inline
      def setTotalRecords(value: String): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
  
  @js.native
  trait PageableSetSortingOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */] extends StObject {
    
    var full: js.UndefOr[Boolean] = js.native
    
    var side: js.UndefOr[String] = js.native
    
    var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, _ | String]] = js.native
  }
  object PageableSetSortingOptions {
    
    @scala.inline
    def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): PageableSetSortingOptions[TModel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
    }
    
    @scala.inline
    implicit class PageableSetSortingOptionsMutableBuilder[Self <: PageableSetSortingOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with PageableSetSortingOptions[TModel]) extends AnyVal {
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setSortValue(value: (/* model */ TModel, /* sortKey */ String) => _ | String): Self = StObject.set(x, "sortValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortValueUndefined: Self = StObject.set(x, "sortValue", js.undefined)
    }
  }
  
  @js.native
  trait PageableState extends StObject {
    
    var currentPage: js.UndefOr[Double] = js.native
    
    var firstPage: js.UndefOr[Double] = js.native
    
    var lastPage: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var sortKey: js.UndefOr[String] = js.native
    
    var totalPages: js.UndefOr[Double] = js.native
    
    var totalRecords: js.UndefOr[Double] = js.native
  }
  object PageableState {
    
    @scala.inline
    def apply(): PageableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableState]
    }
    
    @scala.inline
    implicit class PageableStateMutableBuilder[Self <: PageableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setFirstPage(value: Double): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
      
      @scala.inline
      def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      @scala.inline
      def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
  
  @js.native
  trait PageableSwitchModeOptions extends StObject {
    
    var fetch: js.UndefOr[Boolean] = js.native
    
    var resetState: js.UndefOr[Boolean] = js.native
  }
  object PageableSwitchModeOptions {
    
    @scala.inline
    def apply(): PageableSwitchModeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableSwitchModeOptions]
    }
    
    @scala.inline
    implicit class PageableSwitchModeOptionsMutableBuilder[Self <: PageableSwitchModeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setResetState(value: Boolean): Self = StObject.set(x, "resetState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetStateUndefined: Self = StObject.set(x, "resetState", js.undefined)
    }
  }
}
