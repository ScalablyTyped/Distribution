package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteralTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_BooleanLiteralTypeAnnotation_ : BooleanLiteralTypeAnnotation
}
object BooleanLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class BooleanLiteralTypeAnnotation_MutableBuilder[Self <: BooleanLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
