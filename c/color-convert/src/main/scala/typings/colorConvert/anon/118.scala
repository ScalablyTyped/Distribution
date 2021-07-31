package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  def raw(from: HEX_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, HCG_]
}
object `118` {
  
  @scala.inline
  def apply(raw: /* from */ HEX_ => HCG_): `118` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit class `118MutableBuilder`[Self <: `118`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HEX_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
