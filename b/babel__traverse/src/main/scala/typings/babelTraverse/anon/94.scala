package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var `type`: PrivateName
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setType(value: PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
