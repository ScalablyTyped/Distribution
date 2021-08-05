package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Getting Started
  * chayns
  * interfaces
  */
// chayns.register()
trait RegisterConfig extends StObject {
  
  var appName: js.UndefOr[String] = js.undefined
  
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  var callbackPrefix: js.UndefOr[String] = js.undefined
  
  var cssPrefix: js.UndefOr[String] = js.undefined
  
  var initialHeight: js.UndefOr[Double] = js.undefined
  
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object RegisterConfig {
  
  inline def apply(): RegisterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConfig]
  }
  
  extension [Self <: RegisterConfig](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setCallbackPrefix(value: String): Self = StObject.set(x, "callbackPrefix", value.asInstanceOf[js.Any])
    
    inline def setCallbackPrefixUndefined: Self = StObject.set(x, "callbackPrefix", js.undefined)
    
    inline def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    inline def setInitialHeight(value: Double): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
    
    inline def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
