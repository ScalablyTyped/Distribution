package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.Type
import typings.devextremeB5DqTZzf.anon.XmlaStoreOptionstypexmla
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridDataSourceOptions extends StObject {
  
  /**
    * Configures pivot grid fields.
    */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  /**
    * Specifies data filtering conditions. Cannot be used with an XmlaStore.
    */
  var filter: js.UndefOr[String | js.Array[Any] | js.Function] = js.undefined
  
  /**
    * A function that is executed after data is successfully loaded.
    */
  var onChanged: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that is executed when all fields are loaded from the store and they are ready to be displayed in the PivotGrid.
    */
  var onFieldsPrepared: js.UndefOr[js.Function1[/* fields */ js.Array[Field], Unit]] = js.undefined
  
  /**
    * A function that is executed when data loading fails.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  
  /**
    * A function that is executed when the data loading status changes.
    */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, Unit]] = js.undefined
  
  /**
    * Specifies whether the PivotGridDataSource should load data in portions. Can be used only with an XmlaStore.
    */
  var paginate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the data processing operations (filtering, grouping, summary calculation) should be performed on the server.
    */
  var remoteOperations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to auto-generate pivot grid fields from the store&apos;s data.
    */
  var retrieveFields: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the DataSource&apos;s underlying store.
    */
  var store: js.UndefOr[
    (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[Any, Any]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[Any, Any]) | XmlaStore | XmlaStoreOptionstypexmla | js.Array[Type] | Type
  ] = js.undefined
}
object PivotGridDataSourceOptions {
  
  inline def apply(): PivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceOptions]
  }
  
  extension [Self <: PivotGridDataSourceOptions](x: Self) {
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: String | js.Array[Any] | js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setOnChanged(value: js.Function): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    inline def setOnFieldsPrepared(value: /* fields */ js.Array[Field] => Unit): Self = StObject.set(x, "onFieldsPrepared", js.Any.fromFunction1(value))
    
    inline def setOnFieldsPreparedUndefined: Self = StObject.set(x, "onFieldsPrepared", js.undefined)
    
    inline def setOnLoadError(value: /* error */ Any => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnLoadingChanged(value: /* isLoading */ Boolean => Unit): Self = StObject.set(x, "onLoadingChanged", js.Any.fromFunction1(value))
    
    inline def setOnLoadingChangedUndefined: Self = StObject.set(x, "onLoadingChanged", js.undefined)
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setRemoteOperations(value: Boolean): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
    
    inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
    
    inline def setRetrieveFields(value: Boolean): Self = StObject.set(x, "retrieveFields", value.asInstanceOf[js.Any])
    
    inline def setRetrieveFieldsUndefined: Self = StObject.set(x, "retrieveFields", js.undefined)
    
    inline def setStore(
      value: (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[Any, Any]) | (typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.StoreOptions[Any, Any]) | XmlaStore | XmlaStoreOptionstypexmla | js.Array[Type] | Type
    ): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStoreVarargs(value: Type*): Self = StObject.set(x, "store", js.Array(value*))
  }
}
