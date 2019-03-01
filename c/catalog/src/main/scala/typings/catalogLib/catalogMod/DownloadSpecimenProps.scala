package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadSpecimenProps extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object DownloadSpecimenProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    filename: java.lang.String = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): DownloadSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DownloadSpecimenProps]
  }
}

