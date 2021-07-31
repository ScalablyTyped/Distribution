package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  def raw(from: GRAY_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, RGB_]
}
object `195` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => RGB_): `195` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`195`]
  }
  
  @scala.inline
  implicit class `195MutableBuilder`[Self <: `195`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
