package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  def raw(from: APPLE_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, LCH_]
}
object `190` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => LCH_): `190` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`190`]
  }
  
  @scala.inline
  implicit class `190MutableBuilder`[Self <: `190`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
