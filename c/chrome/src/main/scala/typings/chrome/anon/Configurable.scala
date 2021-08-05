package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurable extends StObject {
  
  var configurable: js.UndefOr[Boolean] = js.undefined
  
  var multiple_mounts: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var watchable: js.UndefOr[Boolean] = js.undefined
}
object Configurable {
  
  inline def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  
  extension [Self <: Configurable](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setMultiple_mounts(value: Boolean): Self = StObject.set(x, "multiple_mounts", value.asInstanceOf[js.Any])
    
    inline def setMultiple_mountsUndefined: Self = StObject.set(x, "multiple_mounts", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWatchable(value: Boolean): Self = StObject.set(x, "watchable", value.asInstanceOf[js.Any])
    
    inline def setWatchableUndefined: Self = StObject.set(x, "watchable", js.undefined)
  }
}
