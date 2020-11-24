package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit extends js.Object {
  
   // 违禁检测分，范围 0~1，数值从低到高代表风险程度的高低 。
  var hit: js.Array[String] = js.native
  
  // 审核通过的类别列表与详情
  var label: Double = js.native
  
   // 请求中的违禁类型
  var score: Double = js.native
}
object Hit {
  
  @scala.inline
  def apply(hit: js.Array[String], label: Double, score: Double): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  @scala.inline
  implicit class HitOps[Self <: Hit] (val x: Self) extends AnyVal {
    
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
    def setHitVarargs(value: String*): Self = this.set("hit", js.Array(value :_*))
    
    @scala.inline
    def setHit(value: js.Array[String]): Self = this.set("hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Double): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
