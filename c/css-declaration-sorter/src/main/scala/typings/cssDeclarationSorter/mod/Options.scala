package typings.cssDeclarationSorter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * To prevent breaking legacy CSS where shorthand declarations override longhand declarations
    * (also taking into account vendor prefixes) this option can enabled.
    * For example `animation-name: some; animation: greeting;` will be kept in this order when `keepOverrides` is `true`.
    */
  var keepOverrides: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide the name of one of the built-in sort orders or a comparison function that is passed to `Array.sort`.
    * @default 'alphabetical'
    */
  var order: js.UndefOr[SortOrder | SortFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(keepOverrides: js.UndefOr[Boolean] = js.undefined, order: SortOrder | SortFunction = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepOverrides)) __obj.updateDynamic("keepOverrides")(keepOverrides.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

