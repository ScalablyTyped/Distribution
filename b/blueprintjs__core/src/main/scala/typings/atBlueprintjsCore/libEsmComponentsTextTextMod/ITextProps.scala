package typings.atBlueprintjsCore.libEsmComponentsTextTextMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextProps extends IProps {
  /**
    * Indicates that this component should be truncated with an ellipsis if it overflows its container.
    * The `title` attribute will also be added when content overflows to show the full text of the children on hover.
    * @default false
    */
  var ellipsize: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML tag name to use for rendered element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
}

object ITextProps {
  @scala.inline
  def apply(
    className: String = null,
    ellipsize: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null
  ): ITextProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsize)) __obj.updateDynamic("ellipsize")(ellipsize.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextProps]
  }
}

