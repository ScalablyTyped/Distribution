package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyword extends StObject {
  
  // 标签结果数组
  var keyword: String = js.native
  
  // 置信度，0-1
  var root: String = js.native
  
  // 图片中的物体或场景名称
  var score: Double = js.native
}
object Keyword {
  
  @scala.inline
  def apply(keyword: String, root: String, score: Double): Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  
  @scala.inline
  implicit class KeywordMutableBuilder[Self <: Keyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
