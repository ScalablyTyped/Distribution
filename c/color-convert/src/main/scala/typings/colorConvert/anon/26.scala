package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  def raw(from: HSL_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, LAB_]
}
object `26` {
  
  @scala.inline
  def apply(raw: /* from */ HSL_ => LAB_): `26` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSL_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
