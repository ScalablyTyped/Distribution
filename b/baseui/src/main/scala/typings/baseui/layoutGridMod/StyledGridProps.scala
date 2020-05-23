package typings.baseui.layoutGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledGridProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  @JSName("$behavior")
  var $behavior: js.UndefOr[BEHAVIOR] = js.undefined
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$gridMargins")
  var $gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$gridMaxWidth")
  var $gridMaxWidth: js.UndefOr[Double] = js.undefined
  @JSName("$gridUnit")
  var $gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.undefined
}

object StyledGridProps {
  @scala.inline
  def apply(
    $align: Responsive[ALIGNMENT] = null,
    $behavior: BEHAVIOR = null,
    $gridGutters: Responsive[Double] = null,
    $gridMargins: Responsive[Double] = null,
    $gridMaxWidth: js.UndefOr[Double] = js.undefined,
    $gridUnit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any = null
  ): StyledGridProps = {
    val __obj = js.Dynamic.literal()
    if ($align != null) __obj.updateDynamic("$align")($align.asInstanceOf[js.Any])
    if ($behavior != null) __obj.updateDynamic("$behavior")($behavior.asInstanceOf[js.Any])
    if ($gridGutters != null) __obj.updateDynamic("$gridGutters")($gridGutters.asInstanceOf[js.Any])
    if ($gridMargins != null) __obj.updateDynamic("$gridMargins")($gridMargins.asInstanceOf[js.Any])
    if (!js.isUndefined($gridMaxWidth)) __obj.updateDynamic("$gridMaxWidth")($gridMaxWidth.get.asInstanceOf[js.Any])
    if ($gridUnit != null) __obj.updateDynamic("$gridUnit")($gridUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledGridProps]
  }
}

