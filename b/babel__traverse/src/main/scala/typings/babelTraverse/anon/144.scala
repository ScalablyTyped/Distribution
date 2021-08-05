package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var `type`: TSExpressionWithTypeArguments
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
