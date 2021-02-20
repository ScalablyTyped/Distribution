package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Score extends StObject {
  
  // 菜品识别结果数组
  var name: Double = js.native
  
  // 植物名称，示例：吉娃莲。
  var score: Double = js.native
}
object Score {
  
  @scala.inline
  def apply(name: Double, score: Double): Score = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  
  @scala.inline
  implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
