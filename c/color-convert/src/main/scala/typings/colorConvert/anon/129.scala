package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  def raw(from: KEYWORD_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HWB_]
}
object `129` {
  
  inline def apply(raw: /* from */ KEYWORD_ => HWB_): `129` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ KEYWORD_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
