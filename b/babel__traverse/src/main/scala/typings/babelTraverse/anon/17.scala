package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForInStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var `type`: ForInStatement
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setType(value: ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
