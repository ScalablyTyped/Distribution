package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  var `type`: EnumSymbolBody
}
object `198` {
  
  inline def apply(): `198` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `198`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
