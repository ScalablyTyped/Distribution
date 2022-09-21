package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var `type`: ForOfStatement
}
object `165` {
  
  inline def apply(): `165` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[`165`]
  }
  
  extension [Self <: `165`](x: Self) {
    
    inline def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
