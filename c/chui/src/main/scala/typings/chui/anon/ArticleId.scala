package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArticleId extends StObject {
  
  var articleId: js.UndefOr[js.Any] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
}
object ArticleId {
  
  inline def apply(): ArticleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArticleId]
  }
  
  extension [Self <: ArticleId](x: Self) {
    
    inline def setArticleId(value: js.Any): Self = StObject.set(x, "articleId", value.asInstanceOf[js.Any])
    
    inline def setArticleIdUndefined: Self = StObject.set(x, "articleId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
