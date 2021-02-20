package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArticleId extends StObject {
  
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
  implicit class ArticleIdMutableBuilder[Self <: ArticleId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArticleId(value: js.Any): Self = StObject.set(x, "articleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticleIdUndefined: Self = StObject.set(x, "articleId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
