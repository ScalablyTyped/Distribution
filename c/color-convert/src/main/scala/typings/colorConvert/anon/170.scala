package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  def raw(from: HCG_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, GRAY_]
}
object `170` {
  
  @scala.inline
  def apply(raw: /* from */ HCG_ => GRAY_): `170` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HCG_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
