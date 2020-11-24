package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
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
  implicit class ArrayTypeAnnotation_Ops[Self <: ArrayTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementType(value: FlowTypeAnnotation): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArrayTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
