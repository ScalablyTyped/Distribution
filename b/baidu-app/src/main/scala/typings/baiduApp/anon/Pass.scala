package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pass extends StObject {
  
  // 待人工复审的类别列表与详情
  var pass: js.Array[Hit]
  
  // 请求中是否包含违禁，0表示非违禁，1表示违禁，2表示建议人工复审 。
  var reject: js.Array[Any]
  
  // 审核未通过的类别列表与详情
  var review: js.Array[Any]
  
  // 审核结果详情
  var spam: Double
}
object Pass {
  
  inline def apply(pass: js.Array[Hit], reject: js.Array[Any], review: js.Array[Any], spam: Double): Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
    
    inline def setPass(value: js.Array[Hit]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassVarargs(value: Hit*): Self = StObject.set(x, "pass", js.Array(value*))
    
    inline def setReject(value: js.Array[Any]): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    inline def setRejectVarargs(value: Any*): Self = StObject.set(x, "reject", js.Array(value*))
    
    inline def setReview(value: js.Array[Any]): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setReviewVarargs(value: Any*): Self = StObject.set(x, "review", js.Array(value*))
    
    inline def setSpam(value: Double): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
  }
}
