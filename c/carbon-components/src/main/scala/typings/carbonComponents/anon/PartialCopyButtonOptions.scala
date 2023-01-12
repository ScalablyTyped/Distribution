package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/copy-button/copy-button.CopyButtonOptions> */
trait PartialCopyButtonOptions extends StObject {
  
  var classAnimating: js.UndefOr[String] = js.undefined
  
  var classFadeIn: js.UndefOr[String] = js.undefined
  
  var classFadeOut: js.UndefOr[String] = js.undefined
  
  var classShowFeedback: js.UndefOr[String] = js.undefined
  
  var feedbackTooltip: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var timeoutValue: js.UndefOr[Double] = js.undefined
}
object PartialCopyButtonOptions {
  
  inline def apply(): PartialCopyButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCopyButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCopyButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setClassAnimating(value: String): Self = StObject.set(x, "classAnimating", value.asInstanceOf[js.Any])
    
    inline def setClassAnimatingUndefined: Self = StObject.set(x, "classAnimating", js.undefined)
    
    inline def setClassFadeIn(value: String): Self = StObject.set(x, "classFadeIn", value.asInstanceOf[js.Any])
    
    inline def setClassFadeInUndefined: Self = StObject.set(x, "classFadeIn", js.undefined)
    
    inline def setClassFadeOut(value: String): Self = StObject.set(x, "classFadeOut", value.asInstanceOf[js.Any])
    
    inline def setClassFadeOutUndefined: Self = StObject.set(x, "classFadeOut", js.undefined)
    
    inline def setClassShowFeedback(value: String): Self = StObject.set(x, "classShowFeedback", value.asInstanceOf[js.Any])
    
    inline def setClassShowFeedbackUndefined: Self = StObject.set(x, "classShowFeedback", js.undefined)
    
    inline def setFeedbackTooltip(value: String): Self = StObject.set(x, "feedbackTooltip", value.asInstanceOf[js.Any])
    
    inline def setFeedbackTooltipUndefined: Self = StObject.set(x, "feedbackTooltip", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setTimeoutValue(value: Double): Self = StObject.set(x, "timeoutValue", value.asInstanceOf[js.Any])
    
    inline def setTimeoutValueUndefined: Self = StObject.set(x, "timeoutValue", js.undefined)
  }
}
