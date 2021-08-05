package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  var `type`: V8IntrinsicIdentifier
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
