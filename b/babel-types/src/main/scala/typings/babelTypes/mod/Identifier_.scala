package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identifier_
  extends Node
     with Expression
     with LVal
     with TSEntityName {
  var name: String = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  @JSName("type")
  var type_Identifier_ : Identifier = js.native
}

object Identifier_ {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier_]
  }
  @scala.inline
  implicit class Identifier_Ops[Self <: Identifier_] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Identifier): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("typeAnnotation", js.undefined)
  }
  
}

