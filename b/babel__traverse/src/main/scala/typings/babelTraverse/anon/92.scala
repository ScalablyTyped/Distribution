package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var `type`: TSUnionType
}
object `92` {
  
  inline def apply(): `92` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[`92`]
  }
  
  extension [Self <: `92`](x: Self) {
    
    inline def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
