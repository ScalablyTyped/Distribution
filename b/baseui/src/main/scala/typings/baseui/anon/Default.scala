package typings.baseui.anon

import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.high
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  val default: default_
  
  val high: typings.baseui.baseuiStrings.high
}
object Default {
  
  inline def apply(): Default = {
    val __obj = js.Dynamic.literal(default = "default", high = "high")
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setHigh(value: high): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
  }
}
