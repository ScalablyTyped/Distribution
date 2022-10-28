package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var `type`: TSTypeParameterDeclaration
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setType(value: TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
