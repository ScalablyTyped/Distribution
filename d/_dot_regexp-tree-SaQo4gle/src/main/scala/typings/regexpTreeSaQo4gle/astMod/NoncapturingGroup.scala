package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncapturingGroup
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Group]
     with Group {
  
  var capturing: `false`
  
  var expression: Expression | Null
}
object NoncapturingGroup {
  
  inline def apply(): NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[NoncapturingGroup]
  }
  
  extension [Self <: NoncapturingGroup](x: Self) {
    
    inline def setCapturing(value: `false`): Self = StObject.set(x, "capturing", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
  }
}
