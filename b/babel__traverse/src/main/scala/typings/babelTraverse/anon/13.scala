package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TupleTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var `type`: TupleTypeAnnotation
}
object `13` {
  
  @scala.inline
  def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TupleTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
