package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  def raw(from: HCG_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HSL_]
}
object `178` {
  
  @scala.inline
  def apply(raw: /* from */ HCG_ => HSL_): `178` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`178`]
  }
  
  @scala.inline
  implicit class `178MutableBuilder`[Self <: `178`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HCG_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
