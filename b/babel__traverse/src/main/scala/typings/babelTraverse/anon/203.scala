package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var `type`: TSThisType
}
object `203` {
  
  inline def apply(): `203` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
