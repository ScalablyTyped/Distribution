package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standards extends js.Object {
  
  var ariaAttrs: js.UndefOr[StringDictionary[AriaAttrs]] = js.native
  
  var ariaRoles: js.UndefOr[StringDictionary[AriaRoles]] = js.native
  
  var cssColors: js.UndefOr[StringDictionary[js.Array[Double]]] = js.native
  
  var htmlElms: js.UndefOr[StringDictionary[HtmlElms]] = js.native
}
object Standards {
  
  @scala.inline
  def apply(): Standards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standards]
  }
  
  @scala.inline
  implicit class StandardsOps[Self <: Standards] (val x: Self) extends AnyVal {
    
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
    def setAriaAttrs(value: StringDictionary[AriaAttrs]): Self = this.set("ariaAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaAttrs: Self = this.set("ariaAttrs", js.undefined)
    
    @scala.inline
    def setAriaRoles(value: StringDictionary[AriaRoles]): Self = this.set("ariaRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaRoles: Self = this.set("ariaRoles", js.undefined)
    
    @scala.inline
    def setCssColors(value: StringDictionary[js.Array[Double]]): Self = this.set("cssColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssColors: Self = this.set("cssColors", js.undefined)
    
    @scala.inline
    def setHtmlElms(value: StringDictionary[HtmlElms]): Self = this.set("htmlElms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlElms: Self = this.set("htmlElms", js.undefined)
  }
}
