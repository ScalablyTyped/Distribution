package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  def raw(from: LAB_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HEX_]
}
object `94` {
  
  inline def apply(raw: /* from */ LAB_ => HEX_): `94` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LAB_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
