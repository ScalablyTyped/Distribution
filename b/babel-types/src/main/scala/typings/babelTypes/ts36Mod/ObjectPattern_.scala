package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPattern_
  extends Node
     with LVal
     with Pattern {
  
  var properties: js.Array[AssignmentProperty | RestProperty_] = js.native
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  
  @JSName("type")
  var type_ObjectPattern_ : ObjectPattern = js.native
}
object ObjectPattern_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double,
    `type`: ObjectPattern
  ): ObjectPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern_]
  }
  
  @scala.inline
  implicit class ObjectPattern_MutableBuilder[Self <: ObjectPattern_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[AssignmentProperty | RestProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (AssignmentProperty | RestProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
