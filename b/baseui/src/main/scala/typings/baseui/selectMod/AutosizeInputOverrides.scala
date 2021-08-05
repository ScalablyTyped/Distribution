package typings.baseui.selectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosizeInputOverrides extends StObject {
  
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}
object AutosizeInputOverrides {
  
  inline def apply(): AutosizeInputOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutosizeInputOverrides]
  }
  
  extension [Self <: AutosizeInputOverrides](x: Self) {
    
    inline def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
