package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  def raw(from: HSL_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HCG_]
}
object `20` {
  
  inline def apply(raw: /* from */ HSL_ => HCG_): `20` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HSL_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
