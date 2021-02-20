package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  var typeAnnotation: FlowTypeAnnotation = js.native
  
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation = js.native
}
object TypeAnnotation_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  @scala.inline
  implicit class TypeAnnotation_MutableBuilder[Self <: TypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
