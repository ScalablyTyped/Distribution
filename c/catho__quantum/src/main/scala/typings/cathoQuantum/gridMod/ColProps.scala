package typings.cathoQuantum.gridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColProps extends js.Object {
  
  var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.native
  
  var large: js.UndefOr[Double] = js.native
  
  var `large-offset`: js.UndefOr[Double] = js.native
  
  var medium: js.UndefOr[Double] = js.native
  
  var `medium-offset`: js.UndefOr[Double] = js.native
  
  var `no-gutters`: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Double] = js.native
  
  var `small-offset`: js.UndefOr[Double] = js.native
  
  var xlarge: js.UndefOr[Double] = js.native
  
  var `xlarge-offset`: js.UndefOr[Double] = js.native
  
  var xsmall: js.UndefOr[Double] = js.native
  
  var `xsmall-offset`: js.UndefOr[Double] = js.native
}
object ColProps {
  
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
    
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
    def setHideVarargs(value: BreakpointsType*): Self = this.set("hide", js.Array(value :_*))
    
    @scala.inline
    def setHide(value: BreakpointsType | js.Array[BreakpointsType]): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setLarge(value: Double): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def `setLarge-offset`(value: Double): Self = this.set("large-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLarge-offset`: Self = this.set("large-offset", js.undefined)
    
    @scala.inline
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def `setMedium-offset`(value: Double): Self = this.set("medium-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedium-offset`: Self = this.set("medium-offset", js.undefined)
    
    @scala.inline
    def `setNo-gutters`(value: Boolean): Self = this.set("no-gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-gutters`: Self = this.set("no-gutters", js.undefined)
    
    @scala.inline
    def setSmall(value: Double): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def `setSmall-offset`(value: Double): Self = this.set("small-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSmall-offset`: Self = this.set("small-offset", js.undefined)
    
    @scala.inline
    def setXlarge(value: Double): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    
    @scala.inline
    def `setXlarge-offset`(value: Double): Self = this.set("xlarge-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXlarge-offset`: Self = this.set("xlarge-offset", js.undefined)
    
    @scala.inline
    def setXsmall(value: Double): Self = this.set("xsmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsmall: Self = this.set("xsmall", js.undefined)
    
    @scala.inline
    def `setXsmall-offset`(value: Double): Self = this.set("xsmall-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXsmall-offset`: Self = this.set("xsmall-offset", js.undefined)
  }
}
