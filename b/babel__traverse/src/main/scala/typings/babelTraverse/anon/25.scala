package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var `type`: BlockStatement
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setType(value: BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
