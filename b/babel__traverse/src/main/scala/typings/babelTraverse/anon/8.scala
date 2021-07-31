package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var `type`: InterfaceTypeAnnotation
}
object `8` {
  
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
