package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  def raw(from: GRAY_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HSV_]
}
object `203` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => HSV_): `203` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit class `203MutableBuilder`[Self <: `203`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
