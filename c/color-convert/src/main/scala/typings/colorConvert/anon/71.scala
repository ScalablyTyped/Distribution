package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  def raw(from: XYZ_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, KEYWORD_]
}
object `71` {
  
  inline def apply(raw: /* from */ XYZ_ => KEYWORD_): `71` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`71`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `71`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ XYZ_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
