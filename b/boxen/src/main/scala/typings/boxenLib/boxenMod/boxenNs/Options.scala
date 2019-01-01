package typings
package boxenLib.boxenMod.boxenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Align the text in the box based on the widest line.
    * @default 'left'
    */
  var align: js.UndefOr[
    boxenLib.boxenLibStrings.left | boxenLib.boxenLibStrings.center | boxenLib.boxenLibStrings.right
  ] = js.undefined
  /**
    * Color of the background.
    * Values: `black` `red` `green` `yellow` `blue` `magenta` `cyan` `white` `gray` or a hex value like `#ff0000`
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Color of the box border.
    * Values: `black` `red` `green` `yellow` `blue` `magenta` `cyan` `white` `gray` or a hex value like `#ff0000`
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of the box border.
    * Can be any of the above predefined styles or an object.
    *
    * Predefined values:
    * - `single`
    * ```
    * ┌───┐
    * │foo│
    * └───┘
    * ```
    * - `double`
    * ```
    * ╔═══╗
    * ║foo║
    * ╚═══╝
    * ```
    * - `round` (`single` sides with round corners)
    * ```
    * ╭───╮
    * │foo│
    * ╰───╯
    * ```
    * - `single-double` (`single` on top and bottom, `double` on right and left)
    * ```
    * ╓───╖
    * ║foo║
    * ╙───╜
    * ```
    * - `double-single` (`double` on top and bottom, `single` on right and left)
    * ```
    * ╒═══╕
    * │foo│
    * ╘═══╛
    * ```
    * - `classic`
    * ```
    * +---+
    * |foo|
    * +---+
    * ```
    */
  var borderStyle: js.UndefOr[
    cliDashBoxesLib.cliDashBoxesMod.boxesNs.BoxNames | cliDashBoxesLib.cliDashBoxesMod.boxesNs.BoxDefinition
  ] = js.undefined
  /**
    * Reduce opacity of the border.
    * @default false
    */
  var dimBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Float the box on the available terminal screen space.
    * @default 'left'
    */
  var float: js.UndefOr[
    boxenLib.boxenLibStrings.right | boxenLib.boxenLibStrings.center | boxenLib.boxenLibStrings.left
  ] = js.undefined
  /**
    * Space around the box.
    * When a number is specified, the left/right margin is 3 times the top/bottom to make it look nice.
    * @default 0
    */
  var margin: js.UndefOr[scala.Double | PositionOptions] = js.undefined
  /**
    * Space between the text and box border.
    * When a number is specified, the left/right padding is 3 times the top/bottom to make it look nice.
    * @default 0
    */
  var padding: js.UndefOr[scala.Double | PositionOptions] = js.undefined
}

