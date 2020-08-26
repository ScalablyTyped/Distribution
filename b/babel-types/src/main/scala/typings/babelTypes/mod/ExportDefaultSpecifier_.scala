package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultSpecifier_
  extends Node
     with ModuleSpecifier {
  var exported: Identifier_ = js.native
  @JSName("type")
  var type_ExportDefaultSpecifier_ : ExportDefaultSpecifier = js.native
}

object ExportDefaultSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultSpecifier
  ): ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier_]
  }
  @scala.inline
  implicit class ExportDefaultSpecifier_Ops[Self <: ExportDefaultSpecifier_] (val x: Self) extends AnyVal {
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
    def setExported(value: Identifier_): Self = this.set("exported", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExportDefaultSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

