package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.ColumnPath
import typings.devextremeB5DqTZzf.anon.keyinEventNameFunctionFieldsPrepared
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource.EventName
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSource extends StObject {
  
  def collapseAll(id: String): Unit = js.native
  /**
    * Collapses all header items of a field with the specified identifier.
    */
  def collapseAll(id: Double): Unit = js.native
  
  /**
    * Collapses a specific header item.
    */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | js.Date]): Unit = js.native
  
  /**
    * Provides access to the facts that were used to calculate a specific summary value.
    */
  def createDrillDownDataSource(options: ColumnPath): DataSource[Any, Any] = js.native
  
  /**
    * Disposes of all the resources allocated to the PivotGridDataSource instance.
    */
  def dispose(): Unit = js.native
  
  def expandAll(id: String): Unit = js.native
  /**
    * Expands all the header items of a field with the specified identifier.
    */
  def expandAll(id: Double): Unit = js.native
  
  /**
    * Expands a specific header item.
    */
  def expandHeaderItem(area: String, path: js.Array[Any]): Unit = js.native
  
  def field(id: String): Any = js.native
  def field(id: String, options: Any): Unit = js.native
  /**
    * Gets all the properties of a field with the specified identifier.
    */
  def field(id: Double): Any = js.native
  /**
    * Updates field options&apos; values.
    */
  def field(id: Double, options: Any): Unit = js.native
  
  /**
    * Gets all the fields including those generated automatically.
    */
  def fields(): js.Array[Field] = js.native
  /**
    * Specifies a new fields collection.
    */
  def fields(fields: js.Array[Field]): Unit = js.native
  
  /**
    * Gets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(): Any = js.native
  /**
    * Sets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(filterExpr: Any): Unit = js.native
  
  /**
    * Gets all the fields within an area.
    */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[Field] = js.native
  
  /**
    * Gets the loaded data. Another data portion is loaded every time a header item is expanded.
    */
  def getData(): Any = js.native
  
  /**
    * Checks whether the PivotGridDataSource is loading data.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxPromise[Any] = js.native
  
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
  def on(events: keyinEventNameFunctionFieldsPrepared): this.type = js.native
  
  /**
    * Clears the loaded PivotGridDataSource data and calls the load() method.
    */
  def reload(): DxPromise[Any] = js.native
  
  /**
    * Gets the current PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(): Any = js.native
  /**
    * Sets the PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(state: Any): Unit = js.native
}
object PivotGridDataSource {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fieldsPrepared
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged
  */
  trait EventName extends StObject
  object EventName {
    
    inline def changed: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed = "changed".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changed]
    
    inline def fieldsPrepared: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fieldsPrepared = "fieldsPrepared".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fieldsPrepared]
    
    inline def loadError: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError = "loadError".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadError]
    
    inline def loadingChanged: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged = "loadingChanged".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loadingChanged]
  }
  
  type Field = PivotGridDataSourceField
  
  type Options = PivotGridDataSourceOptions
}
