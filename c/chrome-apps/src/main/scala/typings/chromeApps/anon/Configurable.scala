package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configurable extends StObject {
  
  /**
    * For example, if *configurable* is set to **true**,
    * then a menu item for configuring volumes will be rendered.
    */
  var configurable: js.UndefOr[Boolean] = js.native
  
  /**
    * If *multiple_mounts* is set to **true**, then *Files app*
    * will allow to add more than one mount points from the UI.
    */
  var multiple_mounts: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[network] = js.native
  
  /**
    * If *watchable* is **false**, then a refresh button will be rendered.
    * Note, that if possible you should add support for watchers, so changes
    * on the file system can be reflected immediately and automatically.
    */
  var watchable: js.UndefOr[Boolean] = js.native
}
object Configurable {
  
  @scala.inline
  def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  
  @scala.inline
  implicit class ConfigurableMutableBuilder[Self <: Configurable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    @scala.inline
    def setMultiple_mounts(value: Boolean): Self = StObject.set(x, "multiple_mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple_mountsUndefined: Self = StObject.set(x, "multiple_mounts", js.undefined)
    
    @scala.inline
    def setSource(value: network): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setWatchable(value: Boolean): Self = StObject.set(x, "watchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchableUndefined: Self = StObject.set(x, "watchable", js.undefined)
  }
}
