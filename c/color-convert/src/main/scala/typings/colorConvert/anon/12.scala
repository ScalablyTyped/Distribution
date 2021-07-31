package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  def raw(from: RGB_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, LAB_]
}
object `12` {
  
  @scala.inline
  def apply(raw: /* from */ RGB_ => LAB_): `12` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ RGB_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
