package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  def raw(from: APPLE_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, RGB_]
}
object `181` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => RGB_): `181` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit class `181MutableBuilder`[Self <: `181`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
