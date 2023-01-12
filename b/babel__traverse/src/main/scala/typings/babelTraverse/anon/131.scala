package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var `type`: StringLiteral
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `131`] (val x: Self) extends AnyVal {
    
    inline def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
