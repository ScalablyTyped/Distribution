package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyHyphenFallback extends js.Object {
  
  var inherits: js.UndefOr[PropertyInheritsProperty | js.Array[PropertyInheritsProperty]] = js.native
  
  var `initial-value`: js.UndefOr[String | js.Array[String]] = js.native
  
  var syntax: js.UndefOr[String | js.Array[String]] = js.native
}
object PropertyHyphenFallback {
  
  @scala.inline
  def apply(): PropertyHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphenFallback]
  }
  
  @scala.inline
  implicit class PropertyHyphenFallbackOps[Self <: PropertyHyphenFallback] (val x: Self) extends AnyVal {
    
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
    def setInheritsVarargs(value: PropertyInheritsProperty*): Self = this.set("inherits", js.Array(value :_*))
    
    @scala.inline
    def setInherits(value: PropertyInheritsProperty | js.Array[PropertyInheritsProperty]): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
    
    @scala.inline
    def `setInitial-valueVarargs`(value: String*): Self = this.set("initial-value", js.Array(value :_*))
    
    @scala.inline
    def `setInitial-value`(value: String | js.Array[String]): Self = this.set("initial-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteInitial-value`: Self = this.set("initial-value", js.undefined)
    
    @scala.inline
    def setSyntaxVarargs(value: String*): Self = this.set("syntax", js.Array(value :_*))
    
    @scala.inline
    def setSyntax(value: String | js.Array[String]): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
}
