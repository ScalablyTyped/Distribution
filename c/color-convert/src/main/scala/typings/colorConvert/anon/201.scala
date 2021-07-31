package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  def raw(from: GRAY_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HCG_]
}
object `201` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => HCG_): `201` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit class `201MutableBuilder`[Self <: `201`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
