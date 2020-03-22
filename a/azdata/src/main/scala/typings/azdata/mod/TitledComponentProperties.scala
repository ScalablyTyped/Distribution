package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitledComponentProperties extends js.Object {
  /**
  		 * The title for the component. This title will show when hovered over
  		 */
  var title: js.UndefOr[String] = js.undefined
}

object TitledComponentProperties {
  @scala.inline
  def apply(title: String = null): TitledComponentProperties = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitledComponentProperties]
  }
}

