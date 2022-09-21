package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeComponents
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chargeBarMod {
  
  @JSImport("@catho/quantum/ChargeBar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ChargeBarProps, js.Object, Any]
  
  type ChargeBar = Component[ChargeBarProps, js.Object, Any]
  
  trait ChargeBarProps extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var progressPercent: js.UndefOr[Double] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | secondary | success] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeComponents] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object ChargeBarProps {
    
    inline def apply(): ChargeBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChargeBarProps]
    }
    
    extension [Self <: ChargeBarProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
      
      inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
      
      inline def setSkin(value: neutral | primary | secondary | success): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: BaseFontSizeComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
