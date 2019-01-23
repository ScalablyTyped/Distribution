package typings
package badgenLib.badgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeCreationParams extends js.Object {
  /**
    * Color RGB or Color Name, optional.
    */
  var color: js.UndefOr[badgenLib.ColorPresets | java.lang.String] = js.undefined
  /**
    * Use icon, optional.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this if icon is not square.
    * @default 13
    */
  var iconWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text representing the status.
    */
  var status: java.lang.String
  /**
    * 'flat' or undefined, optional.
    */
  var style: js.UndefOr[badgenLib.badgenLibStrings.flat] = js.undefined
  /**
    * Text representing the subject.
    */
  var subject: java.lang.String
}

