package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/loading/loading.LoadingOptions> */
trait PartialLoadingOptions extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var classLoadingOverlay: js.UndefOr[String] = js.undefined
  
  var classLoadingOverlayStop: js.UndefOr[String] = js.undefined
  
  var classLoadingStop: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorLoadingOverlay: js.UndefOr[String] = js.undefined
}
object PartialLoadingOptions {
  
  inline def apply(): PartialLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoadingOptions]
  }
  
  extension [Self <: PartialLoadingOptions](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setClassLoadingOverlay(value: String): Self = StObject.set(x, "classLoadingOverlay", value.asInstanceOf[js.Any])
    
    inline def setClassLoadingOverlayStop(value: String): Self = StObject.set(x, "classLoadingOverlayStop", value.asInstanceOf[js.Any])
    
    inline def setClassLoadingOverlayStopUndefined: Self = StObject.set(x, "classLoadingOverlayStop", js.undefined)
    
    inline def setClassLoadingOverlayUndefined: Self = StObject.set(x, "classLoadingOverlay", js.undefined)
    
    inline def setClassLoadingStop(value: String): Self = StObject.set(x, "classLoadingStop", value.asInstanceOf[js.Any])
    
    inline def setClassLoadingStopUndefined: Self = StObject.set(x, "classLoadingStop", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorLoadingOverlay(value: String): Self = StObject.set(x, "selectorLoadingOverlay", value.asInstanceOf[js.Any])
    
    inline def setSelectorLoadingOverlayUndefined: Self = StObject.set(x, "selectorLoadingOverlay", js.undefined)
  }
}
