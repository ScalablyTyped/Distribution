package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit extends StObject {
  
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
  implicit class HitMutableBuilder[Self <: Hit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHit(value: js.Array[String]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitVarargs(value: String*): Self = StObject.set(x, "hit", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
