package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  def raw(from: LCH_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, LAB_]
}
object `110` {
  
  @scala.inline
  def apply(raw: /* from */ LCH_ => LAB_): `110` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LCH_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
