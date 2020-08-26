package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeProperty_
  extends Node
     with Flow
     with UserWhitespacable {
  var key: Expression = js.native
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty = js.native
  var value: FlowTypeAnnotation = js.native
}

object ObjectTypeProperty_ {
  @scala.inline
  def apply(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeProperty,
    value: FlowTypeAnnotation
  ): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
  @scala.inline
  implicit class ObjectTypeProperty_Ops[Self <: ObjectTypeProperty_] (val x: Self) extends AnyVal {
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
    def setKey(value: Expression): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ObjectTypeProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

