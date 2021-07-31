package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  def raw(from: GRAY_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, LAB_]
}
object `208` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => LAB_): `208` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit class `208MutableBuilder`[Self <: `208`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
