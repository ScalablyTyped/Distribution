package typings.ckeditor

import typings.ckeditor.CKEDITOR.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(filter: filter = null): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filter]
  }
}

