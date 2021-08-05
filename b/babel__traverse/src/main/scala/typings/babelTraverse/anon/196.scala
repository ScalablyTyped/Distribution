package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var `type`: TSDeclareFunction
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setType(value: TSDeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
