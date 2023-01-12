package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var `type`: ClassProperty
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `192`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
