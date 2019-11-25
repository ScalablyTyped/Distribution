package typings.atBlueprintjsCore.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(className: String = null): IProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

