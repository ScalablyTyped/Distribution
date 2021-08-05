package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIntrinsicKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var `type`: TSIntrinsicKeyword
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setType(value: TSIntrinsicKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
