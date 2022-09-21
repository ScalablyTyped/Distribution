package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExternalModuleReference
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var expression: StringLiteral_
  
  @JSName("type")
  var type_TSExternalModuleReference: typings.babelTypes.babelTypesStrings.TSExternalModuleReference
}
object TSExternalModuleReference {
  
  inline def apply(expression: StringLiteral_): TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[TSExternalModuleReference]
  }
  
  extension [Self <: TSExternalModuleReference](x: Self) {
    
    inline def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
