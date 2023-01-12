package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  def raw(from: LAB_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HCG_]
}
object `90` {
  
  inline def apply(raw: /* from */ LAB_ => HCG_): `90` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `90`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LAB_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
