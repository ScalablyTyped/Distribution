package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  def raw(from: ANSI256_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, LAB_]
}
object `166` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => LAB_): `166` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit class `166MutableBuilder`[Self <: `166`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
