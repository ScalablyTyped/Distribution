package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  def raw(from: ANSI16_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, LAB_]
}
object `152` {
  
  inline def apply(raw: /* from */ ANSI16_ => LAB_): `152` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
