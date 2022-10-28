package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var `type`: TSTypeOperator
}
object `52` {
  
  inline def apply(): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setType(value: TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
