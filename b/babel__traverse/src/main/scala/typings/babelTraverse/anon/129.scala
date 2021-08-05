package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var `type`: BooleanLiteral
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setType(value: BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
