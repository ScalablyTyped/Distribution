package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var `type`: PrivateName
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `95`] (val x: Self) extends AnyVal {
    
    inline def setType(value: PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
