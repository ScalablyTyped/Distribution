package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var `type`: TSExpressionWithTypeArguments
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `149`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
