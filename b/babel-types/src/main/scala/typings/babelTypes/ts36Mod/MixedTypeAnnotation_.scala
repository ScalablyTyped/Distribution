package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MixedTypeAnnotation_
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation = js.native
}
object MixedTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: MixedTypeAnnotation): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  @scala.inline
  implicit class MixedTypeAnnotation_MutableBuilder[Self <: MixedTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
