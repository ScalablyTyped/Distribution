package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  def raw(from: HCG_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, APPLE_]
}
object `168` {
  
  inline def apply(raw: /* from */ HCG_ => APPLE_): `168` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `168`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HCG_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
