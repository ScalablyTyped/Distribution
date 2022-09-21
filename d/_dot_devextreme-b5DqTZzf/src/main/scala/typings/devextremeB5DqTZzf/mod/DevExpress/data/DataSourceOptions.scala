package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.Changes
import typings.devextremeB5DqTZzf.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceOptions[TStoreItem, TMappedItem, TItem, TKey] extends StObject {
  
  /**
    * Custom parameters that should be passed to an OData service with the load query. Available only for the ODataStore.
    */
  var customQueryParams: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the navigation properties to be loaded with the OData entity. Available only for the ODataStore.
    */
  var expand: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /**
    * Specifies data filtering conditions.
    */
  var filter: js.UndefOr[FilterDescriptor | js.Array[FilterDescriptor]] = js.undefined
  
  /**
    * Specifies data grouping properties.
    */
  var group: js.UndefOr[GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]]] = js.undefined
  
  /**
    * Specifies an item mapping function.
    */
  var map: js.UndefOr[js.Function1[/* dataItem */ TStoreItem, TMappedItem]] = js.undefined
  
  /**
    * A function that is executed after data is loaded.
    */
  var onChanged: js.UndefOr[js.Function1[/* e */ Changes[TMappedItem], Unit]] = js.undefined
  
  /**
    * A function that is executed when data loading fails.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Message, Unit]] = js.undefined
  
  /**
    * A function that is executed when the data loading status changes.
    */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, Unit]] = js.undefined
  
  /**
    * Specifies the maximum number of data items per page. Applies only if paginate is true.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the DataSource loads data items by pages or all at once. Defaults to false if group is set; otherwise, true.
    */
  var paginate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a post processing function.
    */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[TMappedItem], js.Array[TItem]]] = js.undefined
  
  /**
    * Specifies the period (in milliseconds) when changes are aggregated before pushing them to the DataSource.
    */
  var pushAggregationTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the DataSource requests the total count of data items in the storage.
    */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to reapply sorting, filtering, grouping, and other data processing operations after receiving a push.
    */
  var reshapeOnPush: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the fields to search.
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * Specifies the comparison operation used in searching.
    */
  var searchOperation: js.UndefOr[SearchOperation] = js.undefined
  
  /**
    * Specifies the value to which the search expression is compared.
    */
  var searchValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the fields to select from data objects.
    */
  var select: js.UndefOr[SelectDescriptor[TItem]] = js.undefined
  
  /**
    * Specifies data sorting properties.
    */
  var sort: js.UndefOr[SortDescriptor[TItem] | js.Array[SortDescriptor[TItem]]] = js.undefined
  
  /**
    * Configures the store underlying the DataSource.
    */
  var store: js.UndefOr[
    js.Array[TStoreItem] | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TStoreItem, TKey]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[TStoreItem, TKey])
  ] = js.undefined
}
object DataSourceOptions {
  
  inline def apply[TStoreItem, TMappedItem, TItem, TKey](): DataSourceOptions[TStoreItem, TMappedItem, TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions[TStoreItem, TMappedItem, TItem, TKey]]
  }
  
  extension [Self <: DataSourceOptions[?, ?, ?, ?], TStoreItem, TMappedItem, TItem, TKey](x: Self & (DataSourceOptions[TStoreItem, TMappedItem, TItem, TKey])) {
    
    inline def setCustomQueryParams(value: Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    inline def setExpand(value: js.Array[String] | String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
    
    inline def setFilter(value: FilterDescriptor | js.Array[FilterDescriptor]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterDescriptor*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setGroup(value: GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupFunction1(value: TItem => String | Double | js.Date | js.Object): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: GroupDescriptor[TItem]*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setMap(value: /* dataItem */ TStoreItem => TMappedItem): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOnChanged(value: /* e */ Changes[TMappedItem] => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
    
    inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    inline def setOnLoadError(value: /* error */ Message => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnLoadingChanged(value: /* isLoading */ Boolean => Unit): Self = StObject.set(x, "onLoadingChanged", js.Any.fromFunction1(value))
    
    inline def setOnLoadingChangedUndefined: Self = StObject.set(x, "onLoadingChanged", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setPostProcess(value: /* data */ js.Array[TMappedItem] => js.Array[TItem]): Self = StObject.set(x, "postProcess", js.Any.fromFunction1(value))
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setPushAggregationTimeout(value: Double): Self = StObject.set(x, "pushAggregationTimeout", value.asInstanceOf[js.Any])
    
    inline def setPushAggregationTimeoutUndefined: Self = StObject.set(x, "pushAggregationTimeout", js.undefined)
    
    inline def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
    
    inline def setReshapeOnPush(value: Boolean): Self = StObject.set(x, "reshapeOnPush", value.asInstanceOf[js.Any])
    
    inline def setReshapeOnPushUndefined: Self = StObject.set(x, "reshapeOnPush", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchOperation(value: SearchOperation): Self = StObject.set(x, "searchOperation", value.asInstanceOf[js.Any])
    
    inline def setSearchOperationUndefined: Self = StObject.set(x, "searchOperation", js.undefined)
    
    inline def setSearchValue(value: Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    inline def setSelect(value: SelectDescriptor[TItem]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectFunction1(value: TItem => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value*))
    
    inline def setSort(value: SortDescriptor[TItem] | js.Array[SortDescriptor[TItem]]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortFunction1(value: TItem => String | Double | js.Date | js.Object): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortDescriptor[TItem]*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStore(
      value: js.Array[TStoreItem] | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TStoreItem, TKey]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[TStoreItem, TKey])
    ): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStoreVarargs(value: TStoreItem*): Self = StObject.set(x, "store", js.Array(value*))
  }
}
