package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleBooleans.`true`
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleChar
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Char]
     with Char {
  
  var codePoint: Double
  
  var escaped: js.UndefOr[`true`] = js.undefined
  
  var kind: simple
  
  var value: String
}
object SimpleChar {
  
  inline def apply(codePoint: Double, value: String): SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[SimpleChar]
  }
  
  extension [Self <: SimpleChar](x: Self) {
    
    inline def setCodePoint(value: Double): Self = StObject.set(x, "codePoint", value.asInstanceOf[js.Any])
    
    inline def setEscaped(value: `true`): Self = StObject.set(x, "escaped", value.asInstanceOf[js.Any])
    
    inline def setEscapedUndefined: Self = StObject.set(x, "escaped", js.undefined)
    
    inline def setKind(value: simple): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
