package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  def raw(from: XYZ_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, LAB_]
}
object `208` {
  
  inline def apply(raw: /* from */ XYZ_ => LAB_): `208` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
