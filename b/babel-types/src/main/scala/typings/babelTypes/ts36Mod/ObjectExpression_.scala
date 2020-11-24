package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
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
  implicit class ObjectExpression_Ops[Self <: ObjectExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectProperty_ | ObjectMethod_ | SpreadProperty_)*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
