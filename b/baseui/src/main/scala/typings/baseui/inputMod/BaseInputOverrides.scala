package typings.baseui.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseInputOverrides[T] extends StObject {
  
  var After: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Before: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  
  var InputContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}
object BaseInputOverrides {
  
  @scala.inline
  def apply[T](): BaseInputOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInputOverrides[T]]
  }
  
  @scala.inline
  implicit class BaseInputOverridesMutableBuilder[Self <: BaseInputOverrides[_], T] (val x: Self with BaseInputOverrides[T]) extends AnyVal {
    
    @scala.inline
    def setAfter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
    
    @scala.inline
    def setBefore(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
    
    @scala.inline
    def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
