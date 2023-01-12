package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var `type`: ClassImplements
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `212`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassImplements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
