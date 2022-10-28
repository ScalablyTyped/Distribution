package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var `type`: TSOptionalType
}
object `185` {
  
  inline def apply(): `185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[`185`]
  }
  
  extension [Self <: `185`](x: Self) {
    
    inline def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
