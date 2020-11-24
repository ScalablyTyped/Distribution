package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyHyphen extends js.Object {
  
  var inherits: js.UndefOr[PropertyInheritsProperty] = js.native
  
  var `initial-value`: js.UndefOr[String] = js.native
  
  var syntax: js.UndefOr[String] = js.native
}
object PropertyHyphen {
  
  @scala.inline
  def apply(): PropertyHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphen]
  }
  
  @scala.inline
  implicit class PropertyHyphenOps[Self <: PropertyHyphen] (val x: Self) extends AnyVal {
    
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
    def setInherits(value: PropertyInheritsProperty): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
    
    @scala.inline
    def `setInitial-value`(value: String): Self = this.set("initial-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteInitial-value`: Self = this.set("initial-value", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
}
