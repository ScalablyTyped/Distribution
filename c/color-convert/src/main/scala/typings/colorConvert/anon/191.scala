package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  def raw(from: APPLE_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HEX_]
}
object `191` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => HEX_): `191` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
