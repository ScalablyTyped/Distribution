package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  var `type`: IntersectionTypeAnnotation
}
object `209` {
  
  @scala.inline
  def apply(): `209` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[`209`]
  }
  
  @scala.inline
  implicit class `209MutableBuilder`[Self <: `209`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
