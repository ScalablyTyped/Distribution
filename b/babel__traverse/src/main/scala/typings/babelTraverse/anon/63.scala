package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var `type`: AssignmentPattern
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
