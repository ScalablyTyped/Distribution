package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  def raw(from: XYZ_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, LCH_]
}
object `78` {
  
  inline def apply(raw: /* from */ XYZ_ => LCH_): `78` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `78`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ XYZ_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
