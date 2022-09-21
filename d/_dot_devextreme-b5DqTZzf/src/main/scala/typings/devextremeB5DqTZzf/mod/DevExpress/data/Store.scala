package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.Filter
import typings.devextremeB5DqTZzf.anon.Index
import typings.devextremeB5DqTZzf.anon.keyinEventNameFunctionInserted
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DeepPartial
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxExtendedPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.data.Store.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[TItem, TKey] extends StObject {
  
  /**
    * Gets a data item with a specific key.
    */
  def byKey(key: TKey): DxPromise[TItem] = js.native
  def byKey(key: TKey, extraOptions: LoadOptions[TItem]): DxPromise[TItem] = js.native
  
  /**
    * Adds a data item to the store.
    */
  def insert(values: TItem): DxExtendedPromise[TItem] = js.native
  
  /**
    * Gets the key property (or properties) as specified in the key property.
    */
  def key(): String | js.Array[String] = js.native
  
  /**
    * Gets a data item&apos;s key value.
    */
  def keyOf(obj: TItem): TKey = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxExtendedPromise[js.Array[TItem]] = js.native
  /**
    * Starts loading data.
    */
  def load(options: LoadOptions[TItem]): DxExtendedPromise[js.Array[TItem]] = js.native
  
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
  def on(events: keyinEventNameFunctionInserted): this.type = js.native
  
  /**
    * Pushes data changes to the store and notifies the DataSource.
    */
  def push(changes: js.Array[Index[TItem, TKey]]): Unit = js.native
  
  /**
    * Removes a data item with a specific key from the store.
    */
  def remove(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Gets the total count of items the load() function returns.
    */
  def totalCount(obj: Filter[TItem]): DxPromise[Double] = js.native
  
  /**
    * Updates a data item with a specific key.
    */
  def update(key: TKey, values: DeepPartial[TItem]): DxExtendedPromise[TItem] = js.native
}
object Store {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loaded
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loading
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserted
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserting
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updated
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updating
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.push
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removed
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removing
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modified
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modifying
  */
  trait EventName extends StObject
  object EventName {
    
    inline def inserted: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserted = "inserted".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserted]
    
    inline def inserting: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserting = "inserting".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.inserting]
    
    inline def loaded: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loaded = "loaded".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loaded]
    
    inline def loading: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loading = "loading".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.loading]
    
    inline def modified: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modified = "modified".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modified]
    
    inline def modifying: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modifying = "modifying".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modifying]
    
    inline def push: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.push = "push".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.push]
    
    inline def removed: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removed = "removed".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removed]
    
    inline def removing: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removing = "removing".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.removing]
    
    inline def updated: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updated = "updated".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updated]
    
    inline def updating: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updating = "updating".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.updating]
  }
  
  type Options[TItem, TKey] = StoreOptions[TItem, TKey]
}
