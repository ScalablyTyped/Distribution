package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  var `type`: TSTypeAssertion
}
object `235` {
  
  inline def apply(): `235` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[`235`]
  }
  
  extension [Self <: `235`](x: Self) {
    
    inline def setType(value: TSTypeAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
