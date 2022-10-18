package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  def raw(from: GRAY_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, KEYWORD_]
}
object `57` {
  
  inline def apply(raw: /* from */ GRAY_ => KEYWORD_): `57` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
