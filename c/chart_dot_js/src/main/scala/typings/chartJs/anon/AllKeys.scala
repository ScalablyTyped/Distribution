package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllKeys extends StObject {
  
  var allKeys: js.UndefOr[Boolean] = js.undefined
  
  var indexable: Boolean
  
  var scriptable: Boolean
}
object AllKeys {
  
  inline def apply(indexable: Boolean, scriptable: Boolean): AllKeys = {
    val __obj = js.Dynamic.literal(indexable = indexable.asInstanceOf[js.Any], scriptable = scriptable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllKeys]
  }
  
  extension [Self <: AllKeys](x: Self) {
    
    inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
    
    inline def setAllKeysUndefined: Self = StObject.set(x, "allKeys", js.undefined)
    
    inline def setIndexable(value: Boolean): Self = StObject.set(x, "indexable", value.asInstanceOf[js.Any])
    
    inline def setScriptable(value: Boolean): Self = StObject.set(x, "scriptable", value.asInstanceOf[js.Any])
  }
}
