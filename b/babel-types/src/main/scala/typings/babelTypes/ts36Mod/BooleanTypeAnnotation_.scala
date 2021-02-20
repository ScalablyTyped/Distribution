package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanTypeAnnotation_
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_BooleanTypeAnnotation_ : BooleanTypeAnnotation = js.native
}
object BooleanTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: BooleanTypeAnnotation): BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanTypeAnnotation_]
  }
  
  @scala.inline
  implicit class BooleanTypeAnnotation_MutableBuilder[Self <: BooleanTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
