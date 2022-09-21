package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  var `type`: TSThisType
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[`207`]
  }
  
  extension [Self <: `207`](x: Self) {
    
    inline def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
