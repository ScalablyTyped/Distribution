package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  def raw(from: KEYWORD_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, XYZ_]
}
object `132` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => XYZ_): `132` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit class `132MutableBuilder`[Self <: `132`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
