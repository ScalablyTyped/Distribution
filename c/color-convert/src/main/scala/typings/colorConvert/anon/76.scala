package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  def raw(from: XYZ_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HCG_]
}
object `76` {
  
  @scala.inline
  def apply(raw: /* from */ XYZ_ => HCG_): `76` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ XYZ_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
