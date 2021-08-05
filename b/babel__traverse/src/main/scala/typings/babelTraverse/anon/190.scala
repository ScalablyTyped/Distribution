package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  var `type`: JSXText
}
object `190` {
  
  inline def apply(): `190` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[`190`]
  }
  
  extension [Self <: `190`](x: Self) {
    
    inline def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
