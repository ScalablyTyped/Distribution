package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  var `type`: MixedTypeAnnotation
}
object `56` {
  
  @scala.inline
  def apply(): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit class `56MutableBuilder`[Self <: `56`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
