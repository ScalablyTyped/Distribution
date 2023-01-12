package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  def raw(from: LAB_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, ANSI256_]
}
object `87` {
  
  inline def apply(raw: /* from */ LAB_ => ANSI256_): `87` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ LAB_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
