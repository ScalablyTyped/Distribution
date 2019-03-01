package typings
package atBlueprintjsCoreLib.libEsmComponentsHtmlDashTableHtmlTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLTableProps
  extends reactLib.reactMod.ReactNs.TableHTMLAttributes[reactLib.HTMLTableElement]
     with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLTableElement] {
  /** Enables borders between rows and cells. */
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  /** Use small, condensed appearance. */
  var condensed: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables hover styles on row. */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use small, condensed appearance for this element and all child elements.
    * @deprecated
    */
  var small: js.UndefOr[scala.Boolean] = js.undefined
  /** Use an alternate background color on odd rows. */
  var striped: js.UndefOr[scala.Boolean] = js.undefined
}

object IHTMLTableProps {
  @scala.inline
  def apply(
    IElementRefProps: atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLTableElement] = null,
    TableHTMLAttributes: reactLib.reactMod.ReactNs.TableHTMLAttributes[reactLib.HTMLTableElement] = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    condensed: js.UndefOr[scala.Boolean] = js.undefined,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined,
    striped: js.UndefOr[scala.Boolean] = js.undefined
  ): IHTMLTableProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElementRefProps)
    js.Dynamic.global.Object.assign(__obj, TableHTMLAttributes)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(condensed)) __obj.updateDynamic("condensed")(condensed)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    __obj.asInstanceOf[IHTMLTableProps]
  }
}

