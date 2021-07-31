package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  def raw(from: LCH_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, XYZ_]
}
object `105` {
  
  @scala.inline
  def apply(raw: /* from */ LCH_ => XYZ_): `105` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit class `105MutableBuilder`[Self <: `105`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LCH_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
