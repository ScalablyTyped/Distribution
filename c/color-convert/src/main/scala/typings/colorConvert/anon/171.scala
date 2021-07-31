package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  def raw(from: HCG_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, ANSI256_]
}
object `171` {
  
  @scala.inline
  def apply(raw: /* from */ HCG_ => ANSI256_): `171` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`171`]
  }
  
  @scala.inline
  implicit class `171MutableBuilder`[Self <: `171`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HCG_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
