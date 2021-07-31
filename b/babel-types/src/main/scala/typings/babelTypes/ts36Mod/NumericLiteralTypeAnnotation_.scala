package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NumericLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteralTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_NumericLiteralTypeAnnotation_ : NumericLiteralTypeAnnotation
}
object NumericLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[NumericLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NumericLiteralTypeAnnotation_MutableBuilder[Self <: NumericLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumericLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
