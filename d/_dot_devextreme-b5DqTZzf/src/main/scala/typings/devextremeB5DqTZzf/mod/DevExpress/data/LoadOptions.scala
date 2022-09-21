package typings.devextremeB5DqTZzf.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions[T] extends StObject {
  
  /**
    * An object for storing additional settings that should be sent to the server. Relevant to the ODataStore only.
    */
  var customQueryParams: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of strings that represent the names of navigation properties to be loaded simultaneously with the ODataStore.
    */
  var expand: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A filter expression.
    */
  var filter: js.UndefOr[FilterDescriptor | js.Array[FilterDescriptor]] = js.undefined
  
  /**
    * A group expression.
    */
  var group: js.UndefOr[GroupDescriptor[T] | js.Array[GroupDescriptor[T]]] = js.undefined
  
  /**
    * A group summary expression. Used with the group setting.
    */
  var groupSummary: js.UndefOr[SummaryDescriptor[T] | js.Array[SummaryDescriptor[T]]] = js.undefined
  
  /**
    * The IDs of the rows being expanded. Relevant only when the CustomStore is used in the TreeList UI component.
    */
  var parentIds: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Indicates whether a top-level group count is required. Used in conjunction with the filter, take, skip, requireTotalCount, and group settings.
    */
  var requireGroupCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the total count of data objects is needed.
    */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A data field or expression whose value is compared to the search value.
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * A comparison operation.
    */
  var searchOperation: js.UndefOr[SearchOperation] = js.undefined
  
  /**
    * The current search value.
    */
  var searchValue: js.UndefOr[Any] = js.undefined
  
  /**
    * A select expression.
    */
  var select: js.UndefOr[SelectDescriptor[T]] = js.undefined
  
  /**
    * The number of data objects to be skipped from the result set&apos;s start. In conjunction with take, used to implement paging.
    */
  var skip: js.UndefOr[Double] = js.undefined
  
  /**
    * A sort expression.
    */
  var sort: js.UndefOr[SortDescriptor[T] | js.Array[SortDescriptor[T]]] = js.undefined
  
  /**
    * The number of data objects to be loaded. In conjunction with skip, used to implement paging.
    */
  var take: js.UndefOr[Double] = js.undefined
  
  /**
    * A total summary expression.
    */
  var totalSummary: js.UndefOr[SummaryDescriptor[T] | js.Array[SummaryDescriptor[T]]] = js.undefined
  
  /**
    * An object for storing additional settings that should be sent to the server.
    */
  var userData: js.UndefOr[Any] = js.undefined
}
object LoadOptions {
  
  inline def apply[T](): LoadOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions[T]]
  }
  
  extension [Self <: LoadOptions[?], T](x: Self & LoadOptions[T]) {
    
    inline def setCustomQueryParams(value: Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    inline def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
    
    inline def setFilter(value: FilterDescriptor | js.Array[FilterDescriptor]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterDescriptor*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setGroup(value: GroupDescriptor[T] | js.Array[GroupDescriptor[T]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupFunction1(value: T => String | Double | js.Date | js.Object): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setGroupSummary(value: SummaryDescriptor[T] | js.Array[SummaryDescriptor[T]]): Self = StObject.set(x, "groupSummary", value.asInstanceOf[js.Any])
    
    inline def setGroupSummaryFunction1(value: T => String | Double | js.Date | js.Object): Self = StObject.set(x, "groupSummary", js.Any.fromFunction1(value))
    
    inline def setGroupSummaryUndefined: Self = StObject.set(x, "groupSummary", js.undefined)
    
    inline def setGroupSummaryVarargs(value: SummaryDescriptor[T]*): Self = StObject.set(x, "groupSummary", js.Array(value*))
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: GroupDescriptor[T]*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setParentIds(value: js.Array[Any]): Self = StObject.set(x, "parentIds", value.asInstanceOf[js.Any])
    
    inline def setParentIdsUndefined: Self = StObject.set(x, "parentIds", js.undefined)
    
    inline def setParentIdsVarargs(value: Any*): Self = StObject.set(x, "parentIds", js.Array(value*))
    
    inline def setRequireGroupCount(value: Boolean): Self = StObject.set(x, "requireGroupCount", value.asInstanceOf[js.Any])
    
    inline def setRequireGroupCountUndefined: Self = StObject.set(x, "requireGroupCount", js.undefined)
    
    inline def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchOperation(value: SearchOperation): Self = StObject.set(x, "searchOperation", value.asInstanceOf[js.Any])
    
    inline def setSearchOperationUndefined: Self = StObject.set(x, "searchOperation", js.undefined)
    
    inline def setSearchValue(value: Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    inline def setSelect(value: SelectDescriptor[T]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectFunction1(value: T => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value*))
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: SortDescriptor[T] | js.Array[SortDescriptor[T]]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortFunction1(value: T => String | Double | js.Date | js.Object): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortDescriptor[T]*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    
    inline def setTotalSummary(value: SummaryDescriptor[T] | js.Array[SummaryDescriptor[T]]): Self = StObject.set(x, "totalSummary", value.asInstanceOf[js.Any])
    
    inline def setTotalSummaryFunction1(value: T => String | Double | js.Date | js.Object): Self = StObject.set(x, "totalSummary", js.Any.fromFunction1(value))
    
    inline def setTotalSummaryUndefined: Self = StObject.set(x, "totalSummary", js.undefined)
    
    inline def setTotalSummaryVarargs(value: SummaryDescriptor[T]*): Self = StObject.set(x, "totalSummary", js.Array(value*))
    
    inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
