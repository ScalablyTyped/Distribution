package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  def raw(from: ANSI16_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, LCH_]
}
object `149` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI16_ => LCH_): `149` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit class `149MutableBuilder`[Self <: `149`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI16_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
