package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var `type`: ObjectProperty
}
object `141` {
  
  @scala.inline
  def apply(): `141` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit class `141MutableBuilder`[Self <: `141`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
