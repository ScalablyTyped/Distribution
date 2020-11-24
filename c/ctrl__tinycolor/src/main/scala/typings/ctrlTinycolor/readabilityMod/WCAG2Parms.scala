package typings.ctrlTinycolor.readabilityMod

import typings.ctrlTinycolor.ctrlTinycolorStrings.AA
import typings.ctrlTinycolor.ctrlTinycolorStrings.AAA
import typings.ctrlTinycolor.ctrlTinycolorStrings.large
import typings.ctrlTinycolor.ctrlTinycolorStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WCAG2Parms extends js.Object {
  
  var level: js.UndefOr[AA | AAA] = js.native
  
  var size: js.UndefOr[large | small] = js.native
}
object WCAG2Parms {
  
  @scala.inline
  def apply(): WCAG2Parms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCAG2Parms]
  }
  
  @scala.inline
  implicit class WCAG2ParmsOps[Self <: WCAG2Parms] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: AA | AAA): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
