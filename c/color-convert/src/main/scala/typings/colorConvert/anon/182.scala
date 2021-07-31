package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  def raw(from: APPLE_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, KEYWORD_]
}
object `182` {
  
  @scala.inline
  def apply(raw: /* from */ APPLE_ => KEYWORD_): `182` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit class `182MutableBuilder`[Self <: `182`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: /* from */ APPLE_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
