package typings.baseui.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroupOverrides extends js.Object {
  
  var RadioGroupRoot: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object RadioGroupOverrides {
  
  @scala.inline
  def apply(): RadioGroupOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroupOverrides]
  }
  
  @scala.inline
  implicit class RadioGroupOverridesOps[Self <: RadioGroupOverrides] (val x: Self) extends AnyVal {
    
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
    def setRadioGroupRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("RadioGroupRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroupRoot: Self = this.set("RadioGroupRoot", js.undefined)
  }
}
