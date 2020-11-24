package typings.ctrlTinycolor.readabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WCAG2FallbackParms extends WCAG2Parms {
  
  var includeFallbackColors: js.UndefOr[Boolean] = js.native
}
object WCAG2FallbackParms {
  
  @scala.inline
  def apply(): WCAG2FallbackParms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCAG2FallbackParms]
  }
  
  @scala.inline
  implicit class WCAG2FallbackParmsOps[Self <: WCAG2FallbackParms] (val x: Self) extends AnyVal {
    
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
    def setIncludeFallbackColors(value: Boolean): Self = this.set("includeFallbackColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFallbackColors: Self = this.set("includeFallbackColors", js.undefined)
  }
}
