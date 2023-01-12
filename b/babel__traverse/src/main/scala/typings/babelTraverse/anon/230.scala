package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassPrivateProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230` extends StObject {
  
  var `type`: ClassPrivateProperty
}
object `230` {
  
  inline def apply(): `230` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `230`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassPrivateProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
