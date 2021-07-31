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
  
  @scala.inline
  def apply(): AutosizeInputOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutosizeInputOverrides]
  }
  
  @scala.inline
  implicit class AutosizeInputOverridesMutableBuilder[Self <: AutosizeInputOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
