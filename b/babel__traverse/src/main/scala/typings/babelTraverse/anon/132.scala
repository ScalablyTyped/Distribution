package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var `type`: BooleanLiteral
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `132`] (val x: Self) extends AnyVal {
    
    inline def setType(value: BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
