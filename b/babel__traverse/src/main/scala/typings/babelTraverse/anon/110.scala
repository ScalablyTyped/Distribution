package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StaticBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var `type`: StaticBlock
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setType(value: StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
