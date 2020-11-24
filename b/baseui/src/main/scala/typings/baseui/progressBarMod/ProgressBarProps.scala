package typings.baseui.progressBarMod

import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.small_
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var getProgressLabel: js.UndefOr[js.Function2[/* value */ Double, /* successValue */ Double, ReactNode]] = js.native
  
  var infinite: js.UndefOr[Boolean] = js.native
  
  var overrides: js.UndefOr[ProgressBarOverrides] = js.native
  
  var showLabel: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small_ | medium_ | large_] = js.native
  
  var steps: js.UndefOr[Double] = js.native
  
  var successValue: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ProgressBarProps {
  
  @scala.inline
  def apply(): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarProps]
  }
  
  @scala.inline
  implicit class ProgressBarPropsOps[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setGetProgressLabel(value: (/* value */ Double, /* successValue */ Double) => ReactNode): Self = this.set("getProgressLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetProgressLabel: Self = this.set("getProgressLabel", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setOverrides(value: ProgressBarOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    
    @scala.inline
    def setSize(value: small_ | medium_ | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setSuccessValue(value: Double): Self = this.set("successValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessValue: Self = this.set("successValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
