package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.baseline
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.bottom
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.center
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.char
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.justify
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.left
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.middle
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.right
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TdHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var abbr: js.UndefOr[String] = js.native
  
  var align: js.UndefOr[left | center | right | justify | char] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var colspan: js.UndefOr[Double | String] = js.native
  
  var headers: js.UndefOr[String] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var rowspan: js.UndefOr[Double | String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.native
}
object TdHTMLAttributes {
  
  @scala.inline
  def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TdHTMLAttributesOps[Self <: TdHTMLAttributes[_], T] (val x: Self with TdHTMLAttributes[T]) extends AnyVal {
    
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
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    
    @scala.inline
    def setAlign(value: left | center | right | justify | char): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setValign(value: top | middle | bottom | baseline): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
  }
}
