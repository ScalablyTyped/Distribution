package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var `type`: TSConstructorType
}
object `208` {
  
  inline def apply(): `208` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setType(value: TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
