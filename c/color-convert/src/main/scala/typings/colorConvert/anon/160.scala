package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  def raw(from: ANSI256_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, XYZ_]
}
object `160` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => XYZ_): `160` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit class `160MutableBuilder`[Self <: `160`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
