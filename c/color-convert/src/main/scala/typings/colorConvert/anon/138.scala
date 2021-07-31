package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  def raw(from: KEYWORD_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, LAB_]
}
object `138` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => LAB_): `138` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit class `138MutableBuilder`[Self <: `138`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
