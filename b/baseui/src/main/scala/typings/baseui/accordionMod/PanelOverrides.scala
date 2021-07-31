package typings.baseui.accordionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelOverrides[T] extends StObject {
  
  var Content: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var Header: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var PanelContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  
  var ToggleIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
}
object PanelOverrides {
  
  @scala.inline
  def apply[T](): PanelOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelOverrides[T]]
  }
  
  @scala.inline
  implicit class PanelOverridesMutableBuilder[Self <: PanelOverrides[?], T] (val x: Self & PanelOverrides[T]) extends AnyVal {
    
    @scala.inline
    def setContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    @scala.inline
    def setPanelContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "PanelContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelContainerUndefined: Self = StObject.set(x, "PanelContainer", js.undefined)
    
    @scala.inline
    def setToggleIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = StObject.set(x, "ToggleIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleIconUndefined: Self = StObject.set(x, "ToggleIcon", js.undefined)
  }
}
