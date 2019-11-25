package typings.datatablesDotNetDashButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtButtonsSettings extends js.Object {
  var collection: ExtButtonsCollectionSettings
}

object ExtButtonsSettings {
  @scala.inline
  def apply(collection: ExtButtonsCollectionSettings): ExtButtonsSettings = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtButtonsSettings]
  }
}

