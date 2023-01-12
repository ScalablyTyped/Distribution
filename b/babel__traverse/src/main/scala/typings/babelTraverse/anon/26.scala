package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.RestElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var `type`: RestElement
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setType(value: RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
