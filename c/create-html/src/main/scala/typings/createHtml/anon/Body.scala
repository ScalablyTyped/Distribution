package typings.createHtml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  /** Content to insert into <body> tag. */
  var body: js.UndefOr[String] = js.native
  
  /** CSS filename. */
  var css: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Add async attribute to CSS tag. */
  var cssAsync: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Direction of content. */
  var dir: js.UndefOr[String] = js.native
  
  /** Site favicon. */
  var favicon: js.UndefOr[String] = js.native
  
  /** Content to insert into <head> tag. */
  var head: js.UndefOr[String] = js.native
  
  /** Language of content. */
  var lang: js.UndefOr[String] = js.native
  
  /** JavaScript filename. */
  var script: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Add async attribute to script tag. */
  var scriptAsync: js.UndefOr[Boolean] = js.native
  
  /** Page title. */
  var title: js.UndefOr[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: String | js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCssAsyncVarargs(value: String*): Self = this.set("cssAsync", js.Array(value :_*))
    
    @scala.inline
    def setCssAsync(value: String | js.Array[String]): Self = this.set("cssAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssAsync: Self = this.set("cssAsync", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setScriptVarargs(value: String*): Self = this.set("script", js.Array(value :_*))
    
    @scala.inline
    def setScript(value: String | js.Array[String]): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setScriptAsync(value: Boolean): Self = this.set("scriptAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptAsync: Self = this.set("scriptAsync", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
