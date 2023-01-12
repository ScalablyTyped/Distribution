package typings.cathoQuantum

import typings.cathoQuantum.anon.NextWord
import typings.cathoQuantum.anon.`21`
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@catho/quantum/Stepper", "Stepper")
  @js.native
  val Stepper: FC[StepperProps] = js.native
  
  trait StepperProps extends StObject {
    
    var currentStepText: js.UndefOr[String] = js.undefined
    
    var i18n: js.UndefOr[NextWord] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var nextStepText: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[primary | secondary | success] = js.undefined
    
    var theme: js.UndefOr[`21`] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object StepperProps {
    
    inline def apply(): StepperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepperProps] (val x: Self) extends AnyVal {
      
      inline def setCurrentStepText(value: String): Self = StObject.set(x, "currentStepText", value.asInstanceOf[js.Any])
      
      inline def setCurrentStepTextUndefined: Self = StObject.set(x, "currentStepText", js.undefined)
      
      inline def setI18n(value: NextWord): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setNextStepText(value: String): Self = StObject.set(x, "nextStepText", value.asInstanceOf[js.Any])
      
      inline def setNextStepTextUndefined: Self = StObject.set(x, "nextStepText", js.undefined)
      
      inline def setSkin(value: primary | secondary | success): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: `21`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
