package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  def raw(from: KEYWORD_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HSL_]
}
object `136` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => HSL_): `136` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit class `136MutableBuilder`[Self <: `136`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
