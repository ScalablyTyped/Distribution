package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  def raw(from: KEYWORD_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, HCG_]
}
object `131` {
  
  @scala.inline
  def apply(raw: /* from */ KEYWORD_ => HCG_): `131` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit class `131MutableBuilder`[Self <: `131`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ KEYWORD_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
