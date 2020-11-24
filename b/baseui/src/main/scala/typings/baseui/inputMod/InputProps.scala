package typings.baseui.inputMod

import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProps extends BaseInputProps[HTMLInputElement] {
  
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
  
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.native
  
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
}
object InputProps {
  
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
    
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
    def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = this.set("endEnhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = this.set("endEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndEnhancer: Self = this.set("endEnhancer", js.undefined)
    
    @scala.inline
    def setOverrides(value: InputOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = this.set("startEnhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = this.set("startEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEnhancer: Self = this.set("startEnhancer", js.undefined)
  }
}
