package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintSpecimenProps extends StObject {
  
  var directive: js.UndefOr[Boolean] = js.undefined
  
  var important: js.UndefOr[Boolean] = js.undefined
  
  var neutral: js.UndefOr[Boolean] = js.undefined
  
  var warning: js.UndefOr[Boolean] = js.undefined
}
object HintSpecimenProps {
  
  inline def apply(): HintSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintSpecimenProps]
  }
  
  extension [Self <: HintSpecimenProps](x: Self) {
    
    inline def setDirective(value: Boolean): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
    
    inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    inline def setNeutral(value: Boolean): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
    
    inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
