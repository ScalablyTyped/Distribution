package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  var `type`: ForStatement
}
object `190` {
  
  inline def apply(): `190` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[`190`]
  }
  
  extension [Self <: `190`](x: Self) {
    
    inline def setType(value: ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
