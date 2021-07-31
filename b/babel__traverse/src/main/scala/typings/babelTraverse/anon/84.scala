package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  var `type`: ArrayTypeAnnotation
}
object `84` {
  
  @scala.inline
  def apply(): `84` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[`84`]
  }
  
  @scala.inline
  implicit class `84MutableBuilder`[Self <: `84`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
