package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  def raw(from: HSV_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, XYZ_]
}
object `35` {
  
  @scala.inline
  def apply(raw: /* from */ HSV_ => XYZ_): `35` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ HSV_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
