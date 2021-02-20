package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_UnionTypeAnnotation_ : UnionTypeAnnotation = js.native
  
  var types: js.Array[FlowTypeAnnotation] = js.native
}
object UnionTypeAnnotation_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: UnionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeAnnotation_]
  }
  
  @scala.inline
  implicit class UnionTypeAnnotation_MutableBuilder[Self <: UnionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UnionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[FlowTypeAnnotation]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: FlowTypeAnnotation*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
