package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var `type`: TSTypeParameter
}
object `92` {
  
  inline def apply(): `92` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[`92`]
  }
  
  extension [Self <: `92`](x: Self) {
    
    inline def setType(value: TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
