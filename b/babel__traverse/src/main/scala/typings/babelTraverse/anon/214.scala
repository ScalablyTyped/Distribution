package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassAccessorProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var `type`: ClassAccessorProperty
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `214`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassAccessorProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
