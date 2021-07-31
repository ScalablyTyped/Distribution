package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  def raw(from: LAB_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HSV_]
}
object `92` {
  
  @scala.inline
  def apply(raw: /* from */ LAB_ => HSV_): `92` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`92`]
  }
  
  @scala.inline
  implicit class `92MutableBuilder`[Self <: `92`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ LAB_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
