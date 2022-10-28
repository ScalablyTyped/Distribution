package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var `type`: Super
}
object `165` {
  
  inline def apply(): `165` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[`165`]
  }
  
  extension [Self <: `165`](x: Self) {
    
    inline def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
