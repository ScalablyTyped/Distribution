package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AnyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var `type`: AnyTypeAnnotation
}
object `64` {
  
  @scala.inline
  def apply(): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64MutableBuilder`[Self <: `64`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AnyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
