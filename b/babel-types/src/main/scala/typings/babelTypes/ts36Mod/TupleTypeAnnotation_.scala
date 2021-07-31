package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_TupleTypeAnnotation_ : TupleTypeAnnotation
  
  var types: js.Array[FlowTypeAnnotation]
}
object TupleTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[TupleTypeAnnotation_]
  }
  
  @scala.inline
  implicit class TupleTypeAnnotation_MutableBuilder[Self <: TupleTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TupleTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[FlowTypeAnnotation]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: FlowTypeAnnotation*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
