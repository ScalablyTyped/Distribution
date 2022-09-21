package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  var `type`: TSTypeReference
}
object `246` {
  
  inline def apply(): `246` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[`246`]
  }
  
  extension [Self <: `246`](x: Self) {
    
    inline def setType(value: TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
