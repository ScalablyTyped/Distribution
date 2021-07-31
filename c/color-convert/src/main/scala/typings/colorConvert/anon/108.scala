package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  def raw(from: LCH_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HSL_]
}
object `108` {
  
  @scala.inline
  def apply(raw: /* from */ LCH_ => HSL_): `108` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit class `108MutableBuilder`[Self <: `108`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LCH_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
