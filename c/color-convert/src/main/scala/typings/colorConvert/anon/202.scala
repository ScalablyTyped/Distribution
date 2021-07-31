package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  def raw(from: GRAY_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, XYZ_]
}
object `202` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => XYZ_): `202` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit class `202MutableBuilder`[Self <: `202`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
