package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var `type`: TSSymbolKeyword
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
