package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  def raw(from: APPLE_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, XYZ_]
}
object `34` {
  
  inline def apply(raw: /* from */ APPLE_ => XYZ_): `34` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
