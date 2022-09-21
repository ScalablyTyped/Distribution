package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait imageAuditdata extends StObject {
  
  var msg: Double
  
  var probability: Double
  
  var stars: js.Array[imageAuditdata]
  
  var `type`: Double
  
  var words: Double
}
object imageAuditdata {
  
  inline def apply(msg: Double, probability: Double, stars: js.Array[imageAuditdata], `type`: Double, words: Double): imageAuditdata = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditdata]
  }
  
  extension [Self <: imageAuditdata](x: Self) {
    
    inline def setMsg(value: Double): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setStars(value: js.Array[imageAuditdata]): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
    
    inline def setStarsVarargs(value: imageAuditdata*): Self = StObject.set(x, "stars", js.Array(value*))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
