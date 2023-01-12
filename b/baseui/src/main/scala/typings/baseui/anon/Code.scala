package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Name
  
  var gaps: js.Array[Double]
  
  var lengths: js.Array[Double]
  
  var niceType: String
  
  var patterns: js.Array[js.Array[Double]]
  
  var `type`: String
}
object Code {
  
  inline def apply(
    code: Name,
    gaps: js.Array[Double],
    lengths: js.Array[Double],
    niceType: String,
    patterns: js.Array[js.Array[Double]],
    `type`: String
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
    
    inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
    
    inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
    
    inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
