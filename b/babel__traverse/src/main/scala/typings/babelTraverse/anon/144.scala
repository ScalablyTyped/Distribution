package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var `type`: ObjectProperty
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
