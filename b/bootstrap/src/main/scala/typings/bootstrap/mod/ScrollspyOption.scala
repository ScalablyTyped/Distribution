package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollspyOption extends js.Object {
  /**
    * Finds which section the spied element is in:
    * * `auto` will choose the best method get scroll coordinates.
    * * `offset` will use jQuery offset method to get scroll coordinates.
    * * `position` will use jQuery position method to get scroll coordinates.
    *
    * @default "auto"
    */
  var method: js.UndefOr[auto | offset | position] = js.undefined
  /**
    * Pixels to offset from top when calculating position of scroll.
    *
    * @default 10
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * A selector of the parent element or the parent element itself
    * of any Bootstrap `.nav` or `.list-group` component.
    *
    * @default ""
    */
  var target: js.UndefOr[String | Element] = js.undefined
}

object ScrollspyOption {
  @scala.inline
  def apply(
    method: auto | offset | position = null,
    offset: Int | Double = null,
    target: String | Element = null
  ): ScrollspyOption = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollspyOption]
  }
}

