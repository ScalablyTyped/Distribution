package typings.baseui.spinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerDeterminateProps extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var overrides: js.UndefOr[SpinnerDeterminateOverrides] = js.native
  
  var progress: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/spinner.SIZE[keyof baseui.baseui/spinner.SIZE] */ js.Any
  ] = js.native
}
object SpinnerDeterminateProps {
  
  @scala.inline
  def apply(): SpinnerDeterminateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerDeterminateProps]
  }
  
  @scala.inline
  implicit class SpinnerDeterminatePropsOps[Self <: SpinnerDeterminateProps] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setOverrides(value: SpinnerDeterminateOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/spinner.SIZE[keyof baseui.baseui/spinner.SIZE] */ js.Any
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
