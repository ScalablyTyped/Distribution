package typings.backboneDotMarionette.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionConstructionOptions extends js.Object {
  /**
    * Prevents error on missing element. (undocumented)
    */
  var allowMissingEl: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the element for the region to manage. This may be
    * a selector string, a raw DOM node reference or a jQuery wrapped
    * DOM node.
    */
  var el: js.UndefOr[js.Any] = js.undefined
  /**
    * Element to use as context when finding el via jQuery. Defaults to the
    * the document. (undocumented)
    */
  var parentEl: js.UndefOr[String] = js.undefined
  /**
    * Overwrite the parent el of the region with the rendered contents of
    * the inner View.
    */
  var replaceElement: js.UndefOr[String] = js.undefined
}

object RegionConstructionOptions {
  @scala.inline
  def apply(
    allowMissingEl: js.UndefOr[Boolean] = js.undefined,
    el: js.Any = null,
    parentEl: String = null,
    replaceElement: String = null
  ): RegionConstructionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissingEl)) __obj.updateDynamic("allowMissingEl")(allowMissingEl)
    if (el != null) __obj.updateDynamic("el")(el)
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(replaceElement)
    __obj.asInstanceOf[RegionConstructionOptions]
  }
}

