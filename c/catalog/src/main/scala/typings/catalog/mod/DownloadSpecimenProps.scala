package typings.catalog.mod

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
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadSpecimenProps]
  }
}

