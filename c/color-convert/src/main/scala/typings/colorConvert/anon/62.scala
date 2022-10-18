package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  def raw(from: GRAY_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, XYZ_]
}
object `62` {
  
  inline def apply(raw: /* from */ GRAY_ => XYZ_): `62` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
