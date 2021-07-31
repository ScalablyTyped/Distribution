package typings.babelTypes.anon

import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.indexTs37Mod.Expression
import typings.babelTypes.indexTs37Mod.LVal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: LVal
  
  var init: js.UndefOr[Expression] = js.undefined
  
  var kind: `var`
}
object Id {
  
  @scala.inline
  def apply(id: LVal): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "var")
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setKind(value: `var`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
