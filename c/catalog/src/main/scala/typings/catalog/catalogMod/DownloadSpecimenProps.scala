package typings.catalog.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadSpecimenProps extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object DownloadSpecimenProps {
  @scala.inline
  def apply(url: String, filename: String = null, subtitle: String = null, title: String = null): DownloadSpecimenProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DownloadSpecimenProps]
  }
}

