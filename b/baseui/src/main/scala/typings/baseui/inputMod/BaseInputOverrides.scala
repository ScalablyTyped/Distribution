package typings.baseui.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseInputOverrides[T] extends StObject {
  
  var After: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var Before: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var InputContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
}
object BaseInputOverrides {
  
  inline def apply[T](): BaseInputOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInputOverrides[T]]
  }
  
  extension [Self <: BaseInputOverrides[?], T](x: Self & BaseInputOverrides[T]) {
    
    inline def setAfter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
    
    inline def setBefore(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
    
    inline def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
    
    inline def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
