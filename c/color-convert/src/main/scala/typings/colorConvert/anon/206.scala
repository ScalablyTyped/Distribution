package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  def raw(from: GRAY_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HSL_]
}
object `206` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => HSL_): `206` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit class `206MutableBuilder`[Self <: `206`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
