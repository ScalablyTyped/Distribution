package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : IntersectionTypeAnnotation = js.native
  
  var types: js.Array[FlowTypeAnnotation] = js.native
}
object IntersectionTypeAnnotation_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: IntersectionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  
  @scala.inline
  implicit class IntersectionTypeAnnotation_MutableBuilder[Self <: IntersectionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[FlowTypeAnnotation]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: FlowTypeAnnotation*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
