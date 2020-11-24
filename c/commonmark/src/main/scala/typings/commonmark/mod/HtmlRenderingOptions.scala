package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlRenderingOptions extends XmlRenderingOptions {
  
  /**
    *  if true, raw HTML will not be passed through to HTML output (it will be replaced by comments), and potentially unsafe URLs in links and images
    *  (those beginning with javascript:, vbscript:, file:, and with a few exceptions data:) will be replaced with empty strings.
    */
  var safe: js.UndefOr[Boolean] = js.native
  
  /**
    *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
    */
  var smart: js.UndefOr[Boolean] = js.native
  
  /**
    * A raw string to be used for a softbreak.
    * For example, `{ softbreak: "<br/>" }` treats a softbreak as `<br/>`.
    */
  var softbreak: js.UndefOr[String] = js.native
}
object HtmlRenderingOptions {
  
  @scala.inline
  def apply(): HtmlRenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlRenderingOptions]
  }
  
  @scala.inline
  implicit class HtmlRenderingOptionsOps[Self <: HtmlRenderingOptions] (val x: Self) extends AnyVal {
    
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
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSmart(value: Boolean): Self = this.set("smart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmart: Self = this.set("smart", js.undefined)
    
    @scala.inline
    def setSoftbreak(value: String): Self = this.set("softbreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftbreak: Self = this.set("softbreak", js.undefined)
  }
}
