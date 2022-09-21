package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var `type`: TSMappedType
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
