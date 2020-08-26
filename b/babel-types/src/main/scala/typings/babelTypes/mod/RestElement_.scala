package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.RestElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestElement_
  extends Node
     with LVal {
  var argument: LVal = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  @JSName("type")
  var type_RestElement_ : RestElement = js.native
}

object RestElement_ {
  @scala.inline
  def apply(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestElement): RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestElement_]
  }
  @scala.inline
  implicit class RestElement_Ops[Self <: RestElement_] (val x: Self) extends AnyVal {
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
    def setArgument(value: LVal): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RestElement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("typeAnnotation", js.undefined)
  }
  
}

