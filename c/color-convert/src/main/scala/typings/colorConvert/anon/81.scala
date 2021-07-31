package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  def raw(from: XYZ_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, ANSI16_]
}
object `81` {
  
  @scala.inline
  def apply(raw: /* from */ XYZ_ => ANSI16_): `81` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit class `81MutableBuilder`[Self <: `81`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ XYZ_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
