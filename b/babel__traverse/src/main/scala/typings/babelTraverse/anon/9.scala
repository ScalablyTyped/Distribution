package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var `type`: TSAnyKeyword
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
