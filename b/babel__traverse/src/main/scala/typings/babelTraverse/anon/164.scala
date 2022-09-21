package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var `type`: Super
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
