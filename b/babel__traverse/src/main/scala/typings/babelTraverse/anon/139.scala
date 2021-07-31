package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EmptyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var `type`: EmptyTypeAnnotation
}
object `139` {
  
  @scala.inline
  def apply(): `139` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit class `139MutableBuilder`[Self <: `139`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
