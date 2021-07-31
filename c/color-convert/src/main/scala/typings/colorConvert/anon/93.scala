package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  def raw(from: LAB_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, LCH_]
}
object `93` {
  
  @scala.inline
  def apply(raw: /* from */ LAB_ => LCH_): `93` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LAB_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
