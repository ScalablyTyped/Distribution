package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alpha extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var blue: js.UndefOr[Double] = js.native
  
  var green: js.UndefOr[Double] = js.native
  
  var maximumAlpha: js.UndefOr[Double] = js.native
  
  var maximumBlue: js.UndefOr[Double] = js.native
  
  var maximumGreen: js.UndefOr[Double] = js.native
  
  var maximumRed: js.UndefOr[Double] = js.native
  
  var minimumAlpha: js.UndefOr[Double] = js.native
  
  var minimumBlue: js.UndefOr[Double] = js.native
  
  var minimumGreen: js.UndefOr[Double] = js.native
  
  var minimumRed: js.UndefOr[Double] = js.native
  
  var red: js.UndefOr[Double] = js.native
}
object Alpha {
  
  @scala.inline
  def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    
    @scala.inline
    def setMaximumAlpha(value: Double): Self = this.set("maximumAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumAlpha: Self = this.set("maximumAlpha", js.undefined)
    
    @scala.inline
    def setMaximumBlue(value: Double): Self = this.set("maximumBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBlue: Self = this.set("maximumBlue", js.undefined)
    
    @scala.inline
    def setMaximumGreen(value: Double): Self = this.set("maximumGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumGreen: Self = this.set("maximumGreen", js.undefined)
    
    @scala.inline
    def setMaximumRed(value: Double): Self = this.set("maximumRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRed: Self = this.set("maximumRed", js.undefined)
    
    @scala.inline
    def setMinimumAlpha(value: Double): Self = this.set("minimumAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumAlpha: Self = this.set("minimumAlpha", js.undefined)
    
    @scala.inline
    def setMinimumBlue(value: Double): Self = this.set("minimumBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumBlue: Self = this.set("minimumBlue", js.undefined)
    
    @scala.inline
    def setMinimumGreen(value: Double): Self = this.set("minimumGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumGreen: Self = this.set("minimumGreen", js.undefined)
    
    @scala.inline
    def setMinimumRed(value: Double): Self = this.set("minimumRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRed: Self = this.set("minimumRed", js.undefined)
    
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
  }
}
