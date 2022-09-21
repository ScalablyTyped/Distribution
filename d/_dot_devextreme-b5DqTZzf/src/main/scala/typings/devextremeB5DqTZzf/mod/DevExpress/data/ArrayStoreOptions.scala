package typings.devextremeB5DqTZzf.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayStoreOptions[TItem, TKey]
  extends StObject
     with StoreOptions[TItem, TKey] {
  
  /**
    * Specifies the store&apos;s associated array.
    */
  var data: js.UndefOr[js.Array[TItem]] = js.undefined
}
object ArrayStoreOptions {
  
  inline def apply[TItem, TKey](): ArrayStoreOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayStoreOptions[TItem, TKey]]
  }
  
  extension [Self <: ArrayStoreOptions[?, ?], TItem, TKey](x: Self & (ArrayStoreOptions[TItem, TKey])) {
    
    inline def setData(value: js.Array[TItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: TItem*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
