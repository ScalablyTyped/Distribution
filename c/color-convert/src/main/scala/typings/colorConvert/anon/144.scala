package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  def raw(from: ANSI16_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, HWB_]
}
object `144` {
  
  inline def apply(raw: /* from */ ANSI16_ => HWB_): `144` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ ANSI16_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
