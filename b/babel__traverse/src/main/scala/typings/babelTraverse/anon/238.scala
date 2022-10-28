package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIntersectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `238` extends StObject {
  
  var `type`: TSIntersectionType
}
object `238` {
  
  inline def apply(): `238` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[`238`]
  }
  
  extension [Self <: `238`](x: Self) {
    
    inline def setType(value: TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
