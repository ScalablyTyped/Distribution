package typings.devextremeB5DqTZzf.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStoreOptions[TItem, TKey]
  extends StObject
     with ArrayStoreOptions[TItem, TKey] {
  
  /**
    * Specifies a delay in milliseconds between when data changes and the moment these changes are saved in the local storage. Applies only if immediate is false.
    */
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the LocalStore saves changes in the local storage immediately.
    */
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name under which data should be saved in the local storage. The `dx-data-localStore-` prefix will be added to the name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object LocalStoreOptions {
  
  inline def apply[TItem, TKey](): LocalStoreOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStoreOptions[TItem, TKey]]
  }
  
  extension [Self <: LocalStoreOptions[?, ?], TItem, TKey](x: Self & (LocalStoreOptions[TItem, TKey])) {
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
