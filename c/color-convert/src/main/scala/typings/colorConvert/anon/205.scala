package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  def raw(from: XYZ_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HEX_]
}
object `205` {
  
  inline def apply(raw: /* from */ XYZ_ => HEX_): `205` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
