package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtButtonsSettings extends js.Object {
  var collection: ExtButtonsCollectionSettings = js.native
}

object ExtButtonsSettings {
  @scala.inline
  def apply(collection: ExtButtonsCollectionSettings): ExtButtonsSettings = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtButtonsSettings]
  }
  @scala.inline
  implicit class ExtButtonsSettingsOps[Self <: ExtButtonsSettings] (val x: Self) extends AnyVal {
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
    def setCollection(value: ExtButtonsCollectionSettings): Self = this.set("collection", value.asInstanceOf[js.Any])
  }
  
}

