package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  def raw(from: HSV_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, LCH_]
}
object `36` {
  
  @scala.inline
  def apply(raw: /* from */ HSV_ => LCH_): `36` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSV_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
