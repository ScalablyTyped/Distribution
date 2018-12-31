package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options shared by all modal types */
trait BootboxBaseOptions[T] extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  var callback: js.UndefOr[js.Function1[/* result */ T, _]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var onEscape: js.UndefOr[js.Function0[_] | scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /** All other values result in medium */
  var size: js.UndefOr[bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.large] = js.undefined
  var title: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
}

