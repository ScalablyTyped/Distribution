package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var `type`: ClassProperty
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setType(value: ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
