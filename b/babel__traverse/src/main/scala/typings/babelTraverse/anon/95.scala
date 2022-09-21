package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var `type`: WithStatement
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
