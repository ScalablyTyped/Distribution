package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  def raw(from: HSV_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, HCG_]
}
object `34` {
  
  @scala.inline
  def apply(raw: /* from */ HSV_ => HCG_): `34` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit class `34MutableBuilder`[Self <: `34`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSV_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
