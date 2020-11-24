package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrutStyle extends js.Object {
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  var forceStrutHeight: js.UndefOr[Boolean] = js.native
  
  var heightMultiplier: js.UndefOr[Double] = js.native
  
  var leading: js.UndefOr[Double] = js.native
  
  var strutEnabled: js.UndefOr[Boolean] = js.native
}
object StrutStyle {
  
  @scala.inline
  def apply(): StrutStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrutStyle]
  }
  
  @scala.inline
  implicit class StrutStyleOps[Self <: StrutStyle] (val x: Self) extends AnyVal {
    
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
    def setFontFamiliesVarargs(value: String*): Self = this.set("fontFamilies", js.Array(value :_*))
    
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamilies: Self = this.set("fontFamilies", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setForceStrutHeight(value: Boolean): Self = this.set("forceStrutHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceStrutHeight: Self = this.set("forceStrutHeight", js.undefined)
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = this.set("heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMultiplier: Self = this.set("heightMultiplier", js.undefined)
    
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setStrutEnabled(value: Boolean): Self = this.set("strutEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrutEnabled: Self = this.set("strutEnabled", js.undefined)
  }
}
