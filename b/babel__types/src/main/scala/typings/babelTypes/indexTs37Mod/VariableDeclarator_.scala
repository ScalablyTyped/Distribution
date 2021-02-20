package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarator_
  extends BaseNode
     with _Node {
  
  var definite: Boolean | Null = js.native
  
  var id: LVal = js.native
  
  var init: Expression | Null = js.native
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator = js.native
}
object VariableDeclarator_ {
  
  @scala.inline
  def apply(id: LVal, `type`: VariableDeclarator): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  @scala.inline
  implicit class VariableDeclarator_MutableBuilder[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    @scala.inline
    def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
