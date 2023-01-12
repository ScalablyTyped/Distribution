package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ModuleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node {
  
  var body: Program_
  
  @JSName("type")
  var type_ModuleExpression_ : ModuleExpression
}
object ModuleExpression_ {
  
  inline def apply(body: Program_): ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[ModuleExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleExpression_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Program_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: ModuleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
