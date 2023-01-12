package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  def raw(from: HCG_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HSV_]
}
object `175` {
  
  inline def apply(raw: /* from */ HCG_ => HSV_): `175` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `175`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ HCG_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
