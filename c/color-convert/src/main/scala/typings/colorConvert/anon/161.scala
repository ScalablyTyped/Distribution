package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  def raw(from: LAB_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, XYZ_]
}
object `161` {
  
  inline def apply(raw: /* from */ LAB_ => XYZ_): `161` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
