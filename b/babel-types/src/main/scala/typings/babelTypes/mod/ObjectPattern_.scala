package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ObjectPattern_Ops[Self <: ObjectPattern_] (val x: Self) extends AnyVal {
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
    def setPropertiesVarargs(value: (AssignmentProperty | RestProperty_)*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[AssignmentProperty | RestProperty_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ObjectPattern): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("typeAnnotation", js.undefined)
  }
  
}

