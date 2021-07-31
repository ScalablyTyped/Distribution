package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  def raw(from: XYZ_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, HSL_]
}
object `80` {
  
  @scala.inline
  def apply(raw: /* from */ XYZ_ => HSL_): `80` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ XYZ_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
