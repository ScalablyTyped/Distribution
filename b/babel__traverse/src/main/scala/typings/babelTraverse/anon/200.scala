package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DoWhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var `type`: DoWhileStatement
}
object `200` {
  
  inline def apply(): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
