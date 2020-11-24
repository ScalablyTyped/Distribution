package typings.blueprintjsCore.handleMod

import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInternalHandleProps extends IHandleProps {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[Element | String] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var stepSize: Double = js.native
  
  var tickSize: Double = js.native
  
  var tickSizeRatio: Double = js.native
  
  var vertical: Boolean = js.native
}
object IInternalHandleProps {
  
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    stepSize: Double,
    tickSize: Double,
    tickSizeRatio: Double,
    value: Double,
    vertical: Boolean
  ): IInternalHandleProps = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalHandleProps]
  }
  
  @scala.inline
  implicit class IInternalHandlePropsOps[Self <: IInternalHandleProps] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeRatio(value: Double): Self = this.set("tickSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: Element | String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
