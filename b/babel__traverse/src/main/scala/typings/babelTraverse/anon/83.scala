package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var `type`: IfStatement
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setType(value: IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
