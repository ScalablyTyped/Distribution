package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calorie extends StObject {
  
  // 菜名，示例：鱼香肉丝。
  var calorie: Double
  
  // 菜品识别结果数组
  var name: String
  
  // 卡路里，每100g的卡路里含量。
  var probability: Double
}
object Calorie {
  
  @scala.inline
  def apply(calorie: Double, name: String, probability: Double): Calorie = {
    val __obj = js.Dynamic.literal(calorie = calorie.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calorie]
  }
  
  @scala.inline
  implicit class CalorieMutableBuilder[Self <: Calorie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalorie(value: Double): Self = StObject.set(x, "calorie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
  }
}
