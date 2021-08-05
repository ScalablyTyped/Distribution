package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var `type`: FunctionDeclaration
}
object `133` {
  
  inline def apply(): `133` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[`133`]
  }
  
  extension [Self <: `133`](x: Self) {
    
    inline def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
