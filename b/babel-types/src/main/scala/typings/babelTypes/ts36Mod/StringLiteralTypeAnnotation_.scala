package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteralTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_StringLiteralTypeAnnotation_ : StringLiteralTypeAnnotation = js.native
}
object StringLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteralTypeAnnotation): StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class StringLiteralTypeAnnotation_MutableBuilder[Self <: StringLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
