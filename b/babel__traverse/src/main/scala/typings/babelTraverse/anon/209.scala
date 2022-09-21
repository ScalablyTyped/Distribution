package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSRestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  var `type`: TSRestType
}
object `209` {
  
  inline def apply(): `209` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[`209`]
  }
  
  extension [Self <: `209`](x: Self) {
    
    inline def setType(value: TSRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
