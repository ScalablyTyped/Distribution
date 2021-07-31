package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var `type`: EnumSymbolBody
}
object `193` {
  
  @scala.inline
  def apply(): `193` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit class `193MutableBuilder`[Self <: `193`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
