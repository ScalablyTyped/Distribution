package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeSpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var `type`: ObjectTypeSpreadProperty
}
object `79` {
  
  @scala.inline
  def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit class `79MutableBuilder`[Self <: `79`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectTypeSpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
