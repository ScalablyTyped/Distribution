package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Probability extends js.Object {
  
   // 分类结果置信度（0–1.0）
  var location: Height = js.native
  
   // type=0 为1千种高优商标识别结果；type=1 为2万类logo库的结果；其它type为自定义logo库结果。
  var name: Double = js.native
  
   // 识别的品牌名称
  var probability: Double = js.native
  
  // 菜品识别结果数组
  var `type`: Double = js.native
}
object Probability {
  
  @scala.inline
  def apply(location: Height, name: Double, probability: Double, `type`: Double): Probability = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Probability]
  }
  
  @scala.inline
  implicit class ProbabilityOps[Self <: Probability] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Height): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Double): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = this.set("probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
