package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  def raw(from: HSL_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, LCH_]
}
object `23` {
  
  inline def apply(raw: /* from */ HSL_ => LCH_): `23` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSL_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
