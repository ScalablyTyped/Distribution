package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator_
  extends StObject
     with BaseNode
     with Node
     with Standardized {
  
  var definite: js.UndefOr[Boolean | Null] = js.undefined
  
  var id: LVal
  
  var init: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator
}
object VariableDeclarator_ {
  
  inline def apply(id: LVal): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    inline def setDefiniteUndefined: Self = StObject.set(x, "definite", js.undefined)
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
