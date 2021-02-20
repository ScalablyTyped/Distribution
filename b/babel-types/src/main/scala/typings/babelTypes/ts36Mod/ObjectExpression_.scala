package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExpression_
  extends Node
     with Expression {
  
  var properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_] = js.native
  
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression = js.native
}
object ObjectExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_],
    start: Double,
    `type`: ObjectExpression
  ): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression_]
  }
  
  @scala.inline
  implicit class ObjectExpression_MutableBuilder[Self <: ObjectExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectProperty_ | ObjectMethod_ | SpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
