package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var `type`: BigIntLiteral
}
object `184` {
  
  inline def apply(): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `184`] (val x: Self) extends AnyVal {
    
    inline def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
