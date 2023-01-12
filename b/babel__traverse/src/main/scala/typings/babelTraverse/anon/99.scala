package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var `type`: typings.babelTraverse.babelTraverseStrings.Identifier
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `99`] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTraverse.babelTraverseStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
