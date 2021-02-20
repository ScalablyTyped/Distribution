package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  var typeAnnotation: FlowTypeAnnotation = js.native
  
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation = js.native
}
object NullableTypeAnnotation_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: NullableTypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NullableTypeAnnotation_MutableBuilder[Self <: NullableTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
