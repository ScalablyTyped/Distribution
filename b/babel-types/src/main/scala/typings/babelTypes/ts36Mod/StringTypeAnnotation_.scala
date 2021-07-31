package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.StringTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_StringTypeAnnotation_ : StringTypeAnnotation
}
object StringTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[StringTypeAnnotation_]
  }
  
  @scala.inline
  implicit class StringTypeAnnotation_MutableBuilder[Self <: StringTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
