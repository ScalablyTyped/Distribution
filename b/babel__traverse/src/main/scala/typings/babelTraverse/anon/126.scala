package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var `type`: ObjectMethod
}
object `126` {
  
  inline def apply(): `126` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `126`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
