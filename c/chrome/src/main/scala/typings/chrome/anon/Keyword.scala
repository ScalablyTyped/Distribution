package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyword extends StObject {
  
  var keyword: String
}
object Keyword {
  
  @scala.inline
  def apply(keyword: String): Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  
  @scala.inline
  implicit class KeywordMutableBuilder[Self <: Keyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
