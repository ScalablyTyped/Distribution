package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_ThisTypeAnnotation_ : ThisTypeAnnotation
}
object ThisTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[ThisTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ThisTypeAnnotation_MutableBuilder[Self <: ThisTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
