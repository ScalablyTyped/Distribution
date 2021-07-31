package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  def raw(from: ANSI256_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, LCH_]
}
object `162` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => LCH_): `162` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit class `162MutableBuilder`[Self <: `162`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
