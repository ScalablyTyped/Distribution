package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  def raw(from: APPLE_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, LAB_]
}
object `194` {
  
  inline def apply(raw: /* from */ APPLE_ => LAB_): `194` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `194`] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: /* from */ APPLE_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
