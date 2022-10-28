package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  var `type`: JSXText
}
object `195` {
  
  inline def apply(): `195` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[`195`]
  }
  
  extension [Self <: `195`](x: Self) {
    
    inline def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
