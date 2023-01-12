package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurable extends StObject {
  
  /**
    * For example, if *configurable* is set to **true**,
    * then a menu item for configuring volumes will be rendered.
    */
  var configurable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If *multiple_mounts* is set to **true**, then *Files app*
    * will allow to add more than one mount points from the UI.
    */
  var multiple_mounts: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[network] = js.undefined
  
  /**
    * If *watchable* is **false**, then a refresh button will be rendered.
    * Note, that if possible you should add support for watchers, so changes
    * on the file system can be reflected immediately and automatically.
    */
  var watchable: js.UndefOr[Boolean] = js.undefined
}
object Configurable {
  
  inline def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configurable] (val x: Self) extends AnyVal {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setMultiple_mounts(value: Boolean): Self = StObject.set(x, "multiple_mounts", value.asInstanceOf[js.Any])
    
    inline def setMultiple_mountsUndefined: Self = StObject.set(x, "multiple_mounts", js.undefined)
    
    inline def setSource(value: network): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWatchable(value: Boolean): Self = StObject.set(x, "watchable", value.asInstanceOf[js.Any])
    
    inline def setWatchableUndefined: Self = StObject.set(x, "watchable", js.undefined)
  }
}
