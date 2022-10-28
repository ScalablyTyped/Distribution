package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var `type`: SpreadElement
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setType(value: SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
