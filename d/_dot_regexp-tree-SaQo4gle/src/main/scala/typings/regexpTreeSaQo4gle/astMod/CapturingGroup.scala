package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapturingGroup
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Group]
     with Group {
  
  var capturing: `true`
  
  var expression: Expression | Null
  
  var name: js.UndefOr[String] = js.undefined
  
  var nameRaw: js.UndefOr[String] = js.undefined
  
  var number: Double
}
object CapturingGroup {
  
  inline def apply(number: Double): CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[CapturingGroup]
  }
  
  extension [Self <: CapturingGroup](x: Self) {
    
    inline def setCapturing(value: `true`): Self = StObject.set(x, "capturing", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameRaw(value: String): Self = StObject.set(x, "nameRaw", value.asInstanceOf[js.Any])
    
    inline def setNameRawUndefined: Self = StObject.set(x, "nameRaw", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
