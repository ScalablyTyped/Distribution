package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator_
  extends StObject
     with Node {
  
  var id: LVal
  
  var init: Expression
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator
}
object VariableDeclarator_ {
  
  inline def apply(end: Double, id: LVal, init: Expression, loc: SourceLocation, start: Double): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
