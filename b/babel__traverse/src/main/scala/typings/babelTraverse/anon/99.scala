package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSStringKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var `type`: TSStringKeyword
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setType(value: TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
