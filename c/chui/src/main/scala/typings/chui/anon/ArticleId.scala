package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArticleId extends js.Object {
  
  var articleId: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
}
object ArticleId {
  
  @scala.inline
  def apply(): ArticleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArticleId]
  }
  
  @scala.inline
  implicit class ArticleIdOps[Self <: ArticleId] (val x: Self) extends AnyVal {
    
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
    def setArticleId(value: js.Any): Self = this.set("articleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleId: Self = this.set("articleId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
