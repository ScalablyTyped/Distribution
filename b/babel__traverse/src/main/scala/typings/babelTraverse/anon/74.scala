package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var `type`: TSTypeParameterInstantiation
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
