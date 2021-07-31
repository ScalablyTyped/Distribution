package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  def raw(from: HEX_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, XYZ_]
}
object `119` {
  
  @scala.inline
  def apply(raw: /* from */ HEX_ => XYZ_): `119` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit class `119MutableBuilder`[Self <: `119`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HEX_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
