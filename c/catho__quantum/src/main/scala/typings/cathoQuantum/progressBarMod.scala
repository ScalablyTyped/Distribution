package typings.cathoQuantum

import typings.cathoQuantum.anon.`19`
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("@catho/quantum/ProgressBar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ProgressBarProps, js.Object, Any]
  
  type ProgressBar = Component[ProgressBarProps, js.Object, Any]
  
  trait ProgressBarProps extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var progressPercent: js.UndefOr[Double] = js.undefined
    
    var progressText: js.UndefOr[Double] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | secondary] = js.undefined
    
    var theme: js.UndefOr[`19`] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object ProgressBarProps {
    
    inline def apply(): ProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
      
      inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
      
      inline def setProgressText(value: Double): Self = StObject.set(x, "progressText", value.asInstanceOf[js.Any])
      
      inline def setProgressTextUndefined: Self = StObject.set(x, "progressText", js.undefined)
      
      inline def setSkin(value: neutral | primary | secondary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: `19`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
