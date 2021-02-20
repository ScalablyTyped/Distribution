package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  var elementType: FlowTypeAnnotation = js.native
  
  @JSName("type")
  var type_ArrayTypeAnnotation_ : ArrayTypeAnnotation = js.native
}
object ArrayTypeAnnotation_ {
  
  @scala.inline
  def apply(
    elementType: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayTypeAnnotation
  ): ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ArrayTypeAnnotation_MutableBuilder[Self <: ArrayTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: FlowTypeAnnotation): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
