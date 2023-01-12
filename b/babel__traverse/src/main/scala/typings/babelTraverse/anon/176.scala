package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  var `type`: CatchClause
}
object `176` {
  
  inline def apply(): `176` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `176`] (val x: Self) extends AnyVal {
    
    inline def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
