package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Integration extends StObject {
  
  /** Whether to enable the plugin.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The service name to be used for this plugin.
    */
  var service: js.UndefOr[String | js.Any] = js.undefined
}
object Integration {
  
  @scala.inline
  def apply(): Integration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integration]
  }
  
  @scala.inline
  implicit class IntegrationMutableBuilder[Self <: Integration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setService(value: String | js.Any): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
