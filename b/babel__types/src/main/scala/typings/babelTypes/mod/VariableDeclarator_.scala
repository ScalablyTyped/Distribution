package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait VariableDeclarator_
  extends StObject
     with BaseNode
     with Standardized {
  
  var definite: Boolean | Null
  
  var id: LVal
  
  var init: Expression | Null
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator
}
object VariableDeclarator_ {
  
  inline def apply(id: LVal): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], definite = null, end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  extension [Self <: VariableDeclarator_](x: Self) {
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
