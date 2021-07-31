package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  def raw(from: HSV_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, APPLE_]
}
object `28` {
  
  @scala.inline
  def apply(raw: /* from */ HSV_ => APPLE_): `28` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSV_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
