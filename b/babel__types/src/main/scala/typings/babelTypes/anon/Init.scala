package typings.babelTypes.anon

import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.LVal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init extends StObject {
  
  var id: LVal
  
  var init: js.UndefOr[Expression] = js.undefined
  
  var kind: `var`
}
object Init {
  
  inline def apply(id: LVal): Init = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "var")
    __obj.asInstanceOf[Init]
  }
  
  extension [Self <: Init](x: Self) {
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setKind(value: `var`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
