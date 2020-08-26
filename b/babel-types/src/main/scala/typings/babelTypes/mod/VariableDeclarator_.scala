package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarator_ extends Node {
  var id: LVal = js.native
  var init: Expression = js.native
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator = js.native
}

object VariableDeclarator_ {
  @scala.inline
  def apply(
    end: Double,
    id: LVal,
    init: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: VariableDeclarator
  ): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
  @scala.inline
  implicit class VariableDeclarator_Ops[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
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
    def setId(value: LVal): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: VariableDeclarator): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

