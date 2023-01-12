package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/inline-loading/inline-loading.InlineLoadingOptions> */
trait PartialInlineLoadingOptio extends StObject {
  
  var classLoadingStop: js.UndefOr[String] = js.undefined
  
  var selectorError: js.UndefOr[String] = js.undefined
  
  var selectorFinished: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorSpinner: js.UndefOr[String] = js.undefined
  
  var selectorTextActive: js.UndefOr[String] = js.undefined
  
  var selectorTextError: js.UndefOr[String] = js.undefined
  
  var selectorTextFinished: js.UndefOr[String] = js.undefined
}
object PartialInlineLoadingOptio {
  
  inline def apply(): PartialInlineLoadingOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInlineLoadingOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialInlineLoadingOptio] (val x: Self) extends AnyVal {
    
    inline def setClassLoadingStop(value: String): Self = StObject.set(x, "classLoadingStop", value.asInstanceOf[js.Any])
    
    inline def setClassLoadingStopUndefined: Self = StObject.set(x, "classLoadingStop", js.undefined)
    
    inline def setSelectorError(value: String): Self = StObject.set(x, "selectorError", value.asInstanceOf[js.Any])
    
    inline def setSelectorErrorUndefined: Self = StObject.set(x, "selectorError", js.undefined)
    
    inline def setSelectorFinished(value: String): Self = StObject.set(x, "selectorFinished", value.asInstanceOf[js.Any])
    
    inline def setSelectorFinishedUndefined: Self = StObject.set(x, "selectorFinished", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorSpinner(value: String): Self = StObject.set(x, "selectorSpinner", value.asInstanceOf[js.Any])
    
    inline def setSelectorSpinnerUndefined: Self = StObject.set(x, "selectorSpinner", js.undefined)
    
    inline def setSelectorTextActive(value: String): Self = StObject.set(x, "selectorTextActive", value.asInstanceOf[js.Any])
    
    inline def setSelectorTextActiveUndefined: Self = StObject.set(x, "selectorTextActive", js.undefined)
    
    inline def setSelectorTextError(value: String): Self = StObject.set(x, "selectorTextError", value.asInstanceOf[js.Any])
    
    inline def setSelectorTextErrorUndefined: Self = StObject.set(x, "selectorTextError", js.undefined)
    
    inline def setSelectorTextFinished(value: String): Self = StObject.set(x, "selectorTextFinished", value.asInstanceOf[js.Any])
    
    inline def setSelectorTextFinishedUndefined: Self = StObject.set(x, "selectorTextFinished", js.undefined)
  }
}
