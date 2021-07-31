package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  def raw(from: APPLE_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HCG_]
}
object `187` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => HCG_): `187` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit class `187MutableBuilder`[Self <: `187`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
