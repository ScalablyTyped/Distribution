package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insert
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.remove
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.update
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[TItem, TKey] extends StObject {
  
  var data: js.UndefOr[DeepPartial[TItem]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[TKey] = js.undefined
  
  var `type`: insert | update | remove
}
object Index {
  
  inline def apply[TItem, TKey](`type`: insert | update | remove): Index[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[TItem, TKey]]
  }
  
  extension [Self <: Index[?, ?], TItem, TKey](x: Self & (Index[TItem, TKey])) {
    
    inline def setData(value: DeepPartial[TItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: insert | update | remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
