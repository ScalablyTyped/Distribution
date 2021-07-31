package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var `type`: ObjectMethod
}
object `123` {
  
  @scala.inline
  def apply(): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit class `123MutableBuilder`[Self <: `123`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
