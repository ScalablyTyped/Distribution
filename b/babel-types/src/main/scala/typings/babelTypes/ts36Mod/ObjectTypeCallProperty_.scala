package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeCallProperty_
  extends Node
     with Flow
     with UserWhitespacable {
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty = js.native
  
  var value: FlowTypeAnnotation = js.native
}
object ObjectTypeCallProperty_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeCallProperty,
    value: FlowTypeAnnotation
  ): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeCallProperty_Ops[Self <: ObjectTypeCallProperty_] (val x: Self) extends AnyVal {
    
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
    def setType(value: ObjectTypeCallProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
