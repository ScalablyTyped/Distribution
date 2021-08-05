package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.RestElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var `type`: RestElement
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setType(value: RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
