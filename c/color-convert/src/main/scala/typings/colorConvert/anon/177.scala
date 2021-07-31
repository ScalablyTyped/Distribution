package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  def raw(from: HCG_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HEX_]
}
object `177` {
  
  @scala.inline
  def apply(raw: /* from */ HCG_ => HEX_): `177` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit class `177MutableBuilder`[Self <: `177`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HCG_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
