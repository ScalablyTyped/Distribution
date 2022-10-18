package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  def raw(from: KEYWORD_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HEX_]
}
object `149` {
  
  inline def apply(raw: /* from */ KEYWORD_ => HEX_): `149` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
