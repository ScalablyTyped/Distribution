package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.Changes
import typings.devextremeB5DqTZzf.anon.Message
import typings.devextremeB5DqTZzf.anon.keyinEventNameFunctionChanged
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxExtendedPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.EventName
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource._DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource[TItem, TKey]
  extends StObject
     with _DataSourceLike[TItem, TKey] {
  
  /**
    * Cancels the load operation with a specific identifier.
    */
  def cancel(operationId: Double): Boolean = js.native
  
  /**
    * Disposes of all the resources allocated to the DataSource instance.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the filter property&apos;s value.
    */
  def filter(): FilterDescriptor | js.Array[FilterDescriptor] = js.native
  def filter(filterExpr: js.Array[FilterDescriptor]): Unit = js.native
  /**
    * Sets the filter property&apos;s value.
    */
  def filter(filterExpr: FilterDescriptor): Unit = js.native
  
  /**
    * Gets the group property&apos;s value.
    */
  def group(): GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]] = js.native
  def group(groupExpr: js.Array[GroupDescriptor[TItem]]): Unit = js.native
  /**
    * Sets the group property&apos;s value.
    */
  def group(groupExpr: GroupDescriptor[TItem]): Unit = js.native
  
  /**
    * Checks whether the count of items on the current page is less than the pageSize. Takes effect only with enabled paging.
    */
  def isLastPage(): Boolean = js.native
  
  /**
    * Checks whether data is loaded in the DataSource.
    */
  def isLoaded(): Boolean = js.native
  
  /**
    * Checks whether data is being loaded in the DataSource.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Gets an array of data items on the current page.
    */
  def items(): js.Array[Any] = js.native
  
  /**
    * Gets the value of the underlying store&apos;s key property.
    */
  def key(): String | js.Array[String] = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxExtendedPromise[Any] = js.native
  
  /**
    * Gets an object with current data processing settings.
    */
  def loadOptions(): LoadOptions[TItem] = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunctionChanged): this.type = js.native
  
  /**
    * Gets the current page index.
    */
  def pageIndex(): Double = js.native
  /**
    * Sets the index of the page that should be loaded on the next load() method call.
    */
  def pageIndex(newIndex: Double): Unit = js.native
  
  /**
    * Gets the page size.
    */
  def pageSize(): Double = js.native
  /**
    * Sets the page size.
    */
  def pageSize(value: Double): Unit = js.native
  
  /**
    * Gets the paginate property&apos;s value.
    */
  def paginate(): Boolean = js.native
  /**
    * Sets the paginate property&apos;s value.
    */
  def paginate(value: Boolean): Unit = js.native
  
  /**
    * Clears currently loaded DataSource items and calls the load() method.
    */
  def reload(): DxExtendedPromise[Any] = js.native
  
  /**
    * Gets the requireTotalCount property&apos;s value.
    */
  def requireTotalCount(): Boolean = js.native
  /**
    * Sets the requireTotalCount property&apos;s value.
    */
  def requireTotalCount(value: Boolean): Unit = js.native
  
  /**
    * Gets the searchExpr property&apos;s value.
    */
  def searchExpr(): String & js.Function & (js.Array[String | js.Function]) = js.native
  /**
    * Sets the searchExpr property&apos;s value.
    */
  def searchExpr(expr: String): Unit = js.native
  def searchExpr(expr: js.Array[String | js.Function]): Unit = js.native
  def searchExpr(expr: js.Function): Unit = js.native
  
  /**
    * Gets the searchOperation property&apos;s value.
    */
  def searchOperation(): String = js.native
  /**
    * Sets the searchOperation property&apos;s value.
    */
  def searchOperation(op: String): Unit = js.native
  
  /**
    * Gets the searchValue property&apos;s value.
    */
  def searchValue(): Any = js.native
  /**
    * Sets the searchValue property&apos;s value.
    */
  def searchValue(value: Any): Unit = js.native
  
  /**
    * Gets the select property&apos;s value.
    */
  def select(): SelectDescriptor[TItem] = js.native
  /**
    * Sets the select property&apos;s value.
    */
  def select(expr: SelectDescriptor[TItem]): Unit = js.native
  
  /**
    * Gets the sort property&apos;s value.
    */
  def sort(): SortDescriptor[TItem] | js.Array[SortDescriptor[TItem]] = js.native
  def sort(sortExpr: js.Array[SortDescriptor[TItem]]): Unit = js.native
  /**
    * Sets the sort property&apos;s value.
    */
  def sort(sortExpr: SortDescriptor[TItem]): Unit = js.native
  
  /**
    * Gets the instance of the store underlying the DataSource.
    */
  def store(): typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TItem, TKey] = js.native
  
  /**
    * Gets the number of data items in the store after the last load() operation without paging. Takes effect only if requireTotalCount is true
    */
  def totalCount(): Double = js.native
}
object DataSource {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[TItem]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TItem, TKey]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceOptionsStub[scala.Any, scala.Any, TItem]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource[TItem, TKey]
  */
  type DataSourceLike[TItem, TKey] = (_DataSourceLike[TItem, TKey]) | (DataSourceOptionsStub[Any, Any, TItem]) | String | js.Array[TItem]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait DataSourceOptionsStub[TStoreItem, TMappedItem, TItem] extends StObject {
    
    var customQueryParams: js.UndefOr[Any] = js.undefined
    
    var expand: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var filter: js.UndefOr[FilterDescriptor | js.Array[FilterDescriptor]] = js.undefined
    
    var group: js.UndefOr[GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]]] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* dataItem */ TStoreItem, TMappedItem]] = js.undefined
    
    var onChanged: js.UndefOr[js.Function1[/* e */ Changes[TMappedItem], Unit]] = js.undefined
    
    var onLoadError: js.UndefOr[js.Function1[/* error */ Message, Unit]] = js.undefined
    
    var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, Unit]] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var paginate: js.UndefOr[Boolean] = js.undefined
    
    var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[TMappedItem], js.Array[TItem]]] = js.undefined
    
    var pushAggregationTimeout: js.UndefOr[Double] = js.undefined
    
    var requireTotalCount: js.UndefOr[Boolean] = js.undefined
    
    var reshapeOnPush: js.UndefOr[Boolean] = js.undefined
    
    var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
    
    var searchOperation: js.UndefOr[SearchOperation] = js.undefined
    
    var searchValue: js.UndefOr[Any] = js.undefined
    
    var select: js.UndefOr[SelectDescriptor[TItem]] = js.undefined
    
    var sort: js.UndefOr[SortDescriptor[TItem] | js.Array[SortDescriptor[TItem]]] = js.undefined
    
    var store: js.UndefOr[
        js.Array[TStoreItem] | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TStoreItem, Any]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[TStoreItem, Any])
      ] = js.undefined
  }
  object DataSourceOptionsStub {
    
    inline def apply[TStoreItem, TMappedItem, TItem](): DataSourceOptionsStub[TStoreItem, TMappedItem, TItem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceOptionsStub[TStoreItem, TMappedItem, TItem]]
    }
    
    extension [Self <: DataSourceOptionsStub[?, ?, ?], TStoreItem, TMappedItem, TItem](x: Self & (DataSourceOptionsStub[TStoreItem, TMappedItem, TItem])) {
      
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
        value: js.Array[TStoreItem] | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TStoreItem, Any]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[TStoreItem, Any])
      ): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStoreVarargs(value: TStoreItem*): Self = StObject.set(x, "store", js.Array(value*))
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged
  */
  trait EventName extends StObject
  object EventName {
    
    inline def changed: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed = "changed".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed]
    
    inline def loadError: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError = "loadError".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError]
    
    inline def loadingChanged: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged = "loadingChanged".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged]
  }
  
  type Options[TStoreItem, TMappedItem, TItem, TKey] = DataSourceOptions[TStoreItem, TItem, TMappedItem, TKey]
  
  trait _DataSourceLike[TItem, TKey] extends StObject
}
