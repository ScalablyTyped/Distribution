package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var `type`: BinaryExpression
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `89`] (val x: Self) extends AnyVal {
    
    inline def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
