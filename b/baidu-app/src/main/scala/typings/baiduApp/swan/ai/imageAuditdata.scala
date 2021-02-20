package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait imageAuditdata extends StObject {
  
  var msg: Double = js.native
  
  var probability: Double = js.native
  
  var stars: js.Array[imageAuditdata] = js.native
  
  var `type`: Double = js.native
  
  var words: Double = js.native
}
object imageAuditdata {
  
  @scala.inline
  def apply(msg: Double, probability: Double, stars: js.Array[imageAuditdata], `type`: Double, words: Double): imageAuditdata = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditdata]
  }
  
  @scala.inline
  implicit class imageAuditdataMutableBuilder[Self <: imageAuditdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsg(value: Double): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStars(value: js.Array[imageAuditdata]): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarsVarargs(value: imageAuditdata*): Self = StObject.set(x, "stars", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
