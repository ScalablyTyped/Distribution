package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  def raw(from: GRAY_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, LCH_]
}
object `204` {
  
  @scala.inline
  def apply(raw: /* from */ GRAY_ => LCH_): `204` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit class `204MutableBuilder`[Self <: `204`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ GRAY_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
