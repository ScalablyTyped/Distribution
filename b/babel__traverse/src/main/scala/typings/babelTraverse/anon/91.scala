package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var `type`: TSUnionType
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
