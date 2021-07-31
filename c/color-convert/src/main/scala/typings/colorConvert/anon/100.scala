package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  def raw(from: LCH_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, GRAY_]
}
object `100` {
  
  @scala.inline
  def apply(raw: /* from */ LCH_ => GRAY_): `100` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit class `100MutableBuilder`[Self <: `100`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LCH_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
