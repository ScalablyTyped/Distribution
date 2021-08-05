package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  // 菜品识别结果数组
  var name: Double
  
  // 植物名称，示例：吉娃莲。
  var score: Double
}
object Score {
  
  inline def apply(name: Double, score: Double): Score = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
