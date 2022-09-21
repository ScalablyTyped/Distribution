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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("backbone", "PageableCollection")
  @js.native
  open class PageableCollection[TModel /* <: Model[Any, ModelSetOptions, Any] */] () extends Collection[TModel] {
    def this(models: js.Array[TModel]) = this()
    def this(models: js.Array[TModel], options: PageableInitialOptions) = this()
    def this(models: Unit, options: PageableInitialOptions) = this()
    
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
    
    def parse(resp: Any): js.Array[Any] = js.native
    def parse(resp: Any, options: Any): js.Array[Any] = js.native
    
    def parseLinks(resp: Any): Any = js.native
    def parseLinks(resp: Any, options: PageableParseLinksOptions): Any = js.native
    
    def parseRecords(resp: Any): js.Array[Any] = js.native
    def parseRecords(resp: Any, options: Any): js.Array[Any] = js.native
    
    def parseState(resp: Any, queryParams: PageableQueryParams, state: PageableState): PageableState = js.native
    def parseState(resp: Any, queryParams: PageableQueryParams, state: PageableState, options: Any): PageableState = js.native
    
    var queryParams: PageableQueryParams = js.native
    
    def setPageSize(pageSize: Double): JQueryXHR | PageableCollection[TModel] = js.native
    def setPageSize(pageSize: Double, options: CollectionFetchOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def setSorting(sortKey: String): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: Double): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: Double, options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
    def setSorting(sortKey: String, order: Unit, options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
    
    var state: PageableState = js.native
    
    def switchMode(): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: String): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: String, options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
    def switchMode(mode: Unit, options: PageableSwitchModeOptions): JQueryXHR | PageableCollection[TModel] = js.native
    
    def sync(method: String, model: TModel): JQueryXHR = js.native
    def sync(method: String, model: TModel, options: Any): JQueryXHR = js.native
    def sync(method: String, model: Collection[TModel]): JQueryXHR = js.native
    def sync(method: String, model: Collection[TModel], options: Any): JQueryXHR = js.native
  }
  /* static members */
  object PageableCollection {
    
    @JSImport("backbone", "PageableCollection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def noConflict(): TypeofPageableCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[TypeofPageableCollection]
  }
  
  type PageableGetPageOptions = CollectionFetchOptions | Silenceable
  
  trait PageableInitialOptions extends StObject {
    
    var comparator: js.UndefOr[js.Function1[/* repeated */ Any, Double]] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var queryParam: js.UndefOr[PageableQueryParams] = js.undefined
    
    var state: js.UndefOr[PageableState] = js.undefined
  }
  object PageableInitialOptions {
    
    inline def apply(): PageableInitialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableInitialOptions]
    }
    
    extension [Self <: PageableInitialOptions](x: Self) {
      
      inline def setComparator(value: /* repeated */ Any => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction1(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setQueryParam(value: PageableQueryParams): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
      
      inline def setQueryParamUndefined: Self = StObject.set(x, "queryParam", js.undefined)
      
      inline def setState(value: PageableState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait PageableParseLinksOptions extends StObject {
    
    var xhr: js.UndefOr[JQueryXHR] = js.undefined
  }
  object PageableParseLinksOptions {
    
    inline def apply(): PageableParseLinksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableParseLinksOptions]
    }
    
    extension [Self <: PageableParseLinksOptions](x: Self) {
      
      inline def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait PageableQueryParams extends StObject {
    
    var currentPage: js.UndefOr[String] = js.undefined
    
    var directions: js.UndefOr[Any] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[String] = js.undefined
    
    var sortKey: js.UndefOr[String] = js.undefined
    
    var totalPages: js.UndefOr[String] = js.undefined
    
    var totalRecords: js.UndefOr[String] = js.undefined
  }
  object PageableQueryParams {
    
    inline def apply(): PageableQueryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableQueryParams]
    }
    
    extension [Self <: PageableQueryParams](x: Self) {
      
      inline def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setDirections(value: Any): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
      
      inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: String): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setTotalPages(value: String): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      inline def setTotalRecords(value: String): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
  
  trait PageableSetSortingOptions[TModel /* <: Model[Any, ModelSetOptions, Any] */] extends StObject {
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, Any | String]] = js.undefined
  }
  object PageableSetSortingOptions {
    
    inline def apply[TModel /* <: Model[Any, ModelSetOptions, Any] */](): PageableSetSortingOptions[TModel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
    }
    
    extension [Self <: PageableSetSortingOptions[?], TModel /* <: Model[Any, ModelSetOptions, Any] */](x: Self & PageableSetSortingOptions[TModel]) {
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSortValue(value: (/* model */ TModel, /* sortKey */ String) => Any | String): Self = StObject.set(x, "sortValue", js.Any.fromFunction2(value))
      
      inline def setSortValueUndefined: Self = StObject.set(x, "sortValue", js.undefined)
    }
  }
  
  trait PageableState extends StObject {
    
    var currentPage: js.UndefOr[Double] = js.undefined
    
    var firstPage: js.UndefOr[Double] = js.undefined
    
    var lastPage: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sortKey: js.UndefOr[String] = js.undefined
    
    var totalPages: js.UndefOr[Double] = js.undefined
    
    var totalRecords: js.UndefOr[Double] = js.undefined
  }
  object PageableState {
    
    inline def apply(): PageableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableState]
    }
    
    extension [Self <: PageableState](x: Self) {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setFirstPage(value: Double): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
      
      inline def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
      
      inline def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
      
      inline def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
  
  trait PageableSwitchModeOptions extends StObject {
    
    var fetch: js.UndefOr[Boolean] = js.undefined
    
    var resetState: js.UndefOr[Boolean] = js.undefined
  }
  object PageableSwitchModeOptions {
    
    inline def apply(): PageableSwitchModeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageableSwitchModeOptions]
    }
    
    extension [Self <: PageableSwitchModeOptions](x: Self) {
      
      inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setResetState(value: Boolean): Self = StObject.set(x, "resetState", value.asInstanceOf[js.Any])
      
      inline def setResetStateUndefined: Self = StObject.set(x, "resetState", js.undefined)
    }
  }
}
