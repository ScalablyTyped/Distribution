package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  var `type`: BooleanLiteralTypeAnnotation
}
object `173` {
  
  @scala.inline
  def apply(): `173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit class `173MutableBuilder`[Self <: `173`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
