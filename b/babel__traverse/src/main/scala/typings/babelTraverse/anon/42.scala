package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var `type`: NullLiteralTypeAnnotation
}
object `42` {
  
  @scala.inline
  def apply(): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42MutableBuilder`[Self <: `42`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
