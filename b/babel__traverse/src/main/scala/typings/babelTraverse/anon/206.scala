package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DecimalLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  var `type`: DecimalLiteral
}
object `206` {
  
  inline def apply(): `206` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `206`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DecimalLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
