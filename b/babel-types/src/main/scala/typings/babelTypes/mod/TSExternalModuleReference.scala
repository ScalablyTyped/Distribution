package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExternalModuleReference
  extends StObject
     with Node {
  
  var expression: StringLiteral_
  
  @JSName("type")
  var type_TSExternalModuleReference: typings.babelTypes.babelTypesStrings.TSExternalModuleReference
}
object TSExternalModuleReference {
  
  @JSImport("babel-types", "TSExternalModuleReference")
  @js.native
  def apply(expression: StringLiteral_): TSExternalModuleReference = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSExternalModuleReference] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
