package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var `type`: CatchClause
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
