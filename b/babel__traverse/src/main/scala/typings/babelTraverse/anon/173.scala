package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  var `type`: JSXElement
}
object `173` {
  
  inline def apply(): `173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[`173`]
  }
  
  extension [Self <: `173`](x: Self) {
    
    inline def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
