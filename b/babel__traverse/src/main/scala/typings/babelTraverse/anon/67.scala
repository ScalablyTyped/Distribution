package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var `type`: VariableDeclaration
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
