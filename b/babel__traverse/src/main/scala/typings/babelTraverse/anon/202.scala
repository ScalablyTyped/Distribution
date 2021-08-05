package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  var `type`: TSIndexSignature
}
object `202` {
  
  inline def apply(): `202` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[`202`]
  }
  
  extension [Self <: `202`](x: Self) {
    
    inline def setType(value: TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
