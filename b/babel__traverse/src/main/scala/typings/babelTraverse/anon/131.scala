package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var `type`: InferredPredicate
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
