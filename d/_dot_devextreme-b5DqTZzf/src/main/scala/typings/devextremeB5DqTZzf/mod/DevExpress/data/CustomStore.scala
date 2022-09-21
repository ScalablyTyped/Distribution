package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.GroupCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStore[TItem, TKey]
  extends StObject
     with Store[TItem, TKey]
     with typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TItem, TKey] {
  
  /**
    * Deletes data from the cache. Takes effect only if the cacheRawData property is true.
    */
  def clearRawDataCache(): Unit = js.native
}
object CustomStore {
  
  trait GroupItem[TItem] extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var items: (js.Array[GroupItem[Any] | TItem]) | Null
    
    var key: Any | String | Double
    
    var summary: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GroupItem {
    
    inline def apply[TItem](key: Any | String | Double): GroupItem[TItem] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], items = null)
      __obj.asInstanceOf[GroupItem[TItem]]
    }
    
    extension [Self <: GroupItem[?], TItem](x: Self & GroupItem[TItem]) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setItems(value: js.Array[GroupItem[Any] | TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsNull: Self = StObject.set(x, "items", null)
      
      inline def setItemsVarargs(value: (GroupItem[Any] | TItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKey(value: Any | String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: js.Array[Any]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSummaryVarargs(value: Any*): Self = StObject.set(x, "summary", js.Array(value*))
    }
  }
  
  type Options[TItem, TKey] = CustomStoreOptions[TItem, TKey]
  
  type ResolvedData[TItem] = js.Object | (js.Array[GroupItem[Any] | TItem]) | GroupCount[TItem]
}
