package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Import
  extends Node
     with AtRule {
  /** The part following @import. */
  var `import`: js.UndefOr[String] = js.native
}

object Import {
  @scala.inline
  def apply(): Import = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Import]
  }
  @scala.inline
  implicit class ImportOps[Self <: Import] (val x: Self) extends AnyVal {
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
    def setImport(value: String): Self = this.set("import", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
  }
  
}

