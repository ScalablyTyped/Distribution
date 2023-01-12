package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExternalModuleReference__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var expression: StringLiteral_
  
  @JSName("type")
  var type_TSExternalModuleReference__ : TSExternalModuleReference
}
object TSExternalModuleReference__ {
  
  inline def apply(expression: StringLiteral_): TSExternalModuleReference__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[TSExternalModuleReference__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSExternalModuleReference__] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
