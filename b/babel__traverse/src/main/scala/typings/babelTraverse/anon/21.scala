package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var `type`: TypeAnnotation
}
object `21` {
  
  @scala.inline
  def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
