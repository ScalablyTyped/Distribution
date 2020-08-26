package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSpecifier_
  extends Node
     with ModuleSpecifier {
  var imported: Identifier_ = js.native
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier = js.native
}

object ImportSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportSpecifier
  ): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier_]
  }
  @scala.inline
  implicit class ImportSpecifier_Ops[Self <: ImportSpecifier_] (val x: Self) extends AnyVal {
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
    def setImported(value: Identifier_): Self = this.set("imported", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: Identifier_): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImportSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

