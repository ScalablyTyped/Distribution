package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  def raw(from: ANSI256_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HCG_]
}
object `159` {
  
  inline def apply(raw: /* from */ ANSI256_ => HCG_): `159` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
