package typings.babelCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exported extends js.Object {
  var exported: js.Array[js.Object] = js.native
  var specifiers: js.Array[js.Object] = js.native
}

object Exported {
  @scala.inline
  def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exported]
  }
  @scala.inline
  implicit class ExportedOps[Self <: Exported] (val x: Self) extends AnyVal {
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
    def setExportedVarargs(value: js.Object*): Self = this.set("exported", js.Array(value :_*))
    @scala.inline
    def setExported(value: js.Array[js.Object]): Self = this.set("exported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecifiersVarargs(value: js.Object*): Self = this.set("specifiers", js.Array(value :_*))
    @scala.inline
    def setSpecifiers(value: js.Array[js.Object]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
  }
  
}

