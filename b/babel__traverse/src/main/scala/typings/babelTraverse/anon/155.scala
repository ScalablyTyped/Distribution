package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var `type`: TSTypeLiteral
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[`155`]
  }
  
  extension [Self <: `155`](x: Self) {
    
    inline def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
