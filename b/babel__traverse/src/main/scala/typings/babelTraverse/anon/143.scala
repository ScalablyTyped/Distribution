package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var `type`: DirectiveLiteral
}
object `143` {
  
  inline def apply(): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
