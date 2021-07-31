package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  def raw(from: ANSI256_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HCG_]
}
object `159` {
  
  @scala.inline
  def apply(raw: /* from */ ANSI256_ => HCG_): `159` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit class `159MutableBuilder`[Self <: `159`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ ANSI256_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
