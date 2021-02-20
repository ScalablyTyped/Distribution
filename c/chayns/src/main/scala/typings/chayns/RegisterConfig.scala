package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Getting Started
  * chayns
  * interfaces
  */
// chayns.register()
@js.native
trait RegisterConfig extends StObject {
  
  var appName: js.UndefOr[String] = js.native
  
  var autoResize: js.UndefOr[Boolean] = js.native
  
  var callbackPrefix: js.UndefOr[String] = js.native
  
  var cssPrefix: js.UndefOr[String] = js.native
  
  var initialHeight: js.UndefOr[Double] = js.native
  
  var strictMode: js.UndefOr[Boolean] = js.native
}
object RegisterConfig {
  
  @scala.inline
  def apply(): RegisterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConfig]
  }
  
  @scala.inline
  implicit class RegisterConfigMutableBuilder[Self <: RegisterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setCallbackPrefix(value: String): Self = StObject.set(x, "callbackPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackPrefixUndefined: Self = StObject.set(x, "callbackPrefix", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    @scala.inline
    def setInitialHeight(value: Double): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
