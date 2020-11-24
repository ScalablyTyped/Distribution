package typings.blueprintjsCore.controlGroupMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IControlGroupProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Whether the control group should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the control group should appear with vertical styling.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object IControlGroupProps {
  
  @scala.inline
  def apply(): IControlGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlGroupProps]
  }
  
  @scala.inline
  implicit class IControlGroupPropsOps[Self <: IControlGroupProps] (val x: Self) extends AnyVal {
    
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
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
