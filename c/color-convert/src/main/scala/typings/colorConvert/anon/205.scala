package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  def raw(from: GRAY_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HEX_]
}
object `205` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => HEX_): `205` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`205`]
  }
  
  @scala.inline
  implicit class `205MutableBuilder`[Self <: `205`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
