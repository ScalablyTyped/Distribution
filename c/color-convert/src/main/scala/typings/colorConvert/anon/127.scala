package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  def raw(from: KEYWORD_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, GRAY_]
}
object `127` {
  
  inline def apply(raw: /* from */ KEYWORD_ => GRAY_): `127` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `127`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ KEYWORD_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
