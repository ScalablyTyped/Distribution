package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var `type`: Program
}
object `154` {
  
  inline def apply(): `154` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[`154`]
  }
  
  extension [Self <: `154`](x: Self) {
    
    inline def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
