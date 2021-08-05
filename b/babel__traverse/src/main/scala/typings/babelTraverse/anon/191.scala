package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var `type`: TSParameterProperty
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
