package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OptionalIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var `type`: OptionalIndexedAccessType
}
object `145` {
  
  inline def apply(): `145` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[`145`]
  }
  
  extension [Self <: `145`](x: Self) {
    
    inline def setType(value: OptionalIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
