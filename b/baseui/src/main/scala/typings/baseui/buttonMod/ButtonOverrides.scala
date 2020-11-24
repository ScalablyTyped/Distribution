package typings.baseui.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOverrides extends js.Object {
  
  var BaseButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var EndEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var LoadingSpinner: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var LoadingSpinnerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var StartEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object ButtonOverrides {
  
  @scala.inline
  def apply(): ButtonOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOverrides]
  }
  
  @scala.inline
  implicit class ButtonOverridesOps[Self <: ButtonOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("BaseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseButton: Self = this.set("BaseButton", js.undefined)
    
    @scala.inline
    def setEndEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("EndEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndEnhancer: Self = this.set("EndEnhancer", js.undefined)
    
    @scala.inline
    def setLoadingSpinner(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("LoadingSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingSpinner: Self = this.set("LoadingSpinner", js.undefined)
    
    @scala.inline
    def setLoadingSpinnerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("LoadingSpinnerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingSpinnerContainer: Self = this.set("LoadingSpinnerContainer", js.undefined)
    
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setStartEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("StartEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEnhancer: Self = this.set("StartEnhancer", js.undefined)
  }
}
