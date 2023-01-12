package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var `type`: MetaProperty
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[`83`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `83`] (val x: Self) extends AnyVal {
    
    inline def setType(value: MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
