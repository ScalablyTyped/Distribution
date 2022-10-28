package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var `type`: V8IntrinsicIdentifier
}
object `141` {
  
  inline def apply(): `141` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[`141`]
  }
  
  extension [Self <: `141`](x: Self) {
    
    inline def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
