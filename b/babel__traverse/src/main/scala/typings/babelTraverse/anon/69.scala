package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  var `type`: LogicalExpression
}
object `69` {
  
  inline def apply(): `69` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[`69`]
  }
  
  extension [Self <: `69`](x: Self) {
    
    inline def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
