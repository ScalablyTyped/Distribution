package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var `type`: FunctionDeclaration
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
