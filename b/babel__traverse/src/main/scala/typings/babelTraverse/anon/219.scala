package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StringLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var `type`: StringLiteralTypeAnnotation
}
object `219` {
  
  @scala.inline
  def apply(): `219` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit class `219MutableBuilder`[Self <: `219`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
