package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteralTypeAnnotation_
  extends StObject
     with Node {
  
  @JSName("type")
  var type_NullLiteralTypeAnnotation_ : NullLiteralTypeAnnotation
}
object NullLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[NullLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NullLiteralTypeAnnotation_MutableBuilder[Self <: NullLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
