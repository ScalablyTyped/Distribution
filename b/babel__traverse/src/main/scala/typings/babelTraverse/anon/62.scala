package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var `type`: ExpressionStatement
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
