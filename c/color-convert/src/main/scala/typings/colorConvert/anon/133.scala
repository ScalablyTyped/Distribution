package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  def raw(from: KEYWORD_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HSV_]
}
object `133` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => HSV_): `133` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`133`]
  }
  
  @scala.inline
  implicit class `133MutableBuilder`[Self <: `133`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
