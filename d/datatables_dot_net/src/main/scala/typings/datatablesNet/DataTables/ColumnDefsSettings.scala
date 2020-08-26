package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefsSettings extends ColumnSettings {
  var targets: String | Double | (js.Array[Double | String]) = js.native
}

object ColumnDefsSettings {
  @scala.inline
  def apply(targets: String | Double | (js.Array[Double | String])): ColumnDefsSettings = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefsSettings]
  }
  @scala.inline
  implicit class ColumnDefsSettingsOps[Self <: ColumnDefsSettings] (val x: Self) extends AnyVal {
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
    def setTargetsVarargs(value: (Double | String)*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: String | Double | (js.Array[Double | String])): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
  
}

