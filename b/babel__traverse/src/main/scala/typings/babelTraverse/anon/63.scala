package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var `type`: Directive
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `63`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
