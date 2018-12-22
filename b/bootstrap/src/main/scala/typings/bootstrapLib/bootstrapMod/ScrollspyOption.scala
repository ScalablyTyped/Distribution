package typings
package bootstrapLib.bootstrapMod

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
  var method: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.auto | bootstrapLib.bootstrapLibStrings.offset | bootstrapLib.bootstrapLibStrings.position
  ] = js.undefined
  /**
       * Pixels to offset from top when calculating position of scroll.
       *
       * @default 10
       */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
       * A selector of the parent element or the parent element itself
       * of any Bootstrap `.nav` or `.list-group` component.
       *
       * @default ""
       */
  var target: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
}

