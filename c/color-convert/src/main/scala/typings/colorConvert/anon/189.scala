package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  def raw(from: APPLE_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HSV_]
}
object `189` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => HSV_): `189` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit class `189MutableBuilder`[Self <: `189`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
