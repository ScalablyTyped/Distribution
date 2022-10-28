package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSModuleBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var `type`: TSModuleBlock
}
object `231` {
  
  inline def apply(): `231` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[`231`]
  }
  
  extension [Self <: `231`](x: Self) {
    
    inline def setType(value: TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
