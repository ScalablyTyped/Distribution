package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  var `type`: TSTypeQuery
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setType(value: TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
