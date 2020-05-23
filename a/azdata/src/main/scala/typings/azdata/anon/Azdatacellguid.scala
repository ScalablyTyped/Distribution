package typings.azdata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Azdatacellguid extends js.Object {
  var azdata_cell_guid: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Azdatacellguid {
  @scala.inline
  def apply(azdata_cell_guid: String = null, language: String = null, tags: js.Array[String] = null): Azdatacellguid = {
    val __obj = js.Dynamic.literal()
    if (azdata_cell_guid != null) __obj.updateDynamic("azdata_cell_guid")(azdata_cell_guid.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Azdatacellguid]
  }
}

